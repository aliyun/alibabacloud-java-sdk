// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsResponseBody extends TeaModel {
    /**
     * <p>The file sending records.</p>
     */
    @NameInMap("Invocations")
    public DescribeSendFileResultsResponseBodyInvocations invocations;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of file sending tasks queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The creation time of the file sending task.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:54Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error code returned when the file failed to be sent to the instance. Valid values:</p>
         * <ul>
         * <li>Null: The file is sent to the instance.</li>
         * <li>InstanceNotExists: The instance does not exist or has been released.</li>
         * <li>InstanceReleased: The instance is released while the file is being sent.</li>
         * <li>InstanceNotRunning: The instance is not running when the file sending task is being created.</li>
         * <li>AccountNotExists: The specified account does not exist.</li>
         * <li>ClientNotRunning: Cloud Assistant Agent is not running.</li>
         * <li>ClientNotResponse: Cloud Assistant Agent does not respond.</li>
         * <li>ClientIsUpgrading: Cloud Assistant Agent is being upgraded.</li>
         * <li>ClientNeedUpgrade: Cloud Assistant Agent needs to be upgraded.</li>
         * <li>DeliveryTimeout: The file sending task timed out.</li>
         * <li>FileCreateFail: The file failed to be created.</li>
         * <li>FileAlreadyExists: A file with the same name exists in the specified directory.</li>
         * <li>FileContentInvalid: The file content is invalid.</li>
         * <li>FileNameInvalid: The file name is invalid.</li>
         * <li>FilePathInvalid: The specified directory is invalid.</li>
         * <li>FileAuthorityInvalid: The specified permissions on the file are invalid.</li>
         * <li>UserGroupNotExists: The specified user group does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceNotExists</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the file failed to be sent or the file sending task failed to be executed. Valid values:</p>
         * <ul>
         * <li>Null: The file is sent to the instance.</li>
         * <li>the specified instance does not exists</li>
         * <li>the specified instance has been released</li>
         * <li>the instance is not running when create task</li>
         * <li>the specified account does not exists</li>
         * <li>the aliyun service is not running on the instance</li>
         * <li>the aliyun service in the instance does not response</li>
         * <li>the aliyun service in the instance is upgrading now</li>
         * <li>the aliyun service in the instance need upgrade</li>
         * <li>the command delivery has been timeout</li>
         * <li>the file creation is failed due to unknown error</li>
         * <li>the authority of file is invalid</li>
         * <li>File content is empty</li>
         * <li>the content of file is invalid</li>
         * <li>File already exists</li>
         * <li>File name is invalid</li>
         * <li>File path is invalid</li>
         * <li>Owner not exists</li>
         * <li>Group not exists</li>
         * <li>Mode is invalid</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>the instance is not running when create task</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>The time when the file sending task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:54Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf614fhehhz****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the file sending task. Valid values:</p>
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
         * <p>The time when the file sending task started to be executed on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:54Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when the task status was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-20T06:15:54Z</p>
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
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the file sending task.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
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
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash  echo &quot;Current User is :&quot;  echo $(ps | grep &quot;$$&quot; | awk \&quot;{print $2}\&quot;)</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The type of the file content. Valid values:</p>
         * <ul>
         * <li>PlainText: The file content is not encoded.</li>
         * <li>Base64: The file content is encoded in Base64.</li>
         * </ul>
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
         * <p>2019-12-20T06:15:54Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test file.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The group of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FileGroup")
        public String fileGroup;

        /**
         * <p>The permissions on the file.</p>
         * 
         * <strong>example:</strong>
         * <p>777</p>
         */
        @NameInMap("FileMode")
        public String fileMode;

        /**
         * <p>The owner of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FileOwner")
        public String fileOwner;

        /**
         * <p>The overall sending status of the file. The overall sending status of the file varies based on the sending status of the file on all destination instances. Valid values:</p>
         * <ul>
         * <li><p>Pending: The file is being verified or sent. If the sending state of the file on at least one instance is Pending, the overall sending state of the file is Pending.</p>
         * </li>
         * <li><p>Running: The file is being sent to the instances. If the sending state of the file on at least one instance is Running, the overall sending state of the file is Running.</p>
         * </li>
         * <li><p>Success: If the sending state of the file on all instances is Success, the overall sending state of the file is Success.</p>
         * </li>
         * <li><p>If the sending state of the file on all instances is Failed, the overall sending state of the file is Failed. If the sending state of the file on one or more instances is one of the following values, the overall sending state of the file is Failed:</p>
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
         * <p>Success</p>
         */
        @NameInMap("InvocationStatus")
        public String invocationStatus;

        /**
         * <p>The ID of the file sending task.</p>
         * 
         * <strong>example:</strong>
         * <p>f-hz0jdfwd9f****</p>
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
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether a file in the destination directory is overwritten if the file has the same name as the sent file.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * 
         * <strong>example:</strong>
         * <p>/home/user</p>
         */
        @NameInMap("TargetDir")
        public String targetDir;

        /**
         * <p>The number of the destination instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
