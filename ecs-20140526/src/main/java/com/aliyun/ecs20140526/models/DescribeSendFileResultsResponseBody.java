// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponseBody extends TeaModel {
    /**
     * <p>The queried file sending records.</p>
     */
    @NameInMap("Invocations")
    public DescribeSendFileResultsResponseBodyInvocations invocations;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of file sending tasks queried.</p>
     */
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

    public DescribeSendFileResultsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <p>The time when the file sending task was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error code returned when the file failed to be sent to the instance. Valid values:</p>
         * <br>
         * <p>*   Null: The file is sent to the instance.</p>
         * <p>*   InstanceNotExists: The instance does not exist or has been released.</p>
         * <p>*   InstanceReleased: The instance is released while the file is being sent.</p>
         * <p>*   InstanceNotRunning: The instance is not running when the file sending task is being created.</p>
         * <p>*   AccountNotExists: The specified account does not exist.</p>
         * <p>*   ClientNotRunning: Cloud Assistant Agent is not running.</p>
         * <p>*   ClientNotResponse: Cloud Assistant Agent does not respond.</p>
         * <p>*   ClientIsUpgrading: Cloud Assistant Agent is being upgraded.</p>
         * <p>*   ClientNeedUpgrade: Cloud Assistant Agent needs to be upgraded.</p>
         * <p>*   DeliveryTimeout: The file sending task timed out.</p>
         * <p>*   FileCreateFail: The file failed to be created.</p>
         * <p>*   FileAlreadyExists: A file with the same name already exists in the specified directory.</p>
         * <p>*   FileContentInvalid: The file content is invalid.</p>
         * <p>*   FileNameInvalid: The file name is invalid.</p>
         * <p>*   FilePathInvalid: The specified directory is invalid.</p>
         * <p>*   FileAuthorityInvalid: The specified permissions on the file are invalid.</p>
         * <p>*   UserGroupNotExists: The specified user group does not exist.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the file failed to be sent or the file sending task failed to be executed. Valid values:</p>
         * <br>
         * <p>*   Null: The file is sent to the instance.</p>
         * <p>*   the specified instance does not exists</p>
         * <p>*   the specified instance has been released</p>
         * <p>*   the instance is not running when create task</p>
         * <p>*   the specified account does not exists</p>
         * <p>*   the aliyun service is not running on the instance</p>
         * <p>*   the aliyun service in the instance does not response</p>
         * <p>*   the aliyun service in the instance is upgrading now</p>
         * <p>*   the aliyun service in the instance need upgrade</p>
         * <p>*   the command delivery has been timeout</p>
         * <p>*   the file creation is failed due to unknown error</p>
         * <p>*   the authority of file is invalid</p>
         * <p>*   File content is empty</p>
         * <p>*   the content of file is invalid</p>
         * <p>*   File already exists</p>
         * <p>*   File name is invalid</p>
         * <p>*   File path is invalid</p>
         * <p>*   Owner not exists</p>
         * <p>*   Group not exists</p>
         * <p>*   Mode is invalid</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The time when the file sending task was completed.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the instance</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The state of the file sending task.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The time when the file sending task started to be executed on the instance.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when the task status was updated.</p>
         */
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

    public static class DescribeSendFileResultsResponseBodyInvocationsInvocationTagsTag extends TeaModel {
        /**
         * <p>The tag key of the file sending task.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the file sending task.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeSendFileResultsResponseBodyInvocationsInvocationTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseBodyInvocationsInvocationTagsTag self = new DescribeSendFileResultsResponseBodyInvocationsInvocationTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeSendFileResultsResponseBodyInvocationsInvocationTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocationTagsTag> tag;

        public static DescribeSendFileResultsResponseBodyInvocationsInvocationTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsResponseBodyInvocationsInvocationTags self = new DescribeSendFileResultsResponseBodyInvocationsInvocationTags();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsResponseBodyInvocationsInvocationTags setTag(java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocationTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeSendFileResultsResponseBodyInvocationsInvocationTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeSendFileResultsResponseBodyInvocationsInvocation extends TeaModel {
        /**
         * <p>The content of the file.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The content type of the file. Valid values:</p>
         * <br>
         * <p>*   PlainText</p>
         * <p>*   Base64</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The time when the file sending task was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the file.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user group of the file.</p>
         */
        @NameInMap("FileGroup")
        public String fileGroup;

        /**
         * <p>The permissions on the file.</p>
         */
        @NameInMap("FileMode")
        public String fileMode;

        /**
         * <p>The owner of the file.</p>
         */
        @NameInMap("FileOwner")
        public String fileOwner;

        /**
         * <p>The overall sending state of the file. The overall sending state of the file depends on its sending state on all the destination instances. Valid values:</p>
         * <br>
         * <p>*   Pending: The file is being verified or sent.</p>
         * <p>*   Invalid: The file is invalid.</p>
         * <p>*   Running: The file is being sent to the instances.</p>
         * <p>*   Aborted: The file failed to be sent to the instances. To send a file to an instance, make sure that the instance is in the Running state and the file can be sent within 1 minute.</p>
         * <p>*   Success: The file is sent.</p>
         * <p>*   Failed: The file failed to be created on the instances.</p>
         * <p>*   Error: An error occurs and interrupts the file sending task.</p>
         * <p>*   Timeout: The file sending task times out.</p>
         * <p>*   Cancelled: The file sending task is canceled.</p>
         * <p>*   Stopping: The file sending task is being stopped.</p>
         * <p>*   Terminated: The file sending task is terminated.</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The ID of the file sending task.</p>
         */
        @NameInMap("InvokeId")
        public String invokeId;

        /**
         * <p>The destination instances.</p>
         */
        @NameInMap("InvokeInstances")
        public DescribeSendFileResultsResponseBodyInvocationsInvocationInvokeInstances invokeInstances;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether a file in the destination directory is overwritten if the file has the same name as the sent file.</p>
         */
        @NameInMap("Overwrite")
        public String overwrite;

        /**
         * <p>The tags of the file sending task.</p>
         */
        @NameInMap("Tags")
        public DescribeSendFileResultsResponseBodyInvocationsInvocationTags tags;

        /**
         * <p>The destination directory.</p>
         */
        @NameInMap("TargetDir")
        public String targetDir;

        /**
         * <p>The number of instances to which the file was sent.</p>
         */
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

        public DescribeSendFileResultsResponseBodyInvocationsInvocation setTags(DescribeSendFileResultsResponseBodyInvocationsInvocationTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSendFileResultsResponseBodyInvocationsInvocationTags getTags() {
            return this.tags;
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
