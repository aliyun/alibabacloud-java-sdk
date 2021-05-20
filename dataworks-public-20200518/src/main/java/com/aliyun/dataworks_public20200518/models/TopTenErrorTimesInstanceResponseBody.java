// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenErrorTimesInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceErrorRank")
    public TopTenErrorTimesInstanceResponseBodyInstanceErrorRank instanceErrorRank;

    public static TopTenErrorTimesInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TopTenErrorTimesInstanceResponseBody self = new TopTenErrorTimesInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TopTenErrorTimesInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TopTenErrorTimesInstanceResponseBody setInstanceErrorRank(TopTenErrorTimesInstanceResponseBodyInstanceErrorRank instanceErrorRank) {
        this.instanceErrorRank = instanceErrorRank;
        return this;
    }
    public TopTenErrorTimesInstanceResponseBodyInstanceErrorRank getInstanceErrorRank() {
        return this.instanceErrorRank;
    }

    public static class TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProgramType")
        public Integer programType;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("Count")
        public Integer count;

        public static TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank self = new TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank();
            return TeaModel.build(map, self);
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setProgramType(Integer programType) {
            this.programType = programType;
            return this;
        }
        public Integer getProgramType() {
            return this.programType;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class TopTenErrorTimesInstanceResponseBodyInstanceErrorRank extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("ErrorRank")
        public java.util.List<TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank> errorRank;

        public static TopTenErrorTimesInstanceResponseBodyInstanceErrorRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenErrorTimesInstanceResponseBodyInstanceErrorRank self = new TopTenErrorTimesInstanceResponseBodyInstanceErrorRank();
            return TeaModel.build(map, self);
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public TopTenErrorTimesInstanceResponseBodyInstanceErrorRank setErrorRank(java.util.List<TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank> errorRank) {
            this.errorRank = errorRank;
            return this;
        }
        public java.util.List<TopTenErrorTimesInstanceResponseBodyInstanceErrorRankErrorRank> getErrorRank() {
            return this.errorRank;
        }

    }

}
