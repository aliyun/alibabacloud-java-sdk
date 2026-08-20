// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetPoolResponseBody extends TeaModel {
    /**
     * <p>The resource pool information.</p>
     */
    @NameInMap("PoolInfo")
    public GetPoolResponseBodyPoolInfo poolInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPoolResponseBody self = new GetPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPoolResponseBody setPoolInfo(GetPoolResponseBodyPoolInfo poolInfo) {
        this.poolInfo = poolInfo;
        return this;
    }
    public GetPoolResponseBodyPoolInfo getPoolInfo() {
        return this.poolInfo;
    }

    public GetPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPoolResponseBodyPoolInfoTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetPoolResponseBodyPoolInfoTags build(java.util.Map<String, ?> map) throws Exception {
            GetPoolResponseBodyPoolInfoTags self = new GetPoolResponseBodyPoolInfoTags();
            return TeaModel.build(map, self);
        }

        public GetPoolResponseBodyPoolInfoTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetPoolResponseBodyPoolInfoTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPoolResponseBodyPoolInfo extends TeaModel {
        /**
         * <p>The time when the resource pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01 20:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the resource pool creator.</p>
         * 
         * <strong>example:</strong>
         * <p>200428053788xxxx</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The number of executor nodes that are currently running in the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ExecutorUsage")
        public Integer executorUsage;

        /**
         * <p>Indicates whether the resource pool is the default resource pool. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The maximum number of executor nodes that can run concurrently in the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxExecutorNum")
        public Integer maxExecutorNum;

        /**
         * <p>The resource pool name.</p>
         * <ul>
         * <li>The name can be up to 15 characters in length.</li>
         * <li>The name can contain digits, uppercase letters, lowercase letters, underscores (_), and periods (.).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PoolTest</p>
         */
        @NameInMap("PoolName")
        public String poolName;

        /**
         * <p>The priority of the resource pool.</p>
         * <ul>
         * <li>Valid values: 1 to 99. Default value: 1, which indicates the lowest priority.</li>
         * <li>Jobs submitted to a resource pool with a higher priority value are scheduled before pending jobs in a resource pool with a lower priority value. The resource pool priority takes precedence over the job priority.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The error reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Fails to *** pool: ***.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The scheduling policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-xxx</p>
         */
        @NameInMap("SchedulingPolicyId")
        public String schedulingPolicyId;

        /**
         * <p>The resource pool status. Valid values:</p>
         * <ul>
         * <li>Creating: The resource pool is being created.</li>
         * <li>Updating: The resource pool is being updated.</li>
         * <li>Deleting: The resource pool is being deleted.</li>
         * <li>Working: The resource pool is running.</li>
         * <li>Deleted: The resource pool has been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Working</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag information.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetPoolResponseBodyPoolInfoTags> tags;

        /**
         * <p>The time when the resource pool was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01 20:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetPoolResponseBodyPoolInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPoolResponseBodyPoolInfo self = new GetPoolResponseBodyPoolInfo();
            return TeaModel.build(map, self);
        }

        public GetPoolResponseBodyPoolInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPoolResponseBodyPoolInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetPoolResponseBodyPoolInfo setExecutorUsage(Integer executorUsage) {
            this.executorUsage = executorUsage;
            return this;
        }
        public Integer getExecutorUsage() {
            return this.executorUsage;
        }

        public GetPoolResponseBodyPoolInfo setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetPoolResponseBodyPoolInfo setMaxExecutorNum(Integer maxExecutorNum) {
            this.maxExecutorNum = maxExecutorNum;
            return this;
        }
        public Integer getMaxExecutorNum() {
            return this.maxExecutorNum;
        }

        public GetPoolResponseBodyPoolInfo setPoolName(String poolName) {
            this.poolName = poolName;
            return this;
        }
        public String getPoolName() {
            return this.poolName;
        }

        public GetPoolResponseBodyPoolInfo setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetPoolResponseBodyPoolInfo setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetPoolResponseBodyPoolInfo setSchedulingPolicyId(String schedulingPolicyId) {
            this.schedulingPolicyId = schedulingPolicyId;
            return this;
        }
        public String getSchedulingPolicyId() {
            return this.schedulingPolicyId;
        }

        public GetPoolResponseBodyPoolInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPoolResponseBodyPoolInfo setTags(java.util.List<GetPoolResponseBodyPoolInfoTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetPoolResponseBodyPoolInfoTags> getTags() {
            return this.tags;
        }

        public GetPoolResponseBodyPoolInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
