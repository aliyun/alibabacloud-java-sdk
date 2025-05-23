// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetIDEEventDetailResponseBody extends TeaModel {
    @NameInMap("EventDetail")
    public GetIDEEventDetailResponseBodyEventDetail eventDetail;

    /**
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIDEEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIDEEventDetailResponseBody self = new GetIDEEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIDEEventDetailResponseBody setEventDetail(GetIDEEventDetailResponseBodyEventDetail eventDetail) {
        this.eventDetail = eventDetail;
        return this;
    }
    public GetIDEEventDetailResponseBodyEventDetail getEventDetail() {
        return this.eventDetail;
    }

    public GetIDEEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>74328</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <strong>example:</strong>
         * <p>aldurie78l2falure</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>1234122</p>
         */
        @NameInMap("ParentFileId")
        public Long parentFileId;

        public static GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent self = new GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent setCurrentVersion(Long currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Long getCurrentVersion() {
            return this.currentVersion;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent setParentFileId(Long parentFileId) {
            this.parentFileId = parentFileId;
            return this;
        }
        public Long getParentFileId() {
            return this.parentFileId;
        }

    }

    public static class GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dw_project_root</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("ParseType")
        public String parseType;

        public static GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList self = new GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList setParseType(String parseType) {
            this.parseType = parseType;
            return this;
        }
        public String getParseType() {
            return this.parseType;
        }

    }

    public static class GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dw_project.002_out</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
         */
        @NameInMap("RefTableName")
        public String refTableName;

        public static GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList self = new GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList setRefTableName(String refTableName) {
            this.refTableName = refTableName;
            return this;
        }
        public String getRefTableName() {
            return this.refTableName;
        }

    }

    public static class GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>120000</p>
         */
        @NameInMap("AutoRerunIntervalMillis")
        public Long autoRerunIntervalMillis;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AutoRerunTimes")
        public Long autoRerunTimes;

        /**
         * <strong>example:</strong>
         * <p>00 05 00 * * ?</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <strong>example:</strong>
         * <p>5,10,15,20</p>
         */
        @NameInMap("DependentNodeIdList")
        public String dependentNodeIdList;

        /**
         * <strong>example:</strong>
         * <p>USER_DEFINE</p>
         */
        @NameInMap("DependentType")
        public String dependentType;

        @NameInMap("InputList")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList> inputList;

        @NameInMap("OutputList")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList> outputList;

        /**
         * <strong>example:</strong>
         * <p>a=x b=y</p>
         */
        @NameInMap("ParaValue")
        public String paraValue;

        /**
         * <strong>example:</strong>
         * <p>ALL_ALLOWED</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <strong>example:</strong>
         * <p>375827434852437</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        public static GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration self = new GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setAutoRerunIntervalMillis(Long autoRerunIntervalMillis) {
            this.autoRerunIntervalMillis = autoRerunIntervalMillis;
            return this;
        }
        public Long getAutoRerunIntervalMillis() {
            return this.autoRerunIntervalMillis;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setAutoRerunTimes(Long autoRerunTimes) {
            this.autoRerunTimes = autoRerunTimes;
            return this;
        }
        public Long getAutoRerunTimes() {
            return this.autoRerunTimes;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setDependentNodeIdList(String dependentNodeIdList) {
            this.dependentNodeIdList = dependentNodeIdList;
            return this;
        }
        public String getDependentNodeIdList() {
            return this.dependentNodeIdList;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setDependentType(String dependentType) {
            this.dependentType = dependentType;
            return this;
        }
        public String getDependentType() {
            return this.dependentType;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setInputList(java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList> inputList) {
            this.inputList = inputList;
            return this;
        }
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList> getInputList() {
            return this.inputList;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setOutputList(java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList> outputList) {
            this.outputList = outputList;
            return this;
        }
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList> getOutputList() {
            return this.outputList;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setParaValue(String paraValue) {
            this.paraValue = paraValue;
            return this;
        }
        public String getParaValue() {
            return this.paraValue;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setResourceGroupId(Long resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

    }

    public static class GetIDEEventDetailResponseBodyEventDetailCommittedFile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <strong>example:</strong>
         * <p>Second version submission</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("Committor")
        public String committor;

        /**
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1234123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <strong>example:</strong>
         * <p>hello_dataworks.sql</p>
         */
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePropertyContent")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent filePropertyContent;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Long fileType;

        @NameInMap("NodeConfiguration")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration nodeConfiguration;

        /**
         * <strong>example:</strong>
         * <p>421429</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static GetIDEEventDetailResponseBodyEventDetailCommittedFile build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetailCommittedFile self = new GetIDEEventDetailResponseBodyEventDetailCommittedFile();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setCommittor(String committor) {
            this.committor = committor;
            return this;
        }
        public String getCommittor() {
            return this.committor;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setFilePropertyContent(GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent filePropertyContent) {
            this.filePropertyContent = filePropertyContent;
            return this;
        }
        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent getFilePropertyContent() {
            return this.filePropertyContent;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setFileType(Long fileType) {
            this.fileType = fileType;
            return this;
        }
        public Long getFileType() {
            return this.fileType;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setNodeConfiguration(GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration nodeConfiguration) {
            this.nodeConfiguration = nodeConfiguration;
            return this;
        }
        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration getNodeConfiguration() {
            return this.nodeConfiguration;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetIDEEventDetailResponseBodyEventDetailCommittedFile setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class GetIDEEventDetailResponseBodyEventDetailDeletedFile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>74328</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <strong>example:</strong>
         * <p>1234123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <strong>example:</strong>
         * <p>hello_dataworks.sql</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Long fileType;

        /**
         * <strong>example:</strong>
         * <p>aldurie78l2falure</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <strong>example:</strong>
         * <p>421429</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>1234122</p>
         */
        @NameInMap("ParentFileId")
        public Long parentFileId;

        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static GetIDEEventDetailResponseBodyEventDetailDeletedFile build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetailDeletedFile self = new GetIDEEventDetailResponseBodyEventDetailDeletedFile();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setCurrentVersion(Long currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Long getCurrentVersion() {
            return this.currentVersion;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setFileType(Long fileType) {
            this.fileType = fileType;
            return this;
        }
        public Long getFileType() {
            return this.fileType;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setParentFileId(Long parentFileId) {
            this.parentFileId = parentFileId;
            return this;
        }
        public Long getParentFileId() {
            return this.parentFileId;
        }

        public GetIDEEventDetailResponseBodyEventDetailDeletedFile setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <strong>example:</strong>
         * <p>1234123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Long fileType;

        public static GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand self = new GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand setFileType(Long fileType) {
            this.fileType = fileType;
            return this;
        }
        public Long getFileType() {
            return this.fileType;
        }

    }

    public static class GetIDEEventDetailResponseBodyEventDetailTableModelColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ID</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <strong>example:</strong>
         * <p>ID</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsPartitionColumn")
        public Boolean isPartitionColumn;

        public static GetIDEEventDetailResponseBodyEventDetailTableModelColumns build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetailTableModelColumns self = new GetIDEEventDetailResponseBodyEventDetailTableModelColumns();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModelColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModelColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModelColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModelColumns setIsPartitionColumn(Boolean isPartitionColumn) {
            this.isPartitionColumn = isPartitionColumn;
            return this;
        }
        public Boolean getIsPartitionColumn() {
            return this.isPartitionColumn;
        }

    }

    public static class GetIDEEventDetailResponseBodyEventDetailTableModel extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailTableModelColumns> columns;

        /**
         * <strong>example:</strong>
         * <p>A new table</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("LifeCycle")
        public Long lifeCycle;

        /**
         * <strong>example:</strong>
         * <p>hdfs://path/to/object</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>tb_hello</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetIDEEventDetailResponseBodyEventDetailTableModel build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetailTableModel self = new GetIDEEventDetailResponseBodyEventDetailTableModel();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModel setColumns(java.util.List<GetIDEEventDetailResponseBodyEventDetailTableModelColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailTableModelColumns> getColumns() {
            return this.columns;
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModel setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModel setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModel setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModel setLifeCycle(Long lifeCycle) {
            this.lifeCycle = lifeCycle;
            return this;
        }
        public Long getLifeCycle() {
            return this.lifeCycle;
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModel setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetIDEEventDetailResponseBodyEventDetailTableModel setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetIDEEventDetailResponseBodyEventDetail extends TeaModel {
        @NameInMap("CommittedFile")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFile committedFile;

        @NameInMap("DeletedFile")
        public GetIDEEventDetailResponseBodyEventDetailDeletedFile deletedFile;

        @NameInMap("FileExecutionCommand")
        public GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand fileExecutionCommand;

        @NameInMap("TableModel")
        public GetIDEEventDetailResponseBodyEventDetailTableModel tableModel;

        public static GetIDEEventDetailResponseBodyEventDetail build(java.util.Map<String, ?> map) throws Exception {
            GetIDEEventDetailResponseBodyEventDetail self = new GetIDEEventDetailResponseBodyEventDetail();
            return TeaModel.build(map, self);
        }

        public GetIDEEventDetailResponseBodyEventDetail setCommittedFile(GetIDEEventDetailResponseBodyEventDetailCommittedFile committedFile) {
            this.committedFile = committedFile;
            return this;
        }
        public GetIDEEventDetailResponseBodyEventDetailCommittedFile getCommittedFile() {
            return this.committedFile;
        }

        public GetIDEEventDetailResponseBodyEventDetail setDeletedFile(GetIDEEventDetailResponseBodyEventDetailDeletedFile deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public GetIDEEventDetailResponseBodyEventDetailDeletedFile getDeletedFile() {
            return this.deletedFile;
        }

        public GetIDEEventDetailResponseBodyEventDetail setFileExecutionCommand(GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand fileExecutionCommand) {
            this.fileExecutionCommand = fileExecutionCommand;
            return this;
        }
        public GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand getFileExecutionCommand() {
            return this.fileExecutionCommand;
        }

        public GetIDEEventDetailResponseBodyEventDetail setTableModel(GetIDEEventDetailResponseBodyEventDetailTableModel tableModel) {
            this.tableModel = tableModel;
            return this;
        }
        public GetIDEEventDetailResponseBodyEventDetailTableModel getTableModel() {
            return this.tableModel;
        }

    }

}
