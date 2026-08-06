// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCrawlerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("EnableAiComment")
    public Boolean enableAiComment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example_crawler</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Options")
    public java.util.Map<String, String> options;

    /**
     * <strong>example:</strong>
     * <p>Serverless_res_group_1234567890123456_1234567890</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScheduleConfig")
    public CreateCrawlerRequestScheduleConfig scheduleConfig;

    @NameInMap("Scope")
    public CreateCrawlerRequestScope scope;

    /**
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
         * <strong>example:</strong>
         * <p>0 0 2 ? * *</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
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
         * <strong>example:</strong>
         * <p>^tmp_.*</p>
         */
        @NameInMap("ExcludeRegex")
        public String excludeRegex;

        @NameInMap("Items")
        public java.util.List<String> items;

        /**
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
