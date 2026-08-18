// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCrawlerRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable AI metadata description. This parameter is supported only when SupportAiComment returned by GetCrawlerTypeCapabilities is set to true. If this parameter is not specified, the existing value remains unchanged.</p>
     */
    @NameInMap("EnableAiComment")
    public Boolean enableAiComment;

    /**
     * <p>The ID of the metadata crawler. You can call ListCrawlers to query crawler IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The extension configurations for the crawler type. Only the specified configuration items are updated. Unspecified configuration items remain unchanged. The supported keys and values are determined by the SupportedOptionKeys returned by GetCrawlerTypeCapabilities.</p>
     */
    @NameInMap("Options")
    public java.util.Map<String, String> options;

    /**
     * <p>The ID of the Serverless 2.0 resource group used to run the collection task. Whether this parameter is supported and whether it is required depend on the capabilities returned by GetCrawlerTypeCapabilities. If this parameter is not specified, the existing value remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_1234567890123456_1234567890</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The scheduling configuration. If this parameter is specified, the scheduling method is updated. If this parameter is not specified, the existing value remains unchanged.</p>
     */
    @NameInMap("ScheduleConfig")
    public UpdateCrawlerRequestScheduleConfig scheduleConfig;

    /**
     * <p>The collection scope configuration. If this parameter is specified, the collection scope is updated. If this parameter is not specified, the existing value remains unchanged.</p>
     */
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
         * <p>The six-field cron expression for periodic scheduling. This parameter is required when Type is set to NORMAL. The seconds field must be 0, and the scheduling frequency cannot exceed once per hour.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 ? * *</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The scheduling type. MANUAL indicates manual execution. NORMAL indicates periodic scheduling. Data sources in the development environment support only MANUAL. Whether NORMAL is available depends on the SupportSchedule value returned by GetCrawlerTypeCapabilities.</p>
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
         * <p>The regular expression used to exclude objects from the collection scope. This parameter is supported only when SupportExcludeRegex returned by GetCrawlerTypeCapabilities is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>^tmp_.*</p>
         */
        @NameInMap("ExcludeRegex")
        public String excludeRegex;

        /**
         * <p>The list of database names. This parameter is supported only when Unit is set to DATABASE. A maximum of 1,000 entries are allowed. Names cannot be empty or duplicate.</p>
         */
        @NameInMap("Items")
        public java.util.List<String> items;

        /**
         * <p>The collection scope granularity. Valid values are determined by the SupportedScopeUnits returned by GetCrawlerTypeCapabilities.</p>
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
