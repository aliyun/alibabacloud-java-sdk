// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponseBody extends TeaModel {
    /**
     * <p>Record of file distribution.</p>
     */
    @NameInMap("Invocations")
    public DescribeSendFileResultsResponseBodyInvocations invocations;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of commands.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeSendFileResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSendFileResultsResponseBody self = new DescribeSendFileResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSendFileResultsResponseBody setInvocations(DescribeSendFileResultsResponseBodyInvocations invocations) {
        this.invocations = invocations;
        return this;
    }
    public DescribeSendFileResultsResponseBodyInvocations getInvocations() {
        return this.invocations;
    }

    public DescribeSendFileResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSendFileResultsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode extends TeaModel {
        /**
         * <p>The creation time of the file distribution task.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The failure reason code for file distribution. Possible values:</p>
         * <ul>
         * <li>Empty: The file was distributed normally. </li>
         * <li>NodeNotExists: The specified instance does not exist or has been released. </li>
         * <li>NodeReleased: The instance was released during the file distribution process. </li>
         * <li>NodeNotRunning: The instance was not running when the file distribution task was created. </li>
         * <li>AccountNotExists: The specified account does not exist. </li>
         * <li>ClientNotRunning: The Cloud Assistant Agent is not running. </li>
         * <li>ClientNotResponse: The Cloud Assistant Agent is not responding. </li>
         * <li>ClientIsUpgrading: The Cloud Assistant Agent is currently being upgraded. </li>
         * <li>ClientNeedUpgrade: The Cloud Assistant Agent needs to be upgraded. </li>
         * <li>DeliveryTimeout: File delivery timed out. </li>
         * <li>FileCreateFail: Failed to create the file. </li>
         * <li>FileAlreadyExists: A file with the same name already exists at the specified path. </li>
         * <li>FileContentInvalid: The file content is invalid. </li>
         * <li>FileNameInvalid: The file name is invalid. </li>
         * <li>FilePathInvalid: The file path is invalid. </li>
         * <li>FileAuthorityInvalid: The file permissions are invalid. </li>
         * <li>UserGroupNotExists: The user group specified for file delivery does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AccountNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Details of the reason for command delivery failure or execution failure, possible values: </p>
         * <ul>
         * <li>Empty: The command executed normally. </li>
         * <li>the specified instance does not exist: The specified instance does not exist or has been released. </li>
         * <li>the node has been released when creating task: The instance was released during the command execution. </li>
         * <li>the node is not running when creating task: The instance was not in a running state when the command was executed. </li>
         * <li>the command is not applicable: The command is not applicable to the specified instance. </li>
         * <li>the specified account does not exist: The specified account does not exist. </li>
         * <li>the specified directory does not exist: The specified directory does not exist. </li>
         * <li>the cron job expression is invalid: The specified execution time expression is invalid. </li>
         * <li>the aliyun service is not running on the instance: The Cloud Assistant Agent is not running. </li>
         * <li>the aliyun service in the instance does not respond: The Cloud Assistant Agent is not responding. </li>
         * <li>the aliyun service in the node is upgrading now: The Cloud Assistant Agent is currently being upgraded. </li>
         * <li>the aliyun service in the node needs upgrade: The Cloud Assistant Agent needs an upgrade. </li>
         * <li>the command delivery has timed out: Command delivery has timed out. </li>
         * <li>the command execution has timed out: Command execution has timed out. </li>
         * <li>the command execution got an exception: An exception occurred during command execution. </li>
         * <li>the command execution has been interrupted: The command execution was interrupted. </li>
         * <li>the command execution exit code is not zero: The command execution completed with a non-zero exit code. </li>
         * <li>the specified instance has been released: The instance was released during file delivery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>the specified instance does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>Completion time, format: &quot;2020-05-22T17:04:18&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-10T10:53:46.156+08:00</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>Status of the task on a single instance. Possible values:</p>
         * <ul>
         * <li>Pending: The system is validating or distributing the file.</li>
         * <li>Invalid: The specified file parameters are incorrect, and validation failed.</li>
         * <li>Running: The file is being distributed to the instance.</li>
         * <li>Aborted: Failed to distribute the file to the instance.</li>
         * <li>Success: The file distribution is complete.</li>
         * <li>Failed: The file creation failed within the instance.</li>
         * <li>Error: An exception occurred during file distribution and could not continue.</li>
         * <li>Timeout: The file distribution timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>Node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-9lb3c15m81j</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>Start Time</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Update Time</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T16:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode self = new DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes extends TeaModel {
        /**
         * <p>Record of file distribution for the node.</p>
         */
        @NameInMap("InvokeNode")
        public java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode> invokeNode;

        public static DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes self = new DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes setInvokeNode(java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode> invokeNode) {
            this.invokeNode = invokeNode;
            return this;
        }
        public java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodesInvokeNode> getInvokeNode() {
            return this.invokeNode;
        }

    }

    public static class DescribeSendFileResultsResponseBodyInvocationsInvocation extends TeaModel {
        /**
         * <p>Output information after command execution.</p>
         * <p>If ContentEncoding is specified as PlainText, the original output information is returned.
         * If ContentEncoding is specified as Base64, the Base64 encoded output information is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>File content type.</p>
         * <p>PlainText: Plain text.
         * Base64: Base64 encoding.
         * The default value is PlainText.</p>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>Creation time of the distribution.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-10T10:53:46.156+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Command description.</p>
         * 
         * <strong>example:</strong>
         * <p>描述信息。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user group of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("FileGroup")
        public String fileGroup;

        /**
         * <p>File permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("FileMode")
        public String fileMode;

        /**
         * <p>The owner of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("FileOwner")
        public String fileOwner;

        /**
         * <p>Overall status of the file distribution. The overall status depends on the common execution status of all instances involved in this distribution, possible values are:</p>
         * <ul>
         * <li>Pending: The system is verifying or distributing the file. If at least one instance has a file distribution status of Pending, the overall execution status will be Pending.</li>
         * <li>Running: The file is being distributed on the instance. If at least one instance has a file distribution status of Running, the overall execution status will be Running.</li>
         * <li>Success: All instances have a file distribution status of Success, then the overall execution status will be Success.</li>
         * <li>Failed: All instances have a file distribution status of Failed, then the overall execution status will be Failed. If any of the following conditions occur for the file distribution status on an instance, the return value will be Failed:<ul>
         * <li>The specified file parameters are incorrect, verification failed (Invalid).</li>
         * <li>Failed to distribute the file to the instance (Aborted).</li>
         * <li>The file creation failed within the instance (Failed).</li>
         * <li>The file distribution timed out (Timeout).</li>
         * <li>An exception occurred during file distribution and could not continue (Error).</li>
         * </ul>
         * </li>
         * <li>PartialFailed: Some instances successfully received the file while others failed. If the file distribution status of all instances is either Success or Failed, the overall execution status will be PartialFailed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>Record of file distribution.</p>
         */
        @NameInMap("InvokeNodes")
        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes invokeNodes;

        /**
         * <p>Name of the file distribution.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Number of nodes</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>Whether to overwrite the file if a file with the same name already exists in the target directory.</p>
         * <ul>
         * <li>true: Overwrite.</li>
         * <li>false: Do not overwrite.</li>
         * </ul>
         * <p>The default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Overwrite")
        public Boolean overwrite;

        /**
         * <p>Target path.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/user</p>
         */
        @NameInMap("TargetDir")
        public String targetDir;

        public static DescribeSendFileResultsResponseBodyInvocationsInvocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseBodyInvocationsInvocation self = new DescribeSendFileResultsResponseBodyInvocationsInvocation();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setFileGroup(String fileGroup) {
            this.fileGroup = fileGroup;
            return this;
        }
        public String getFileGroup() {
            return this.fileGroup;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setFileMode(String fileMode) {
            this.fileMode = fileMode;
            return this;
        }
        public String getFileMode() {
            return this.fileMode;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setFileOwner(String fileOwner) {
            this.fileOwner = fileOwner;
            return this;
        }
        public String getFileOwner() {
            return this.fileOwner;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setInvokeNodes(DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes invokeNodes) {
            this.invokeNodes = invokeNodes;
            return this;
        }
        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes getInvokeNodes() {
            return this.invokeNodes;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setOverwrite(Boolean overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public Boolean getOverwrite() {
            return this.overwrite;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setTargetDir(String targetDir) {
            this.targetDir = targetDir;
            return this;
        }
        public String getTargetDir() {
            return this.targetDir;
        }

    }

    public static class DescribeSendFileResultsResponseBodyInvocations extends TeaModel {
        /**
         * <p>Command execution ID.</p>
         */
        @NameInMap("Invocation")
        public java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocation> invocation;

        public static DescribeSendFileResultsResponseBodyInvocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseBodyInvocations self = new DescribeSendFileResultsResponseBodyInvocations();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseBodyInvocations setInvocation(java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocation> invocation) {
            this.invocation = invocation;
            return this;
        }
        public java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocation> getInvocation() {
            return this.invocation;
        }

    }

}
