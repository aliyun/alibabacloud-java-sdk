// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetBatchMediaProducingJobResponseBody extends TeaModel {
    /**
     * <p>The batch intelligent one-click video production task information.</p>
     */
    @NameInMap("EditingBatchJob")
    public GetBatchMediaProducingJobResponseBodyEditingBatchJob editingBatchJob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetBatchMediaProducingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchMediaProducingJobResponseBody self = new GetBatchMediaProducingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchMediaProducingJobResponseBody setEditingBatchJob(GetBatchMediaProducingJobResponseBodyEditingBatchJob editingBatchJob) {
        this.editingBatchJob = editingBatchJob;
        return this;
    }
    public GetBatchMediaProducingJobResponseBodyEditingBatchJob getEditingBatchJob() {
        return this.editingBatchJob;
    }

    public GetBatchMediaProducingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList extends TeaModel {
        /**
         * <p>The duration of the produced video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>24.5</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The error code returned when the subtask fails. This parameter is not returned if the subtask is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidMaterial.NotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the subtask fails. This parameter is not returned if the subtask is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified clips id not found:[&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>&quot;]</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The subtask ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>8e81933d44e3ae69e2f81485</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the produced media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>1470b11171ee9d19e7e6c66a</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The URL of the output video file.</p>
         * 
         * <strong>example:</strong>
         * <p>http:/xxx.oss-cn-shanghai.aliyuncs.com/xxx_0.mp4</p>
         */
        @NameInMap("MediaURL")
        public String mediaURL;

        /**
         * <p>The ID of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>7cc47fe04eaa81bd853acb6a</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The subtask status. Valid values:</p>
         * <ul>
         * <li><p>Init: initialized</p>
         * </li>
         * <li><p>Processing: processing</p>
         * </li>
         * <li><p>Success: successful</p>
         * </li>
         * <li><p>Failed: failed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList self = new GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList();
            return TeaModel.build(map, self);
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setMediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
            return this;
        }
        public String getMediaURL() {
            return this.mediaURL;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBatchMediaProducingJobResponseBodyEditingBatchJob extends TeaModel {
        /**
         * <p>The time when the task was completed. The time is displayed in UTC.</p>
         * <p>Format: &quot;YYYY-MM-DD\&quot;T\&quot;hh:mm:ss\&quot;Z\&quot;&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:57:07Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the task was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:47:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The editing-related configuration. For more information about the structure, see <a href="~~2692547#1be9bba03b7qu~~">EditingConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaConfig&quot;: {
         *       &quot;Volume&quot;: 0
         *   },
         *   &quot;SpeechConfig&quot;: {
         *       &quot;Volume&quot;: 1
         *   },
         *  &quot;BackgroundMusicConfig&quot;: {
         *       &quot;Volume&quot;: 0.3
         *   }
         * }</p>
         */
        @NameInMap("EditingConfig")
        public String editingConfig;

        /**
         * <p>The extended information. Field details:</p>
         * <ul>
         * <li><p>ErrorCode: the error code of the main task</p>
         * </li>
         * <li><p>ErrorMessage: the error message of the main task</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ErrorCode&quot;: &quot;InvalidMaterial.NotFound&quot;,
         *     &quot;ErrorMessage&quot;: &quot;The specified clips id not found:[\&quot;<strong><strong>30d0b5e871eebb2ff7f6c75a</strong></strong>\&quot;]&quot;
         * }</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The additional input.</p>
         * <ul>
         * <li>If JobType is set to Smart_Mix_Timeline_Organize or Screen_Media_Highlights_Timeline_Organize, the additional input is the media selection result.</li>
         * <li>If JobType is set to Scene_Batch_Editing, the additional input is the list of editing project IDs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;<strong><strong>7cc47fe04eaa81bd853acb6a</strong></strong>&quot;, &quot;<strong><strong>04eaa7cc47fe81bd853acb6a</strong></strong>&quot;]</p>
         */
        @NameInMap("ExtendInput")
        public String extendInput;

        /**
         * <p>The additional output.</p>
         * <ul>
         * <li>If JobType is set to Smart_Mix_Media_Select or Screen_Media_Highlights_Media_Select, the media selection result is additionally returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;textMatchMediaOutputList&quot;: [{
         *         &quot;textMatchMediaSentenceOutputList&quot;: [{
         *                 &quot;duration&quot;: 3.366667,
         *                 &quot;matchClipList&quot;: [{
         *                     &quot;clipId&quot;: &quot;null-2&quot;,
         *                     &quot;endTime&quot;: 11.16,
         *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
         *                     &quot;score&quot;: -0.253,
         *                     &quot;startTime&quot;: 8.04
         *                 }],
         *                 &quot;text&quot;: &quot;A new box of fresh horses has been opened in the nearby shopping mall.&quot;,
         *                 &quot;textId&quot;: &quot;0&quot;
         *             },
         *             {
         *                 &quot;duration&quot;: 1.566667,
         *                 &quot;matchClipList&quot;: [{
         *                     &quot;clipId&quot;: &quot;null-1&quot;,
         *                     &quot;endTime&quot;: 1.54,
         *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
         *                     &quot;score&quot;: -0.2326,
         *                     &quot;startTime&quot;: 0
         *                 }],
         *                 &quot;text&quot;: &quot;Today is the first day of opening&quot;,
         *                 &quot;textId&quot;: &quot;0&quot;
         *             }
         *         ]
         *     }]
         * }</p>
         */
        @NameInMap("ExtendOutput")
        public String extendOutput;

        /**
         * <p>The user synthesis output configuration. For more information about the structure, see <a href="~~2692547#2faed1559549n~~">InputConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaGroupArray&quot;: [{
         *       &quot;GroupName&quot;: &quot;MediaGroup1&quot;,
         *       &quot;MediaArray&quot;: [
         *         &quot;<strong><strong>9d46c886b45481030f6e</strong></strong>&quot;,
         *         &quot;<strong><strong>6c886b4549d481030f6e</strong></strong>&quot; ]
         *     }, {
         *       &quot;GroupName&quot;: &quot;MediaGroup2&quot;,
         *       &quot;MediaArray&quot;: [
         *         &quot;<strong><strong>d46c886810b454930f6e</strong></strong>&quot;,
         *         &quot;<strong><strong>4549d886810b46c30f6e</strong></strong>&quot; ]
         *   }],
         *   &quot;TitleArray&quot;: [
         *       &quot;Huilongguan Box Ma Xiansheng Opened&quot;,
         *       &quot;Box of Ma Xiansheng has opened&quot; ],
         *   &quot;SpeechTextArray&quot;: [
         *       &quot;A new box of fresh horses has been opened in a nearby shopping mall. Today is the first day of opening.&quot;
         *       &quot;There are a lot of people in the shopping mall. Snacks and drinks are relatively cheap. Come and have a look.&quot; ]
         * }</p>
         */
        @NameInMap("InputConfig")
        public String inputConfig;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>b6b2750d4308892ac3330238</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>Script: scripted automatic video production</li>
         * <li>Smart_Mix: intelligent image and text matching video production</li>
         * <li>Sports_Highlights: sports event highlights video production</li>
         * <li>Screen_Media_Highlights: high-energy mashup video production</li>
         * <li>Smart_Mix_Media_Select: intelligent matching - media selection</li>
         * <li>Smart_Mix_Timeline_Organize: intelligent matching - timeline arrangement</li>
         * <li>Screen_Media_Highlights_Media_Select: high-energy mashup - media selection</li>
         * <li>Screen_Media_Highlights_Timeline_Organize: high-energy mashup - timeline arrangement</li>
         * <li>Scene_Batch_Editing: multi-timeline batch synthesis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Script</p>
         */
        @NameInMap("JobType")
        public String jobType;

        /**
         * <p>The time when the task was modified. The time is displayed in UTC.</p>
         * <p>Format: &quot;YYYY-MM-DD\&quot;T\&quot;hh:mm:ss\&quot;Z\&quot;&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-13T08:57:07Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The output configuration. For more information about the structure, see <a href="~~2692547#447b928fcbuoa~~">OutputConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
         *   &quot;Count&quot;: 20,
         *   &quot;MaxDuration&quot;: 15,
         *   &quot;Width&quot;: 1080,
         *   &quot;Height&quot;: 1920,
         *   &quot;Video&quot;: {&quot;Crf&quot;: 27}
         * }</p>
         */
        @NameInMap("OutputConfig")
        public String outputConfig;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><p>Init: initialized</p>
         * </li>
         * <li><p>Processing: processing</p>
         * </li>
         * <li><p>Finished: finished</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of one-click video production subtasks.</p>
         */
        @NameInMap("SubJobList")
        public java.util.List<GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList> subJobList;

        /**
         * <p>The user business and callback configurations. For more information about the structure, see <a href="~~357745#section-urj-v3f-0s1~~">UserData</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetBatchMediaProducingJobResponseBodyEditingBatchJob build(java.util.Map<String, ?> map) throws Exception {
            GetBatchMediaProducingJobResponseBodyEditingBatchJob self = new GetBatchMediaProducingJobResponseBodyEditingBatchJob();
            return TeaModel.build(map, self);
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setEditingConfig(String editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public String getEditingConfig() {
            return this.editingConfig;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setExtendInput(String extendInput) {
            this.extendInput = extendInput;
            return this;
        }
        public String getExtendInput() {
            return this.extendInput;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setExtendOutput(String extendOutput) {
            this.extendOutput = extendOutput;
            return this;
        }
        public String getExtendOutput() {
            return this.extendOutput;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setInputConfig(String inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public String getInputConfig() {
            return this.inputConfig;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setOutputConfig(String outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public String getOutputConfig() {
            return this.outputConfig;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setSubJobList(java.util.List<GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList> subJobList) {
            this.subJobList = subJobList;
            return this;
        }
        public java.util.List<GetBatchMediaProducingJobResponseBodyEditingBatchJobSubJobList> getSubJobList() {
            return this.subJobList;
        }

        public GetBatchMediaProducingJobResponseBodyEditingBatchJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
