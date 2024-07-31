// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceConsumeTimeRankResponseBody extends TeaModel {
    /**
     * <p>The ranking record of the running durations of instances.</p>
     */
    @NameInMap("InstanceConsumeTimeRank")
    public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRank instanceConsumeTimeRank;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6347364dadsfadf****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceConsumeTimeRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsumeTimeRankResponseBody self = new GetInstanceConsumeTimeRankResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsumeTimeRankResponseBody setInstanceConsumeTimeRank(GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRank instanceConsumeTimeRank) {
        this.instanceConsumeTimeRank = instanceConsumeTimeRank;
        return this;
    }
    public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRank getInstanceConsumeTimeRank() {
        return this.instanceConsumeTimeRank;
    }

    public GetInstanceConsumeTimeRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank extends TeaModel {
        /**
         * <p>The data timestamp of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1600963200000</p>
         */
        @NameInMap("Bizdate")
        public Long bizdate;

        /**
         * <p>The running duration of the instance. Unit: seconds.</p>
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

        public static GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank self = new GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank setBizdate(Long bizdate) {
            this.bizdate = bizdate;
            return this;
        }
        public Long getBizdate() {
            return this.bizdate;
        }

        public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank setConsumed(Long consumed) {
            this.consumed = consumed;
            return this;
        }
        public Long getConsumed() {
            return this.consumed;
        }

        public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank setPrgType(Integer prgType) {
            this.prgType = prgType;
            return this;
        }
        public Integer getPrgType() {
            return this.prgType;
        }

    }

    public static class GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRank extends TeaModel {
        /**
         * <p>The ranking data of the running durations of instances.</p>
         */
        @NameInMap("ConsumeTimeRank")
        public java.util.List<GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank;

        /**
         * <p>The timestamp when the ranking was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1600963200000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRank self = new GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRank setConsumeTimeRank(java.util.List<GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank) {
            this.consumeTimeRank = consumeTimeRank;
            return this;
        }
        public java.util.List<GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRankConsumeTimeRank> getConsumeTimeRank() {
            return this.consumeTimeRank;
        }

        public GetInstanceConsumeTimeRankResponseBodyInstanceConsumeTimeRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
