// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceConsumeTimeRankResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceConsumeTimeRank")
    @Validation(required = true)
    public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRank instanceConsumeTimeRank;

    public static GetInstanceConsumeTimeRankResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsumeTimeRankResponse self = new GetInstanceConsumeTimeRankResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsumeTimeRankResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceConsumeTimeRankResponse setInstanceConsumeTimeRank(GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRank instanceConsumeTimeRank) {
        this.instanceConsumeTimeRank = instanceConsumeTimeRank;
        return this;
    }
    public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRank getInstanceConsumeTimeRank() {
        return this.instanceConsumeTimeRank;
    }

    public static class GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank extends TeaModel {
        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("Bizdate")
        @Validation(required = true)
        public Long bizdate;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("Consumed")
        @Validation(required = true)
        public Long consumed;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("PrgType")
        @Validation(required = true)
        public Integer prgType;

        public static GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank self = new GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank setConsumed(Long consumed) {
            this.consumed = consumed;
            return this;
        }
        public Long getConsumed() {
            return this.consumed;
        }

        public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank setPrgType(Integer prgType) {
            this.prgType = prgType;
            return this;
        }
        public Integer getPrgType() {
            return this.prgType;
        }

    }

    public static class GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRank extends TeaModel {
        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("ConsumeTimeRank")
        @Validation(required = true)
        public java.util.List<GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank;

        public static GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRank self = new GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRank setConsumeTimeRank(java.util.List<GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank) {
            this.consumeTimeRank = consumeTimeRank;
            return this;
        }
        public java.util.List<GetInstanceConsumeTimeRankResponseInstanceConsumeTimeRankConsumeTimeRank> getConsumeTimeRank() {
            return this.consumeTimeRank;
        }

    }

}
