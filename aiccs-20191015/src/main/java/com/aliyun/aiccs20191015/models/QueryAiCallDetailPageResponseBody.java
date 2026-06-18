// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryAiCallDetailPageResponseBody extends TeaModel {
    /**
     * <p>The reason why the access request was denied.</p>
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
     * <p>A description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
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
     * <p>Indicates whether the request was successful. Valid values are:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
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
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("BranchId")
        public Long branchId;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("BranchName")
        public String branchName;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("BranchVersionId")
        public Long branchVersionId;

        /**
         * <p>The call result.</p>
         * 
         * <strong>example:</strong>
         * <p>用户接通</p>
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
         * <p>The call time, formatted as a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        @NameInMap("CallingTime")
        public Long callingTime;

        /**
         * <p>The conversation duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ConversationDuration")
        public Long conversationDuration;

        /**
         * <p>The conversation record, formatted as a chronologically sorted JSON array. Each object has the following structure:</p>
         * <pre><code class="language-json">[
         *     {
         *         &quot;content&quot;:&quot;The content of the message.&quot;,
         *         &quot;role&quot;:&quot;The role of the speaker.&quot;, // Valid values: user, assistant
         *     }
         * ]
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;content&quot;: &quot;111您好，年龄222，性别男，我这边是<strong>汽车的官方顾问，我们新出了一款车型为</strong>；<strong>已经上市了，售价</strong>万元起，<strong>分钟破*台，您看要不了解一下？&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;
         *     },
         *     {
         *         &quot;content&quot;: &quot;&lt;客户打断&gt;哎，你是谁？&quot;,
         *         &quot;role&quot;: &quot;user&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;&lt;客户打断&gt;你再说一遍。&quot;,
         *         &quot;role&quot;: &quot;user&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;哎，我没听清。&quot;,
         *         &quot;role&quot;: &quot;user&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;你在说什么？&quot;,
         *         &quot;role&quot;: &quot;user&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;您好，&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;我是</strong>汽车总部销售服务顾问。&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;我们最近推出了一款新车**，想了解一下您是否对这款车型感兴趣？&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;&lt;客户打断&gt;哎，那我是谁？&quot;,
         *         &quot;role&quot;: &quot;user&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;你在说什么呢？&quot;,
         *         &quot;role&quot;: &quot;user&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;抱歉打扰了，111先生。&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;,
         *     },
         *     {
         *         &quot;content&quot;: &quot;祝您生活愉快！再见！&quot;,
         *         &quot;role&quot;: &quot;assistant&quot;,
         *     }
         * ]</p>
         */
        @NameInMap("ConversationRecord")
        public String conversationRecord;

        /**
         * <p>The conversation turn count.</p>
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
         * <p>The encryption type. Valid values are: 0 (no encryption), 1 (MD5), 2 (SHA256), and 3 (SM3).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EncryptionType")
        public Long encryptionType;

        /**
         * <p>The failure reason. Provided only if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>账户停机</p>
         */
        @NameInMap("FailedReason")
        public String failedReason;

        /**
         * <p>The import time, formatted as a timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1748948749000</p>
         */
        @NameInMap("ImportedTime")
        public Long importedTime;

        /**
         * <p>The major intent.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("MajorIntent")
        public String majorIntent;

        /**
         * <p>A JSON object of key-value pairs for runtime variables.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;date&quot;: &quot;666&quot;,
         *   &quot;phoneNumber&quot;: &quot;777&quot;,
         *   &quot;distance&quot;: &quot;555&quot;,
         *   &quot;mendian&quot;: &quot;444&quot;,
         *   &quot;sex&quot;: &quot;男&quot;,
         *   &quot;name&quot;: &quot;111&quot;,
         *   &quot;age&quot;: &quot;222&quot;
         * }</p>
         */
        @NameInMap("Options")
        public String options;

        /**
         * <strong>example:</strong>
         * <p>outId</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The recording file path. Provided only after the recording file is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>https://*******</p>
         */
        @NameInMap("RecordingFilePath")
        public String recordingFilePath;

        /**
         * <p>The task detail status.</p>
         * <ul>
         * <li><p>0: Initializing</p>
         * </li>
         * <li><p>1: Waiting to call</p>
         * </li>
         * <li><p>2: Waiting to retry</p>
         * </li>
         * <li><p>3: Calling</p>
         * </li>
         * <li><p>4: Call ended</p>
         * </li>
         * <li><p>5: Call failed</p>
         * </li>
         * </ul>
         * <p>Only statuses 4 and 5 are terminal states.</p>
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
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        /**
         * <strong>example:</strong>
         * <p>55</p>
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
         * <p>A list of task details.</p>
         */
        @NameInMap("List")
        public java.util.List<QueryAiCallDetailPageResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
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
