// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeActivationsResponseBody extends TeaModel {
    /**
     * <p>The activation codes and their usage information.</p>
     */
    @NameInMap("ActivationList")
    public java.util.List<DescribeActivationsResponseBodyActivationList> activationList;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4ECEEE12-56F1-4FBC-9AB1-890F74625134</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeActivationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationsResponseBody self = new DescribeActivationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActivationsResponseBody setActivationList(java.util.List<DescribeActivationsResponseBodyActivationList> activationList) {
        this.activationList = activationList;
        return this;
    }
    public java.util.List<DescribeActivationsResponseBodyActivationList> getActivationList() {
        return this.activationList;
    }

    public DescribeActivationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeActivationsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActivationsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeActivationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActivationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeActivationsResponseBodyActivationListTags extends TeaModel {
        /**
         * <p>The tag key of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeActivationsResponseBodyActivationListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeActivationsResponseBodyActivationListTags self = new DescribeActivationsResponseBodyActivationListTags();
            return TeaModel.build(map, self);
        }

        public DescribeActivationsResponseBodyActivationListTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeActivationsResponseBodyActivationListTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeActivationsResponseBodyActivationList extends TeaModel {
        /**
         * <p>The ID of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>4ECEEE12-56F1-4FBC-9AB1-890F1234****</p>
         */
        @NameInMap("ActivationId")
        public String activationId;

        /**
         * <p>The time when the activation code was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-20T06:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The number of instances that were deregistered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DeregisteredCount")
        public Integer deregisteredCount;

        /**
         * <p>The description of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the activation code is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Disabled")
        public Boolean disabled;

        /**
         * <p>The maximum number of times that the activation code can be used to register managed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The default instance name prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>test-InstanceName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The IP addresses of hosts that are allowed to use the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("IpAddressRange")
        public String ipAddressRange;

        /**
         * <p>The number of instances that were registered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RegisteredCount")
        public Integer registeredCount;

        /**
         * <p>The ID of the resource group to which the activation code belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-123******</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags of the activation code.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeActivationsResponseBodyActivationListTags> tags;

        /**
         * <p>The validity period of the activation code. Unit: hours.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TimeToLiveInHours")
        public Long timeToLiveInHours;

        public static DescribeActivationsResponseBodyActivationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeActivationsResponseBodyActivationList self = new DescribeActivationsResponseBodyActivationList();
            return TeaModel.build(map, self);
        }

        public DescribeActivationsResponseBodyActivationList setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DescribeActivationsResponseBodyActivationList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeActivationsResponseBodyActivationList setDeregisteredCount(Integer deregisteredCount) {
            this.deregisteredCount = deregisteredCount;
            return this;
        }
        public Integer getDeregisteredCount() {
            return this.deregisteredCount;
        }

        public DescribeActivationsResponseBodyActivationList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeActivationsResponseBodyActivationList setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeActivationsResponseBodyActivationList setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeActivationsResponseBodyActivationList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeActivationsResponseBodyActivationList setIpAddressRange(String ipAddressRange) {
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        public DescribeActivationsResponseBodyActivationList setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        public DescribeActivationsResponseBodyActivationList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeActivationsResponseBodyActivationList setTags(java.util.List<DescribeActivationsResponseBodyActivationListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeActivationsResponseBodyActivationListTags> getTags() {
            return this.tags;
        }

        public DescribeActivationsResponseBodyActivationList setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

    }

}
