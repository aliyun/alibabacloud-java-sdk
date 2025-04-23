// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateProjectBuildRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a65451293e64979ba7a4b573950217fe</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>refresh</p>
     */
    @NameInMap("projectBuildAction")
    public String projectBuildAction;

    @NameInMap("taskIds")
    public java.util.List<String> taskIds;

    @NameInMap("taskPolicies")
    public java.util.List<CreateProjectBuildRequestTaskPolicies> taskPolicies;

    public static CreateProjectBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectBuildRequest self = new CreateProjectBuildRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectBuildRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProjectBuildRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateProjectBuildRequest setProjectBuildAction(String projectBuildAction) {
        this.projectBuildAction = projectBuildAction;
        return this;
    }
    public String getProjectBuildAction() {
        return this.projectBuildAction;
    }

    public CreateProjectBuildRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public CreateProjectBuildRequest setTaskPolicies(java.util.List<CreateProjectBuildRequestTaskPolicies> taskPolicies) {
        this.taskPolicies = taskPolicies;
        return this;
    }
    public java.util.List<CreateProjectBuildRequestTaskPolicies> getTaskPolicies() {
        return this.taskPolicies;
    }

    public static class CreateProjectBuildRequestTaskPolicies extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>destroyAfterExecution</p>
         */
        @NameInMap("destroyAfterExecution")
        public Boolean destroyAfterExecution;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("priority")
        public Long priority;

        /**
         * <strong>example:</strong>
         * <p>task-60f24b4eb47f1135b7b14ddbdfd</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateProjectBuildRequestTaskPolicies build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectBuildRequestTaskPolicies self = new CreateProjectBuildRequestTaskPolicies();
            return TeaModel.build(map, self);
        }

        public CreateProjectBuildRequestTaskPolicies setDestroyAfterExecution(Boolean destroyAfterExecution) {
            this.destroyAfterExecution = destroyAfterExecution;
            return this;
        }
        public Boolean getDestroyAfterExecution() {
            return this.destroyAfterExecution;
        }

        public CreateProjectBuildRequestTaskPolicies setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public CreateProjectBuildRequestTaskPolicies setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
