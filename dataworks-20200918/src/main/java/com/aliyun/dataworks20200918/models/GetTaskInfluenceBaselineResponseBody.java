// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetTaskInfluenceBaselineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfluence")
    public GetTaskInfluenceBaselineResponseBodyTaskInfluence taskInfluence;

    public static GetTaskInfluenceBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInfluenceBaselineResponseBody self = new GetTaskInfluenceBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskInfluenceBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskInfluenceBaselineResponseBody setTaskInfluence(GetTaskInfluenceBaselineResponseBodyTaskInfluence taskInfluence) {
        this.taskInfluence = taskInfluence;
        return this;
    }
    public GetTaskInfluenceBaselineResponseBodyTaskInfluence getTaskInfluence() {
        return this.taskInfluence;
    }

    public static class GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences extends TeaModel {
        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("BaselineName")
        public String baselineName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("ProjectId")
        public Long projectId;

        public static GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences self = new GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences();
            return TeaModel.build(map, self);
        }

        public GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

        public GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetTaskInfluenceBaselineResponseBodyTaskInfluence extends TeaModel {
        @NameInMap("Influences")
        public java.util.List<GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences> influences;

        @NameInMap("TaskId")
        public Long taskId;

        public static GetTaskInfluenceBaselineResponseBodyTaskInfluence build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInfluenceBaselineResponseBodyTaskInfluence self = new GetTaskInfluenceBaselineResponseBodyTaskInfluence();
            return TeaModel.build(map, self);
        }

        public GetTaskInfluenceBaselineResponseBodyTaskInfluence setInfluences(java.util.List<GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences> influences) {
            this.influences = influences;
            return this;
        }
        public java.util.List<GetTaskInfluenceBaselineResponseBodyTaskInfluenceInfluences> getInfluences() {
            return this.influences;
        }

        public GetTaskInfluenceBaselineResponseBodyTaskInfluence setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
