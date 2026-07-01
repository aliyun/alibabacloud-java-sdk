// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetYikeStoryboardJobResponseBody extends TeaModel {
    /**
     * <p>The storyboard job ID. You can obtain this ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/461964.html">SubmitStoryboardJob</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>A JSON object that contains the parameters for the job. The structure of this object varies based on the AI algorithm.</p>
     */
    @NameInMap("JobParams")
    public GetYikeStoryboardJobResponseBodyJobParams jobParams;

    /**
     * <p>The job result.</p>
     */
    @NameInMap("JobResult")
    public GetYikeStoryboardJobResponseBodyJobResult jobResult;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li><p><strong>Succeeded</strong>: The job completed successfully.</p>
     * </li>
     * <li><p><strong>Failed</strong>: The job failed to complete.</p>
     * </li>
     * <li><p><strong>Running</strong>: The job is in progress.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatus")
    public String jobStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetYikeStoryboardJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeStoryboardJobResponseBody self = new GetYikeStoryboardJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeStoryboardJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetYikeStoryboardJobResponseBody setJobParams(GetYikeStoryboardJobResponseBodyJobParams jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public GetYikeStoryboardJobResponseBodyJobParams getJobParams() {
        return this.jobParams;
    }

    public GetYikeStoryboardJobResponseBody setJobResult(GetYikeStoryboardJobResponseBodyJobResult jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public GetYikeStoryboardJobResponseBodyJobResult getJobResult() {
        return this.jobResult;
    }

    public GetYikeStoryboardJobResponseBody setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public GetYikeStoryboardJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetYikeStoryboardJobResponseBodyJobParams extends TeaModel {
        /**
         * <p>The aspect ratio of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        @NameInMap("AspectRatio")
        public String aspectRatio;

        /**
         * <p>The OSS URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The model parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;AudioEnable&quot;: false
         * }</p>
         */
        @NameInMap("ModelParams")
        public String modelParams;

        /**
         * <p>The narration voice.</p>
         * 
         * <strong>example:</strong>
         * <p>sys_YoungGracefulWoman</p>
         */
        @NameInMap("NarrationVoiceId")
        public String narrationVoiceId;

        /**
         * <p>The resolution of the generated video.</p>
         * 
         * <strong>example:</strong>
         * <p>1K</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The shot generation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>multi</p>
         */
        @NameInMap("ShotPromptMode")
        public String shotPromptMode;

        /**
         * <p>The shot splitting mode.</p>
         * 
         * <strong>example:</strong>
         * <p>firstPersonNarration</p>
         */
        @NameInMap("ShotSplitMode")
        public String shotSplitMode;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>Novel</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The style ID.</p>
         * 
         * <strong>example:</strong>
         * <p>RealisticPhotography</p>
         */
        @NameInMap("StyleId")
        public String styleId;

        /**
         * <p>The job title.</p>
         * <p>\- Maximum length: 128 bytes.</p>
         * <p>\- UTF-8 encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>test-title</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The video model.</p>
         * 
         * <strong>example:</strong>
         * <p>wan2.6-r2v-flash</p>
         */
        @NameInMap("VideoModel")
        public String videoModel;

        public static GetYikeStoryboardJobResponseBodyJobParams build(java.util.Map<String, ?> map) throws Exception {
            GetYikeStoryboardJobResponseBodyJobParams self = new GetYikeStoryboardJobResponseBodyJobParams();
            return TeaModel.build(map, self);
        }

        public GetYikeStoryboardJobResponseBodyJobParams setAspectRatio(String aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }
        public String getAspectRatio() {
            return this.aspectRatio;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setModelParams(String modelParams) {
            this.modelParams = modelParams;
            return this;
        }
        public String getModelParams() {
            return this.modelParams;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setNarrationVoiceId(String narrationVoiceId) {
            this.narrationVoiceId = narrationVoiceId;
            return this;
        }
        public String getNarrationVoiceId() {
            return this.narrationVoiceId;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setShotPromptMode(String shotPromptMode) {
            this.shotPromptMode = shotPromptMode;
            return this;
        }
        public String getShotPromptMode() {
            return this.shotPromptMode;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setShotSplitMode(String shotSplitMode) {
            this.shotSplitMode = shotSplitMode;
            return this;
        }
        public String getShotSplitMode() {
            return this.shotSplitMode;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setStyleId(String styleId) {
            this.styleId = styleId;
            return this;
        }
        public String getStyleId() {
            return this.styleId;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetYikeStoryboardJobResponseBodyJobParams setVideoModel(String videoModel) {
            this.videoModel = videoModel;
            return this;
        }
        public String getVideoModel() {
            return this.videoModel;
        }

    }

    public static class GetYikeStoryboardJobResponseBodyJobResult extends TeaModel {
        /**
         * <p>A list of IDs for storyboards that encountered an exception.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;st_2053348871\&quot;]</p>
         */
        @NameInMap("ExceptionStoryboardIds")
        public String exceptionStoryboardIds;

        /**
         * <p>A list of shots that failed to generate.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;errorCode\&quot;:\&quot;NoMediaData\&quot;,\&quot;storyboardId\&quot;:\&quot;st_2118280473\&quot;,\&quot;shotId\&quot;:\&quot;54\&quot;}]</p>
         */
        @NameInMap("FailureShotList")
        public String failureShotList;

        /**
         * <p>The downloadable OSS URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>Detailed information about each storyboard in the job.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;storyboardId\&quot;:\&quot;st_1541525214\&quot;,\&quot;title\&quot;:\&quot;test_1\&quot;,\&quot;status\&quot;:\&quot;Produced\&quot;,\&quot;subStatus\&quot;:\&quot;ProduceSucc\&quot;},{\&quot;storyboardId\&quot;:\&quot;st_1633435355\&quot;,\&quot;title\&quot;:\&quot;test_2\&quot;,\&quot;status\&quot;:\&quot;Produced\&quot;,\&quot;subStatus\&quot;:\&quot;ProduceSucc\&quot;}]</p>
         */
        @NameInMap("StoryboardInfoList")
        public String storyboardInfoList;

        /**
         * <p>A comma-separated list of successful storyboard IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>st_2118280473, st_2118280471</p>
         */
        @NameInMap("SuccessStoryboardIds")
        public String successStoryboardIds;

        /**
         * <p>A list of IDs for successful storyboards.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;st_2118280473\&quot;]</p>
         */
        @NameInMap("SuccessStoryboardList")
        public String successStoryboardList;

        public static GetYikeStoryboardJobResponseBodyJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetYikeStoryboardJobResponseBodyJobResult self = new GetYikeStoryboardJobResponseBodyJobResult();
            return TeaModel.build(map, self);
        }

        public GetYikeStoryboardJobResponseBodyJobResult setExceptionStoryboardIds(String exceptionStoryboardIds) {
            this.exceptionStoryboardIds = exceptionStoryboardIds;
            return this;
        }
        public String getExceptionStoryboardIds() {
            return this.exceptionStoryboardIds;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setFailureShotList(String failureShotList) {
            this.failureShotList = failureShotList;
            return this;
        }
        public String getFailureShotList() {
            return this.failureShotList;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setStoryboardInfoList(String storyboardInfoList) {
            this.storyboardInfoList = storyboardInfoList;
            return this;
        }
        public String getStoryboardInfoList() {
            return this.storyboardInfoList;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setSuccessStoryboardIds(String successStoryboardIds) {
            this.successStoryboardIds = successStoryboardIds;
            return this;
        }
        public String getSuccessStoryboardIds() {
            return this.successStoryboardIds;
        }

        public GetYikeStoryboardJobResponseBodyJobResult setSuccessStoryboardList(String successStoryboardList) {
            this.successStoryboardList = successStoryboardList;
            return this;
        }
        public String getSuccessStoryboardList() {
            return this.successStoryboardList;
        }

    }

}
