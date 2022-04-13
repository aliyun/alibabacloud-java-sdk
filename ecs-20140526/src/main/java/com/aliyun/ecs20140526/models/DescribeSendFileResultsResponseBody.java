// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponseBody extends TeaModel {
    @NameInMap("Invocations")
    public DescribeSendFileResultsResponseBodyInvocations invocations;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

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

    public DescribeSendFileResultsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSendFileResultsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSendFileResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSendFileResultsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance self = new DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances extends TeaModel {
        @NameInMap("InvokeInstance")
        public java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance> invokeInstance;

        public static DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances self = new DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances setInvokeInstance(java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance> invokeInstance) {
            this.invokeInstance = invokeInstance;
            return this;
        }
        public java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstancesInvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

    }

    public static class DescribeSendFileResultsResponseBodyInvocationsInvocation extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("FileGroup")
        public String fileGroup;

        @NameInMap("FileMode")
        public String fileMode;

        @NameInMap("FileOwner")
        public String fileOwner;

        @NameInMap("InvocationStatus")
        public String invocationStatus;

        @NameInMap("InvokeId")
        public String invokeId;

        @NameInMap("InvokeInstances")
        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances invokeInstances;

        @NameInMap("Name")
        public String name;

        @NameInMap("Overwrite")
        public String overwrite;

        @NameInMap("TargetDir")
        public String targetDir;

        @NameInMap("VmCount")
        public Integer vmCount;

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

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setInvokeInstances(DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances invokeInstances) {
            this.invokeInstances = invokeInstances;
            return this;
        }
        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances getInvokeInstances() {
            return this.invokeInstances;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setOverwrite(String overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public String getOverwrite() {
            return this.overwrite;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setTargetDir(String targetDir) {
            this.targetDir = targetDir;
            return this;
        }
        public String getTargetDir() {
            return this.targetDir;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setVmCount(Integer vmCount) {
            this.vmCount = vmCount;
            return this;
        }
        public Integer getVmCount() {
            return this.vmCount;
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
