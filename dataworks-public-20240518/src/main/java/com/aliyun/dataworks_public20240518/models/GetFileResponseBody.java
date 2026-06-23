// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetFileResponseBody extends TeaModel {
    /**
     * <p>Details of the file.</p>
     */
    @NameInMap("Data")
    public GetFileResponseBodyData data;

    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Request ID. Used for troubleshooting when a fault occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the invocation succeeded. Valid values:</p>
     * <ul>
     * <li><p>true: The invocation succeeded.</p>
     * </li>
     * <li><p>false: Failed to invoke.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileResponseBody self = new GetFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileResponseBody setData(GetFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileResponseBodyData getData() {
        return this.data;
    }

    public GetFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileResponseBodyDataFile extends TeaModel {
        /**
         * <p>Advanced configuration of the job.</p>
         * <p>This parameter corresponds to &quot;Advanced Settings&quot; in the right-side navigation bar on the editing page of an EMR Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * <blockquote>
         * <p>Currently, EMR Shell jobs do not support advanced parameters.</p>
         * </blockquote>
         * <p>For details about advanced parameters for different EMR job types, see <a href="https://help.aliyun.com/document_detail/473077.html">EMR Job Development</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;priority\&quot;:\&quot;1\&quot;,\&quot;ENABLE_SPARKSQL_JDBC\&quot;:false,\&quot;FLOW_SKIP_SQL_ANALYZE\&quot;:false,\&quot;queue\&quot;:\&quot;default\&quot;}</p>
         */
        @NameInMap("AdvancedSettings")
        public String advancedSettings;

        /**
         * <p>Indicates whether automatic parsing is enabled for the file. Valid values:</p>
         * <ul>
         * <li><p>true: The code in the file is automatically parsed.</p>
         * </li>
         * <li><p>false: The code in the file is not automatically parsed.</p>
         * </li>
         * </ul>
         * <p>This parameter corresponds to the &quot;Code Parsing&quot; option in the DataWorks console (https\://workbench.data.aliyun.com/console) when you select &quot;Same Cycle&quot; under Schedule Configuration &gt; Schedule Dependency for a Data Development job.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoParsing")
        public Boolean autoParsing;

        /**
         * <p>The ID of the Business Process to which the file belongs. This field is deprecated. Use the BusinessId field instead.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("BizId")
        public Long bizId;

        /**
         * <p>The Business Process ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("BusinessId")
        public Long businessId;

        /**
         * <p>The current commit status of the file. Valid values:</p>
         * <ul>
         * <li><p>0: The latest code has not been submitted.</p>
         * </li>
         * <li><p>1: The latest code has been submitted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CommitStatus")
        public Integer commitStatus;

        /**
         * <p>The name of the data source used when executing the job corresponding to the file.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_source</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>The code of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>UNIX timestamp when the file was created, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1593879116000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The Alibaba Cloud User ID of the file creator.</p>
         * 
         * <strong>example:</strong>
         * <p>424732****</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Version number of the latest submitted version of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CurrentVersion")
        public Integer currentVersion;

        /**
         * <p>The deletion status of the file. Valid values:</p>
         * <ul>
         * <li><p>NORMAL: Not deleted.</p>
         * </li>
         * <li><p>RECYCLE_BIN: In the recycle bin.</p>
         * </li>
         * <li><p>DELETED: Deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RECYCLE</p>
         */
        @NameInMap("DeletedStatus")
        public String deletedStatus;

        /**
         * <p>The description of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>My first DataWorks file</p>
         */
        @NameInMap("FileDescription")
        public String fileDescription;

        /**
         * <p>The ID of the folder to which the file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>2735c2****</p>
         */
        @NameInMap("FileFolderId")
        public String fileFolderId;

        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>100000001</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>Name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The code type of the file. Different file types use different code. For more information, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks Edge Zone Collection</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <p>Indicates whether the resource file needs to be uploaded to MaxCompute.
         * Configure this parameter only when the file is a MaxCompute resource file.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsMaxCompute")
        public Boolean isMaxCompute;

        /**
         * <p>The UNIX timestamp of the most recent edit to the file, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1593879116000</p>
         */
        @NameInMap("LastEditTime")
        public Long lastEditTime;

        /**
         * <p>The Alibaba Cloud User ID of the user who last edited the file.</p>
         * 
         * <strong>example:</strong>
         * <p>424732****</p>
         */
        @NameInMap("LastEditUser")
        public String lastEditUser;

        /**
         * <p>The ID of the scheduling task generated in the CDN mapping system after the file is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>300001</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>Alibaba Cloud User ID of the file owner.</p>
         * 
         * <strong>example:</strong>
         * <p>7775674356****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>If the current file is an internal file of a composite edge zone file, this field identifies the ID of the corresponding composite edge zone file.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <p>The function module to which the file belongs. Valid values:</p>
         * <ul>
         * <li><p>NORMAL: Data Development.</p>
         * </li>
         * <li><p>MANUAL: One-time task.</p>
         * </li>
         * <li><p>MANUAL_BIZ: Manually triggered workflow.</p>
         * </li>
         * <li><p>SKIP: Dry-run scheduling in Data Development.</p>
         * </li>
         * <li><p>ADHOCQUERY: Ad-hoc query.</p>
         * </li>
         * <li><p>COMPONENT: Widget Management.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static GetFileResponseBodyDataFile build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataFile self = new GetFileResponseBodyDataFile();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataFile setAdvancedSettings(String advancedSettings) {
            this.advancedSettings = advancedSettings;
            return this;
        }
        public String getAdvancedSettings() {
            return this.advancedSettings;
        }

        public GetFileResponseBodyDataFile setAutoParsing(Boolean autoParsing) {
            this.autoParsing = autoParsing;
            return this;
        }
        public Boolean getAutoParsing() {
            return this.autoParsing;
        }

        public GetFileResponseBodyDataFile setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public GetFileResponseBodyDataFile setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetFileResponseBodyDataFile setCommitStatus(Integer commitStatus) {
            this.commitStatus = commitStatus;
            return this;
        }
        public Integer getCommitStatus() {
            return this.commitStatus;
        }

        public GetFileResponseBodyDataFile setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public GetFileResponseBodyDataFile setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetFileResponseBodyDataFile setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetFileResponseBodyDataFile setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetFileResponseBodyDataFile setCurrentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        public GetFileResponseBodyDataFile setDeletedStatus(String deletedStatus) {
            this.deletedStatus = deletedStatus;
            return this;
        }
        public String getDeletedStatus() {
            return this.deletedStatus;
        }

        public GetFileResponseBodyDataFile setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public GetFileResponseBodyDataFile setFileFolderId(String fileFolderId) {
            this.fileFolderId = fileFolderId;
            return this;
        }
        public String getFileFolderId() {
            return this.fileFolderId;
        }

        public GetFileResponseBodyDataFile setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetFileResponseBodyDataFile setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetFileResponseBodyDataFile setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetFileResponseBodyDataFile setIsMaxCompute(Boolean isMaxCompute) {
            this.isMaxCompute = isMaxCompute;
            return this;
        }
        public Boolean getIsMaxCompute() {
            return this.isMaxCompute;
        }

        public GetFileResponseBodyDataFile setLastEditTime(Long lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public Long getLastEditTime() {
            return this.lastEditTime;
        }

        public GetFileResponseBodyDataFile setLastEditUser(String lastEditUser) {
            this.lastEditUser = lastEditUser;
            return this;
        }
        public String getLastEditUser() {
            return this.lastEditUser;
        }

        public GetFileResponseBodyDataFile setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetFileResponseBodyDataFile setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetFileResponseBodyDataFile setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public GetFileResponseBodyDataFile setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class GetFileResponseBodyDataNodeConfigurationInputList extends TeaModel {
        /**
         * <p>The output name of the upstream file on which this file depends.</p>
         * <p>This parameter corresponds to &quot;Parent Node Output Name&quot; when &quot;Same Cycle&quot; is selected under &quot;Schedule Configuration &gt; Schedule Dependency&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>project.001_out</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The method for configuring file dependencies. Valid values:</p>
         * <ul>
         * <li><p>MANUAL: Manually configured.</p>
         * </li>
         * <li><p>AUTO: Automatically parsed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("ParseType")
        public String parseType;

        public static GetFileResponseBodyDataNodeConfigurationInputList build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfigurationInputList self = new GetFileResponseBodyDataNodeConfigurationInputList();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfigurationInputList setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public GetFileResponseBodyDataNodeConfigurationInputList setParseType(String parseType) {
            this.parseType = parseType;
            return this;
        }
        public String getParseType() {
            return this.parseType;
        }

    }

    public static class GetFileResponseBodyDataNodeConfigurationInputParameters extends TeaModel {
        /**
         * <p>The parameter name of the input parameter in the node context. You can reference this parameter in code by using the ${...} syntax.</p>
         * <p>This parameter corresponds to the &quot;Parameter Name&quot; field under &quot;Schedule Configuration &gt; Node Context &gt; Input Parameters of This Node&quot; in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>input</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The value source of the input parameter in the node context.</p>
         * <p>This parameter corresponds to the &quot;Value Source&quot; field under &quot;Schedule Configuration &gt; Node Context &gt; Input Parameters of This Node&quot; in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>project_001.parent_node:outputs</p>
         */
        @NameInMap("ValueSource")
        public String valueSource;

        public static GetFileResponseBodyDataNodeConfigurationInputParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfigurationInputParameters self = new GetFileResponseBodyDataNodeConfigurationInputParameters();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfigurationInputParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetFileResponseBodyDataNodeConfigurationInputParameters setValueSource(String valueSource) {
            this.valueSource = valueSource;
            return this;
        }
        public String getValueSource() {
            return this.valueSource;
        }

    }

    public static class GetFileResponseBodyDataNodeConfigurationOutputList extends TeaModel {
        /**
         * <p>Output name of the file.</p>
         * <p>This parameter corresponds to the value in the &quot;Output Name&quot; column when &quot;Same Cycle&quot; is selected under &quot;Scan Configuration &gt; Schedule Dependency&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project.002_out</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>Output value of the file.</p>
         * <p>This parameter corresponds to the value in the &quot;Output Table&quot; column when &quot;Same Cycle&quot; is selected under &quot;Scan Configuration &gt; Schedule Dependency&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
         */
        @NameInMap("RefTableName")
        public String refTableName;

        public static GetFileResponseBodyDataNodeConfigurationOutputList build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfigurationOutputList self = new GetFileResponseBodyDataNodeConfigurationOutputList();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfigurationOutputList setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetFileResponseBodyDataNodeConfigurationOutputList setRefTableName(String refTableName) {
            this.refTableName = refTableName;
            return this;
        }
        public String getRefTableName() {
            return this.refTableName;
        }

    }

    public static class GetFileResponseBodyDataNodeConfigurationOutputParameters extends TeaModel {
        /**
         * <p>The description of the output parameter in the edge zone context.</p>
         * 
         * <strong>example:</strong>
         * <p>It\&quot;s a context output parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter name of the output parameter in the node context.</p>
         * <p>This parameter corresponds to the &quot;Parameter Name&quot; field under &quot;Schedule Configuration &gt; Node Context &gt; Output Parameters of This Node&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>output</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The type of the expression for the edge zone context output parameter. Valid values are as follows:</p>
         * <ul>
         * <li><p>1: constant</p>
         * </li>
         * <li><p>2: variable</p>
         * </li>
         * <li><p>3: pass-through variable from a parameter node</p>
         * </li>
         * </ul>
         * <p>This parameter corresponds to the &quot;Type&quot; field in the &quot;Scan Configuration &gt; Edge Zone Context &gt; Output Parameters of This Node&quot; section for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The expression of the output parameter in the edge zone context.</p>
         * <p>This parameter corresponds to the &quot;Value&quot; field in the &quot;Scan Configuration &gt; Edge Zone Context &gt; Output Parameters of This Node&quot; section for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>${bizdate}</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetFileResponseBodyDataNodeConfigurationOutputParameters build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfigurationOutputParameters self = new GetFileResponseBodyDataNodeConfigurationOutputParameters();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfigurationOutputParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFileResponseBodyDataNodeConfigurationOutputParameters setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public GetFileResponseBodyDataNodeConfigurationOutputParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetFileResponseBodyDataNodeConfigurationOutputParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetFileResponseBodyDataNodeConfiguration extends TeaModel {
        /**
         * <p>Whether to apply the schedule configuration immediately after publishing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ApplyScheduleImmediately")
        public String applyScheduleImmediately;

        /**
         * <p>The time interval between automatic reruns after an error, in milliseconds.</p>
         * <p>This parameter corresponds to the &quot;Rerun Interval&quot; setting under &quot;Schedule Configuration &gt; Time Properties &gt; Auto Rerun on Error&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.<br>
         * Note that the time unit for &quot;Rerun Interval&quot; in the console is minutes; convert the time accordingly when invoking the API.</p>
         * 
         * <strong>example:</strong>
         * <p>120000</p>
         */
        @NameInMap("AutoRerunIntervalMillis")
        public Integer autoRerunIntervalMillis;

        /**
         * <p>The number of automatic reruns after an error.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AutoRerunTimes")
        public Integer autoRerunTimes;

        /**
         * <p>The Cron Expression for timed scheduling of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>00 05 00 * * ?</p>
         */
        @NameInMap("CronExpress")
        public String cronExpress;

        /**
         * <p>The type of recurrence, including NOT_DAY (minute, hour) and DAY (day, week, month).</p>
         * <p>This parameter corresponds to &quot;Schedule Configuration &gt; Time Properties &gt; Recurrence&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("CycleType")
        public String cycleType;

        /**
         * <p>When the DependentType parameter is set to USER_DEFINE, this parameter specifies the IDs of the nodes on which the current file depends. Separate multiple node IDs with commas (,).</p>
         * <p>This parameter corresponds to the configuration when, in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, the &quot;Schedule Configuration &gt; Schedule Dependency&quot; of a Data Development job is set to &quot;Previous Cycle&quot; and the dependency option is set to &quot;Other Nodes&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>5,10,15,20</p>
         */
        @NameInMap("DependentNodeIdList")
        public String dependentNodeIdList;

        /**
         * <p>The method of depending on the previous cycle. Valid values:</p>
         * <ul>
         * <li><p>SELF: The dependency is the current node itself.</p>
         * </li>
         * <li><p>CHILD: The dependency is direct child nodes.</p>
         * </li>
         * <li><p>USER_DEFINE: The dependency is other specified nodes.</p>
         * </li>
         * <li><p>NONE: No dependency is selected, meaning the node does not depend on the previous cycle.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINE</p>
         */
        @NameInMap("DependentType")
        public String dependentType;

        /**
         * <p>The UNIX timestamp, in milliseconds, when automatic scheduling stops.</p>
         * <p>This parameter corresponds to the millisecond UNIX timestamp of the end time configured in the &quot;Scan Configuration &gt; Time Properties &gt; Effective Date&quot; setting for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>4155787800000</p>
         */
        @NameInMap("EndEffectDate")
        public Long endEffectDate;

        /**
         * <p>Schedule Configuration &gt; Previous Cycle &gt; Whether to ignore the upstream dry-run property.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreParentSkipRunningProperty")
        public String ignoreParentSkipRunningProperty;

        /**
         * <p>Custom image ID</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1h4b5a8ogkbll2f3tr</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>Information about outputs from upstream files on which this file depends.</p>
         */
        @NameInMap("InputList")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> inputList;

        /**
         * <p>Return Result.</p>
         */
        @NameInMap("InputParameters")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputParameters> inputParameters;

        /**
         * <p>Output information of the file.</p>
         */
        @NameInMap("OutputList")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> outputList;

        /**
         * <p>Return Result.</p>
         */
        @NameInMap("OutputParameters")
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputParameters> outputParameters;

        /**
         * <p>Schedule parameter.</p>
         * <p>This parameter corresponds to the &quot;Scan Configuration &gt; Parameters&quot; setting for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. You can refer to the <a href="https://help.aliyun.com/document_detail/137548.html">Schedule Parameters</a> documentation for configuration details.</p>
         * 
         * <strong>example:</strong>
         * <p>a=x b=y</p>
         */
        @NameInMap("ParaValue")
        public String paraValue;

        /**
         * <p>Rerun property. Valid values:</p>
         * <ul>
         * <li><p>ALL_ALLOWED: The job can be rerun regardless of whether it previously Succeeded or failed.</p>
         * </li>
         * <li><p>FAILURE_ALLOWED: The job cannot be rerun if it previously Succeeded, but can be rerun if it previously failed.</p>
         * </li>
         * <li><p>ALL_DENIED: The job cannot be rerun regardless of whether it previously Succeeded or failed.</p>
         * </li>
         * </ul>
         * <p>This parameter corresponds to the &quot;Scan Configuration &gt; Time Properties &gt; Rerun Property&quot; setting for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL_ALLOWED</p>
         */
        @NameInMap("RerunMode")
        public String rerunMode;

        /**
         * <p>The resource group used when the file is published as a Job and executed. You can call <a href="https://help.aliyun.com/document_detail/173913.html">ListResourceGroups</a> to obtain the list of available resource groups in the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>375827434852437</p>
         */
        @NameInMap("ResourceGroupId")
        public Long resourceGroupId;

        /**
         * <p>The schedule type. Valid values:</p>
         * <ul>
         * <li><p>NORMAL: Normal scheduling task.</p>
         * </li>
         * <li><p>MANUAL: One-time task, which is not included in regular scheduling and corresponds to a node in a manually triggered workflow.</p>
         * </li>
         * <li><p>PAUSE: Paused task.</p>
         * </li>
         * <li><p>SKIP: Dry-run task, which is included in regular scheduling but is immediately marked as Succeeded when scheduled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("SchedulerType")
        public String schedulerType;

        /**
         * <p>The UNIX timestamp (in milliseconds) indicating when automatic scheduling starts.</p>
         * <p>This parameter corresponds to the start time (as a UNIX timestamp in milliseconds) configured under &quot;Schedule Configuration &gt; Time Properties &gt; Effective Date&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>936923400000</p>
         */
        @NameInMap("StartEffectDate")
        public Long startEffectDate;

        /**
         * <p>Indicates whether to start immediately after publishing.</p>
         * <p>This parameter corresponds to the &quot;Start Method&quot; setting under &quot;Configuration &gt; Time Properties&quot; in the right-side navigation bar on the editing page for EMR Spark Streaming and EMR Streaming SQL Data Development jobs in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("StartImmediately")
        public Boolean startImmediately;

        /**
         * <p>Indicates whether to skip execution. Valid values:</p>
         * <ul>
         * <li><p>true: Skip execution.</p>
         * </li>
         * <li><p>false: Do not skip execution.</p>
         * </li>
         * </ul>
         * <p>This parameter corresponds to the setting &quot;Schedule Type&quot; under &quot;Schedule Configuration &gt; Time Properties&quot; for a Data Development job in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, when it is set to &quot;skip execution&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Stop")
        public Boolean stop;

        /**
         * <p>Timeout definition for scheduling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static GetFileResponseBodyDataNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataNodeConfiguration self = new GetFileResponseBodyDataNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataNodeConfiguration setApplyScheduleImmediately(String applyScheduleImmediately) {
            this.applyScheduleImmediately = applyScheduleImmediately;
            return this;
        }
        public String getApplyScheduleImmediately() {
            return this.applyScheduleImmediately;
        }

        public GetFileResponseBodyDataNodeConfiguration setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
            this.autoRerunIntervalMillis = autoRerunIntervalMillis;
            return this;
        }
        public Integer getAutoRerunIntervalMillis() {
            return this.autoRerunIntervalMillis;
        }

        public GetFileResponseBodyDataNodeConfiguration setAutoRerunTimes(Integer autoRerunTimes) {
            this.autoRerunTimes = autoRerunTimes;
            return this;
        }
        public Integer getAutoRerunTimes() {
            return this.autoRerunTimes;
        }

        public GetFileResponseBodyDataNodeConfiguration setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetFileResponseBodyDataNodeConfiguration setCycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }
        public String getCycleType() {
            return this.cycleType;
        }

        public GetFileResponseBodyDataNodeConfiguration setDependentNodeIdList(String dependentNodeIdList) {
            this.dependentNodeIdList = dependentNodeIdList;
            return this;
        }
        public String getDependentNodeIdList() {
            return this.dependentNodeIdList;
        }

        public GetFileResponseBodyDataNodeConfiguration setDependentType(String dependentType) {
            this.dependentType = dependentType;
            return this;
        }
        public String getDependentType() {
            return this.dependentType;
        }

        public GetFileResponseBodyDataNodeConfiguration setEndEffectDate(Long endEffectDate) {
            this.endEffectDate = endEffectDate;
            return this;
        }
        public Long getEndEffectDate() {
            return this.endEffectDate;
        }

        public GetFileResponseBodyDataNodeConfiguration setIgnoreParentSkipRunningProperty(String ignoreParentSkipRunningProperty) {
            this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
            return this;
        }
        public String getIgnoreParentSkipRunningProperty() {
            return this.ignoreParentSkipRunningProperty;
        }

        public GetFileResponseBodyDataNodeConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetFileResponseBodyDataNodeConfiguration setInputList(java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> inputList) {
            this.inputList = inputList;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputList> getInputList() {
            return this.inputList;
        }

        public GetFileResponseBodyDataNodeConfiguration setInputParameters(java.util.List<GetFileResponseBodyDataNodeConfigurationInputParameters> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationInputParameters> getInputParameters() {
            return this.inputParameters;
        }

        public GetFileResponseBodyDataNodeConfiguration setOutputList(java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> outputList) {
            this.outputList = outputList;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputList> getOutputList() {
            return this.outputList;
        }

        public GetFileResponseBodyDataNodeConfiguration setOutputParameters(java.util.List<GetFileResponseBodyDataNodeConfigurationOutputParameters> outputParameters) {
            this.outputParameters = outputParameters;
            return this;
        }
        public java.util.List<GetFileResponseBodyDataNodeConfigurationOutputParameters> getOutputParameters() {
            return this.outputParameters;
        }

        public GetFileResponseBodyDataNodeConfiguration setParaValue(String paraValue) {
            this.paraValue = paraValue;
            return this;
        }
        public String getParaValue() {
            return this.paraValue;
        }

        public GetFileResponseBodyDataNodeConfiguration setRerunMode(String rerunMode) {
            this.rerunMode = rerunMode;
            return this;
        }
        public String getRerunMode() {
            return this.rerunMode;
        }

        public GetFileResponseBodyDataNodeConfiguration setResourceGroupId(Long resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetFileResponseBodyDataNodeConfiguration setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public GetFileResponseBodyDataNodeConfiguration setStartEffectDate(Long startEffectDate) {
            this.startEffectDate = startEffectDate;
            return this;
        }
        public Long getStartEffectDate() {
            return this.startEffectDate;
        }

        public GetFileResponseBodyDataNodeConfiguration setStartImmediately(Boolean startImmediately) {
            this.startImmediately = startImmediately;
            return this;
        }
        public Boolean getStartImmediately() {
            return this.startImmediately;
        }

        public GetFileResponseBodyDataNodeConfiguration setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public GetFileResponseBodyDataNodeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class GetFileResponseBodyDataResourceDownloadLink extends TeaModel {
        /**
         * <p>Link for downloading the resource.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xx">http://xx</a></p>
         */
        @NameInMap("downloadLink")
        public String downloadLink;

        public static GetFileResponseBodyDataResourceDownloadLink build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyDataResourceDownloadLink self = new GetFileResponseBodyDataResourceDownloadLink();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyDataResourceDownloadLink setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

    }

    public static class GetFileResponseBodyData extends TeaModel {
        /**
         * <p>Basic information about the file.</p>
         */
        @NameInMap("File")
        public GetFileResponseBodyDataFile file;

        /**
         * <p>The schedule configuration of the file.</p>
         */
        @NameInMap("NodeConfiguration")
        public GetFileResponseBodyDataNodeConfiguration nodeConfiguration;

        /**
         * <p>Resource download link.</p>
         */
        @NameInMap("ResourceDownloadLink")
        public GetFileResponseBodyDataResourceDownloadLink resourceDownloadLink;

        public static GetFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileResponseBodyData self = new GetFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileResponseBodyData setFile(GetFileResponseBodyDataFile file) {
            this.file = file;
            return this;
        }
        public GetFileResponseBodyDataFile getFile() {
            return this.file;
        }

        public GetFileResponseBodyData setNodeConfiguration(GetFileResponseBodyDataNodeConfiguration nodeConfiguration) {
            this.nodeConfiguration = nodeConfiguration;
            return this;
        }
        public GetFileResponseBodyDataNodeConfiguration getNodeConfiguration() {
            return this.nodeConfiguration;
        }

        public GetFileResponseBodyData setResourceDownloadLink(GetFileResponseBodyDataResourceDownloadLink resourceDownloadLink) {
            this.resourceDownloadLink = resourceDownloadLink;
            return this;
        }
        public GetFileResponseBodyDataResourceDownloadLink getResourceDownloadLink() {
            return this.resourceDownloadLink;
        }

    }

}
