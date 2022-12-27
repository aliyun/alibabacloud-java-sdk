// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponseBody extends TeaModel {
    // Details about the file sending records.
    @NameInMap("Invocations")
    public DescribeSendFileResultsResponseBodyInvocations invocations;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of file sending tasks.
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
        // The creation time of the file sending task.
        @NameInMap("CreationTime")
        public String creationTime;

        // The error code returned when the file failed to be sent to the instance. Valid values:
        // 
        // *   Null: The file is sent to the instance.
        // *   InstanceNotExists: The instance does not exist or was released.
        // *   InstanceReleased: The instance is released while the file is being sent.
        // *   InstanceNotRunning: The instance is not running when the file sending task is being created.
        // *   AccountNotExists: The specified account does not exist.
        // *   ClientNotRunning: The Cloud Assistant client is not running.
        // *   ClientNotResponse: The Cloud Assistant client is not responding.
        // *   ClientIsUpgrading: The Cloud Assistant client is being upgraded.
        // *   ClientNeedUpgrade: The Cloud Assistant client needs to be upgraded.
        // *   DeliveryTimeout: The file sending task timed out.
        // *   FileCreateFail: The file failed to be created.
        // *   FileAlreadyExists: A file with the same name already exists in the specified directory.
        // *   FileContentInvalid: The file content is invalid.
        // *   FileNameInvalid: The file name is invalid.
        // *   FilePathInvalid: The specified directory is invalid.
        // *   FileAuthorityInvalid: The specified permissions on the file are invalid.
        @NameInMap("ErrorCode")
        public String errorCode;

        // The error message returned when the file failed to be sent to the instance or the file sending task failed to be executed on the instance. Valid values:
        // 
        // *   Null: The file is sent to the instance.
        // *   the specified instance does not exists
        // *   the instance has released when create task
        // *   the instance is not running when create task
        // *   the specified account does not exists
        // *   the aliyun service is not running on the instance
        // *   the aliyun service in the instance does not response
        // *   the aliyun service in the instance is upgrading now
        // *   the aliyun service in the instance need upgrade
        // *   the command delivery has been timeout
        // *   Unexpected error during creating
        // *   File already exists
        // *   File content error
        // *   File name is invalid
        // *   File path is invalid
        // *   Owner not exists
        // *   Group not exists
        // *   Mode is invalid
        @NameInMap("ErrorInfo")
        public String errorInfo;

        // The time when the file sending task finished being executed.
        @NameInMap("FinishTime")
        public String finishTime;

        // The ID of instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The status of the file sending task.
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        // The time when the file sending task started to be executed on the instance.
        @NameInMap("StartTime")
        public String startTime;

        // The time when the task status was updated.
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
        // The content of the file.
        @NameInMap("Content")
        public String content;

        // The content type of the file. Valid values:
        // 
        // *   PlainText
        // *   Base64
        @NameInMap("ContentType")
        public String contentType;

        // The time when the file sending task was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the file.
        @NameInMap("Description")
        public String description;

        // The user group of the file.
        @NameInMap("FileGroup")
        public String fileGroup;

        // The permissions on the file.
        @NameInMap("FileMode")
        public String fileMode;

        // The owner of the file.
        @NameInMap("FileOwner")
        public String fileOwner;

        // The overall sending status of the file. The overall sending status of the file depends on its sending status on all destination instances. Valid values:
        // 
        // *   Pending: The file is being verified or sent. If the sending status of the file on at least one instance is Pending, the overall sending status of the file is Pending.
        // 
        // *   Running: The file creation task is running on the instances. If the sending status of the file on at least one instance is Running, the overall sending status of the file is Running.
        // 
        // *   Success: If the sending status of the file on all the instances is Success, the overall sending status of the file is Success.
        // 
        // *   Failed: If the sending status of the file on all the instances is Failed, the overall sending status of the file is Failed. If the sending status of the file on one or more instances is one of the following values, the overall sending status of the file is Failed:
        // 
        //     *   Invalid: The file is invalid.
        //     *   Aborted: The file failed to be sent.
        //     *   Failed: The file failed to be created.
        //     *   Timeout: The file sending task timed out.
        //     *   Error: An error occurred while the file is being sent.
        // 
        // *   PartialFailed: The file was sent to some of the specified instances and failed to be sent to the others. The overall sending status of the file is PartialFailed only when its sending status is Success on some instances and is Failed on the others.
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        // The ID of the execution.
        @NameInMap("InvokeId")
        public String invokeId;

        // Details about the destination instances.
        @NameInMap("InvokeInstances")
        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances invokeInstances;

        // The name of the file.
        @NameInMap("Name")
        public String name;

        // Indicates whether a file in the destination directory is overwritten if the file has the same name as the sent file.
        @NameInMap("Overwrite")
        public String overwrite;

        // The destination directory.
        @NameInMap("TargetDir")
        public String targetDir;

        // The number of instances to which you want to send the file.
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
