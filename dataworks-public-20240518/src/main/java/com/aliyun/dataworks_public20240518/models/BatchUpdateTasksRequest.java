// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchUpdateTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Tasks")
    public java.util.List<BatchUpdateTasksRequestTasks> tasks;

    public static BatchUpdateTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTasksRequest self = new BatchUpdateTasksRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTasksRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public BatchUpdateTasksRequest setTasks(java.util.List<BatchUpdateTasksRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<BatchUpdateTasksRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class BatchUpdateTasksRequestTasksDataSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>odps_test</p>
         */
        @NameInMap("Name")
        public String name;

        public static BatchUpdateTasksRequestTasksDataSource build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateTasksRequestTasksDataSource self = new BatchUpdateTasksRequestTasksDataSource();
            return TeaModel.build(map, self);
        }

        public BatchUpdateTasksRequestTasksDataSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class BatchUpdateTasksRequestTasksRuntimeResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <strong>example:</strong>
         * <p>i-xxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static BatchUpdateTasksRequestTasksRuntimeResource build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateTasksRequestTasksRuntimeResource self = new BatchUpdateTasksRequestTasksRuntimeResource();
            return TeaModel.build(map, self);
        }

        public BatchUpdateTasksRequestTasksRuntimeResource setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public BatchUpdateTasksRequestTasksRuntimeResource setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public BatchUpdateTasksRequestTasksRuntimeResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

    public static class BatchUpdateTasksRequestTasksTags extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static BatchUpdateTasksRequestTasksTags build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateTasksRequestTasksTags self = new BatchUpdateTasksRequestTasksTags();
            return TeaModel.build(map, self);
        }

        public BatchUpdateTasksRequestTasksTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchUpdateTasksRequestTasksTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchUpdateTasksRequestTasksTrigger extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        @NameInMap("Type")
        public String type;

        public static BatchUpdateTasksRequestTasksTrigger build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateTasksRequestTasksTrigger self = new BatchUpdateTasksRequestTasksTrigger();
            return TeaModel.build(map, self);
        }

        public BatchUpdateTasksRequestTasksTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public BatchUpdateTasksRequestTasksTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public BatchUpdateTasksRequestTasksTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public BatchUpdateTasksRequestTasksTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public BatchUpdateTasksRequestTasksTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class BatchUpdateTasksRequestTasks extends TeaModel {
        @NameInMap("DataSource")
        public BatchUpdateTasksRequestTasksDataSource dataSource;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RerunInterval")
        public Integer rerunInterval;

        /**
         * <strong>example:</strong>
         * <p>AllAllowed</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RerunTimes")
        public Integer rerunTimes;

        @NameInMap("RuntimeResource")
        public BatchUpdateTasksRequestTasksRuntimeResource runtimeResource;

        @NameInMap("Tags")
        public java.util.List<BatchUpdateTasksRequestTasksTags> tags;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Trigger")
        public BatchUpdateTasksRequestTasksTrigger trigger;

        public static BatchUpdateTasksRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateTasksRequestTasks self = new BatchUpdateTasksRequestTasks();
            return TeaModel.build(map, self);
        }

        public BatchUpdateTasksRequestTasks setDataSource(BatchUpdateTasksRequestTasksDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public BatchUpdateTasksRequestTasksDataSource getDataSource() {
            return this.dataSource;
        }

        public BatchUpdateTasksRequestTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchUpdateTasksRequestTasks setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public BatchUpdateTasksRequestTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchUpdateTasksRequestTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchUpdateTasksRequestTasks setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public BatchUpdateTasksRequestTasks setRerunInterval(Integer rerunInterval) {
            this.rerunInterval = rerunInterval;
            return this;
        }
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        public BatchUpdateTasksRequestTasks setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public BatchUpdateTasksRequestTasks setRerunTimes(Integer rerunTimes) {
            this.rerunTimes = rerunTimes;
            return this;
        }
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        public BatchUpdateTasksRequestTasks setRuntimeResource(BatchUpdateTasksRequestTasksRuntimeResource runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public BatchUpdateTasksRequestTasksRuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        public BatchUpdateTasksRequestTasks setTags(java.util.List<BatchUpdateTasksRequestTasksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<BatchUpdateTasksRequestTasksTags> getTags() {
            return this.tags;
        }

        public BatchUpdateTasksRequestTasks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public BatchUpdateTasksRequestTasks setTrigger(BatchUpdateTasksRequestTasksTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public BatchUpdateTasksRequestTasksTrigger getTrigger() {
            return this.trigger;
        }

    }

}
