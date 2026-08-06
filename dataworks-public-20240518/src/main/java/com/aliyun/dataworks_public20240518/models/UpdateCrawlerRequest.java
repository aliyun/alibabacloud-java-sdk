// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCrawlerRequest extends TeaModel {
    @NameInMap("EnableAiComment")
    public Boolean enableAiComment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Options")
    public java.util.Map<String, String> options;

    /**
     * <strong>example:</strong>
     * <p>Serverless_res_group_1234567890123456_1234567890</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScheduleConfig")
    public UpdateCrawlerRequestScheduleConfig scheduleConfig;

    @NameInMap("Scope")
    public UpdateCrawlerRequestScope scope;

    public static UpdateCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrawlerRequest self = new UpdateCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCrawlerRequest setEnableAiComment(Boolean enableAiComment) {
        this.enableAiComment = enableAiComment;
        return this;
    }
    public Boolean getEnableAiComment() {
        return this.enableAiComment;
    }

    public UpdateCrawlerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateCrawlerRequest setOptions(java.util.Map<String, String> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public UpdateCrawlerRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateCrawlerRequest setScheduleConfig(UpdateCrawlerRequestScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public UpdateCrawlerRequestScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public UpdateCrawlerRequest setScope(UpdateCrawlerRequestScope scope) {
        this.scope = scope;
        return this;
    }
    public UpdateCrawlerRequestScope getScope() {
        return this.scope;
    }

    public static class UpdateCrawlerRequestScheduleConfig extends TeaModel {
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

        public static UpdateCrawlerRequestScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateCrawlerRequestScheduleConfig self = new UpdateCrawlerRequestScheduleConfig();
            return TeaModel.build(map, self);
        }

        public UpdateCrawlerRequestScheduleConfig setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public UpdateCrawlerRequestScheduleConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateCrawlerRequestScope extends TeaModel {
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

        public static UpdateCrawlerRequestScope build(java.util.Map<String, ?> map) throws Exception {
            UpdateCrawlerRequestScope self = new UpdateCrawlerRequestScope();
            return TeaModel.build(map, self);
        }

        public UpdateCrawlerRequestScope setExcludeRegex(String excludeRegex) {
            this.excludeRegex = excludeRegex;
            return this;
        }
        public String getExcludeRegex() {
            return this.excludeRegex;
        }

        public UpdateCrawlerRequestScope setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

        public UpdateCrawlerRequestScope setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
