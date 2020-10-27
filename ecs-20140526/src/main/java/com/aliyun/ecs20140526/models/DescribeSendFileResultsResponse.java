// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Invocations")
    @Validation(required = true)
    public DescribeSendFileResultsResponseInvocations invocations;

    public static DescribeSendFileResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSendFileResultsResponse self = new DescribeSendFileResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSendFileResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSendFileResultsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeSendFileResultsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSendFileResultsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSendFileResultsResponse setInvocations(DescribeSendFileResultsResponseInvocations invocations) {
        this.invocations = invocations;
        return this;
    }
    public DescribeSendFileResultsResponseInvocations getInvocations() {
        return this.invocations;
    }

    public static class DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InvocationStatus")
        @Validation(required = true)
        public String invocationStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorInfo")
        @Validation(required = true)
        public String errorInfo;

        public static DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance self = new DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

    }

    public static class DescribeSendFileResultsResponseInvocationsInvocationInvokeInstances extends TeaModel {
        @NameInMap("InvokeInstance")
        @Validation(required = true)
        public java.util.List<DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance> invokeInstance;

        public static DescribeSendFileResultsResponseInvocationsInvocationInvokeInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseInvocationsInvocationInvokeInstances self = new DescribeSendFileResultsResponseInvocationsInvocationInvokeInstances();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstances setInvokeInstance(java.util.List<DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance> invokeInstance) {
            this.invokeInstance = invokeInstance;
            return this;
        }
        public java.util.List<DescribeSendFileResultsResponseInvocationsInvocationInvokeInstancesInvokeInstance> getInvokeInstance() {
            return this.invokeInstance;
        }

    }

    public static class DescribeSendFileResultsResponseInvocationsInvocation extends TeaModel {
        @NameInMap("InvokeId")
        @Validation(required = true)
        public String invokeId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("TargetDir")
        @Validation(required = true)
        public String targetDir;

        @NameInMap("ContentType")
        @Validation(required = true)
        public String contentType;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("FileOwner")
        @Validation(required = true)
        public String fileOwner;

        @NameInMap("FileGroup")
        @Validation(required = true)
        public String fileGroup;

        @NameInMap("FileMode")
        @Validation(required = true)
        public String fileMode;

        @NameInMap("Overwrite")
        @Validation(required = true)
        public String overwrite;

        @NameInMap("VmCount")
        @Validation(required = true)
        public Integer vmCount;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("InvocationStatus")
        @Validation(required = true)
        public String invocationStatus;

        @NameInMap("InvokeInstances")
        @Validation(required = true)
        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstances invokeInstances;

        public static DescribeSendFileResultsResponseInvocationsInvocation build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseInvocationsInvocation self = new DescribeSendFileResultsResponseInvocationsInvocation();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setInvokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }
        public String getInvokeId() {
            return this.invokeId;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setTargetDir(String targetDir) {
            this.targetDir = targetDir;
            return this;
        }
        public String getTargetDir() {
            return this.targetDir;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setFileOwner(String fileOwner) {
            this.fileOwner = fileOwner;
            return this;
        }
        public String getFileOwner() {
            return this.fileOwner;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setFileGroup(String fileGroup) {
            this.fileGroup = fileGroup;
            return this;
        }
        public String getFileGroup() {
            return this.fileGroup;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setFileMode(String fileMode) {
            this.fileMode = fileMode;
            return this;
        }
        public String getFileMode() {
            return this.fileMode;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setOverwrite(String overwrite) {
            this.overwrite = overwrite;
            return this;
        }
        public String getOverwrite() {
            return this.overwrite;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setVmCount(Integer vmCount) {
            this.vmCount = vmCount;
            return this;
        }
        public Integer getVmCount() {
            return this.vmCount;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setInvocationStatus(String invocationStatus) {
            this.invocationStatus = invocationStatus;
            return this;
        }
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        public DescribeSendFileResultsResponseInvocationsInvocation setInvokeInstances(DescribeSendFileResultsResponseInvocationsInvocationInvokeInstances invokeInstances) {
            this.invokeInstances = invokeInstances;
            return this;
        }
        public DescribeSendFileResultsResponseInvocationsInvocationInvokeInstances getInvokeInstances() {
            return this.invokeInstances;
        }

    }

    public static class DescribeSendFileResultsResponseInvocations extends TeaModel {
        @NameInMap("Invocation")
        @Validation(required = true)
        public java.util.List<DescribeSendFileResultsResponseInvocationsInvocation> invocation;

        public static DescribeSendFileResultsResponseInvocations build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseInvocations self = new DescribeSendFileResultsResponseInvocations();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseInvocations setInvocation(java.util.List<DescribeSendFileResultsResponseInvocationsInvocation> invocation) {
            this.invocation = invocation;
            return this;
        }
        public java.util.List<DescribeSendFileResultsResponseInvocationsInvocation> getInvocation() {
            return this.invocation;
        }

    }

}
