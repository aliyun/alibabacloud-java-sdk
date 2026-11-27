// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallDetailPageResponseBody extends TeaModel {
    /**
     * <p>The detailed reasons for access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryAiCallDetailPageResponseBodyData data;

    /**
     * <p>The status message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A57441B2-8EB6-5B93-9F37-0A51B8E2C9F5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAiCallDetailPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAiCallDetailPageResponseBody self = new QueryAiCallDetailPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAiCallDetailPageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAiCallDetailPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAiCallDetailPageResponseBody setData(QueryAiCallDetailPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAiCallDetailPageResponseBodyData getData() {
        return this.data;
    }

    public QueryAiCallDetailPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAiCallDetailPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAiCallDetailPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAiCallDetailPageResponseBodyDataList extends TeaModel {
        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1183**************</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <p>The branch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("BranchId")
        public Long branchId;

        /**
         * <p>The branch name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default branch</p>
         */
        @NameInMap("BranchName")
        public String branchName;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("BranchVersionId")
        public Long branchVersionId;

        /**
         * <p>The expiration time of the outbound call detail. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1785412820000</p>
         */
        @NameInMap("CallExpireTime")
        public Long callExpireTime;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123<em><strong><strong>456^123</strong></strong></em>456</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>The call result.</p>
         * 
         * <strong>example:</strong>
         * <p>Answered</p>
         */
        @NameInMap("CallResult")
        public String callResult;

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>0537101****</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The call time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        @NameInMap("CallingTime")
        public Long callingTime;

        /**
         * <p>The call duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ConversationDuration")
        public Long conversationDuration;

        /**
         * <p>The chat record information. The structure is a JSON array, and the chat records are sorted in chronological order. Details:</p>
         * <pre><code class="language-json">[
         *     {
         *         &quot;content&quot;:&quot;Chat content&quot;,
         *         &quot;role&quot;:&quot;Role&quot;,//Valid values: user (user), assistant (robot)
         *     }
         * ]
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;content&quot;: &quot;Hello 111, age 222, gender male. I am the official consultant for ** Motors. We have launched a new model, **. ** is now on the market with a starting price of ** 10,000 yuan. It sold * units in ** minutes. Would you like to learn more?&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;<Customer interruption> Hey, who are you?&quot;,
         *         &quot;role&quot;: &quot;user&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;<Customer interruption> Say that again.&quot;,
         *         &quot;role&quot;: &quot;user&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;Hey, I didn&quot;t catch that.&quot;,
         *         &quot;role&quot;: &quot;user&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;What are you saying?&quot;,
         *         &quot;role&quot;: &quot;user&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;Hello,&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;I am a sales service consultant at ** Motors headquarters.&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;We recently launched a new car, **. I would like to know if you are interested in this model.&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;<Customer interruption> Hey, then who am I?&quot;,
         *         &quot;role&quot;: &quot;user&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;What are you talking about?&quot;,
         *         &quot;role&quot;: &quot;user&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;Sorry to bother you, Mr. 111.&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;Have a great day! Goodbye!&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;
         *     }
         * ]</p>
         */
        @NameInMap("ConversationRecord")
        public String conversationRecord;

        /**
         * <p>The number of conversation turns.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ConversationTurnCount")
        public Long conversationTurnCount;

        /**
         * <p>The task detail ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9662*************</p>
         */
        @NameInMap("DetailId")
        public String detailId;

        /**
         * <p>The encryption method. Valid values: 0: No encryption. 1: MD5. 2: SHA256. 3: SM3.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EncryptionType")
        public Long encryptionType;

        /**
         * <p>The reason for the call failure. This field is returned only when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Account suspended</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The import time. The value is a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        @NameInMap("ImportedTime")
        public Long importedTime;

        /**
         * <p>The primary intent.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("MajorIntent")
        public String majorIntent;

        /**
         * <p>The variable information used at runtime. The information is stored in this field as key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;date&quot;: &quot;666&quot;,
         *   &quot;phoneNumber&quot;: &quot;777&quot;,
         *   &quot;distance&quot;: &quot;555&quot;,
         *   &quot;mendian&quot;: &quot;444&quot;,
         *   &quot;sex&quot;: &quot;Male&quot;,
         *   &quot;name&quot;: &quot;111&quot;,
         *   &quot;age&quot;: &quot;222&quot;
         * }</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <p>The custom business transaction ID provided by the caller. You can use a unique ID to associate the business.</p>
         * 
         * <strong>example:</strong>
         * <p>outId</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The download path of the recording file. This field is returned only after the recording file is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>https://*******</p>
         */
        @NameInMap("RecordingFilePath")
        public String recordingFilePath;

        /**
         * <p>The task detail status. Valid values:</p>
         * <ul>
         * <li>0: Initialized.</li>
         * <li>1: Waiting for call.</li>
         * <li>2: Waiting for retry.</li>
         * <li>3: Calling.</li>
         * <li>4: Call ended.</li>
         * <li>5: Call failed.</li>
         * </ul>
         * <p>Only 4 and 5 are final states.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1187**************</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>Default version</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionNo")
        public Long versionNo;

        public static QueryAiCallDetailPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryAiCallDetailPageResponseBodyDataList self = new QueryAiCallDetailPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryAiCallDetailPageResponseBodyDataList setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setBranchId(Long branchId) {
            this.branchId = branchId;
            return this;
        }
        public Long getBranchId() {
            return this.branchId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public QueryAiCallDetailPageResponseBodyDataList setBranchVersionId(Long branchVersionId) {
            this.branchVersionId = branchVersionId;
            return this;
        }
        public Long getBranchVersionId() {
            return this.branchVersionId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setCallExpireTime(Long callExpireTime) {
            this.callExpireTime = callExpireTime;
            return this;
        }
        public Long getCallExpireTime() {
            return this.callExpireTime;
        }

        public QueryAiCallDetailPageResponseBodyDataList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setCallResult(String callResult) {
            this.callResult = callResult;
            return this;
        }
        public String getCallResult() {
            return this.callResult;
        }

        public QueryAiCallDetailPageResponseBodyDataList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public QueryAiCallDetailPageResponseBodyDataList setCallingTime(Long callingTime) {
            this.callingTime = callingTime;
            return this;
        }
        public Long getCallingTime() {
            return this.callingTime;
        }

        public QueryAiCallDetailPageResponseBodyDataList setConversationDuration(Long conversationDuration) {
            this.conversationDuration = conversationDuration;
            return this;
        }
        public Long getConversationDuration() {
            return this.conversationDuration;
        }

        public QueryAiCallDetailPageResponseBodyDataList setConversationRecord(String conversationRecord) {
            this.conversationRecord = conversationRecord;
            return this;
        }
        public String getConversationRecord() {
            return this.conversationRecord;
        }

        public QueryAiCallDetailPageResponseBodyDataList setConversationTurnCount(Long conversationTurnCount) {
            this.conversationTurnCount = conversationTurnCount;
            return this;
        }
        public Long getConversationTurnCount() {
            return this.conversationTurnCount;
        }

        public QueryAiCallDetailPageResponseBodyDataList setDetailId(String detailId) {
            this.detailId = detailId;
            return this;
        }
        public String getDetailId() {
            return this.detailId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setEncryptionType(Long encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public Long getEncryptionType() {
            return this.encryptionType;
        }

        public QueryAiCallDetailPageResponseBodyDataList setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public QueryAiCallDetailPageResponseBodyDataList setImportedTime(Long importedTime) {
            this.importedTime = importedTime;
            return this;
        }
        public Long getImportedTime() {
            return this.importedTime;
        }

        public QueryAiCallDetailPageResponseBodyDataList setMajorIntent(String majorIntent) {
            this.majorIntent = majorIntent;
            return this;
        }
        public String getMajorIntent() {
            return this.majorIntent;
        }

        public QueryAiCallDetailPageResponseBodyDataList setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public QueryAiCallDetailPageResponseBodyDataList setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setRecordingFilePath(String recordingFilePath) {
            this.recordingFilePath = recordingFilePath;
            return this;
        }
        public String getRecordingFilePath() {
            return this.recordingFilePath;
        }

        public QueryAiCallDetailPageResponseBodyDataList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryAiCallDetailPageResponseBodyDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryAiCallDetailPageResponseBodyDataList setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public QueryAiCallDetailPageResponseBodyDataList setVersionNo(Long versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public Long getVersionNo() {
            return this.versionNo;
        }

    }

    public static class QueryAiCallDetailPageResponseBodyData extends TeaModel {
        /**
         * <p>The list of task details.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryAiCallDetailPageResponseBodyDataList> list;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Total")
        public Long total;

        public static QueryAiCallDetailPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAiCallDetailPageResponseBodyData self = new QueryAiCallDetailPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAiCallDetailPageResponseBodyData setList(java.util.List<QueryAiCallDetailPageResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryAiCallDetailPageResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryAiCallDetailPageResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryAiCallDetailPageResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryAiCallDetailPageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
