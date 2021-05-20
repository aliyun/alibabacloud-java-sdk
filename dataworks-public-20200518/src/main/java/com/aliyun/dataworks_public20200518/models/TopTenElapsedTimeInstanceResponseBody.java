// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenElapsedTimeInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceConsumeTimeRank")
    public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank instanceConsumeTimeRank;

    public static TopTenElapsedTimeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TopTenElapsedTimeInstanceResponseBody self = new TopTenElapsedTimeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TopTenElapsedTimeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TopTenElapsedTimeInstanceResponseBody setInstanceConsumeTimeRank(TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank instanceConsumeTimeRank) {
        this.instanceConsumeTimeRank = instanceConsumeTimeRank;
        return this;
    }
    public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank getInstanceConsumeTimeRank() {
        return this.instanceConsumeTimeRank;
    }

    public static class TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("BusinessDate")
        public Long businessDate;

        @NameInMap("ProgramType")
        public Integer programType;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("Consumed")
        public Long consumed;

        public static TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank self = new TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setBusinessDate(Long businessDate) {
            this.businessDate = businessDate;
            return this;
        }
        public Long getBusinessDate() {
            return this.businessDate;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setProgramType(Integer programType) {
            this.programType = programType;
            return this;
        }
        public Integer getProgramType() {
            return this.programType;
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

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank setConsumed(Long consumed) {
            this.consumed = consumed;
            return this;
        }
        public Long getConsumed() {
            return this.consumed;
        }

    }

    public static class TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("ConsumeTimeRank")
        public java.util.List<TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank;

        public static TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank self = new TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank();
            return TeaModel.build(map, self);
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank setConsumeTimeRank(java.util.List<TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank) {
            this.consumeTimeRank = consumeTimeRank;
            return this;
        }
        public java.util.List<TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank> getConsumeTimeRank() {
            return this.consumeTimeRank;
        }

    }

}
