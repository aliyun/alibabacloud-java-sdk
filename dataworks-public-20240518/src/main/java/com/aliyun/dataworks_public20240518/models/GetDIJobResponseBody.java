// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDIJobResponseBody extends TeaModel {
    /**
     * <p>The details of the data integration job.</p>
     */
    @NameInMap("PagingInfo")
    public GetDIJobResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
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
         * <p>The data type in the destination, such as <code>bigint</code>, <code>boolean</code>, <code>string</code>, <code>text</code>, <code>datetime</code>, <code>timestamp</code>, <code>decimal</code>, and <code>binary</code>. Data types vary depending on the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("DestinationDataType")
        public String destinationDataType;

        /**
         * <p>The data type in the source, such as <code>bigint</code>, <code>boolean</code>, <code>string</code>, <code>text</code>, <code>datetime</code>, <code>timestamp</code>, <code>decimal</code>, and <code>binary</code>. Data types vary depending on the data source.</p>
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
         * <p>The synchronization type for periodic scheduling. Valid values:</p>
         * <ul>
         * <li><p><code>Full</code>: full</p>
         * </li>
         * <li><p><code>OfflineIncremental</code>: offline incremental</p>
         * </li>
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
         * <li><p><code>Ignore</code>: Ignores the DDL message.</p>
         * </li>
         * <li><p><code>Critical</code>: Reports an error.</p>
         * </li>
         * <li><p><code>Normal</code>: Processes the DDL message.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The DDL message type. Valid values:</p>
         * <ul>
         * <li><p><code>RenameColumn</code></p>
         * </li>
         * <li><p><code>ModifyColumn</code></p>
         * </li>
         * <li><p><code>CreateTable</code></p>
         * </li>
         * <li><p><code>TruncateTable</code></p>
         * </li>
         * <li><p><code>DropTable</code></p>
         * </li>
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
         * <p>The name of the setting. Valid values:</p>
         * <ul>
         * <li><p><code>src.offline.datasource.max.connection</code>: the maximum number of connections to the source for an offline batch job.</p>
         * </li>
         * <li><p><code>dst.offline.truncate</code>: Whether to truncate the destination table before the offline batch job starts.</p>
         * </li>
         * <li><p><code>runtime.offline.speed.limit.enable</code>: Whether to enable throttling for an offline batch job.</p>
         * </li>
         * <li><p><code>runtime.offline.concurrent</code>: the concurrency level for an offline batch synchronization job.</p>
         * </li>
         * <li><p><code>runtime.enable.auto.create.schema</code>: Whether to automatically create a schema at the destination.</p>
         * </li>
         * <li><p><code>runtime.realtime.concurrent</code>: the concurrency level for a real-time job.</p>
         * </li>
         * <li><p><code>runtime.realtime.failover.minute.dataxcdc</code>: The wait duration (in minutes) before restarting a failed instance.</p>
         * </li>
         * <li><p><code>runtime.realtime.failover.times.dataxcdc</code>: The maximum number of retries for a failed instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>runtime.offline.concurrent</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the setting.</p>
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
         * <p>The settings for channel-related jobs. You can configure special settings for specific channels. The following channels are supported: Holo2Holo (data synchronization from Hologres to Hologres) and Holo2Kafka (data synchronization from Hologres to Kafka).</p>
         * <ol>
         * <li>Holo2Kafka</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;destinationChannelSettings&quot;:{&quot;kafkaClientProperties&quot;:[{&quot;key&quot;:&quot;linger.ms&quot;,&quot;value&quot;:&quot;100&quot;}],&quot;keyColumns&quot;:[&quot;col3&quot;],&quot;writeMode&quot;:&quot;canal&quot;}}</code></p>
         * </li>
         * <li><p><code>kafkaClientProperties</code>: The parameters for the Kafka producer, used when writing data to Kafka.</p>
         * </li>
         * <li><p><code>keyColumns</code>: The columns whose values are used as the key for Kafka records.</p>
         * </li>
         * <li><p><code>writeMode</code>: The format for writing data to Kafka. Valid values: <code>json</code> and <code>canal</code>.</p>
         * </li>
         * </ul>
         * <ol start="2">
         * <li>Holo2Holo</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;destinationChannelSettings&quot;:{&quot;conflictMode&quot;:&quot;replace&quot;,&quot;dynamicColumnAction&quot;:&quot;replay&quot;,&quot;writeMode&quot;:&quot;replay&quot;}}</code></p>
         * </li>
         * <li><p><code>conflictMode</code>: The conflict handling policy for writing data to Hologres. Valid values: <code>replace</code> (overwrite) and <code>ignore</code> (ignore).</p>
         * </li>
         * <li><p><code>writeMode</code>: The method for writing data to Hologres. Valid values: <code>replay</code> and <code>insert</code>.</p>
         * </li>
         * <li><p><code>dynamicColumnAction</code>: The method for handling dynamic columns when writing data to Hologres. Valid values: <code>replay</code>, <code>insert</code>, and <code>ignore</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;structInfo&quot;:&quot;MANAGED&quot;,&quot;storageType&quot;:&quot;TEXTFILE&quot;,&quot;writeMode&quot;:&quot;APPEND&quot;,&quot;partitionColumns&quot;:[{&quot;columnName&quot;:&quot;pt&quot;,&quot;columnType&quot;:&quot;STRING&quot;,&quot;comment&quot;:&quot;&quot;}],&quot;fieldDelimiter&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ChannelSettings")
        public String channelSettings;

        /**
         * <p>The column data type mappings.</p>
         */
        @NameInMap("ColumnDataTypeSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoJobSettingsColumnDataTypeSettings> columnDataTypeSettings;

        /**
         * <p>The settings for periodic scheduling.</p>
         */
        @NameInMap("CycleScheduleSettings")
        public GetDIJobResponseBodyPagingInfoJobSettingsCycleScheduleSettings cycleScheduleSettings;

        /**
         * <p>An array of settings for handling DDL messages. Each element specifies a DDL message type and the corresponding handling rule.</p>
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
         * <p>The number of CUs from the data integration resource group for the offline synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the data integration resource group used by the offline synchronization job.</p>
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
         * <p>The number of CUs from the data integration resource group for the real-time synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the data integration resource group used by the real-time job.</p>
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
         * <p>The number of CUs from the scheduling resource group for the offline scheduling job.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("RequestedCu")
        public Double requestedCu;

        /**
         * <p>The name of the scheduling resource group used by the offline scheduling job.</p>
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
         * <p>The resource settings for the offline synchronization job.</p>
         */
        @NameInMap("OfflineResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsOfflineResourceSettings offlineResourceSettings;

        /**
         * <p>The resource settings for the real-time synchronization job.</p>
         */
        @NameInMap("RealtimeResourceSettings")
        public GetDIJobResponseBodyPagingInfoResourceSettingsRealtimeResourceSettings realtimeResourceSettings;

        /**
         * <p>The scheduling resource settings.</p>
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
         * <p>The encoding of the database.</p>
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
         * <p>The selection action. Valid values: <code>Include</code> and <code>Exclude</code>.</p>
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
         * <p>The expression type. Valid values: <code>Exact</code> and <code>Regex</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Exact</p>
         */
        @NameInMap("ExpressionType")
        public String expressionType;

        /**
         * <p>The object type. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code></p>
         * </li>
         * <li><p><code>Schema</code></p>
         * </li>
         * <li><p><code>Database</code></p>
         * </li>
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
         * <li><p><code>DefinePrimaryKey</code></p>
         * </li>
         * <li><p><code>Rename</code></p>
         * </li>
         * <li><p><code>AddColumn</code></p>
         * </li>
         * <li><p><code>HandleDml</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AddColumn</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The name of the rule. The rule name must be unique for a specific action type (<code>RuleActionType</code>) and target type (<code>RuleTargetType</code>).</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The target object type of the action. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code></p>
         * </li>
         * <li><p><code>Schema</code></p>
         * </li>
         * <li><p><code>Database</code></p>
         * </li>
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
         * <p>Each rule selects a set of source objects to be synchronized. A combination of multiple rules selects one table.</p>
         */
        @NameInMap("SourceObjectSelectionRules")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappingsSourceObjectSelectionRules> sourceObjectSelectionRules;

        /**
         * <p>An array of object transformation rule definitions.</p>
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
         * <li><p><code>DefinePrimaryKey</code></p>
         * </li>
         * <li><p><code>Rename</code></p>
         * </li>
         * <li><p><code>AddColumn</code></p>
         * </li>
         * <li><p><code>HandleDml</code></p>
         * </li>
         * <li><p><code>DefineIncrementalCondition</code></p>
         * </li>
         * <li><p><code>DefineCycleScheduleSettings</code></p>
         * </li>
         * <li><p><code>DefinePartitionKey</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Rename</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The rule expression, in JSON string format.</p>
         * <ol>
         * <li>Rename rule (<code>Rename</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;expression&quot;:&quot;${srcDatasourceName}_${srcDatabaseName}_0922&quot;}</code></p>
         * </li>
         * <li><p><code>expression</code>: The expression for the rename transformation rule. The expression supports the following variables: <code>${srcDatasourceName}</code> (source data source name), <code>${srcDatabaseName}</code> (source database name), and <code>${srcTableName}</code> (source table name).</p>
         * </li>
         * </ul>
         * <ol start="2">
         * <li>Add column rule (<code>AddColumn</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;columns&quot;:[{&quot;columnName&quot;:&quot;my_add_column&quot;,&quot;columnValueType&quot;:&quot;Constant&quot;,&quot;columnValue&quot;:&quot;123&quot;}]}</code></p>
         * </li>
         * <li><p>If you do not specify this parameter, no columns are added or copied by default.</p>
         * </li>
         * <li><p><code>columnName</code>: The name of the column to add.</p>
         * </li>
         * <li><p><code>columnValueType</code>: The value type of the added column. Valid values: <code>Constant</code> and <code>Variable</code>.</p>
         * </li>
         * <li><p><code>columnValue</code>: The value of the added column. If <code>columnValueType</code> is <code>Constant</code>, the value is a custom string constant. If <code>columnValueType</code> is <code>Variable</code>, the value is a built-in variable. Valid built-in variables: <code>EXECUTE_TIME</code> (execution time, Long), <code>DB_NAME_SRC</code> (source database name, String), <code>DATASOURCE_NAME_SRC</code> (source data source name, String), <code>TABLE_NAME_SRC</code> (source table name, String), <code>DB_NAME_DEST</code> (destination database name, String), <code>DATASOURCE_NAME_DEST</code> (destination data source name, String), <code>TABLE_NAME_DEST</code> (destination table name, String), and <code>DB_NAME_SRC_TRANSED</code> (converted database name, String).</p>
         * </li>
         * </ul>
         * <ol start="3">
         * <li>Define primary key rule (<code>DefinePrimaryKey</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;columns&quot;:[&quot;ukcolumn1&quot;,&quot;ukcolumn2&quot;]}</code></p>
         * </li>
         * <li><p>By default, the primary key columns from the source table are used.</p>
         * </li>
         * <li><p>If the destination table already exists, the data integration system does not modify the table schema. If the specified primary key columns are not in the destination table, the job fails to start.</p>
         * </li>
         * <li><p>If the destination table is automatically created, the data integration system automatically creates the table schema that includes the defined primary key columns. If the specified primary key columns are not in the destination table, the job fails to start.</p>
         * </li>
         * </ul>
         * <ol start="4">
         * <li>DML handling rule (<code>HandleDml</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;dmlPolicies&quot;:[{&quot;dmlType&quot;:&quot;Delete&quot;,&quot;dmlAction&quot;:&quot;Filter&quot;,&quot;filterCondition&quot;:&quot;id &gt; 1&quot;}]}</code></p>
         * </li>
         * <li><p>If you do not specify this parameter, the default value <code>Normal</code> is used for Insert, Update, and Delete operations.</p>
         * </li>
         * <li><p><code>dmlType</code>: The DML operation type. Valid values: <code>Insert</code>, <code>Update</code>, and <code>Delete</code>.</p>
         * </li>
         * <li><p><code>dmlAction</code>: The DML handling policy. Valid values: <code>Normal</code> (process normally), <code>Ignore</code> (ignore), <code>Filter</code> (process conditionally, used when <code>dmlType</code> is <code>Update</code> or <code>Delete</code>), and <code>LogicalDelete</code> (logically delete).</p>
         * </li>
         * <li><p><code>filterCondition</code>: The DML filter condition. This parameter is used when <code>dmlAction</code> is <code>Filter</code>.</p>
         * </li>
         * </ul>
         * <ol start="5">
         * <li>Define incremental condition rule (<code>DefineIncrementalCondition</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;where&quot;:&quot;id &gt; 0&quot;}</code></p>
         * </li>
         * <li><p>Specifies the filter condition for incremental synchronization.</p>
         * </li>
         * </ul>
         * <ol start="6">
         * <li>Define cycle schedule settings rule (<code>DefineCycleScheduleSettings</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;cronExpress&quot;:&quot; * * * * * *&quot;, &quot;cycleType&quot;:&quot;1&quot;}</code></p>
         * </li>
         * <li><p>Specifies the scheduling parameters for a periodic job.</p>
         * </li>
         * </ul>
         * <ol start="7">
         * <li>Define partition key rule (<code>DefinePartitionKey</code>)</li>
         * </ol>
         * <ul>
         * <li><p>Example: <code>{&quot;columns&quot;:[&quot;id&quot;]}</code></p>
         * </li>
         * <li><p>Specifies the partition key.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expression&quot;:&quot;${srcDatasoureName}_${srcDatabaseName}&quot;}</p>
         */
        @NameInMap("RuleExpression")
        public String ruleExpression;

        /**
         * <p>The name of the rule. The rule name must be unique for a specific action type (<code>RuleActionType</code>) and target type (<code>RuleTargetType</code>).</p>
         * 
         * <strong>example:</strong>
         * <p>rename_rule_1</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The target object type of the action. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code></p>
         * </li>
         * <li><p><code>Schema</code></p>
         * </li>
         * <li><p><code>Database</code></p>
         * </li>
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
         * <p>This field is deprecated. Use the <code>Id</code> field instead.</p>
         * 
         * <strong>example:</strong>
         * <p>32601</p>
         */
        @NameInMap("DIJobId")
        @Deprecated
        public String DIJobId;

        /**
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The settings for the destination data source.</p>
         */
        @NameInMap("DestinationDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoDestinationDataSourceSettings> destinationDataSourceSettings;

        /**
         * <p>The type of the destination data source. Valid values: <code>Hologres</code>, <code>OSS-HDFS</code>, <code>OSS</code>, <code>MaxCompute</code>, <code>LogHub</code>, <code>StarRocks</code>, <code>DataHub</code>, <code>AnalyticDB for MySQL</code>, <code>Kafka</code>, and <code>Hive</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Hologres</p>
         */
        @NameInMap("DestinationDataSourceType")
        public String destinationDataSourceType;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32601</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>imp_ods_dms_det_dealer_info_df</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The job settings.</p>
         */
        @NameInMap("JobSettings")
        public GetDIJobResponseBodyPagingInfoJobSettings jobSettings;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><p><code>Finished</code>: The job is complete.</p>
         * </li>
         * <li><p><code>Failed</code>: The job failed.</p>
         * </li>
         * <li><p><code>Running</code>: The job is running.</p>
         * </li>
         * <li><p><code>Initialized</code>: The job is initialized but has not started.</p>
         * </li>
         * <li><p><code>Stopping</code>: The job is being stopped.</p>
         * </li>
         * <li><p><code>Stop</code>: The job is stopped.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The job type.</p>
         * <ul>
         * <li><p><code>DatabaseRealtimeMigration</code>: real-time synchronization of multiple tables from multiple source databases. This type supports full, incremental, or both full and incremental synchronization.</p>
         * </li>
         * <li><p><code>DatabaseOfflineMigration</code>: batch synchronization of multiple tables from multiple source databases. This type supports full, incremental, or both full and incremental synchronization.</p>
         * </li>
         * <li><p><code>SingleTableRealtimeMigration</code>: real-time synchronization of a single source table.</p>
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
         * <li><p><code>FullAndRealtimeIncremental</code>: one-time full synchronization and real-time incremental synchronization (for an entire database).</p>
         * </li>
         * <li><p><code>RealtimeIncremental</code>: real-time incremental synchronization (for a single table).</p>
         * </li>
         * <li><p><code>Full</code>: one-time full synchronization (for an entire database).</p>
         * </li>
         * <li><p><code>OfflineIncremental</code>: offline incremental synchronization (for an entire database).</p>
         * </li>
         * <li><p><code>FullAndOfflineIncremental</code>: one-time full synchronization and offline incremental synchronization (for an entire database).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullAndRealtimeIncremental</p>
         */
        @NameInMap("MigrationType")
        public String migrationType;

        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the DataWorks workspace for the API call. You can obtain the workspace ID from the Workspace Configuration page in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The settings for the source data source.</p>
         */
        @NameInMap("SourceDataSourceSettings")
        public java.util.List<GetDIJobResponseBodyPagingInfoSourceDataSourceSettings> sourceDataSourceSettings;

        /**
         * <p>The type of the source data source. Valid values: <code>PolarDB</code>, <code>MySQL</code>, <code>Kafka</code>, <code>LogHub</code>, <code>Hologres</code>, <code>Oracle</code>, <code>OceanBase</code>, <code>MongoDB</code>, <code>RedShift</code>, <code>Hive</code>, <code>SQLServer</code>, <code>Doris</code>, and <code>ClickHouse</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Mysql</p>
         */
        @NameInMap("SourceDataSourceType")
        public String sourceDataSourceType;

        /**
         * <p>A list of mappings for object transformation. Each element in the list describes a set of selection rules for source objects and a set of transformation rules that apply to the selected objects.</p>
         * <blockquote>
         * <p>[
         * {
         * &quot;SourceObjectSelectionRules&quot;:[
         * {
         * &quot;ObjectType&quot;:&quot;Database&quot;,
         * &quot;Action&quot;:&quot;Include&quot;,
         * &quot;ExpressionType&quot;:&quot;Exact&quot;,
         * &quot;Expression&quot;:&quot;biz_db&quot;
         * },
         * {
         * &quot;ObjectType&quot;:&quot;Schema&quot;,
         * &quot;Action&quot;:&quot;Include&quot;,
         * &quot;ExpressionType&quot;:&quot;Exact&quot;,
         * &quot;Expression&quot;:&quot;s1&quot;
         * },
         * {
         * &quot;ObjectType&quot;:&quot;Table&quot;,
         * &quot;Action&quot;:&quot;Include&quot;,
         * &quot;ExpressionType&quot;:&quot;Exact&quot;,
         * &quot;Expression&quot;:&quot;table1&quot;
         * }
         * ],
         * &quot;TransformationRuleNames&quot;:[
         * {
         * &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;,
         * &quot;RuleActionType&quot;:&quot;Rename&quot;,
         * &quot;RuleTargetType&quot;:&quot;Schema&quot;
         * }
         * ]
         * }
         * ]</p>
         * </blockquote>
         */
        @NameInMap("TableMappings")
        public java.util.List<GetDIJobResponseBodyPagingInfoTableMappings> tableMappings;

        /**
         * <p>A list of definitions for object transformation rules.</p>
         * <blockquote>
         * <p>[
         * {
         * &quot;RuleName&quot;:&quot;my_database_rename_rule&quot;,
         * &quot;RuleActionType&quot;:&quot;Rename&quot;,
         * &quot;RuleTargetType&quot;:&quot;Schema&quot;,
         * &quot;RuleExpression&quot;:&quot;{\\&quot;expression\\&quot;:\\&quot;${srcDatasoureName}_${srcDatabaseName}\\&quot;}&quot;
         * }
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
