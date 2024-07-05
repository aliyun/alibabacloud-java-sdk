// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListMediaWorkflowExecutionsResponseBody extends TeaModel {
    /**
     * <p>The details of the media workflows.</p>
     */
    @NameInMap("MediaWorkflowExecutionList")
    public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionList mediaWorkflowExecutionList;

    /**
     * <p>The returned value of NextPageToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D1D5C080-8E2F-5030-8AB4-13092F17631B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMediaWorkflowExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaWorkflowExecutionsResponseBody self = new ListMediaWorkflowExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaWorkflowExecutionsResponseBody setMediaWorkflowExecutionList(ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionList mediaWorkflowExecutionList) {
        this.mediaWorkflowExecutionList = mediaWorkflowExecutionList;
        return this;
    }
    public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionList getMediaWorkflowExecutionList() {
        return this.mediaWorkflowExecutionList;
    }

    public ListMediaWorkflowExecutionsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListMediaWorkflowExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult extends TeaModel {
        /**
         * <p>The error code returned if the job failed. If the job was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The Topic/Queue config is empty, not send message</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the job failed. If the job was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MessageConfigEmpty</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the success message. If the job failed, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4f3bc83233de4e2f81c7dade443e****</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult self = new ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity extends TeaModel {
        /**
         * <p>The error code returned if the request failed.</p>
         * <ul>
         * <li>The specific error code appears if the state of the activity is <strong>Fail</strong>.</li>
         * <li>This parameter is not returned if the state of the activity is <strong>Success</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The end time of the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T06:54:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the job generated when the activity is executed. We recommend that you keep this ID for subsequent operation calls.</p>
         * 
         * <strong>example:</strong>
         * <p>2376030d9d0849399cd20e20c876****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message sent by Message Service (MNS) to notify the user of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned if the request failed.</p>
         * <ul>
         * <li>The detailed error message appears if the state of the activity is <strong>Fail</strong>.</li>
         * <li>This parameter is not returned if the state of the activity is <strong>Success</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the media workflow activity.</p>
         * <blockquote>
         * <p>The name of an activity in a media workflow is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Act-2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The start time of the activity.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T06:53:45Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the activity. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong>: The activity is being executed.</li>
         * <li><strong>Fail</strong>: The activity failed to be executed.</li>
         * <li><strong>Skipped</strong>: The activity was skipped.</li>
         * <li><strong>Success</strong>: The activity was successfully executed.</li>
         * </ul>
         * <blockquote>
         * <p>For example, the high-definition and standard-definition transcoding activities are to be run after the analysis activity is complete. The system determines the activity to run based on the analysis result. If the definition of the input video content is insufficient, the high-definition transcoding activity may be skipped.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The type of the media workflow activity. Valid values: Start, Snapshot, Transcode, Analysis, and Report. For more information, see <a href="https://help.aliyun.com/document_detail/68494.html">Methods supported for media workflows</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Start</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity build(java.util.Map<String, ?> map) throws Exception {
            ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity self = new ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity();
            return TeaModel.build(map, self);
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setMNSMessageResult(ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList extends TeaModel {
        @NameInMap("Activity")
        public java.util.List<ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity> activity;

        public static ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList self = new ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList();
            return TeaModel.build(map, self);
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList setActivity(java.util.List<ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity> activity) {
            this.activity = activity;
            return this;
        }
        public java.util.List<ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivity> getActivity() {
            return this.activity;
        }

    }

    public static class ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input media file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the input file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input media file.</p>
         */
        @NameInMap("Object")
        public String object;

        public static ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile build(java.util.Map<String, ?> map) throws Exception {
            ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile self = new ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile();
            return TeaModel.build(map, self);
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput extends TeaModel {
        /**
         * <p>The information about the storage location of the input file of the media workflow in OSS.</p>
         */
        @NameInMap("InputFile")
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile inputFile;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>example data</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput build(java.util.Map<String, ?> map) throws Exception {
            ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput self = new ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput();
            return TeaModel.build(map, self);
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput setInputFile(ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInputInputFile getInputFile() {
            return this.inputFile;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution extends TeaModel {
        /**
         * <p>The activities that are executed in the media workflow.</p>
         */
        @NameInMap("ActivityList")
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList activityList;

        /**
         * <p>The time when the media workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-04-01T06:53:43Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The custom data of the media workflow.</p>
         */
        @NameInMap("Input")
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput input;

        /**
         * <p>The ID of the media file. A media file contains all the information about a media workflow.</p>
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
         * <p>43b7335a4b1d4fe883670036affb****</p>
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
         * <li><strong>running</strong>: The execution is in progress.</li>
         * <li><strong>Completed</strong>: The execution is complete.</li>
         * </ul>
         * <blockquote>
         * <p>A value of Completed indicates that the execution is complete. For the information about whether each activity, such as Transcode or Snapshot, is successful, check the status of the activity.</p>
         * </blockquote>
         * <ul>
         * <li><strong>Fail</strong>: The execution failed.</li>
         * <li><strong>Success</strong>: The execution was successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        public static ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution build(java.util.Map<String, ?> map) throws Exception {
            ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution self = new ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution();
            return TeaModel.build(map, self);
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setActivityList(ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList activityList) {
            this.activityList = activityList;
            return this;
        }
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList getActivityList() {
            return this.activityList;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setInput(ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput input) {
            this.input = input;
            return this;
        }
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput getInput() {
            return this.input;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionList extends TeaModel {
        @NameInMap("MediaWorkflowExecution")
        public java.util.List<ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution> mediaWorkflowExecution;

        public static ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionList self = new ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionList();
            return TeaModel.build(map, self);
        }

        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionList setMediaWorkflowExecution(java.util.List<ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution> mediaWorkflowExecution) {
            this.mediaWorkflowExecution = mediaWorkflowExecution;
            return this;
        }
        public java.util.List<ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecution> getMediaWorkflowExecution() {
            return this.mediaWorkflowExecution;
        }

    }

}
