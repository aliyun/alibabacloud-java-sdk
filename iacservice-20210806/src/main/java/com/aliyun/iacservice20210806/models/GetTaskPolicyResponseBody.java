// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTaskPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0D797DC3-FF04-5C21-81EB-92C7799512E3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskPolicy")
    public GetTaskPolicyResponseBodyTaskPolicy taskPolicy;

    public static GetTaskPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskPolicyResponseBody self = new GetTaskPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskPolicyResponseBody setTaskPolicy(GetTaskPolicyResponseBodyTaskPolicy taskPolicy) {
        this.taskPolicy = taskPolicy;
        return this;
    }
    public GetTaskPolicyResponseBodyTaskPolicy getTaskPolicy() {
        return this.taskPolicy;
    }

    public static class GetTaskPolicyResponseBodyTaskPolicyTaskPolicies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <strong>example:</strong>
         * <p>task-433aead7560571d0938bfbbe957</p>
         */
        @NameInMap("taskId")
        public String taskId;

        @NameInMap("taskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>SceneTestingTask</p>
         */
        @NameInMap("type")
        public String type;

        public static GetTaskPolicyResponseBodyTaskPolicyTaskPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetTaskPolicyResponseBodyTaskPolicyTaskPolicies self = new GetTaskPolicyResponseBodyTaskPolicyTaskPolicies();
            return TeaModel.build(map, self);
        }

        public GetTaskPolicyResponseBodyTaskPolicyTaskPolicies setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetTaskPolicyResponseBodyTaskPolicyTaskPolicies setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskPolicyResponseBodyTaskPolicyTaskPolicies setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTaskPolicyResponseBodyTaskPolicyTaskPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTaskPolicyResponseBodyTaskPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>g-433aead7560571e66e31274ffd3</p>
         */
        @NameInMap("groupId")
        public String groupId;

        @NameInMap("taskPolicies")
        public java.util.List<GetTaskPolicyResponseBodyTaskPolicyTaskPolicies> taskPolicies;

        public static GetTaskPolicyResponseBodyTaskPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetTaskPolicyResponseBodyTaskPolicy self = new GetTaskPolicyResponseBodyTaskPolicy();
            return TeaModel.build(map, self);
        }

        public GetTaskPolicyResponseBodyTaskPolicy setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetTaskPolicyResponseBodyTaskPolicy setTaskPolicies(java.util.List<GetTaskPolicyResponseBodyTaskPolicyTaskPolicies> taskPolicies) {
            this.taskPolicies = taskPolicies;
            return this;
        }
        public java.util.List<GetTaskPolicyResponseBodyTaskPolicyTaskPolicies> getTaskPolicies() {
            return this.taskPolicies;
        }

    }

}
