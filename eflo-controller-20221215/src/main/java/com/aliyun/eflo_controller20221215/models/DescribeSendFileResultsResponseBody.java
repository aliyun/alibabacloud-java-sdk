// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponseBody extends TeaModel {
    /**
     * <p>The file sending records.</p>
     */
    @NameInMap("Invocations")
    public DescribeSendFileResultsResponseBodyInvocations invocations;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the commands.</p>
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
         * <p>The time when the file sending task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error code returned when the file failed to be sent to the instance. Valid values:</p>
         * <p>Null: The file is sent to the instance. NodeNotExists: The specified instance does not exist or has been released. NodeReleased: The instance was released while the file was being sent. NodeNotRunning: The instance was not running while the file sending task was being created. AccountNotExists: The specified account does not exist. ClientNotRunning: Cloud Assistant Agent is not running. ClientNotResponse: Cloud Assistant Agent did not respond. ClientIsUpgrading: Cloud Assistant Agent was being upgraded. ClientNeedUpgrade: Cloud Assistant Agent needs to be upgraded. DeliveryTimeout: The file sending task timed out. FileCreateFail: The file failed to be created. FileAlreadyExists: A file with the same name exists in the specified directory. FileContentInvalid: The file content is invalid. FileNameInvalid: The file name is invalid. FilePathInvalid: The specified directory is invalid. FileAuthorityInvalid: The specified permissions on the file are invalid. UserGroupNotExists: The specified user group does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>AccountNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the command failed to be sent or run. Valid values:</p>
         * <ul>
         * <li>null: The command is run as expected.</li>
         * <li>the specified instance does not exists: The specified instance does not exist or is released.</li>
         * <li>the node has released when create task: The instance is released when the command is being run.</li>
         * <li>the node is not running when create task: The instance is not in the Running state while the command is being run.</li>
         * <li>the command is not applicable: The command is not applicable to the specified instance.</li>
         * <li>the specified account does not exists: The specified account does not exist.</li>
         * <li>the specified directory does not exists: The specified directory does not exist.</li>
         * <li>the cron job expression is invalid: The cron expression that specifies the execution time is invalid.</li>
         * <li>the aliyun service is not running on the instance: Cloud Assistant Agent is not running.</li>
         * <li>the aliyun service in the instance does not response: Cloud Assistant Agent does not respond.</li>
         * <li>the aliyun service in the node is upgrading now: Cloud Assistant Agent is being upgraded.</li>
         * <li>the aliyun service in the node need upgrade: Cloud Assistant Agent needs to be upgraded.</li>
         * <li>the command delivery has been timeout: The request to send the command timed out.</li>
         * <li>the command execution has been timeout: The command execution timed out.</li>
         * <li>the command execution got an exception: An exception occurred when the command is being run.</li>
         * <li>the command execution has been interrupted: The command execution is interrupted.</li>
         * <li>the command execution exit code is not zero: The command execution completes, but the exit code is not 0.</li>
         * <li>the specified instance has been released: The instance is released while the file is being sent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>the specified instance does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The time when the file sending task ends. The time is in the 2020-05-22T17:04:18 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-10T10:53:46.156+08:00</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The status of the file sending task on an instance. Valid values:</p>
         * <ul>
         * <li>Pending: The file is being verified or sent.</li>
         * <li>Invalid: The file is invalid.</li>
         * <li>Running: The file is being sent to the instance.</li>
         * <li>Aborted: The file failed to be sent to the instance.</li>
         * <li>Success: The file is sent.</li>
         * <li>Failed: The file failed to be created on the instance.</li>
         * <li>Error: An error occurred and interrupted the file sending task.</li>
         * <li>Timeout: The file sending task timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-9lb3c15m81j</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-30T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The update time.</p>
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
         * <p>The file sending records on a node.</p>
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
         * <p>The command output.</p>
         * <p>If ContentEncoding is set to PlainText in the request, the original command output is returned. If ContentEncoding is set to Base64 in the request, the Base64-encoded command output is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Base64</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The content type of the file.</p>
         * <p>PlainText: The file content is not encoded. Base64: The file content is encoded in Base64. Default value: PlainText.</p>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The time when the file sending task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-10T10:53:46.156+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The command description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
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
         * <p>The permissions on the file.</p>
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
         * <p>The overall sending status of the file. The overall sending status of the file varies based on the sending status of the file on all destination instances. Valid values:</p>
         * <ul>
         * <li><p>Pending: The file is being verified or sent. If the sending state of the file on at least one instance is Pending, the overall sending state of the file is Pending.</p>
         * </li>
         * <li><p>Running: The file is being sent to the instance. If the sending state of the file on at least one instance is Running, the overall sending state of the file is Running.</p>
         * </li>
         * <li><p>Success: If the sending state of the file on all instances is Success, the overall sending state of the file is Success.</p>
         * </li>
         * <li><p>Failed: If the sending state of the file on all instances is Failed, the overall sending state of the file is Failed. If the sending state of the file on one or more instances is one of the following values, the overall sending state of the file is Failed:</p>
         * <ul>
         * <li>Invalid: The file is invalid.</li>
         * <li>Aborted: The file failed to be sent to the instances.</li>
         * <li>Failed: The file failed to be created on the instances.</li>
         * <li>Timeout: The file sending task timed out.</li>
         * <li>Error: An error occurred and interrupted the file sending task.</li>
         * </ul>
         * </li>
         * <li><p>PartialFailed: The file sending task was completed on some instances but failed on other instances. If the sending state of the file is Success on some instances and is Failed on other instances, the overall sending state of the file is PartialFailed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The file sending records.</p>
         */
        @NameInMap("InvokeNodes")
        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes invokeNodes;

        /**
         * <p>The name of the file sending task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <p>Indicates whether a file was overwritten in the destination directory if the file has the same name as the sent file.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Overwrite")
        public Boolean overwrite;

        /**
         * <p>The destination directory.</p>
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
         * <p>The command execution ID.</p>
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
