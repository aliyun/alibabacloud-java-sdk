// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetIDEEventDetailResponseBody extends TeaModel {
    /**
     * <p>The data snapshot that is generated when the extension point event is triggered.</p>
     * <br>
     * <p>The fields contained in data snapshots vary based on the types of the triggered extension point events. For more information, see the description of the fields.</p>
     */
    @NameInMap("EventDetail")
    public GetIDEEventDetailResponseBodyEventDetail eventDetail;

    /**
     * <p>The ID of the request. You can troubleshoot errors based on the ID.</p>
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
         * <p>The ID of the workflow to which the file belongs.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The latest version number of the file.</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <p>The name of the compute engine instance with which the file is associated.</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The ID of the folder to which the file belongs. You can call the [GetFolder](https://help.aliyun.com/document_detail/173952.html) operation to query the details of the file based on the folder ID.</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The owner of the file.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the do-while node or for-each node that corresponds to the file.</p>
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
         * <p>The output names of the parent files on which the current file depends.</p>
         * <br>
         * <p>This parameter is equivalent to the Output Name parameter under Parent Nodes in the Dependencies section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The mode of the configuration file dependency. Valid values:</p>
         * <br>
         * <p>*   MANUAL: The scheduling dependencies are manually configured.</p>
         * <p>*   AUTO: The scheduling dependencies are automatically parsed.</p>
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
         * <p>The output name of the current file.</p>
         * <br>
         * <p>This parameter is equivalent to the Output Name parameter under Output in the Dependencies section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The output table name of the current file.</p>
         * <br>
         * <p>This parameter is equivalent to the Output Table Name parameter under Output in the Dependencies section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
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
         * <p>The interval at which the node corresponding to the file is rerun. Unit: milliseconds.</p>
         */
        @NameInMap("AutoRerunIntervalMillis")
        public Long autoRerunIntervalMillis;

        /**
         * <p>The number of times that the node corresponding to the file can be rerun.</p>
         */
        @NameInMap("AutoRerunTimes")
        public Long autoRerunTimes;

        /**
         * <p>The CRON expression that is used to schedule the node corresponding to the file.</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The type of the scheduling cycle of the node that corresponds to the file. Valid values: NOT_DAY and DAY. A value of NOT_DAY indicates that the node is scheduled to run by minute or hour. A value of DAY indicates that the node is scheduled to run by day, week, or month.</p>
         * <br>
         * <p>This parameter is equivalent to the Scheduling Cycle parameter in the Schedule section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The IDs of the nodes on which the node corresponding to the file depends when the DependentType parameter is set to USER_DEFINE. Multiple IDs are separated by commas (,).</p>
         * <br>
         * <p>This parameter is equivalent to the field that appears after Previous Cycle is selected and the Depend On parameter is set to Other Nodes in the Dependencies section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("DependentNodeIdList")
        public String dependentNodeIdList;

        /**
         * <p>The type of the cross-cycle scheduling dependency of the node that corresponds to the file. Valid values:</p>
         * <br>
         * <p>*   SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle.</p>
         * <p>*   CHILD: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle.</p>
         * <p>*   USER_DEFINE: The instance generated for the node in the current cycle depends on the instances generated for one or more specified nodes in the previous cycle.</p>
         * <p>*   NONE: No cross-cycle scheduling dependency type is selected for the node.</p>
         */
        @NameInMap("DependentType")
        public String dependentType;

        /**
         * <p>The output names of the parent files on which the current file depends.</p>
         */
        @NameInMap("InputList")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList> inputList;

        /**
         * <p>The output names of the current file.</p>
         * <br>
         * <p>This parameter is equivalent to the Output Name parameter under Output in the Dependencies section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("OutputList")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList> outputList;

        /**
         * <p>The scheduling parameters.</p>
         * <br>
         * <p>This parameter is equivalent to the configuration of the scheduling parameters in the Parameters section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console). For more information, see [Configure scheduling parameters](https://help.aliyun.com/document_detail/137548.html).</p>
         */
        @NameInMap("ParaValue")
        public String paraValue;

        /**
         * <p>Indicates whether the node can be rerun. Valid values:</p>
         * <br>
         * <p>*   ALL_ALLOWED: The node can be rerun regardless of whether it is successfully run or fails to run.</p>
         * <p>*   FAILURE_ALLOWED: The node can be rerun only after it fails to run.</p>
         * <p>*   ALL_DENIED: The node cannot be rerun regardless of whether it is successfully run or fails to run.</p>
         * <br>
         * <p>This parameter is equivalent to the Rerun parameter in the Schedule section of the Properties panel in the [DataWorks console](https://workbench.data.aliyun.com/console).</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The ID of the resource group that is used to run the node that corresponds to the file. You can call the [ListResourceGroups](https://help.aliyun.com/document_detail/173913.html) operation to query the available resource groups in the workspace.</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <br>
         * <p>*   NORMAL: The node is an auto triggered node.</p>
         * <p>*   MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered. They correspond to the nodes in the Manually Triggered Workflows pane.</p>
         * <p>*   PAUSE: The node is a paused node.</p>
         * <p>*   SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled but the system sets the status of the nodes to successful when it starts to run them.</p>
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
         * <p>The type of the change to the file of the current version. Valid values: CREATE, UPDATE, and DELETE.</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The description of the file version.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the file of the current version.</p>
         */
        @NameInMap("Committor")
        public String committor;

        /**
         * <p>The code in the file of the current version.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the file.</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The details of the file.</p>
         */
        @NameInMap("FilePropertyContent")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent filePropertyContent;

        /**
         * <p>The type of the code in the file. Examples: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time sync), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
         */
        @NameInMap("FileType")
        public Long fileType;

        /**
         * <p>The scheduling properties of the node that corresponds to the file.</p>
         */
        @NameInMap("NodeConfiguration")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration nodeConfiguration;

        /**
         * <p>The ID of the node that is scheduled.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The module to which the file belongs. Valid values:</p>
         * <br>
         * <p>*   NORMAL: The file is used for DataStudio.</p>
         * <p>*   MANUAL: The file is used for a manually triggered node.</p>
         * <p>*   MANUAL_BIZ: The file is used for a manually triggered workflow.</p>
         * <p>*   SKIP: The file is used for a dry-run DataStudio node.</p>
         * <p>*   ADHOCQUERY: The file is used for an ad hoc query.</p>
         * <p>*   COMPONENT: The file is used for a snippet.</p>
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
         * <p>The ID of the workflow to which the file belongs.</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The code in the file of the current version.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The latest version number of the file.</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <p>The name of the compute engine instance with which the file is associated.</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The ID of the file.</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The type of the code in the file. Examples: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time sync), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
         */
        @NameInMap("FileType")
        public Long fileType;

        /**
         * <p>The ID of the folder to which the file belongs. You can call the [GetFolder](https://help.aliyun.com/document_detail/173952.html) operation to query the details of the file based on the folder ID.</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The ID of the node that is scheduled.</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The owner of the file.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the do-while node or for-each node that corresponds to the file.</p>
         */
        @NameInMap("ParentFileId")
        public Long parentFileId;

        /**
         * <p>The module to which the file belongs. Valid values:</p>
         * <br>
         * <p>*   NORMAL: The file is used for DataStudio.</p>
         * <p>*   MANUAL: The file is used for a manually triggered node.</p>
         * <p>*   MANUAL_BIZ: The file is used for a manually triggered workflow.</p>
         * <p>*   SKIP: The file is used for a dry-run DataStudio node.</p>
         * <p>*   ADHOCQUERY: The file is used for an ad hoc query.</p>
         * <p>*   COMPONENT: The file is used for a snippet.</p>
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
         * <p>The code in the file of the current version.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The name of the compute engine instance with which the file is associated.</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The ID of the file.</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The type of the code in the file. Examples: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time sync), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3).</p>
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
         * <p>The name of the column.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the column.</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The remarks of the column.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Indicates whether the column is a partition key column. Valid values:</p>
         * <br>
         * <p>- true: The column is a partition key column.</p>
         * <p>- false: The column is not a partition key column.</p>
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
        /**
         * <p>The columns in the table.</p>
         */
        @NameInMap("Columns")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailTableModelColumns> columns;

        /**
         * <p>The description of the table.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The name of the compute engine instance to which the table belongs.</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The environment in which the table is used. Valid values:</p>
         * <br>
         * <p>- DEV: development environment</p>
         * <p>- PROD: production environment</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The lifecycle of the table. Unit: days.</p>
         */
        @NameInMap("LifeCycle")
        public Long lifeCycle;

        /**
         * <p>The path of the table.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the table.</p>
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
        /**
         * <p>The data snapshot when the file is committed and deployed.</p>
         * <br>
         * <p>The value of this parameter is not empty only when the message type is IDE_FILE_SUBMIT_BEFORE or IDE_FILE_DEPLOY_BEFORE.</p>
         */
        @NameInMap("CommittedFile")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFile committedFile;

        /**
         * <p>The data snapshot when the file is deleted. The value of this parameter is not empty only when the message type is IDE_FILE_DELETE_BEFORE.</p>
         */
        @NameInMap("DeletedFile")
        public GetIDEEventDetailResponseBodyEventDetailDeletedFile deletedFile;

        /**
         * <p>The data snapshot when the code in the file is run. The value of this parameter is not empty only when the message type is IDE_FILE_EXECUTE_BEFORE.</p>
         */
        @NameInMap("FileExecutionCommand")
        public GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand fileExecutionCommand;

        /**
         * <p>The data snapshot when the table is committed and deployed. The value of this parameter is not empty only when the message type is IDE_TABLE_SUBMIT_BEFORE or IDE_TABLE_DEPLOY_BEFORE.</p>
         */
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
