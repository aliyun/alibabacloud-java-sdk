// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetPoolResponseBody extends TeaModel {
    /**
     * <p>The information about the resource pool.</p>
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

    public static class GetPoolResponseBodyPoolInfo extends TeaModel {
        /**
         * <p>The time when the resource pool is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-01 20:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The usage of execution nodes that are running in a resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExectorUsage")
        public Integer exectorUsage;

        /**
         * <p>Indices whether the resource pool is the default resource pool. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The maximum number of execution nodes that can run concurrently in a resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxExectorNum")
        public Integer maxExectorNum;

        /**
         * <p>The name of the resource group.</p>
         * <ul>
         * <li>The value can be up to 15 characters in length.</li>
         * <li>It can contain digits, uppercase letters, lowercase letters, underscores (_), and dots (.).</li>
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
         * <li>You can set a priority in the range of 1 to 99. The default value is 1, which is the lowest priority.</li>
         * <li>Jobs submitted to a resource pool with a higher priority level value will be scheduled before pending jobs in a resource pool with a lower priority level value, and the priority level of the resource pool takes precedence over the priority of the job.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The cause of the error.</p>
         * 
         * <strong>example:</strong>
         * <p>Fails to *** pool: ***.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the resource pool. Valid values:</p>
         * <ul>
         * <li>Creating: The resource pool is being created.</li>
         * <li>Updating: The resource pool is being updated.</li>
         * <li>Deleting: The resource pool is being deleted.</li>
         * <li>Working: The resource pool is working.</li>
         * <li>Deleted: The resource pool is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Working</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the resource pool was updated.</p>
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

        public GetPoolResponseBodyPoolInfo setExectorUsage(Integer exectorUsage) {
            this.exectorUsage = exectorUsage;
            return this;
        }
        public Integer getExectorUsage() {
            return this.exectorUsage;
        }

        public GetPoolResponseBodyPoolInfo setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetPoolResponseBodyPoolInfo setMaxExectorNum(Integer maxExectorNum) {
            this.maxExectorNum = maxExectorNum;
            return this;
        }
        public Integer getMaxExectorNum() {
            return this.maxExectorNum;
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

        public GetPoolResponseBodyPoolInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
