// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceErrorRankResponseBody extends TeaModel {
    /**
     * <p>The ranking data of nodes on which errors occurred.</p>
     */
    @NameInMap("InstanceErrorRank")
    public GetInstanceErrorRankResponseBodyInstanceErrorRank instanceErrorRank;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>952795279527****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceErrorRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceErrorRankResponseBody self = new GetInstanceErrorRankResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceErrorRankResponseBody setInstanceErrorRank(GetInstanceErrorRankResponseBodyInstanceErrorRank instanceErrorRank) {
        this.instanceErrorRank = instanceErrorRank;
        return this;
    }
    public GetInstanceErrorRankResponseBodyInstanceErrorRank getInstanceErrorRank() {
        return this.instanceErrorRank;
    }

    public GetInstanceErrorRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank extends TeaModel {
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
         * <p>The type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PrgType")
        public Integer prgType;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9527</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank self = new GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setPrgType(Integer prgType) {
            this.prgType = prgType;
            return this;
        }
        public Integer getPrgType() {
            return this.prgType;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetInstanceErrorRankResponseBodyInstanceErrorRank extends TeaModel {
        /**
         * <p>The ranking data of nodes on which errors occurred within the last month.</p>
         */
        @NameInMap("ErrorRank")
        public java.util.List<GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank> errorRank;

        /**
         * <p>The timestamp at which the rankings were updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1600963200000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetInstanceErrorRankResponseBodyInstanceErrorRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceErrorRankResponseBodyInstanceErrorRank self = new GetInstanceErrorRankResponseBodyInstanceErrorRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRank setErrorRank(java.util.List<GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank> errorRank) {
            this.errorRank = errorRank;
            return this;
        }
        public java.util.List<GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank> getErrorRank() {
            return this.errorRank;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
