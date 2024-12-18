// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponseBody extends TeaModel {
    @NameInMap("Invocations")
    public DescribeSendFileResultsResponseBodyInvocations invocations;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>2023-02-06T07:12:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>AccountNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>the specified instance does not exists</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <strong>example:</strong>
         * <p>2023-04-10T10:53:46.156+08:00</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <strong>example:</strong>
         * <p>e01-cn-9lb3c15m81j</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>2023-03-30T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
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
         * <strong>example:</strong>
         * <p>Base64</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <strong>example:</strong>
         * <p>2023-04-10T10:53:46.156+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("FileGroup")
        public String fileGroup;

        /**
         * <strong>example:</strong>
         * <p>0644</p>
         */
        @NameInMap("FileMode")
        public String fileMode;

        /**
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("FileOwner")
        public String fileOwner;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("InvokeNodes")
        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeNodes invokeNodes;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NodeCount")
        public Integer nodeCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Overwrite")
        public Boolean overwrite;

        /**
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
