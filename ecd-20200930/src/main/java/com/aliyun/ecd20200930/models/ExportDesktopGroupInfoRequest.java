// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopGroupInfoRequest extends TeaModel {
    /**
     * <p>The billing method of the cloud computer share.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go.</li>
     * <li>PrePaid: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The IDs of the cloud computer shares.</p>
     */
    @NameInMap("DesktopGroupId")
    public java.util.List<String> desktopGroupId;

    /**
     * <p>The name of the cloud computer share.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    /**
     * <p>The IDs of the users to be authorized.</p>
     */
    @NameInMap("EndUserId")
    public java.util.List<String> endUserId;

    /**
     * <p>The expiration date of the subscription cloud computer share.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-31T15:59Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the next query. If this parameter is left empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-467671****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the security policy.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-53iyi2aar0nd6****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ExportDesktopGroupInfoRequestTag> tag;

    public static ExportDesktopGroupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDesktopGroupInfoRequest self = new ExportDesktopGroupInfoRequest();
        return TeaModel.build(map, self);
    }

    public ExportDesktopGroupInfoRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ExportDesktopGroupInfoRequest setDesktopGroupId(java.util.List<String> desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public java.util.List<String> getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public ExportDesktopGroupInfoRequest setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    public ExportDesktopGroupInfoRequest setEndUserId(java.util.List<String> endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public java.util.List<String> getEndUserId() {
        return this.endUserId;
    }

    public ExportDesktopGroupInfoRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ExportDesktopGroupInfoRequest setLangType(String langType) {
        this.langType = langType;
        return this;
    }
    public String getLangType() {
        return this.langType;
    }

    public ExportDesktopGroupInfoRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ExportDesktopGroupInfoRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportDesktopGroupInfoRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ExportDesktopGroupInfoRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ExportDesktopGroupInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportDesktopGroupInfoRequest setTag(java.util.List<ExportDesktopGroupInfoRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ExportDesktopGroupInfoRequestTag> getTag() {
        return this.tag;
    }

    public static class ExportDesktopGroupInfoRequestTag extends TeaModel {
        /**
         * <p>The tag key. You cannot specify an empty string as a tag key. A tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify an empty string as a tag key. A tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExportDesktopGroupInfoRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ExportDesktopGroupInfoRequestTag self = new ExportDesktopGroupInfoRequestTag();
            return TeaModel.build(map, self);
        }

        public ExportDesktopGroupInfoRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExportDesktopGroupInfoRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
