// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopGroupsRequest extends TeaModel {
    /**
     * <p>The list of cloud computer template IDs.</p>
     */
    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    /**
     * <p>The ID of the shared cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The list of shared cloud computer IDs.</p>
     */
    @NameInMap("DesktopGroupIds")
    public java.util.List<String> desktopGroupIds;

    /**
     * <p>The name of the shared cloud computer to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudComputerPool01</p>
     */
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    /**
     * <p>The cloud computer specification. You can call the <a href="~~DescribeDesktopTypes~~">DescribeDesktopTypes</a> operation to query the supported specification IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>eds.enterprise_office.16c64g</p>
     */
    @NameInMap("DesktopType")
    public String desktopType;

    /**
     * <p>The list of IDs of authorized users for the shared cloud computer.</p>
     */
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>The list of authorized users to exclude.</p>
     */
    @NameInMap("ExcludedEndUserIds")
    public java.util.List<String> excludedEndUserIds;

    /**
     * <p>The list of image IDs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The number of entries per page for paging in a paged query.
     * Maximum value: 100.
     * Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Specifies whether the shared cloud computer is a multi-resource shared cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MultiResource")
    public Boolean multiResource;

    /**
     * <p>The pagination token for the next query. An empty value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the office network to which the shared cloud computer belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-467671****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The type of the shared cloud computer.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OwnType")
    public Long ownType;

    /**
     * <p>The subscription duration of the shared cloud computer. The unit is specified by PeriodUnit.</p>
     * <ul>
     * <li>If PeriodUnit is set to Month, valid values:<ul>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>6</li>
     * </ul>
     * </li>
     * <li>If PeriodUnit is set to Year, valid values:<ul>
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
     * <p>The time unit of the subscription billing Billable methods.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy associated with the shared cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-53iyi2aar0nd6****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The ID of the bandwidth throttling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-5605u0gelk200****</p>
     */
    @NameInMap("QosRuleId")
    public String qosRuleId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Wuying Cloud Computer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the shared cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The list of tags. You can specify 1 to 20 tags.</p>
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

    public DescribeDesktopGroupsRequest setDesktopGroupIds(java.util.List<String> desktopGroupIds) {
        this.desktopGroupIds = desktopGroupIds;
        return this;
    }
    public java.util.List<String> getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    public DescribeDesktopGroupsRequest setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    public DescribeDesktopGroupsRequest setDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public String getDesktopType() {
        return this.desktopType;
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

    public DescribeDesktopGroupsRequest setMultiResource(Boolean multiResource) {
        this.multiResource = multiResource;
        return this;
    }
    public Boolean getMultiResource() {
        return this.multiResource;
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

    public DescribeDesktopGroupsRequest setQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
        return this;
    }
    public String getQosRuleId() {
        return this.qosRuleId;
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
         * <p>The tag key. The value cannot be an empty string. It can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be an empty string. It can be up to 128 characters in length, and cannot start with <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>.</p>
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
