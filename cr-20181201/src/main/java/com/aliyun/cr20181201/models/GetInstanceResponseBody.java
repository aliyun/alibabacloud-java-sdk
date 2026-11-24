// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation time, in UNIX timestamp format. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1571926439000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance issue.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance issue. Valid values:
     * OSS_TOO_MANY_BUCKETS: The number of OSS buckets exceeds the limit.</p>
     * <p>OSS_BUCKET_ALREADY_EXISTS: An OSS bucket with the same name already exists.</p>
     * <p>OSS_SERVICE_ROLE_UNAUTHORIZED: OSS permissions are not authorized.</p>
     * <p>USER_NOT_REGISTERED_BY_REAL_NAME: The China site account has not completed real-name verification when purchasing an OSS bucket on the China site</p>
     */
    @NameInMap("InstanceIssue")
    public String instanceIssue;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>shanghai-instance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The instance specification. Valid values:
     * Enterprise_Basic: basic instance.
     * Enterprise_Standard: standard instance.
     * Enterprise_Advanced: advanced instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Enterprise_Basic</p>
     */
    @NameInMap("InstanceSpecification")
    public String instanceSpecification;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><p><code>PENDING</code>: Initializing.</p>
     * </li>
     * <li><p><code>INIT_ERROR</code>: Initialization failed.</p>
     * </li>
     * <li><p><code>STARTING</code>: Starting.</p>
     * </li>
     * <li><p><code>RUNNING</code>: Running.</p>
     * </li>
     * <li><p><code>STOPPING</code>: Stopping.</p>
     * </li>
     * <li><p><code>STOPPED</code>: Stopped.</p>
     * </li>
     * <li><p><code>DELETING</code>: Deleting.</p>
     * </li>
     * <li><p><code>DELETED</code>: Deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The call was successful.</p>
     * </li>
     * <li><p><code>false</code>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The modification time, in UNIX timestamp format. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1571926560000</p>
     */
    @NameInMap("ModifiedTime")
    public Long modifiedTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF34B18-4228-470C-860C-D28597CF010E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmv36i4isx****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag collection of the instance.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetInstanceResponseBodyTags> tags;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceResponseBody setInstanceIssue(String instanceIssue) {
        this.instanceIssue = instanceIssue;
        return this;
    }
    public String getInstanceIssue() {
        return this.instanceIssue;
    }

    public GetInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetInstanceResponseBody setInstanceSpecification(String instanceSpecification) {
        this.instanceSpecification = instanceSpecification;
        return this;
    }
    public String getInstanceSpecification() {
        return this.instanceSpecification;
    }

    public GetInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public GetInstanceResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetInstanceResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetInstanceResponseBody setTags(java.util.List<GetInstanceResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetInstanceResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetInstanceResponseBodyTags extends TeaModel {
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

        public static GetInstanceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyTags self = new GetInstanceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetInstanceResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
