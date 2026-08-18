// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCrawlerRequest extends TeaModel {
    /**
     * <p>The ID of the data source associated with the crawler. The data source must be bound to a DataWorks workspace, and the data source type must match the Type value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>Specifies whether to enable AI metadata descriptions. This parameter is supported only when the SupportAiComment value returned by GetCrawlerTypeCapabilities is true.</p>
     */
    @NameInMap("EnableAiComment")
    public Boolean enableAiComment;

    /**
     * <p>The name of the metadata crawler. The name can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example_crawler</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The extended configuration for the crawler type. The key names, value types, required fields, default values, and valid values are determined by the SupportedOptionKeys value returned by GetCrawlerTypeCapabilities.</p>
     */
    @NameInMap("Options")
    public java.util.Map<String, String> options;

    /**
     * <p>The ID of the Serverless 2.0 resource group used to run the collection task. Whether this parameter is required depends on the RequireResourceGroup value returned by GetCrawlerTypeCapabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_1234567890123456_1234567890</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The scheduling configuration. If this parameter is not specified, manual scheduling is used.</p>
     */
    @NameInMap("ScheduleConfig")
    public CreateCrawlerRequestScheduleConfig scheduleConfig;

    /**
     * <p>The collection scope configuration. If this parameter is not specified, the DefaultScopeUnit value returned by GetCrawlerTypeCapabilities is used.</p>
     */
    @NameInMap("Scope")
    public CreateCrawlerRequestScope scope;

    /**
     * <p>The crawler type. Call GetCrawlerTypeCapabilities to query the valid values supported in the current region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>starrocks</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCrawlerRequest self = new CreateCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public CreateCrawlerRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateCrawlerRequest setEnableAiComment(Boolean enableAiComment) {
        this.enableAiComment = enableAiComment;
        return this;
    }
    public Boolean getEnableAiComment() {
        return this.enableAiComment;
    }

    public CreateCrawlerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCrawlerRequest setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public CreateCrawlerRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCrawlerRequest setScheduleConfig(CreateCrawlerRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public CreateCrawlerRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public CreateCrawlerRequest setScope(CreateCrawlerRequestScope scope) {
        this.scope = scope;
        return this;
    }
    public CreateCrawlerRequestScope getScope() {
        return this.scope;
    }

    public CreateCrawlerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateCrawlerRequestScheduleConfig extends TeaModel {
        /**
         * <p>The six-field cron expression for periodic scheduling. This parameter is required when Type is set to NORMAL. The seconds field must be 0, and the scheduling frequency cannot exceed once per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 ? * *</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The scheduling type. MANUAL indicates manual execution, and NORMAL indicates periodic scheduling. Data sources in the development environment support only MANUAL. Whether NORMAL is available depends on the SupportSchedule value returned by GetCrawlerTypeCapabilities.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateCrawlerRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCrawlerRequestScheduleConfig self = new CreateCrawlerRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public CreateCrawlerRequestScheduleConfig setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public CreateCrawlerRequestScheduleConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCrawlerRequestScope extends TeaModel {
        /**
         * <p>The regular expression used to exclude objects from the collection scope. This parameter is supported only when the SupportExcludeRegex value returned by GetCrawlerTypeCapabilities is true.</p>
         * 
         * <strong>example:</strong>
         * <p>^tmp_.*</p>
         */
        @NameInMap("ExcludeRegex")
        public String excludeRegex;

        /**
         * <p>The list of database names. This parameter is supported only when Unit is set to DATABASE. A maximum of 1000 entries are allowed. Names cannot be empty or duplicated.</p>
         */
        @NameInMap("Items")
        public java.util.List<String> items;

        /**
         * <p>The collection scope granularity. Valid values are determined by the SupportedScopeUnits value returned by GetCrawlerTypeCapabilities.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static CreateCrawlerRequestScope build(java.util.Map<String, ?> map) throws Exception {
            CreateCrawlerRequestScope self = new CreateCrawlerRequestScope();
            return TeaModel.build(map, self);
        }

        public CreateCrawlerRequestScope setExcludeRegex(String excludeRegex) {
            this.excludeRegex = excludeRegex;
            return this;
        }
        public String getExcludeRegex() {
            return this.excludeRegex;
        }

        public CreateCrawlerRequestScope setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public CreateCrawlerRequestScope setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
