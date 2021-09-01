// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenErrorTimesInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceErrorRank")
    @Validation(required = true)
    public TopTenErrorTimesInstanceResponseInstanceErrorRank instanceErrorRank;

    public static TopTenErrorTimesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TopTenErrorTimesInstanceResponse self = new TopTenErrorTimesInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TopTenErrorTimesInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TopTenErrorTimesInstanceResponse setInstanceErrorRank(TopTenErrorTimesInstanceResponseInstanceErrorRank instanceErrorRank) {
        this.instanceErrorRank = instanceErrorRank;
        return this;
    }
    public TopTenErrorTimesInstanceResponseInstanceErrorRank getInstanceErrorRank() {
        return this.instanceErrorRank;
    }

    public static class TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank extends TeaModel {
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

        @NameInMap("ProgramType")
        @Validation(required = true)
        public Integer programType;

        public static TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank self = new TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank();
            return TeaModel.build(map, self);
        }

        public TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank setProgramType(Integer programType) {
            this.programType = programType;
            return this;
        }
        public Integer getProgramType() {
            return this.programType;
        }

    }

    public static class TopTenErrorTimesInstanceResponseInstanceErrorRank extends TeaModel {
        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("ErrorRank")
        @Validation(required = true)
        public java.util.List<TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank> errorRank;

        public static TopTenErrorTimesInstanceResponseInstanceErrorRank build(java.util.Map<String, ?> map) throws Exception {
            TopTenErrorTimesInstanceResponseInstanceErrorRank self = new TopTenErrorTimesInstanceResponseInstanceErrorRank();
            return TeaModel.build(map, self);
        }

        public TopTenErrorTimesInstanceResponseInstanceErrorRank setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public TopTenErrorTimesInstanceResponseInstanceErrorRank setErrorRank(java.util.List<TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank> errorRank) {
            this.errorRank = errorRank;
            return this;
        }
        public java.util.List<TopTenErrorTimesInstanceResponseInstanceErrorRankErrorRank> getErrorRank() {
            return this.errorRank;
        }

    }

}
