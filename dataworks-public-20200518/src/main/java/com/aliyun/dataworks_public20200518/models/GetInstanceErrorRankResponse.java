// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceErrorRankResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceErrorRank")
    @Validation(required = true)
    public GetInstanceErrorRankResponseInstanceErrorRank instanceErrorRank;

    public static GetInstanceErrorRankResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceErrorRankResponse self = new GetInstanceErrorRankResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceErrorRankResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceErrorRankResponse setInstanceErrorRank(GetInstanceErrorRankResponseInstanceErrorRank instanceErrorRank) {
        this.instanceErrorRank = instanceErrorRank;
        return this;
    }
    public GetInstanceErrorRankResponseInstanceErrorRank getInstanceErrorRank() {
        return this.instanceErrorRank;
    }

    public static class GetInstanceErrorRankResponseInstanceErrorRankErrorRank extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("PrgType")
        @Validation(required = true)
        public Integer prgType;

        public static GetInstanceErrorRankResponseInstanceErrorRankErrorRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceErrorRankResponseInstanceErrorRankErrorRank self = new GetInstanceErrorRankResponseInstanceErrorRankErrorRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceErrorRankResponseInstanceErrorRankErrorRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetInstanceErrorRankResponseInstanceErrorRankErrorRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetInstanceErrorRankResponseInstanceErrorRankErrorRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetInstanceErrorRankResponseInstanceErrorRankErrorRank setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetInstanceErrorRankResponseInstanceErrorRankErrorRank setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetInstanceErrorRankResponseInstanceErrorRankErrorRank setPrgType(Integer prgType) {
            this.prgType = prgType;
            return this;
        }
        public Integer getPrgType() {
            return this.prgType;
        }

    }

    public static class GetInstanceErrorRankResponseInstanceErrorRank extends TeaModel {
        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("ErrorRank")
        @Validation(required = true)
        public java.util.List<GetInstanceErrorRankResponseInstanceErrorRankErrorRank> errorRank;

        public static GetInstanceErrorRankResponseInstanceErrorRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceErrorRankResponseInstanceErrorRank self = new GetInstanceErrorRankResponseInstanceErrorRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceErrorRankResponseInstanceErrorRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetInstanceErrorRankResponseInstanceErrorRank setErrorRank(java.util.List<GetInstanceErrorRankResponseInstanceErrorRankErrorRank> errorRank) {
            this.errorRank = errorRank;
            return this;
        }
        public java.util.List<GetInstanceErrorRankResponseInstanceErrorRankErrorRank> getErrorRank() {
            return this.errorRank;
        }

    }

}
