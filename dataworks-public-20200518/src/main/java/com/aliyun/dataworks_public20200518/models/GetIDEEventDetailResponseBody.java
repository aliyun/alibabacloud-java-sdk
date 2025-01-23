// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetIDEEventDetailResponseBody extends TeaModel {
    /**
     * <p>The data snapshot that is generated when an extension point event is triggered.</p>
     * <p>The fields contained in data snapshots vary based on the types of the triggered extension point events. For more information, see the description of the fields.</p>
     */
    @NameInMap("EventDetail")
    public GetIDEEventDetailResponseBodyEventDetail eventDetail;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The ID of the workflow to which the file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>74328</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The latest version number of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <p>The name of the data source with which the file is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The ID of the folder to which the file belongs. You can call the <a href="https://help.aliyun.com/document_detail/173952.html">GetFolder</a> operation to query the details of the file based on the folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aldurie78l2falure</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The file owner.</p>
         * 
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the do-while node or for-each node that corresponds to the file.</p>
         * 
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
         * <p>The output name of the parent file on which the current file depends.</p>
         * <p>This parameter corresponds to the Output Name of Ancestor Node parameter under Parent Nodes in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project_root</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The mode of the configuration file dependency. Valid values:</p>
         * <ul>
         * <li>MANUAL: Scheduling dependencies are manually configured.</li>
         * <li>AUTO: Scheduling dependencies are automatically parsed.</li>
         * </ul>
         * 
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
         * <p>The output name of the current file.</p>
         * <p>This parameter corresponds to the Output Name parameter under Output Name of Current Node in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project.002_out</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The output table name of the current file.</p>
         * <p>This parameter corresponds to the Output Table Name parameter under Output Name of Current Node in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
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
         * <p>The interval at which the node corresponding to the file is rerun. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120000</p>
         */
        @NameInMap("AutoRerunIntervalMillis")
        public Long autoRerunIntervalMillis;

        /**
         * <p>The number of times that the node corresponding to the file can be rerun.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AutoRerunTimes")
        public Long autoRerunTimes;

        /**
         * <p>The CRON expression that is used to schedule the node corresponding to the file.</p>
         * 
         * <strong>example:</strong>
         * <p>00 05 00 * * ?</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The type of the scheduling cycle of the node that corresponds to the file. Valid values: NOT_DAY and DAY. The value NOT_DAY indicates that the node is scheduled to run by minute or hour. The value DAY indicates that the node is scheduled to run by day, week, or month.</p>
         * <p>This parameter corresponds to the Scheduling Cycle parameter in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The ID of the node on which the node that corresponds to the file depends when the DependentType parameter is set to USER_DEFINE. Multiple IDs are separated by commas (,).</p>
         * <p>The value of this parameter is equivalent to the ID of the node that you specified after you select Other Nodes for Cross-Cycle Dependency (Original Previous-Cycle Dependency) in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>5,10,15,20</p>
         */
        @NameInMap("DependentNodeIdList")
        public String dependentNodeIdList;

        /**
         * <p>The type of the cross-cycle scheduling dependency of the node. Valid values:</p>
         * <ul>
         * <li>SELF: The instance generated for the node in the current cycle depends on the instance generated for the node in the previous cycle.</li>
         * <li>CHILD: The instance generated for the node in the current cycle depends on the instances generated for the descendant nodes at the nearest level of the node in the previous cycle.</li>
         * <li>USER_DEFINE: The instance generated for the node in the current cycle depends on the instances generated for one or more specified nodes in the previous cycle.</li>
         * <li>NONE: No cross-cycle scheduling dependency type is selected for the node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINE</p>
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
         * <p>This parameter corresponds to the Output Name of Current Node parameter in the Dependencies section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         */
        @NameInMap("OutputList")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList> outputList;

        /**
         * <p>The scheduling parameters of the node.</p>
         * <p>This parameter corresponds to the Scheduling Parameter section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information about the configurations of the scheduling parameters, see <a href="https://help.aliyun.com/document_detail/137548.html">Configure scheduling parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>a=x b=y</p>
         */
        @NameInMap("ParaValue")
        public String paraValue;

        /**
         * <p>Indicates whether the node that corresponds to the file can be rerun. Valid values:</p>
         * <ul>
         * <li>ALL_ALLOWED: The node can be rerun regardless of whether it is successfully run or fails to run.</li>
         * <li>FAILURE_ALLOWED: The node can be rerun only after it fails to run.</li>
         * <li>ALL_DENIED: The node cannot be rerun regardless of whether it is successfully run or fails to run.</li>
         * </ul>
         * <p>This parameter corresponds to the Rerun parameter in the Schedule section of the Properties tab in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL_ALLOWED</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The ID of the resource group that is used to run the node that corresponds to the file. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to query the available resource groups in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>375827434852437</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <p>The scheduling type of the node. Valid values:</p>
         * <ul>
         * <li>NORMAL: The node is an auto triggered node.</li>
         * <li>MANUAL: The node is a manually triggered node. Manually triggered nodes cannot be automatically triggered. They correspond to the nodes in the Manually Triggered Workflows pane.</li>
         * <li>PAUSE: The node is a paused node.</li>
         * <li>SKIP: The node is a dry-run node. Dry-run nodes are started as scheduled, but the system sets the status of the nodes to successful when it starts to run them.</li>
         * </ul>
         * 
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
         * <p>The type of the change to the file of the current version. Valid values: CREATE, UPDATE, and DELETE.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The description of the file version.</p>
         * 
         * <strong>example:</strong>
         * <p>Second version submission</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to generate the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("Committor")
        public String committor;

        /**
         * <p>The code in the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_dataworks.sql</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The details of the file.</p>
         */
        @NameInMap("FilePropertyContent")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent filePropertyContent;

        /**
         * <p>The type of the code for the file. The code of files varies based on the file type. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * 
         * <strong>example:</strong>
         * <p>421429</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The module to which the file belongs. Valid values:</p>
         * <ul>
         * <li>NORMAL: The file is used for DataStudio.</li>
         * <li>MANUAL: The file is used for a manually triggered node.</li>
         * <li>MANUAL_BIZ: The file is used for a manually triggered workflow.</li>
         * <li>SKIP: The file is used for a dry-run DataStudio node.</li>
         * <li>ADHOCQUERY: The file is used for an ad hoc query.</li>
         * <li>COMPONENT: The file is used for a snippet.</li>
         * </ul>
         * 
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
         * <p>The ID of the workflow to which the file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>74328</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The code in the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The latest version number of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <p>The name of the data source with which the file is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_dataworks.sql</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The type of the code for the file. The code of files varies based on the file type. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Long fileType;

        /**
         * <p>The ID of the folder to which the file belongs. You can call the <a href="https://help.aliyun.com/document_detail/173952.html">GetFolder</a> operation to query the details of the file based on the folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aldurie78l2falure</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The ID of the node that is scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>421429</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The file owner.</p>
         * 
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the do-while node or for-each node that corresponds to the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1234122</p>
         */
        @NameInMap("ParentFileId")
        public Long parentFileId;

        /**
         * <p>The module to which the file belongs. Valid values:</p>
         * <ul>
         * <li>NORMAL: The file is used for DataStudio.</li>
         * <li>MANUAL: The file is used for a manually triggered node.</li>
         * <li>MANUAL_BIZ: The file is used for a manually triggered workflow.</li>
         * <li>SKIP: The file is used for a dry-run DataStudio node.</li>
         * <li>ADHOCQUERY: The file is used for an ad hoc query.</li>
         * <li>COMPONENT: The file is used for a snippet.</li>
         * </ul>
         * 
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
         * <p>The code in the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The name of the data source with which the file is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The type of the code for the file. The code for files varies based on the file type. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
         * 
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
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>ID</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The remarks of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>ID</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Indicates whether the column is a partition key column. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
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
        /**
         * <p>The columns in the table.</p>
         */
        @NameInMap("Columns")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailTableModelColumns> columns;

        /**
         * <p>The remarks of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>A new table</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The name of the data source to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_first</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The environment in which the table is used. Valid values:</p>
         * <ul>
         * <li>DEV</li>
         * <li>PROD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The lifecycle of the metatable. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("LifeCycle")
        public Long lifeCycle;

        /**
         * <p>The path of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs://path/to/object</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the table.</p>
         * 
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
        /**
         * <p>The data snapshot when the file is committed and deployed.</p>
         * <p>This parameter is valid only if the message type is IDE_FILE_SUBMIT_BEFORE or IDE_FILE_DEPLOY_BEFORE.</p>
         */
        @NameInMap("CommittedFile")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFile committedFile;

        /**
         * <p>The data snapshot when the file is deleted. This parameter is valid only if the message type is IDE_FILE_DELETE_BEFORE.</p>
         */
        @NameInMap("DeletedFile")
        public GetIDEEventDetailResponseBodyEventDetailDeletedFile deletedFile;

        /**
         * <p>The data snapshot when the code in the file is run. This parameter is valid only if the message type is IDE_FILE_EXECUTE_BEFORE.</p>
         */
        @NameInMap("FileExecutionCommand")
        public GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand fileExecutionCommand;

        /**
         * <p>The data snapshot when the table is committed and deployed. This parameter is valid only if the message type is IDE_TABLE_SUBMIT_BEFORE or IDE_TABLE_DEPLOY_BEFORE.</p>
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
