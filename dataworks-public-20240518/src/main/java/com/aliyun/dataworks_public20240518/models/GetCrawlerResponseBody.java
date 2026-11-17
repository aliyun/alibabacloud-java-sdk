// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCrawlerResponseBody extends TeaModel {
    /**
     * <p>The metadata crawler details.</p>
     */
    @NameInMap("Crawler")
    public GetCrawlerResponseBodyCrawler crawler;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
         * <p>The cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 ? * *</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>MANUAL</li>
         * <li>NORMAL</li>
         * </ul>
         * 
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
         * <p>The regular expression used to exclude items from the crawl scope.</p>
         * 
         * <strong>example:</strong>
         * <p>^tmp_.*</p>
         */
        @NameInMap("ExcludeRegex")
        public String excludeRegex;

        /**
         * <p>The crawl scope items.</p>
         */
        @NameInMap("Items")
        public java.util.List<String> items;

        /**
         * <p>The crawl scope granularity. Valid values:</p>
         * <ul>
         * <li>PROJECT</li>
         * <li>DATABASE</li>
         * <li>INSTANCE</li>
         * <li>CATALOG</li>
         * </ul>
         * 
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
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <p>Indicates whether AI metadata descriptions are enabled.</p>
         */
        @NameInMap("EnableAiComment")
        public Boolean enableAiComment;

        /**
         * <p>The DataWorks environment type. Valid values:</p>
         * <ul>
         * <li>Dev</li>
         * <li>Prod</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The crawler ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The latest run status. Valid values:</p>
         * <ul>
         * <li>WAITING</li>
         * <li>RUNNING</li>
         * <li>SUCCESS</li>
         * <li>ERROR</li>
         * <li>SHUTDOWN
         * This parameter may be empty if the crawler has not been run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LastRunStatus")
        public String lastRunStatus;

        /**
         * <p>The DataWorks task instance ID associated with the latest run. This parameter may be empty if the crawler has not been run.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("LastRunTaskInstanceId")
        public Long lastRunTaskInstanceId;

        /**
         * <p>The ID of the meta-entity associated with the crawler. You can use this ID in metadata query APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>starrocks:example-instance</p>
         */
        @NameInMap("MetaEntityId")
        public String metaEntityId;

        /**
         * <p>The modification time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The crawler name.</p>
         * 
         * <strong>example:</strong>
         * <p>example_crawler</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The extension configuration for the crawler type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CollectRecyclebin&quot;:&quot;false&quot;}</p>
         */
        @NameInMap("Options")
        public java.util.Map<String, String> options;

        /**
         * <p>The DataWorks user ID of the crawler owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the Serverless 2.0 resource group used to run the crawl task.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_1234567890123456_1234567890</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The schedule settings.</p>
         */
        @NameInMap("ScheduleConfig")
        public GetCrawlerResponseBodyCrawlerScheduleConfig scheduleConfig;

        /**
         * <p>The crawl scope configuration.</p>
         */
        @NameInMap("Scope")
        public GetCrawlerResponseBodyCrawlerScope scope;

        /**
         * <p>The crawler status. Valid values:</p>
         * <ul>
         * <li>VALID: The crawler configuration is valid and the associated data source exists.</li>
         * <li>INVALID: The crawler configuration is invalid or the associated data source does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The DataWorks scheduled task ID associated with the crawler. You can call GetTask to query the task definition.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The crawler type.</p>
         * 
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
