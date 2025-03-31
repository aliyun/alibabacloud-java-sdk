// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The queried instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstanceResponseBodyInstances> instances;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A2A9BA68-B264-4953-9154-CE61B1C03BA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12121</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceResponseBody setInstances(java.util.List<ListInstanceResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstanceResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstanceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListInstanceResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceResponseBodyInstancesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test_key</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test_value</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListInstanceResponseBodyInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyInstancesTags self = new ListInstanceResponseBodyInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyInstancesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListInstanceResponseBodyInstancesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListInstanceResponseBodyInstances extends TeaModel {
        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1562849679000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-sgedpenzw80e****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The issue occurs on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>oss bucket already exists</p>
         */
        @NameInMap("InstanceIssue")
        public String instanceIssue;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The edition of the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise_Basic</p>
         */
        @NameInMap("InstanceSpecification")
        public String instanceSpecification;

        /**
         * <p>The status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1562849760000</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2h3aexpy****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListInstanceResponseBodyInstancesTags> tags;

        public static ListInstanceResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyInstances self = new ListInstanceResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstanceResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceResponseBodyInstances setInstanceIssue(String instanceIssue) {
            this.instanceIssue = instanceIssue;
            return this;
        }
        public String getInstanceIssue() {
            return this.instanceIssue;
        }

        public ListInstanceResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstanceResponseBodyInstances setInstanceSpecification(String instanceSpecification) {
            this.instanceSpecification = instanceSpecification;
            return this;
        }
        public String getInstanceSpecification() {
            return this.instanceSpecification;
        }

        public ListInstanceResponseBodyInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public ListInstanceResponseBodyInstances setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListInstanceResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstanceResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstanceResponseBodyInstances setTags(java.util.List<ListInstanceResponseBodyInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyInstancesTags> getTags() {
            return this.tags;
        }

    }

}
