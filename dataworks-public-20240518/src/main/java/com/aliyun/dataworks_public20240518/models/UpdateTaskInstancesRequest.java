// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateTaskInstancesRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The instances.</p>
     */
    @NameInMap("TaskInstances")
    public java.util.List<UpdateTaskInstancesRequestTaskInstances> taskInstances;

    public static UpdateTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskInstancesRequest self = new UpdateTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateTaskInstancesRequest setTaskInstances(java.util.List<UpdateTaskInstancesRequestTaskInstances> taskInstances) {
        this.taskInstances = taskInstances;
        return this;
    }
    public java.util.List<UpdateTaskInstancesRequestTaskInstances> getTaskInstances() {
        return this.taskInstances;
    }

    public static class UpdateTaskInstancesRequestTaskInstancesDataSource extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateTaskInstancesRequestTaskInstancesDataSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskInstancesRequestTaskInstancesDataSource self = new UpdateTaskInstancesRequestTaskInstancesDataSource();
            return TeaModel.build(map, self);
        }

        public UpdateTaskInstancesRequestTaskInstancesDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateTaskInstancesRequestTaskInstances extends TeaModel {
        /**
         * <p>The information about the associated data source.</p>
         */
        @NameInMap("DataSource")
        public UpdateTaskInstancesRequestTaskInstancesDataSource dataSource;

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The priority of the instance. Valid values: 1, 3, 5, 7, and 8.</p>
         * <p>A larger value indicates a higher priority. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The resource group information. Set this parameter to the ID of a resource group for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("RuntimeResource")
        public String runtimeResource;

        public static UpdateTaskInstancesRequestTaskInstances build(java.util.Map<String, ?> map) throws Exception {
            UpdateTaskInstancesRequestTaskInstances self = new UpdateTaskInstancesRequestTaskInstances();
            return TeaModel.build(map, self);
        }

        public UpdateTaskInstancesRequestTaskInstances setDataSource(UpdateTaskInstancesRequestTaskInstancesDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public UpdateTaskInstancesRequestTaskInstancesDataSource getDataSource() {
            return this.dataSource;
        }

        public UpdateTaskInstancesRequestTaskInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateTaskInstancesRequestTaskInstances setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateTaskInstancesRequestTaskInstances setRuntimeResource(String runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public String getRuntimeResource() {
            return this.runtimeResource;
        }

    }

}
