// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenElapsedTimeInstanceResponseBody extends TeaModel {
    /**
     * <p>The ranking record of the running durations of the instances.</p>
     */
    @NameInMap("InstanceConsumeTimeRank")
    public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank instanceConsumeTimeRank;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6347364dadsfadf****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TopTenElapsedTimeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TopTenElapsedTimeInstanceResponseBody self = new TopTenElapsedTimeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TopTenElapsedTimeInstanceResponseBody setInstanceConsumeTimeRank(TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank instanceConsumeTimeRank) {
        this.instanceConsumeTimeRank = instanceConsumeTimeRank;
        return this;
    }
    public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank getInstanceConsumeTimeRank() {
        return this.instanceConsumeTimeRank;
    }

    public TopTenElapsedTimeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank extends TeaModel {
        /**
         * <p>The data timestamp of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1600963200000</p>
         */
        @NameInMap("BusinessDate")
        public Long businessDate;

        /**
         * <p>The run time length of the instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Consumed")
        public Long consumed;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95279527</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9527</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Node name</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>952795279527</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The type of the node. Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ProgramType")
        public Integer programType;

        public static TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank self = new TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setBusinessDate(Long businessDate) {
            this.businessDate = businessDate;
            return this;
        }
        public Long getBusinessDate() {
            return this.businessDate;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setConsumed(Long consumed) {
            this.consumed = consumed;
            return this;
        }
        public Long getConsumed() {
            return this.consumed;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setProgramType(Integer programType) {
            this.programType = programType;
            return this;
        }
        public Integer getProgramType() {
            return this.programType;
        }

    }

    public static class TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank extends TeaModel {
        /**
         * <p>The ranking data of the running durations of the instances.</p>
         */
        @NameInMap("ConsumeTimeRank")
        public java.util.List<TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank;

        /**
         * <p>The timestamp at which the ranking of the running durations of the instances was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1600963200000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank self = new TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank setConsumeTimeRank(java.util.List<TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank) {
            this.consumeTimeRank = consumeTimeRank;
            return this;
        }
        public java.util.List<TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank> getConsumeTimeRank() {
            return this.consumeTimeRank;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
