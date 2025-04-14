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
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
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
         * <p>The name of the data source.</p>
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
         * <p>The data type of the destination field. Valid values: bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Different types of data sources support different data types.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <p>The data type of the source field. Valid values: bigint, boolean, string, text, datetime, timestamp, decimal, and binary. Different types of data sources support different data types.</p>
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
         * <li>Full: full synchronization</li>
         * <li>OfflineIncremental: batch incremental synchronization</li>
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
         * <p>The processing policy for a specific type of DDL message. Valid values:</p>
         * <ul>
         * <li>Ignore: ignores a DDL message.</li>
         * <li>Critical: reports an error for a DDL message.</li>
         * <li>Normal: normally processes a DDL message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The DDL operation type. Valid values:</p>
         * <ul>
         * <li>RenameColumn</li>
         * <li>ModifyColumn</li>
         * <li>CreateTable</li>
         * <li>TruncateTable</li>
         * <li>DropTable</li>
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
         * <p>The name of the configuration item. Valid values:</p>
         * <ul>
         * <li>src.offline.datasource.max.connection: indicates the maximum number of connections that are allowed for reading data from the source of a batch synchronization task.</li>
         * <li>dst.offline.truncate: indicates whether to clear the destination table before data writing.</li>
         * <li>runtime.offline.speed.limit.enable: indicates whether throttling is enabled for a batch synchronization task.</li>
         * <li>runtime.offline.concurrent: indicates the maximum number of parallel threads that are allowed for a batch synchronization task.</li>
         * <li>runtime.enable.auto.create.schema: indicates whether schemas are automatically created in the destination of a synchronization task.</li>
         * <li>runtime.realtime.concurrent: indicates the maximum number of parallel threads that are allowed for a real-time synchronization task.</li>
         * <li>runtime.realtime.failover.minute.dataxcdc: indicates the maximum waiting duration before a synchronization task retries the next restart if the previous restart fails after failover occurs. Unit: minutes.</li>
         * <li>runtime.realtime.failover.times.dataxcdc: indicates the maximum number of failures that are allowed for restarting a synchronization task after failovers occur.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>runtime.offline.concurrent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the configuration item.</p>
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
         * <p>The channel control settings for the synchronization task. You can configure special channel control settings for the following synchronization links: data synchronization between Hologres data sources and data synchronization from Hologres to Kafka.</p>
         * <ol>
         * <li>Holo2Kafka</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</li>
         * <li>kafkaClientProperties: the parameters related to a Kafka producer, which are used when you write data to a Kafka data source.</li>
         * <li>keyColumns: the names of Kafka columns to which data is written.</li>
         * <li>writeMode: the writing format. Valid values: json and canal.</li>
         * </ul>
         * <ol start="2">
         * <li>Holo2Holo</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</li>
         * <li>conflictMode: the policy used to handle a conflict that occurs during data writing to Hologres. Valid values: replace and ignore.</li>
         * <li>writeMode: the mode in which data is written to Hologres. Valid values: replay and insert.</li>
         * <li>dynamicColumnAction: the mode in which data is written to dynamic columns in a Hologres table. Valid values: replay, insert, and ignore.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ChannelSettings")
        public String channelSettings;

        /**
         * <p>The data type mappings between source fields and destination fields.</p>
         */
        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        /**
         * <p>The settings for periodic scheduling.</p>
         */
        @NameInMap("CycleScheduleSettings")
        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings cycleScheduleSettings;

        /**
         * <p>The DDL operation types. Valid values:</p>
         * <ul>
         * <li>RenameColumn</li>
         * <li>ModifyColumn</li>
         * <li>CreateTable</li>
         * <li>TruncateTable</li>
         * <li>DropTable</li>
         * <li>DropColumn</li>
         * <li>AddColumn</li>
         * </ul>
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
         * <p>The number of compute units (CUs) in the resource group for scheduling that are used for batch synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The identifier of the resource group for Data Integration used for batch synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_7708_1667792816832</p>
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
         * <p>The number of CUs in the resource group for Data Integration that are used for real-time synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The identifier of the resource group for Data Integration used for real-time synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_235454102432001_1579085295030</p>
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
         * <p>The number of CUs in the resource group for Data Integration that are used for scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The identifier of the resource group for scheduling used by the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_235454102432001_1718359176885</p>
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
         * <p>The resource used for batch synchronization.</p>
         */
        @NameInMap("OfflineResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings offlineResourceSettings;

        /**
         * <p>The resource used for real-time synchronization.</p>
         */
        @NameInMap("RealtimeResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        /**
         * <p>The resource used for scheduling.</p>
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
         * <p>The encoding format of the database.</p>
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
         * <p>The operation that is performed to select objects. Valid values: Include and Exclude.</p>
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
         * <li>Table</li>
         * <li>Schema</li>
         * <li>Database</li>
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
         * <li>DefinePrimaryKey</li>
         * <li>Rename</li>
         * <li>AddColumn</li>
         * <li>HandleDml</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AddColumn</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The name of the rule. If the values of the RuleActionType parameter and the RuleTargetType parameter are the same for multiple transformation rules, you must make sure that the transformation rule names are unique.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the object on which the action is performed. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * <li>Schema</li>
         * <li>Database</li>
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
         * <p>The list of rules used to select synchronization objects in the source.</p>
         */
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        /**
         * <p>The list of transformation rules that are applied to the synchronization objects selected from the source. Each entry in the list defines a transformation rule.</p>
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
         * <li>DefinePrimaryKey</li>
         * <li>Rename</li>
         * <li>AddColumn</li>
         * <li>HandleDml</li>
         * <li>DefineIncrementalCondition</li>
         * <li>DefineCycleScheduleSettings</li>
         * <li>DefinePartitionKey</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The expression of the rule. The expression is a JSON string.</p>
         * <ol>
         * <li>Example of a renaming rule</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot; }</li>
         * <li>expression: the expression of the renaming rule. You can use the following variables in an expression: ${srcDatasourceName}, ${srcDatabaseName}, and ${srcTableName}. ${srcDatasourceName} indicates the name of the source. ${srcDatabaseName} indicates the name of a source database. ${srcTableName} indicates the name of a source table.</li>
         * </ul>
         * <ol start="2">
         * <li>Example of a column addition rule</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</li>
         * <li>If no rule of this type is configured, no fields are added to the destination and no values are assigned by default.</li>
         * <li>columnName: the name of the field that is added.</li>
         * <li>columnValueType: the value type of the field. Valid values: Constant and Variable.</li>
         * <li>columnValue: the value of the field. If the columnValueType parameter is set to Constant, the value of the columnValue parameter is a constant of the STRING data type. If the columnValueType parameter is set to Variable, the value of the columnValue parameter is a built-in variable. The following built-in variables are supported: EXECUTE_TIME (LONG data type), DB_NAME_SRC (STRING data type), DATASOURCE_NAME_SRC (STRING data type), TABLE_NAME_SRC (STRING data type), DB_NAME_DEST (STRING data type), DATASOURCE_NAME_DEST (STRING data type), TABLE_NAME_DEST (STRING data type), and DB_NAME_SRC_TRANSED (STRING data type). EXECUTE_TIME indicates the execution time. DB_NAME_SRC indicates the name of a source database. DATASOURCE_NAME_SRC indicates the name of the source. TABLE_NAME_SRC indicates the name of a source table. DB_NAME_DEST indicates the name of a destination database. DATASOURCE_NAME_DEST indicates the name of the destination. TABLE_NAME_DEST indicates the name of a destination table. DB_NAME_SRC_TRANSED indicates the database name obtained after a transformation.</li>
         * </ul>
         * <ol start="3">
         * <li>Example of a rule used to specify primary key fields for a destination table</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</li>
         * <li>If no rule of this type is configured, the primary key fields in the mapped source table are used for the destination table by default.</li>
         * <li>If the destination table is an existing table, Data Integration does not modify the schema of the destination table. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run.</li>
         * <li>If the destination table is automatically created by the system, Data Integration automatically creates the schema of the destination table. The schema contains the primary key fields that you specify. If the specified primary key fields do not exist in the destination table, an error is reported when the synchronization task starts to run.</li>
         * </ul>
         * <ol start="4">
         * <li>Example of a rule used to process DML messages</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</li>
         * <li>If no rule of this type is configured, the default processing policy for messages generated for insert, update, and delete operations is Normal.</li>
         * <li>dmlType: the DML operation. Valid values: Insert, Update, and Delete.</li>
         * <li>dmlAction: the processing policy for DML messages. Valid values: Normal, Ignore, Filter, and LogicalDelete. Filter indicates conditional processing. The value Filter is returned for the dmlAction parameter only when the value of the dmlType parameter is Update or Delete.</li>
         * <li>filterCondition: the condition used to filter DML messages. This parameter is returned only when the value of the dmlAction parameter is Filter.</li>
         * </ul>
         * <ol start="5">
         * <li>Example of a rule used to perform incremental synchronization</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;where&quot;:&quot;id &gt; 0&quot;}</li>
         * <li>The rule used to perform incremental synchronization is returned.</li>
         * </ul>
         * <ol start="6">
         * <li>Example of a rule used to configure scheduling parameters for an auto triggered task</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;cronExpress&quot;:&quot; \* \* \* \* \* \*&quot;, &quot;cycleType&quot;:&quot;1&quot;}</li>
         * <li>The rule used to configure scheduling parameters for an auto triggered task is returned.</li>
         * </ul>
         * <ol start="7">
         * <li>Example of a rule used to specify a partition key</li>
         * </ol>
         * <ul>
         * <li>Example: {&quot;columns&quot;:[&quot;id&quot;]}</li>
         * <li>The rule used to specify a partition key is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}</p>
         */
        @NameInMap("RuleExpression")
        public String ruleExpression;

        /**
         * <p>The name of the rule. If the values of the RuleActionType parameter and the RuleTargetType parameter are the same for multiple transformation rules, you must make sure that the transformation rule names are unique.</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the object on which the action is performed. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * <li>Schema</li>
         * <li>Database</li>
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
         * <p>This parameter is deprecated. Use the Id parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>32601</p>
         */
        @NameInMap("DIJobId")
        @Deprecated
        public String DIJobId;

        /**
         * <p>The description of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The properties of the destination.</p>
         */
        @NameInMap("DestinationDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings> destinationDataSourceSettings;

        /**
         * <p>The destination type. Valid values: Hologres, OSS-HDFS, OSS, MaxCompute, LogHub, StarRocks, DataHub, AnalyticDB_For_MySQL, Kafka, Hive.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>32601</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the synchronization task.</p>
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
         * <p>The status of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>任务类型</p>
         * <ul>
         * <li><p>DatabaseRealtimeMigration(整库实时):将源端多个库的多个表进行流同步，支持仅全量，仅增量，或全量+增量。</p>
         * </li>
         * <li><p>DatabaseOfflineMigration(整库离线):将源端多个库的多个表进行批同步，支持仅全量，仅增量，或全量+增量。</p>
         * </li>
         * <li><p>SingleTableRealtimeMigration(单表实时):将源端单个表进行流同步。</p>
         * </li>
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
         * <li>FullAndRealtimeIncremental: full synchronization and real-time incremental synchronization of data in an entire database</li>
         * <li>RealtimeIncremental: real-time incremental synchronization of data in a single table</li>
         * <li>Full: full batch synchronization of data in an entire database</li>
         * <li>OfflineIncremental: batch incremental synchronization of data in an entire database</li>
         * <li>FullAndOfflineIncremental: full synchronization and batch incremental synchronization of data in an entire database</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullAndRealtimeIncremental</p>
         */
        @NameInMap("MigrationType")
        public String migrationType;

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
         * <p>This parameter indicates the DataWorks workspace to which the API operation is applied.</p>
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
         * <p>The settings of the source. Only a single source is supported.</p>
         */
        @NameInMap("SourceDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoSourceDataSourceSettings> sourceDataSourceSettings;

        /**
         * <p>The source type. Valid values: PolarDB, MySQL, Kafka, LogHub, Hologres, Oracle, OceanBase, MongoDB, RedShift, Hive, SQLServer, Doris, ClickHouse.</p>
         * 
         * <strong>example:</strong>
         * <p>Mysql</p>
         */
        @NameInMap("SourceDataSourceType")
        public String sourceDataSourceType;

        /**
         * <p>The list of mappings between rules used to select synchronization objects in the source and transformation rules applied to the selected synchronization objects. Each entry in the list displays a mapping between a rule used to select synchronization objects and a transformation rule applied to the selected synchronization objects.</p>
         * <blockquote>
         * <p> [ { &quot;SourceObjectSelectionRules&quot;:[ { &quot;ObjectType&quot;:&quot;Database&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;biz_db&quot; }, { &quot;ObjectType&quot;:&quot;Schema&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;s1&quot; }, { &quot;ObjectType&quot;:&quot;Table&quot;, &quot;Action&quot;:&quot;Include&quot;, &quot;ExpressionType&quot;:&quot;Exact&quot;, &quot;Expression&quot;:&quot;table1&quot; } ], &quot;TransformationRuleNames&quot;:[ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot; } ] } ]</p>
         * </blockquote>
         */
        @NameInMap("TableMappings")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappings> tableMappings;

        /**
         * <p>The list of transformation rules that are applied to the synchronization objects selected from the source.</p>
         * <blockquote>
         * <p> [ { &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;, &quot;RuleActionType&quot;:&quot;Rename&quot;, &quot;RuleTargetType&quot;:&quot;Schema&quot;, &quot;RuleExpression&quot;:&quot;{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}&quot; } ]</p>
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
