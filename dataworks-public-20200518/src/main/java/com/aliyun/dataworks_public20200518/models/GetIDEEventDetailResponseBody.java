// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetIDEEventDetailResponseBody extends TeaModel {
    /**
     * <p>The data snapshot at the time the extension point event was triggered.</p>
     * <p>Different types of message events have different valid fields in the data snapshot. For details, refer to the field descriptions of each message event.</p>
     */
    @NameInMap("EventDetail")
    public GetIDEEventDetailResponseBodyEventDetail eventDetail;

    /**
     * <p>The unique ID of the request, which can be used for troubleshooting.</p>
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
         * <p>The latest version of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <p>The unique identifier of the data source associated with the file.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The ID of the folder to which the file belongs. You can call the <a href="https://help.aliyun.com/document_detail/173952.html">GetFolder</a> operation to query file details by folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aldurie78l2falure</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The owner of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The node ID of the loop node or traversal node to which the file belongs.</p>
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
         * <p>The output name of the upstream file on which the file depends.</p>
         * <p>This parameter corresponds to the &quot;Output Name of Upstream Node&quot; in the &quot;Schedule Configuration &gt; Scheduling Dependencies &gt; Depends On Upstream Nodes&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project_root</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The method used to configure file dependencies. Valid values:</p>
         * <ul>
         * <li>MANUAL: manual configuration.</li>
         * <li>AUTO: automatic parsing.</li>
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
         * <p>The output name of the file.</p>
         * <p>This parameter corresponds to the &quot;Output Name&quot; in the &quot;Schedule Configuration &gt; Scheduling Dependencies &gt; Output Name of Current Node&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project.002_out</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>The output table name of the file.</p>
         * <p>This parameter corresponds to the &quot;Output Table Name&quot; in the &quot;Schedule Configuration &gt; Scheduling Dependencies &gt; Output Name of Current Node&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
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
         * <p>The interval between automatic reruns, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120000</p>
         */
        @NameInMap("AutoRerunIntervalMillis")
        public Long autoRerunIntervalMillis;

        /**
         * <p>The number of automatic reruns.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AutoRerunTimes")
        public Long autoRerunTimes;

        /**
         * <p>The scheduling cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>00 05 00 * * ?</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The type of the scheduling cycle. Valid values: NOT_DAY (minute or hour) and DAY (day, week, or month).</p>
         * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Time Properties &gt; Scheduling Cycle&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>The IDs of the nodes on which the current file depends when the DependentType parameter settings are set to USER_DEFINE. Separate multiple node IDs with commas (,).</p>
         * <p>This parameter corresponds to the &quot;Settings &gt; Scheduling Dependencies &gt; Cross-epoch Dependencies (Previous Epoch)&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, when the dependency is set to &quot;Other Nodes&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>5,10,15,20</p>
         */
        @NameInMap("DependentNodeIdList")
        public String dependentNodeIdList;

        /**
         * <p>The method of depending on the previous cycle. Valid values:</p>
         * <ul>
         * <li>SELF: the dependency is set to the current node.</li>
         * <li>CHILD: the dependency is set to first-level child nodes.</li>
         * <li>USER_DEFINE: the dependency is set to other nodes.</li>
         * <li>NONE: no dependency is selected, meaning the node does not depend on the previous cycle.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINE</p>
         */
        @NameInMap("DependentType")
        public String dependentType;

        /**
         * <p>The upstream file outputs on which the file depends.</p>
         */
        @NameInMap("InputList")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationInputList> inputList;

        /**
         * <p>The outputs of the file.</p>
         * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Scheduling Dependencies &gt; Output Name of Current Node&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         */
        @NameInMap("OutputList")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfigurationOutputList> outputList;

        /**
         * <p>The scheduling parameters.</p>
         * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Parameters&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/137548.html">Scheduling parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>a=x b=y</p>
         */
        @NameInMap("ParaValue")
        public String paraValue;

        /**
         * <p>The rerun property. Valid values:</p>
         * <ul>
         * <li>ALL_ALLOWED: The node can be rerun regardless of whether it runs successfully or fails.</li>
         * <li>FAILURE_ALLOWED: The node can be rerun only after it fails.</li>
         * <li>ALL_DENIED: The node cannot be rerun regardless of whether it runs successfully or fails.</li>
         * </ul>
         * <p>This parameter corresponds to the &quot;Schedule Configuration &gt; Time Properties &gt; Rerun Properties&quot; setting of a DataStudio task in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL_ALLOWED</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The resource group used when the task is executed after the file is deployed. You can call the <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> operation to obtain the list of available resource groups for the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>375827434852437</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <p>The scheduling type. Valid values:</p>
         * <ul>
         * <li>NORMAL: normal scheduling task.</li>
         * <li>MANUAL: manual task that is not scheduled on a regular basis. This corresponds to nodes in a manual workflow.</li>
         * <li>PAUSE: paused task.</li>
         * <li>SKIP: dry-run task that is scheduled on a regular basis but is directly set to successful when scheduling starts.</li>
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
         * <p>The change type of this file version. Valid values: CREATE, UPDATE, and DELETE.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The description of this file version.</p>
         * 
         * <strong>example:</strong>
         * <p>Second version submission</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The Alibaba Cloud user ID that generated this file version.</p>
         * 
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("Committor")
        public String committor;

        /**
         * <p>The file code that generated this file version.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the file.</p>
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
         * <p>The additional properties of the file.</p>
         */
        @NameInMap("FilePropertyContent")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFileFilePropertyContent filePropertyContent;

        /**
         * <p>The file type. Different file types have different code. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Long fileType;

        /**
         * <p>The scheduling configuration of the file.</p>
         */
        @NameInMap("NodeConfiguration")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFileNodeConfiguration nodeConfiguration;

        /**
         * <p>The ID of the scheduling node.</p>
         * 
         * <strong>example:</strong>
         * <p>421429</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The functional module to which the file belongs. Valid values:</p>
         * <ul>
         * <li>NORMAL: DataStudio.</li>
         * <li>MANUAL: manual task.</li>
         * <li>MANUAL_BIZ: manual workflow.</li>
         * <li>SKIP: dry-run scheduling in DataStudio.</li>
         * <li>ADHOCQUERY: ad hoc query.</li>
         * <li>COMPONENT: component management.</li>
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
         * <p>The file code that generated this file version.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The latest version of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <p>The unique identifier of the data source associated with the file.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The ID of the file.</p>
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
         * <p>The file type. Different file types have different code. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Long fileType;

        /**
         * <p>The ID of the folder to which the file belongs. You can call the <a href="https://help.aliyun.com/document_detail/173952.html">GetFolder</a> operation to query file details by folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aldurie78l2falure</p>
         */
        @NameInMap("FolderId")
        public String folderId;

        /**
         * <p>The ID of the scheduling node.</p>
         * 
         * <strong>example:</strong>
         * <p>421429</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The owner of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The node ID of the loop node or traversal node to which the file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234122</p>
         */
        @NameInMap("ParentFileId")
        public Long parentFileId;

        /**
         * <p>The functional module to which the file belongs. Valid values:</p>
         * <ul>
         * <li>NORMAL: DataStudio.</li>
         * <li>MANUAL: manual task.</li>
         * <li>MANUAL_BIZ: manual workflow.</li>
         * <li>SKIP: dry-run scheduling in DataStudio.</li>
         * <li>ADHOCQUERY: ad hoc query.</li>
         * <li>COMPONENT: component management.</li>
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
         * <p>The file code that generated this file version.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The unique identifier of the data source associated with the file.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1234123</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The file type. Different file types have different code. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks nodes</a>.</p>
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
         * <p>The type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The comment of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>ID</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Indicates whether the column is a partition column. Valid values:</p>
         * <ul>
         * <li>true: The column is a partition column.</li>
         * <li>false: The column is not a partition column.</li>
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
         * <p>The list of columns.</p>
         */
        @NameInMap("Columns")
        public java.util.List<GetIDEEventDetailResponseBodyEventDetailTableModelColumns> columns;

        /**
         * <p>The comment of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>A new table</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The unique identifier of the data source to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The environment to which the table belongs. Valid values:</p>
         * <ul>
         * <li>DEV: development environment.</li>
         * <li>PROD: production environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The lifecycle of the table. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("LifeCycle")
        public Long lifeCycle;

        /**
         * <p>The location information of the external table.</p>
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
         * <p>The snapshot when a file is committed or deployed.</p>
         * <p>This field is valid only when the Message type is IDE_FILE_SUBMIT_BEFORE or IDE_FILE_DEPLOY_BEFORE.</p>
         */
        @NameInMap("CommittedFile")
        public GetIDEEventDetailResponseBodyEventDetailCommittedFile committedFile;

        /**
         * <p>The snapshot information when a file is deleted. This field is valid only when the Message type is IDE_FILE_DELETE_BEFORE.</p>
         */
        @NameInMap("DeletedFile")
        public GetIDEEventDetailResponseBodyEventDetailDeletedFile deletedFile;

        /**
         * <p>The snapshot when file code is executed. This field is valid only when the Message type is IDE_FILE_EXECUTE_BEFORE.</p>
         */
        @NameInMap("FileExecutionCommand")
        public GetIDEEventDetailResponseBodyEventDetailFileExecutionCommand fileExecutionCommand;

        /**
         * <p>The snapshot when a table is committed or deployed. This field is valid only when the Message type is IDE_TABLE_SUBMIT_BEFORE or IDE_TABLE_DEPLOY_BEFORE.</p>
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
