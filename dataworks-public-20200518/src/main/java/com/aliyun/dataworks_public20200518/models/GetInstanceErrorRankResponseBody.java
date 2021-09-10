// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceErrorRankResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceErrorRank")
    public GetInstanceErrorRankResponseBodyInstanceErrorRank instanceErrorRank;

    public static GetInstanceErrorRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceErrorRankResponseBody self = new GetInstanceErrorRankResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceErrorRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceErrorRankResponseBody setInstanceErrorRank(GetInstanceErrorRankResponseBodyInstanceErrorRank instanceErrorRank) {
        this.instanceErrorRank = instanceErrorRank;
        return this;
    }
    public GetInstanceErrorRankResponseBodyInstanceErrorRank getInstanceErrorRank() {
        return this.instanceErrorRank;
    }

    public static class GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("PrgType")
        public Integer prgType;

        public static GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank self = new GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank setPrgType(Integer prgType) {
            this.prgType = prgType;
            return this;
        }
        public Integer getPrgType() {
            return this.prgType;
        }

    }

    public static class GetInstanceErrorRankResponseBodyInstanceErrorRank extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("ErrorRank")
        public java.util.List<GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank> errorRank;

        public static GetInstanceErrorRankResponseBodyInstanceErrorRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceErrorRankResponseBodyInstanceErrorRank self = new GetInstanceErrorRankResponseBodyInstanceErrorRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetInstanceErrorRankResponseBodyInstanceErrorRank setErrorRank(java.util.List<GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank> errorRank) {
            this.errorRank = errorRank;
            return this;
        }
        public java.util.List<GetInstanceErrorRankResponseBodyInstanceErrorRankErrorRank> getErrorRank() {
            return this.errorRank;
        }

    }

}
