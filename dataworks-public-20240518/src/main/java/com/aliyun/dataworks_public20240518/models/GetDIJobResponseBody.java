// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDIJobResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public GetDIJobResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C99E2BE6-9DEA-5C2E-8F51-1DDCFEADE490</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDIJobResponseBody self = new GetDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDIJobResponseBody setPagingInfo(GetDIJobResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public GetDIJobResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public GetDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings extends TeaModel {
        /**
         * <p>The name of the destination data source.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_mysql</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        public static GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings self = new GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings extends TeaModel {
        /**
         * <p>The destination data type, such as bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Data types vary based on the data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <p>The source data type, such as bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Data types vary based on the data source type.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("SourceDataType")
        public String sourceDataType;

        public static GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings self = new GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings setDestinationDataType(String destinationDataType) {
            this.destinationDataType = destinationDataType;
            return this;
        }
        public String getDestinationDataType() {
            return this.destinationDataType;
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings setSourceDataType(String sourceDataType) {
            this.sourceDataType = sourceDataType;
            return this;
        }
        public String getSourceDataType() {
            return this.sourceDataType;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings extends TeaModel {
        /**
         * <p>The synchronization type that requires periodic scheduling. Valid values:</p>
         * <ul>
         * <li>Full: full data synchronization.</li>
         * <li>OfflineIncremental: batch incremental synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Full</p>
         */
        @NameInMap("CycleMigrationType")
        public String cycleMigrationType;

        /**
         * <p>The scheduling parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>bizdate=$bizdate</p>
         */
        @NameInMap("ScheduleParameters")
        public String scheduleParameters;

        public static GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings self = new GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings setCycleMigrationType(String cycleMigrationType) {
            this.cycleMigrationType = cycleMigrationType;
            return this;
        }
        public String getCycleMigrationType() {
            return this.cycleMigrationType;
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings setScheduleParameters(String scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }
        public String getScheduleParameters() {
            return this.scheduleParameters;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings extends TeaModel {
        /**
         * <p>The handling action. Valid values:</p>
         * <ul>
         * <li>Ignore: ignores the DDL statement.</li>
         * <li>Critical: reports an error.</li>
         * <li>Normal: processes the DDL statement normally.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The DDL type. Valid values:</p>
         * <ul>
         * <li>RenameColumn: renames a column.</li>
         * <li>ModifyColumn: modifies a column.</li>
         * <li>CreateTable: creates a table.</li>
         * <li>TruncateTable: truncates a table.</li>
         * <li>DropTable: drops a table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTable</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings self = new GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings extends TeaModel {
        /**
         * <p>The setting name. Valid values:</p>
         * <ul>
         * <li>src.offline.datasource.max.connection: the maximum number of connections to the source for batch tasks.</li>
         * <li>dst.offline.truncate: specifies whether to truncate the destination table.</li>
         * <li>runtime.offline.speed.limit.enable: specifies whether to enable throttling for batch tasks.</li>
         * <li>runtime.offline.concurrent: the concurrency of batch synchronization tasks.</li>
         * <li>runtime.enable.auto.create.schema: specifies whether to automatically create a schema at the destination.</li>
         * <li>runtime.realtime.concurrent: the concurrency of real-time tasks.</li>
         * <li>runtime.realtime.failover.minute.dataxcdc: the wait time in minutes before restarting after a failover failure.</li>
         * <li>runtime.realtime.failover.times.dataxcdc: the number of restart attempts after a failover failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>runtime.offline.concurrent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The setting value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings self = new GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoJobSettings extends TeaModel {
        /**
         * <p>The channel-related task settings. You can configure specific channels. Currently, Holo2Holo (synchronization from Hologres to Hologres) and Holo2Kafka (synchronization from Hologres to Kafka) are supported.</p>
         * <ol>
         * <li>Holo2Kafka</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</li>
         * <li>kafkaClientProperties: the Kafka producer parameters used when writing data to Kafka.</li>
         * <li>keyColumns: the Kafka columns to which data is written.</li>
         * <li>writeMode: the format in which data is written to Kafka. Valid values: json and canal.</li>
         * </ul>
         * <ol start="2">
         * <li>Holo2Holo</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</li>
         * <li>conflictMode: the conflict handling policy when writing data to Hologres. Valid values: replace (overwrite) and ignore (ignore).</li>
         * <li>writeMode: the method used to write data to Hologres. Valid values: replay and insert.</li>
         * <li>dynamicColumnAction: the method used to write dynamic columns to Hologres. Valid values: replay, insert, and ignore.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ChannelSettings")
        public String channelSettings;

        /**
         * <p>The column type mappings.</p>
         */
        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        /**
         * <p>The periodic scheduling settings.</p>
         */
        @NameInMap("CycleScheduleSettings")
        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings cycleScheduleSettings;

        /**
         * <p>The array of DDL handling settings, which includes a list of DDL types to be handled and their corresponding rules.</p>
         */
        @NameInMap("DdlHandlingSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings> ddlHandlingSettings;

        /**
         * <p>The runtime settings.</p>
         */
        @NameInMap("RuntimeSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings> runtimeSettings;

        public static GetDIJobResponseBodyPagingInfoJobSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoJobSettings self = new GetDIJobResponseBodyPagingInfoJobSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setChannelSettings(String channelSettings) {
            this.channelSettings = channelSettings;
            return this;
        }
        public String getChannelSettings() {
            return this.channelSettings;
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setColumnDataTypeSettings(java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings> columnDataTypeSettings) {
            this.columnDataTypeSettings = columnDataTypeSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings> getColumnDataTypeSettings() {
            return this.columnDataTypeSettings;
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setCycleScheduleSettings(GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings cycleScheduleSettings) {
            this.cycleScheduleSettings = cycleScheduleSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings getCycleScheduleSettings() {
            return this.cycleScheduleSettings;
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setDdlHandlingSettings(java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings> ddlHandlingSettings) {
            this.ddlHandlingSettings = ddlHandlingSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsDdlHandlingSettings> getDdlHandlingSettings() {
            return this.ddlHandlingSettings;
        }

        public GetDIJobResponseBodyPagingInfoJobSettings setRuntimeSettings(java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings> runtimeSettings) {
            this.runtimeSettings = runtimeSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsRuntimeSettings> getRuntimeSettings() {
            return this.runtimeSettings;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings extends TeaModel {
        /**
         * <p>The number of compute units (CUs) of the scheduling resource group used by the batch synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the data integration resource group used for batch synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>di_resourcegroup_v1</p>
         */
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings self = new GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings extends TeaModel {
        /**
         * <p>The number of CUs of the data integration resource group used for real-time synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the data integration resource group used for real-time tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>di_resourcegroup_v1</p>
         */
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings self = new GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings extends TeaModel {
        /**
         * <p>The number of CUs of the data integration resource group used by the batch scheduling task.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the scheduling resource group used by the batch scheduling task.</p>
         * 
         * <strong>example:</strong>
         * <p>schedual_resourcegroup_v1</p>
         */
        @NameInMap("ResourceGroupIdentifier")
        public String resourceGroupIdentifier;

        public static GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings self = new GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings setRequestedCu(Double requestedCu) {
            this.requestedCu = requestedCu;
            return this;
        }
        public Double getRequestedCu() {
            return this.requestedCu;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings setResourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }
        public String getResourceGroupIdentifier() {
            return this.resourceGroupIdentifier;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoResourceSettings extends TeaModel {
        /**
         * <p>The batch synchronization resources.</p>
         */
        @NameInMap("OfflineResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings offlineResourceSettings;

        /**
         * <p>The real-time synchronization resources.</p>
         */
        @NameInMap("RealtimeResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        /**
         * <p>The scheduling resource.</p>
         */
        @NameInMap("ScheduleResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings scheduleResourceSettings;

        public static GetDIJobResponseBodyPagingInfoResourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoResourceSettings self = new GetDIJobResponseBodyPagingInfoResourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoResourceSettings setOfflineResourceSettings(GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings offlineResourceSettings) {
            this.offlineResourceSettings = offlineResourceSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings getOfflineResourceSettings() {
            return this.offlineResourceSettings;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettings setRealtimeResourceSettings(GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings realtimeResourceSettings) {
            this.realtimeResourceSettings = realtimeResourceSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings getRealtimeResourceSettings() {
            return this.realtimeResourceSettings;
        }

        public GetDIJobResponseBodyPagingInfoResourceSettings setScheduleResourceSettings(GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings scheduleResourceSettings) {
            this.scheduleResourceSettings = scheduleResourceSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoResourceSettingsScheduleResourceSettings getScheduleResourceSettings() {
            return this.scheduleResourceSettings;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties extends TeaModel {
        /**
         * <p>The database encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>GMT+8</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        public static GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties self = new GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoSourceDataSourceSettings extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_mysql</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The properties of the data source.</p>
         */
        @NameInMap("DataSourceProperties")
        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties dataSourceProperties;

        public static GetDIJobResponseBodyPagingInfoSourceDataSourceSettings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoSourceDataSourceSettings self = new GetDIJobResponseBodyPagingInfoSourceDataSourceSettings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettings setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettings setDataSourceProperties(GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties dataSourceProperties) {
            this.dataSourceProperties = dataSourceProperties;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoSourceDataSourceSettingsDataSourceProperties getDataSourceProperties() {
            return this.dataSourceProperties;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules extends TeaModel {
        /**
         * <p>The selection action. Valid values: Include and Exclude.</p>
         * 
         * <strong>example:</strong>
         * <p>Include</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The expression.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_table_1</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The expression type. Valid values: Exact and Regex.</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li>Table: table.</li>
         * <li>Schema: schema.</li>
         * <li>Database: database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        public static GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules self = new GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules setExpressionType(String expressionType) {
            this.expressionType = expressionType;
            return this;
        }
        public String getExpressionType() {
            return this.expressionType;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules extends TeaModel {
        /**
         * <p>The action type. Valid values:</p>
         * <ul>
         * <li>DefinePrimaryKey: defines the primary key.</li>
         * <li>Rename: renames the object.</li>
         * <li>AddColumn: adds a column.</li>
         * <li>HandleDml: handles DML operations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AddColumn</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The rule name. The rule name must be unique when the action type and the target type of the action are the same.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The target type of the action. Valid values:</p>
         * <ul>
         * <li>Table: table.</li>
         * <li>Schema: schema.</li>
         * <li>Database: database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("RuleTargetType")
        public String ruleTargetType;

        public static GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules self = new GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoTableMappings extends TeaModel {
        /**
         * <p>Each rule selects a set of source objects to be synchronized. Multiple rules combine to select a single table.</p>
         */
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        /**
         * <p>The list of transformation rule definitions for synchronization objects. Each element in the list is a transformation rule definition.</p>
         */
        @NameInMap("TransformationRules")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules> transformationRules;

        public static GetDIJobResponseBodyPagingInfoTableMappings build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoTableMappings self = new GetDIJobResponseBodyPagingInfoTableMappings();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoTableMappings setSourceObjectSelectionRules(java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules) {
            this.sourceObjectSelectionRules = sourceObjectSelectionRules;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules> getSourceObjectSelectionRules() {
            return this.sourceObjectSelectionRules;
        }

        public GetDIJobResponseBodyPagingInfoTableMappings setTransformationRules(java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules> transformationRules) {
            this.transformationRules = transformationRules;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

    }

    public static class GetDIJobResponseBodyPagingInfoTransformationRules extends TeaModel {
        /**
         * <p>The action type. Valid values:</p>
         * <ul>
         * <li>DefinePrimaryKey: defines the primary key.</li>
         * <li>Rename: renames the object.</li>
         * <li>AddColumn: adds a column.</li>
         * <li>HandleDml: handles DML operations.</li>
         * <li>DefineIncrementalCondition: defines the incremental condition.</li>
         * <li>DefineCycleScheduleSettings: defines the periodic scheduling settings.</li>
         * <li>DefinePartitionKey: defines the partition key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The rule expression in JSON string format.</p>
         * <ol>
         * <li>Rename rule (Rename)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot;}</li>
         * <li>expression: the expression for the rename transformation rule. Supported variables in the expression include: ${srcDatasourceName} (source data source name), ${srcDatabaseName} (source database name), and ${srcTableName} (source table name).</li>
         * </ul>
         * <ol start="2">
         * <li>Add column rule (AddColumn)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</li>
         * <li>If not specified, the default rule is to add no columns and perform no replication.</li>
         * <li>columnName: the name of the appended column.</li>
         * <li>columnValueType: the value type of the appended column. Valid values: Constant and Variable.</li>
         * <li>columnValue: the value of the appended column. When columnValueType is Constant, the value is a custom constant of the String type. When columnValueType is Variable, the value is a built-in variable. Valid built-in variables include: EXECUTE_TIME (execution time, Long type), DB_NAME_SRC (source database name, String type), DATASOURCE_NAME_SRC (source data source name, String type), TABLE_NAME_SRC (source table name, String type), DB_NAME_DEST (destination database name, String type), DATASOURCE_NAME_DEST (destination data source name, String type), TABLE_NAME_DEST (destination table name, String type), and DB_NAME_SRC_TRANSED (transformed database name, String type).</li>
         * </ul>
         * <ol start="3">
         * <li>Specify the primary key column names for the destination table (DefinePrimaryKey)</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</li>
         * <li>If not specified, the source primary key columns are used by default.</li>
         * <li>When the destination is an existing table: the data integration system does not modify the destination table schema. If the specified primary key columns are not in the destination column set, an error is reported when the task starts.</li>
         * <li>When the destination is a table to be created automatically: the data integration system automatically creates the destination table schema, which includes the defined primary key columns. If the specified primary key columns are not in the destination column set, an error is reported when the task starts.</li>
         * </ul>
         * <ol start="4">
         * <li>DML handling rule (HandleDml)</li>
         * </ol>
         * <ul>
         * <li>Example:
         * {&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</li>
         * <li>If not specified, the default rule is Normal for Insert, Update, and Delete.</li>
         * <li>dmlType: the DML operations type. Valid values: Insert, Update, and Delete.</li>
         * <li>dmlAction: the DML handling policy. Valid values: Normal (normal processing), Ignore (ignore), Filter (conditional normal processing, used when dmlType is Update or Delete), and LogicalDelete (logical deletion).</li>
         * <li>filterCondition: the DML filter condition, used when dmlAction is Filter.</li>
         * </ul>
         * <ol start="5">
         * <li>Incremental condition (DefineIncrementalCondition)</li>
         * </ol>
         * <ul>
         * <li>Example:
         * {&quot;where&quot;:&quot;id &gt; 0&quot;}</li>
         * <li>Specifies the incremental filter condition.</li>
         * </ul>
         * <ol start="6">
         * <li>Periodic scheduling parameters (DefineCycleScheduleSettings)</li>
         * </ol>
         * <ul>
         * <li>Example:
         * {&quot;cronExpress&quot;:&quot; * * * * * *&quot;, &quot;cycleType&quot;:&quot;1&quot;}</li>
         * <li>Specifies the scheduling parameters for the scheduled task.</li>
         * </ul>
         * <ol start="7">
         * <li>Specify the partition key (DefinePartitionKey)</li>
         * </ol>
         * <ul>
         * <li>Example:
         * {&quot;columns&quot;:[&quot;id&quot;]}</li>
         * <li>Specifies the partition key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}</p>
         */
        @NameInMap("RuleExpression")
        public String ruleExpression;

        /**
         * <p>The rule name. The rule name must be unique under a specific combination of action type and target type.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The target type of the action. Valid values:</p>
         * <ul>
         * <li>Table: table.</li>
         * <li>Schema: schema.</li>
         * <li>Database: database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("RuleTargetType")
        public String ruleTargetType;

        public static GetDIJobResponseBodyPagingInfoTransformationRules build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfoTransformationRules self = new GetDIJobResponseBodyPagingInfoTransformationRules();
            return TeaModel.build(map, self);
        }

        public GetDIJobResponseBodyPagingInfoTransformationRules setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public GetDIJobResponseBodyPagingInfoTransformationRules setRuleExpression(String ruleExpression) {
            this.ruleExpression = ruleExpression;
            return this;
        }
        public String getRuleExpression() {
            return this.ruleExpression;
        }

        public GetDIJobResponseBodyPagingInfoTransformationRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetDIJobResponseBodyPagingInfoTransformationRules setRuleTargetType(String ruleTargetType) {
            this.ruleTargetType = ruleTargetType;
            return this;
        }
        public String getRuleTargetType() {
            return this.ruleTargetType;
        }

    }

    public static class GetDIJobResponseBodyPagingInfo extends TeaModel {
        /**
         * <p><strong>[Deprecated]</strong> This field is deprecated. Use the Id field instead.</p>
         * 
         * <strong>example:</strong>
         * <p>32601</p>
         */
        @NameInMap("DIJobId")
        @Deprecated
        public String DIJobId;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of destination data source properties.</p>
         */
        @NameInMap("DestinationDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings> destinationDataSourceSettings;

        /**
         * <p>The type of the destination data source. Valid values: Hologres, OSS-HDFS, OSS, MaxCompute, LogHub, StarRocks, DataHub, AnalyticDB_For_MySQL, Kafka, and Hive.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32601</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>imp_ods_dms_det_dealer_info_df</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The runtime settings.</p>
         */
        @NameInMap("JobSettings")
        public GetDIJobResponseBodyPagingInfoJobSettings jobSettings;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Finished: the task ran successfully and has finished.</li>
         * <li>Failed: the task failed to run.</li>
         * <li>Running: the task is running.</li>
         * <li>Initialized: the task is initialized but not started.</li>
         * <li>Stopping: the task is being stopped.</li>
         * <li>Stop: the task is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>DatabaseRealtimeMigration: performs stream synchronization for multiple tables across multiple source databases. Supports full data only, incremental data only, or both full and incremental data.</li>
         * <li>DatabaseOfflineMigration: performs batch synchronization for multiple tables across multiple source databases. Supports full data only, incremental data only, or both full and incremental data.</li>
         * <li>SingleTableRealtimeMigration: performs stream synchronization for a single source table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DatabaseRealtimeMigration</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The synchronization type. Valid values:</p>
         * <ul>
         * <li>FullAndRealtimeIncremental: full and real-time incremental synchronization (real-time synchronization for the entire database).</li>
         * <li>RealtimeIncremental: real-time incremental synchronization (real-time synchronization for a single table).</li>
         * <li>Full: full data synchronization (batch synchronization for the entire database).</li>
         * <li>OfflineIncremental: batch incremental synchronization (batch synchronization for the entire database).</li>
         * <li>FullAndOfflineIncremental: full and batch incremental synchronization (batch synchronization for the entire database).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullAndRealtimeIncremental</p>
         */
        @NameInMap("MigrationType")
        public String migrationType;

        /**
         * <p>The task owner.</p>
         * 
         * <strong>example:</strong>
         * <p>3726346</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
         * <p>This parameter specifies the DataWorks workspace used for this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>98330</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The resource settings.</p>
         */
        @NameInMap("ResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettings resourceSettings;

        /**
         * <p>The array of source data source settings.</p>
         */
        @NameInMap("SourceDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoSourceDataSourceSettings> sourceDataSourceSettings;

        /**
         * <p>The type of the source data source. Valid values: PolarDB, MySQL, Kafka, LogHub, Hologres, Oracle, OceanBase, MongoDB, RedShift, Hive, SQLServer, Doris, and ClickHouse.</p>
         * 
         * <strong>example:</strong>
         * <p>Mysql</p>
         */
        @NameInMap("SourceDataSourceType")
        public String sourceDataSourceType;

        /**
         * <p>The list of synchronization object transformation mappings. Each element in the list describes a set of source object selection rules and a list of transformation rules applied to the selected synchronization objects.</p>
         * <blockquote>
         * <p>[
         *   {
         *     &quot;SourceObjectSelectionRules&quot;:[
         *       {
         *         &quot;ObjectType&quot;:&quot;Database&quot;,
         *         &quot;Action&quot;:&quot;Include&quot;,
         *         &quot;ExpressionType&quot;:&quot;Exact&quot;,
         *         &quot;Expression&quot;:&quot;biz_db&quot;
         *       },
         *     {
         *         &quot;ObjectType&quot;:&quot;Schema&quot;,
         *         &quot;Action&quot;:&quot;Include&quot;,
         *         &quot;ExpressionType&quot;:&quot;Exact&quot;,
         *         &quot;Expression&quot;:&quot;s1&quot;
         *       }, 
         *     {
         *         &quot;ObjectType&quot;:&quot;Table&quot;,
         *         &quot;Action&quot;:&quot;Include&quot;,
         *         &quot;ExpressionType&quot;:&quot;Exact&quot;,
         *         &quot;Expression&quot;:&quot;table1&quot;
         *       }
         *     ],
         *     &quot;TransformationRuleNames&quot;:[
         *       {
         *         &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;,
         *         &quot;RuleActionType&quot;:&quot;Rename&quot;,
         *         &quot;RuleTargetType&quot;:&quot;Schema&quot;
         *           }
         *     ]
         *   }
         * ]</p>
         * </blockquote>
         */
        @NameInMap("TableMappings")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappings> tableMappings;

        /**
         * <p>The list of transformation rule definitions for synchronization objects.</p>
         * <blockquote>
         * <p>[
         *   {
         *     &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;,
         *     &quot;RuleActionType&quot;:&quot;Rename&quot;,
         *     &quot;RuleTargetType&quot;:&quot;Schema&quot;,
         *     &quot;RuleExpression&quot;:&quot;{\&quot;expression\&quot;:\&quot;${srcDatasoureName}_${srcDatabaseName}\&quot;}&quot;
         *   }
         * ]</p>
         * </blockquote>
         */
        @NameInMap("TransformationRules")
        public java.util.List<GetDIJobResponseBodyPagingInfoTransformationRules> transformationRules;

        public static GetDIJobResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDIJobResponseBodyPagingInfo self = new GetDIJobResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public GetDIJobResponseBodyPagingInfo setDIJobId(String DIJobId) {
            this.DIJobId = DIJobId;
            return this;
        }
        public String getDIJobId() {
            return this.DIJobId;
        }

        public GetDIJobResponseBodyPagingInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDIJobResponseBodyPagingInfo setDestinationDataSourceSettings(java.util.List<GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings> destinationDataSourceSettings) {
            this.destinationDataSourceSettings = destinationDataSourceSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings> getDestinationDataSourceSettings() {
            return this.destinationDataSourceSettings;
        }

        public GetDIJobResponseBodyPagingInfo setDestinationDataSourceType(String destinationDataSourceType) {
            this.destinationDataSourceType = destinationDataSourceType;
            return this;
        }
        public String getDestinationDataSourceType() {
            return this.destinationDataSourceType;
        }

        public GetDIJobResponseBodyPagingInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDIJobResponseBodyPagingInfo setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetDIJobResponseBodyPagingInfo setJobSettings(GetDIJobResponseBodyPagingInfoJobSettings jobSettings) {
            this.jobSettings = jobSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoJobSettings getJobSettings() {
            return this.jobSettings;
        }

        public GetDIJobResponseBodyPagingInfo setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public GetDIJobResponseBodyPagingInfo setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetDIJobResponseBodyPagingInfo setMigrationType(String migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public String getMigrationType() {
            return this.migrationType;
        }

        public GetDIJobResponseBodyPagingInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetDIJobResponseBodyPagingInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetDIJobResponseBodyPagingInfo setResourceSettings(GetDIJobResponseBodyPagingInfoResourceSettings resourceSettings) {
            this.resourceSettings = resourceSettings;
            return this;
        }
        public GetDIJobResponseBodyPagingInfoResourceSettings getResourceSettings() {
            return this.resourceSettings;
        }

        public GetDIJobResponseBodyPagingInfo setSourceDataSourceSettings(java.util.List<GetDIJobResponseBodyPagingInfoSourceDataSourceSettings> sourceDataSourceSettings) {
            this.sourceDataSourceSettings = sourceDataSourceSettings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoSourceDataSourceSettings> getSourceDataSourceSettings() {
            return this.sourceDataSourceSettings;
        }

        public GetDIJobResponseBodyPagingInfo setSourceDataSourceType(String sourceDataSourceType) {
            this.sourceDataSourceType = sourceDataSourceType;
            return this;
        }
        public String getSourceDataSourceType() {
            return this.sourceDataSourceType;
        }

        public GetDIJobResponseBodyPagingInfo setTableMappings(java.util.List<GetDIJobResponseBodyPagingInfoTableMappings> tableMappings) {
            this.tableMappings = tableMappings;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappings> getTableMappings() {
            return this.tableMappings;
        }

        public GetDIJobResponseBodyPagingInfo setTransformationRules(java.util.List<GetDIJobResponseBodyPagingInfoTransformationRules> transformationRules) {
            this.transformationRules = transformationRules;
            return this;
        }
        public java.util.List<GetDIJobResponseBodyPagingInfoTransformationRules> getTransformationRules() {
            return this.transformationRules;
        }

    }

}
