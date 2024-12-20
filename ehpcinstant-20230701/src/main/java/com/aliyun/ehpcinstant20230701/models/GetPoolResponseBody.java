// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetPoolResponseBody extends TeaModel {
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
         * <strong>example:</strong>
         * <p>2024-12-01 20:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExectorUsage")
        public Integer exectorUsage;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxExectorNum")
        public Integer maxExectorNum;

        /**
         * <strong>example:</strong>
         * <p>PoolTest</p>
         */
        @NameInMap("PoolName")
        public String poolName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>Fails to *** pool: ***.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>Working</p>
         */
        @NameInMap("Status")
        public String status;

        /**
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
