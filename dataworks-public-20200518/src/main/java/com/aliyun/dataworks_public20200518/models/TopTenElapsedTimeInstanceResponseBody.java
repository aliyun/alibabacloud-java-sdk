// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenElapsedTimeInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceConsumeTimeRank")
    public TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRank instanceConsumeTimeRank;

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
        @NameInMap("BusinessDate")
        public Long businessDate;

        @NameInMap("Consumed")
        public Long consumed;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Owner")
        public String owner;

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
        @NameInMap("ConsumeTimeRank")
        public java.util.List<TopTenElapsedTimeInstanceResponseBodyInstanceConsumeTimeRankConsumeTimeRank> consumeTimeRank;

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
