// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenErrorTimesInstanceResponseBody extends TeaModel {
    /**
     * <p>The ranking of nodes on which errors occur.</p>
     */
    @NameInMap("InstanceErrorRank")
    public TopTenErrorTimesInstanceResponseBodyInstanceErrorRank instanceErrorRank;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
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
         * <p>The number of errors that occur on the node.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The user identifier (UID) of the Alibaba Cloud account used by the owner of the node.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The type of the node.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>6 (Shell node), 10 (ODPS SQL node), 11 (ODPS MR node), 23 (Data Integration node), 24 (ODPS Script node), 99 (zero load node), 221 (PyODPS 2 node), 225 (ODPS Spark node), 227 (EMR Hive node), 228 (EMR Spark node), 229 (EMR Spark SQL node), 230 (EMR MR node), 239 (OSS object inspection node), 257 (EMR Shell node), 258 (EMR Spark Shell node), 259 (EMR Presto node), 260 (EMR Impala node), 900 (real-time data synchronization node), 1089 (cross-tenant collaboration node), 1091 (Hologres development node), 1093 (Hologres SQL node), 1100 (assignment node), and 1221 (PyODPS 3 node).</p>
         */
        @NameInMap("ProgramType")
        public Integer programType;

        /**
         * <p>The ID of the DataWorks workspace.</p>
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
         * <p>The ranking of nodes on which errors occur within the last month.</p>
         */
        @NameInMap("ErrorRank")
        public java.util.List<TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank> errorRank;

        /**
         * <p>The time when the ranking was updated.</p>
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
