// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowExecutionListResponseBody extends TeaModel {
    /**
     * <p>The details of the media workflows.</p>
     */
    @NameInMap("MediaWorkflowExecutionList")
    public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionList mediaWorkflowExecutionList;

    /**
     * <p>The IDs of the execution instances that do not exist.</p>
     */
    @NameInMap("NonExistRunIds")
    public QueryMediaWorkflowExecutionListResponseBodyNonExistRunIds nonExistRunIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D1D5C080-8E2F-5030-8AB4-13092F17631B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaWorkflowExecutionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaWorkflowExecutionListResponseBody self = new QueryMediaWorkflowExecutionListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaWorkflowExecutionListResponseBody setMediaWorkflowExecutionList(QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionList mediaWorkflowExecutionList) {
        this.mediaWorkflowExecutionList = mediaWorkflowExecutionList;
        return this;
    }
    public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionList getMediaWorkflowExecutionList() {
        return this.mediaWorkflowExecutionList;
    }

    public QueryMediaWorkflowExecutionListResponseBody setNonExistRunIds(QueryMediaWorkflowExecutionListResponseBodyNonExistRunIds nonExistRunIds) {
        this.nonExistRunIds = nonExistRunIds;
        return this;
    }
    public QueryMediaWorkflowExecutionListResponseBodyNonExistRunIds getNonExistRunIds() {
        return this.nonExistRunIds;
    }

    public QueryMediaWorkflowExecutionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult extends TeaModel {
        /**
         * <p>The error code returned if the MNS message fails to be sent. This parameter is not returned if the MNS message is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>The Topic/Queue config is empty, not send message</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the MNS message fails to be sent. This parameter is not returned if the MNS message is sent.</p>
         * 
         * <strong>example:</strong>
         * <p>MessageConfigEmpty</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the message that indicates the MNS message is sent. This parameter is not returned if the MNS message fails to be sent.</p>
         * 
         * <strong>example:</strong>
         * <p>4f3bc83233de4e2f81c7dade443e****</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult self = new QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity extends TeaModel {
        /**
         * <p>The error code.</p>
         * <ul>
         * <li>This parameter is returned only if <strong>Fail</strong> is returned for the State parameter.</li>
         * <li>This parameter is not returned if the method status is <strong>Success</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ResourceContentBad</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the method ends.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T06:53:44Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The IDs of the jobs that are generated when the methods are called, such as the job IDs for the analysis, transcode, and snapshot methods.</p>
         * 
         * <strong>example:</strong>
         * <p>2376030d9d0849399cd20e20f4f3****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message sent by Message Service (MNS) to notify the user of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message.</p>
         * <ul>
         * <li>This parameter is returned only if <strong>Fail</strong> is returned for the State parameter.</li>
         * <li>This parameter is not returned if the method status is <strong>Success</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>The resource operated InputFile is bad</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the method.</p>
         * <blockquote>
         * <p>The name of each method in a media workflow is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Start</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the method is called.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T06:53:44Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the workflow method. Valid values:</p>
         * <ul>
         * <li>Running: The method is being called.</li>
         * <li>Success: The method is called.</li>
         * <li>Fail: The method failed to be called.</li>
         * <li>Skipped: The method is skipped.</li>
         * </ul>
         * <blockquote>
         * <p>For example, after the analysis is complete, the transcode method is called and high-definition and standard-definition transcoding jobs are created. The system determines whether to run the jobs based on the analysis result. If the resolution of the input video is low, the high-definition transcoding job may be skipped.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The methods that are supported in the media workflow. Valid values: Start, Snapshot, Transcode, Analysis, and Report. For more information, see <a href="https://help.aliyun.com/document_detail/68494.html">Methods supported for media workflows</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Start</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity self = new QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setMNSMessageResult(QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList extends TeaModel {
        @NameInMap("Activity")
        public java.util.List<QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity> activity;

        public static QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList self = new QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList setActivity(java.util.List<QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity> activity) {
            this.activity = activity;
            return this;
        }
        public java.util.List<QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity> getActivity() {
            return this.activity;
        }

    }

    public static class QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the input file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>mps-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile self = new QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput extends TeaModel {
        /**
         * <p>The input file of the media workflow.</p>
         */
        @NameInMap("InputFile")
        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile inputFile;

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>example data ****</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput self = new QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput setInputFile(QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution extends TeaModel {
        /**
         * <p>The methods that are called in the media workflow.</p>
         */
        @NameInMap("ActivityList")
        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList activityList;

        /**
         * <p>The time when the media workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>016-04-01T06:53:43Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The input data of the media workflow.</p>
         */
        @NameInMap("Input")
        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput input;

        /**
         * <p>The ID of the media asset. A media file contains all the information about a media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>512046582a924698a41e0f8b0d2b****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The ID of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f44eab54b6e91****81d4</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the media workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>example-mediaworkflow-****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the execution instance.</p>
         * 
         * <strong>example:</strong>
         * <p>48e33690ac19445488c706924321****</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The status of the media workflow. Valid values:</p>
         * <ul>
         * <li>Running: The media workflow is running.</li>
         * <li>Completed: The media workflow is complete.</li>
         * </ul>
         * <blockquote>
         * <p>Completed only indicates that the media workflow is complete. View the status of each method in the workflow, such as the transcode and snapshot methods, to check whether the method is called.</p>
         * </blockquote>
         * <ul>
         * <li>Fail: The media workflow fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("State")
        public String state;

        public static QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution self = new QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setActivityList(QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList activityList) {
            this.activityList = activityList;
            return this;
        }
        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList getActivityList() {
            return this.activityList;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setInput(QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput input) {
            this.input = input;
            return this;
        }
        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput getInput() {
            return this.input;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionList extends TeaModel {
        @NameInMap("MediaWorkflowExecution")
        public java.util.List<QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution> mediaWorkflowExecution;

        public static QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionList self = new QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionList();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionList setMediaWorkflowExecution(java.util.List<QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution> mediaWorkflowExecution) {
            this.mediaWorkflowExecution = mediaWorkflowExecution;
            return this;
        }
        public java.util.List<QueryMediaWorkflowExecutionListResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution> getMediaWorkflowExecution() {
            return this.mediaWorkflowExecution;
        }

    }

    public static class QueryMediaWorkflowExecutionListResponseBodyNonExistRunIds extends TeaModel {
        @NameInMap("RunId")
        public java.util.List<String> runId;

        public static QueryMediaWorkflowExecutionListResponseBodyNonExistRunIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaWorkflowExecutionListResponseBodyNonExistRunIds self = new QueryMediaWorkflowExecutionListResponseBodyNonExistRunIds();
            return TeaModel.build(map, self);
        }

        public QueryMediaWorkflowExecutionListResponseBodyNonExistRunIds setRunId(java.util.List<String> runId) {
            this.runId = runId;
            return this;
        }
        public java.util.List<String> getRunId() {
            return this.runId;
        }

    }

}
