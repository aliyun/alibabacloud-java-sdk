// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListMediaWorkflowExecutionsResponseBody extends TeaModel {
    /**
     * <p>The list of media workflow execution instances.</p>
     */
    @NameInMap("MediaWorkflowExecutionList")
    public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionList mediaWorkflowExecutionList;

    /**
     * <p>The token that is used to retrieve the next page of the query results.</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The error code returned when the job fails. If the job is successful, this parameter is not returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the job fails. If the job is successful, this parameter is not returned.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the success message. If the job fails, this parameter is not returned.</p>
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
         * <p>The error code returned.</p>
         * <br>
         * <p>*   The specific error code appears if the activity status is **Fail**.</p>
         * <p>*   This parameter is not returned if the activity status is **Success**.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The end time of the activity.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the job generated when the activity is executed. We recommend that you save this ID for subsequent calls of other operations.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message sent by Message Service (MNS) to notify the user of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityListActivityMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned.</p>
         * <br>
         * <p>*   The detailed error message appears if the activity status is **Fail**.</p>
         * <p>*   This parameter is not returned if the activity status is **Success**.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The name of the media workflow activity. </p>
         * <br>
         * <p>>  The name of an activity in a media workflow is unique.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The start time of the activity.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the activity. Valid values:</p>
         * <br>
         * <p>*   **Running**: The activity is being executed.</p>
         * <p>*   **Fail**: The activity failed to be executed.</p>
         * <p>*   **Skipped**: The activity was skipped.</p>
         * <p>*   **Success**: The activity was successfully executed.</p>
         * <br>
         * <p>>  For example, the high-definition and standard-definition transcoding activities are to be run after the analysis activity is complete. The system determines the activity to run based on the analysis result. If the definition of the input video content is insufficient, the high-definition transcoding activity may be skipped.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The type of the media workflow activity. Valid values: Start, Snapshot, Transcode, Analysis, and Report. For more information, see [Media workflow activities](~~68494~~).</p>
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
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region where the input file resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
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
         * <p>The list of activities that are executed in the media workflow.</p>
         */
        @NameInMap("ActivityList")
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionActivityList activityList;

        /**
         * <p>The time when the execution instance was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The custom data of the media workflow.</p>
         */
        @NameInMap("Input")
        public ListMediaWorkflowExecutionsResponseBodyMediaWorkflowExecutionListMediaWorkflowExecutionInput input;

        /**
         * <p>The ID of the media file. This media file ID is associated with all information generated by the media workflow.</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The ID of the media workflow.</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the media workflow.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the execution instance.</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The status of the execution instance. Valid values:</p>
         * <br>
         * <p>*   **running**: The execution instance is in progress.</p>
         * <p>*   **Completed**: The execution instance is complete.</p>
         * <br>
         * <p>>  A value of Completed indicates that the execution instance is complete. For the information about whether each activity, such as Transcode or Snapshot, is successful, check the status of the activity.</p>
         * <br>
         * <p>*   **Fail**: The execution instance failed.</p>
         * <p>*   **Success**: The execution instance was successful.</p>
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
