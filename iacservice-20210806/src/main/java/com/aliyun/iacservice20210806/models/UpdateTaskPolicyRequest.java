// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateTaskPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("taskPolicies")
    public java.util.List<UpdateTaskPolicyRequestTaskPolicies> taskPolicies;

    public static UpdateTaskPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskPolicyRequest self = new UpdateTaskPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTaskPolicyRequest setTaskPolicies(java.util.List<UpdateTaskPolicyRequestTaskPolicies> taskPolicies) {
        this.taskPolicies = taskPolicies;
        return this;
    }
    public java.util.List<UpdateTaskPolicyRequestTaskPolicies> getTaskPolicies() {
        return this.taskPolicies;
    }

    public static class UpdateTaskPolicyRequestTaskPolicies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("priority")
        public String priority;

        /**
         * <strong>example:</strong>
         * <p>task-60f24b4eb47f1135b7b14ddbdfd</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>SceneTestingTask</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateTaskPolicyRequestTaskPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskPolicyRequestTaskPolicies self = new UpdateTaskPolicyRequestTaskPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateTaskPolicyRequestTaskPolicies setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public UpdateTaskPolicyRequestTaskPolicies setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public UpdateTaskPolicyRequestTaskPolicies setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
