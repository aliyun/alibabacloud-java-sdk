// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenErrorTimesInstanceResponseBody extends TeaModel {
    /**
     * <p>The ranking data of nodes on which errors occurred.</p>
     */
    @NameInMap("InstanceErrorRank")
    public TopTenErrorTimesInstanceResponseBodyInstanceErrorRank instanceErrorRank;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>952795279527****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TopTenErrorTimesInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TopTenErrorTimesInstanceResponseBody self = new TopTenErrorTimesInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TopTenErrorTimesInstanceResponseBody setInstanceErrorRank(TopTenErrorTimesInstanceResponseBodyInstanceErrorRank instanceErrorRank) {
        this.instanceErrorRank = instanceErrorRank;
        return this;
    }
    public TopTenErrorTimesInstanceResponseBodyInstanceErrorRank getInstanceErrorRank() {
        return this.instanceErrorRank;
    }

    public TopTenErrorTimesInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank extends TeaModel {
        /**
         * <p>The number of errors that occurred on the node.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Integer count;

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

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9527</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank self = new TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank();
            return TeaModel.build(map, self);
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setProgramType(Integer programType) {
            this.programType = programType;
            return this;
        }
        public Integer getProgramType() {
            return this.programType;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class TopTenErrorTimesInstanceResponseBodyInstanceErrorRank extends TeaModel {
        /**
         * <p>The ranking data of nodes on which errors occurred within the last month.</p>
         */
        @NameInMap("ErrorRank")
        public java.util.List<TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank> errorRank;

        /**
         * <p>The timestamp at which the rankings were updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1600963200000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static TopTenErrorTimesInstanceResponseBodyInstanceErrorRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenErrorTimesInstanceResponseBodyInstanceErrorRank self = new TopTenErrorTimesInstanceResponseBodyInstanceErrorRank();
            return TeaModel.build(map, self);
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRank setErrorRank(java.util.List<TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank> errorRank) {
            this.errorRank = errorRank;
            return this;
        }
        public java.util.List<TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank> getErrorRank() {
            return this.errorRank;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
