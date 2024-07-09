// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computer templates.</p>
     */
    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    /**
     * <p>The ID of the cloud computer pool.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The name of the cloud computer pool to query. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    /**
     * <p>The authorized user IDs of cloud computer pools.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The authorized users that you want to exclude.</p>
     */
    @NameInMap("ExcludedEndUserIds")
    public java.util.List<String> excludedEndUserIds;

    /**
     * <p>The IDs of the images.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the NextToken parameter is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the office network to which the cloud computer pool belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-467671****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The type of the cloud computer pool.</p>
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: individual (single session)</li>
     * <li>1: shared (multiple sessions)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OwnType")
    public Long ownType;

    /**
     * <p>The subscription duration of the cloud computer pool. The unit is specified by the <code>PeriodUnit</code> parameter.</p>
     * <ul>
     * <li><p>Valid values if the <code>PeriodUnit</code> parameter is set to <code>Month</code>:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>6</li>
     * </ul>
     * </li>
     * <li><p>Valid values if the <code>PeriodUnit</code> parameter is set to <code>Year</code>:</p>
     * <ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>4</li>
     * <li>5</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy that you want to associate with the cloud computer pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-53iyi2aar0nd6****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The protocol type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>High-definition Experience (HDX)</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Adaptive Streaming Protocol (ASP)</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The payment status of the cloud computer pool.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: unpaid</li>
     * <li>1: paid</li>
     * <li>2: overdue or expired</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The tags attached to the cloud computer pool. You can specify 1 to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDesktopGroupsRequestTag> tag;

    public static DescribeDesktopGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopGroupsRequest self = new DescribeDesktopGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopGroupsRequest setBundleId(java.util.List<String> bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public java.util.List<String> getBundleId() {
        return this.bundleId;
    }

    public DescribeDesktopGroupsRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DescribeDesktopGroupsRequest setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    public DescribeDesktopGroupsRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public DescribeDesktopGroupsRequest setExcludedEndUserIds(java.util.List<String> excludedEndUserIds) {
        this.excludedEndUserIds = excludedEndUserIds;
        return this;
    }
    public java.util.List<String> getExcludedEndUserIds() {
        return this.excludedEndUserIds;
    }

    public DescribeDesktopGroupsRequest setImageId(java.util.List<String> imageId) {
        this.imageId = imageId;
        return this;
    }
    public java.util.List<String> getImageId() {
        return this.imageId;
    }

    public DescribeDesktopGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDesktopGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopGroupsRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopGroupsRequest setOwnType(Long ownType) {
        this.ownType = ownType;
        return this;
    }
    public Long getOwnType() {
        return this.ownType;
    }

    public DescribeDesktopGroupsRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeDesktopGroupsRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeDesktopGroupsRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeDesktopGroupsRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeDesktopGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopGroupsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeDesktopGroupsRequest setTag(java.util.List<DescribeDesktopGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDesktopGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDesktopGroupsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. If you specify the <code>Tag</code> parameter, you must also specify the <code>Key</code> parameter. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>. You cannot specify an empty string as a tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDesktopGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopGroupsRequestTag self = new DescribeDesktopGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDesktopGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
