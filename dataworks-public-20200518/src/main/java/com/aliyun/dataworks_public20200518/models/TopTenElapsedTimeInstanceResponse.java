// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenElapsedTimeInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceConsumeTimeRank")
    @Validation(required = true)
    public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRank instanceConsumeTimeRank;

    public static TopTenElapsedTimeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TopTenElapsedTimeInstanceResponse self = new TopTenElapsedTimeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TopTenElapsedTimeInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TopTenElapsedTimeInstanceResponse setInstanceConsumeTimeRank(TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRank instanceConsumeTimeRank) {
        this.instanceConsumeTimeRank = instanceConsumeTimeRank;
        return this;
    }
    public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRank getInstanceConsumeTimeRank() {
        return this.instanceConsumeTimeRank;
    }

    public static class TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank extends TeaModel {
        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("BusinessDate")
        @Validation(required = true)
        public Long businessDate;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("Consumed")
        @Validation(required = true)
        public Long consumed;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public Long instanceId;

        @NameInMap("ProgramType")
        @Validation(required = true)
        public Integer programType;

        public static TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank self = new TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank setBusinessDate(Long businessDate) {
            this.businessDate = businessDate;
            return this;
        }
        public Long getBusinessDate() {
            return this.businessDate;
        }

        public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank setConsumed(Long consumed) {
            this.consumed = consumed;
            return this;
        }
        public Long getConsumed() {
            return this.consumed;
        }

        public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank setProgramType(Integer programType) {
            this.programType = programType;
            return this;
        }
        public Integer getProgramType() {
            return this.programType;
        }

    }

    public static class TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRank extends TeaModel {
        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("ConsumeTimeRank")
        @Validation(required = true)
        public java.util.List<TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank;

        public static TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRank self = new TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRank setConsumeTimeRank(java.util.List<TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank) {
            this.consumeTimeRank = consumeTimeRank;
            return this;
        }
        public java.util.List<TopTenElapsedTimeInstanceResponseInstanceConsumeTimeRankConsumeTimeRank> getConsumeTimeRank() {
            return this.consumeTimeRank;
        }

    }

}
