// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeEnterpriseSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of disks.</p>
     */
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    /**
     * <p>The maximum number of entries per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of enterprise-level snapshot policies.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the enterprise-level snapshot policy belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the enterprise-level snapshot policies. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeEnterpriseSnapshotPolicyRequestTag> tag;

    public static DescribeEnterpriseSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnterpriseSnapshotPolicyRequest self = new DescribeEnterpriseSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnterpriseSnapshotPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeEnterpriseSnapshotPolicyRequest setDiskIds(java.util.List<String> diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public java.util.List<String> getDiskIds() {
        return this.diskIds;
    }

    public DescribeEnterpriseSnapshotPolicyRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeEnterpriseSnapshotPolicyRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEnterpriseSnapshotPolicyRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnterpriseSnapshotPolicyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEnterpriseSnapshotPolicyRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public DescribeEnterpriseSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEnterpriseSnapshotPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeEnterpriseSnapshotPolicyRequest setTag(java.util.List<DescribeEnterpriseSnapshotPolicyRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeEnterpriseSnapshotPolicyRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeEnterpriseSnapshotPolicyRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the enterprise-level snapshot policy.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEnterpriseSnapshotPolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnterpriseSnapshotPolicyRequestTag self = new DescribeEnterpriseSnapshotPolicyRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeEnterpriseSnapshotPolicyRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEnterpriseSnapshotPolicyRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
