// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCrawlerResponseBody extends TeaModel {
    @NameInMap("Crawler")
    public GetCrawlerResponseBodyCrawler crawler;

    /**
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCrawlerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCrawlerResponseBody self = new GetCrawlerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCrawlerResponseBody setCrawler(GetCrawlerResponseBodyCrawler crawler) {
        this.crawler = crawler;
        return this;
    }
    public GetCrawlerResponseBodyCrawler getCrawler() {
        return this.crawler;
    }

    public GetCrawlerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCrawlerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCrawlerResponseBodyCrawlerScheduleConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0 0 2 ? * *</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetCrawlerResponseBodyCrawlerScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCrawlerResponseBodyCrawlerScheduleConfig self = new GetCrawlerResponseBodyCrawlerScheduleConfig();
            return TeaModel.build(map, self);
        }

        public GetCrawlerResponseBodyCrawlerScheduleConfig setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetCrawlerResponseBodyCrawlerScheduleConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCrawlerResponseBodyCrawlerScope extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>^tmp_.*</p>
         */
        @NameInMap("ExcludeRegex")
        public String excludeRegex;

        @NameInMap("Items")
        public java.util.List<String> items;

        /**
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static GetCrawlerResponseBodyCrawlerScope build(java.util.Map<String, ?> map) throws Exception {
            GetCrawlerResponseBodyCrawlerScope self = new GetCrawlerResponseBodyCrawlerScope();
            return TeaModel.build(map, self);
        }

        public GetCrawlerResponseBodyCrawlerScope setExcludeRegex(String excludeRegex) {
            this.excludeRegex = excludeRegex;
            return this;
        }
        public String getExcludeRegex() {
            return this.excludeRegex;
        }

        public GetCrawlerResponseBodyCrawlerScope setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public GetCrawlerResponseBodyCrawlerScope setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class GetCrawlerResponseBodyCrawler extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        @NameInMap("EnableAiComment")
        public Boolean enableAiComment;

        /**
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LastRunStatus")
        public String lastRunStatus;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("LastRunTaskInstanceId")
        public Long lastRunTaskInstanceId;

        /**
         * <strong>example:</strong>
         * <p>starrocks:example-instance</p>
         */
        @NameInMap("MetaEntityId")
        public String metaEntityId;

        /**
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <strong>example:</strong>
         * <p>example_crawler</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Options")
        public java.util.Map<String, String> options;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>Serverless_res_group_1234567890123456_1234567890</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ScheduleConfig")
        public GetCrawlerResponseBodyCrawlerScheduleConfig scheduleConfig;

        @NameInMap("Scope")
        public GetCrawlerResponseBodyCrawlerScope scope;

        /**
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>starrocks</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetCrawlerResponseBodyCrawler build(java.util.Map<String, ?> map) throws Exception {
            GetCrawlerResponseBodyCrawler self = new GetCrawlerResponseBodyCrawler();
            return TeaModel.build(map, self);
        }

        public GetCrawlerResponseBodyCrawler setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCrawlerResponseBodyCrawler setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetCrawlerResponseBodyCrawler setEnableAiComment(Boolean enableAiComment) {
            this.enableAiComment = enableAiComment;
            return this;
        }
        public Boolean getEnableAiComment() {
            return this.enableAiComment;
        }

        public GetCrawlerResponseBodyCrawler setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetCrawlerResponseBodyCrawler setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCrawlerResponseBodyCrawler setLastRunStatus(String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        public GetCrawlerResponseBodyCrawler setLastRunTaskInstanceId(Long lastRunTaskInstanceId) {
            this.lastRunTaskInstanceId = lastRunTaskInstanceId;
            return this;
        }
        public Long getLastRunTaskInstanceId() {
            return this.lastRunTaskInstanceId;
        }

        public GetCrawlerResponseBodyCrawler setMetaEntityId(String metaEntityId) {
            this.metaEntityId = metaEntityId;
            return this;
        }
        public String getMetaEntityId() {
            return this.metaEntityId;
        }

        public GetCrawlerResponseBodyCrawler setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetCrawlerResponseBodyCrawler setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCrawlerResponseBodyCrawler setOptions(java.util.Map<String, String> options) {
            this.options = options;
            return this;
        }
        public java.util.Map<String, String> getOptions() {
            return this.options;
        }

        public GetCrawlerResponseBodyCrawler setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetCrawlerResponseBodyCrawler setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetCrawlerResponseBodyCrawler setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetCrawlerResponseBodyCrawler setScheduleConfig(GetCrawlerResponseBodyCrawlerScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public GetCrawlerResponseBodyCrawlerScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public GetCrawlerResponseBodyCrawler setScope(GetCrawlerResponseBodyCrawlerScope scope) {
            this.scope = scope;
            return this;
        }
        public GetCrawlerResponseBodyCrawlerScope getScope() {
            return this.scope;
        }

        public GetCrawlerResponseBodyCrawler setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCrawlerResponseBodyCrawler setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetCrawlerResponseBodyCrawler setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
