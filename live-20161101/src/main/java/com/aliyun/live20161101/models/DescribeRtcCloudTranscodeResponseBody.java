// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcCloudTranscodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskInfo")
    public DescribeRtcCloudTranscodeResponseBodyTaskInfo taskInfo;

    public static DescribeRtcCloudTranscodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcCloudTranscodeResponseBody self = new DescribeRtcCloudTranscodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcCloudTranscodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcCloudTranscodeResponseBody setTaskInfo(DescribeRtcCloudTranscodeResponseBodyTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }
    public DescribeRtcCloudTranscodeResponseBodyTaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static class DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Long sourceType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Long streamType;

        /**
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam self = new DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam();
            return TeaModel.build(map, self);
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam setSourceType(Long sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Long getSourceType() {
            return this.sourceType;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam setStreamType(Long streamType) {
            this.streamType = streamType;
            return this;
        }
        public Long getStreamType() {
            return this.streamType;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParam extends TeaModel {
        @NameInMap("SingleSubUserParam")
        public DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam singleSubUserParam;

        public static DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParam self = new DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParam();
            return TeaModel.build(map, self);
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParam setSingleSubUserParam(DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam singleSubUserParam) {
            this.singleSubUserParam = singleSubUserParam;
            return this;
        }
        public DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParamSingleSubUserParam getSingleSubUserParam() {
            return this.singleSubUserParam;
        }

    }

    public static class DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>myChannel</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>lhd</p>
         */
        @NameInMap("TranscodeTemplate")
        public String transcodeTemplate;

        /**
         * <strong>example:</strong>
         * <p>userA_360p</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>eyJhcHBpZCI********</p>
         */
        @NameInMap("UserToken")
        public String userToken;

        public static DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams self = new DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams();
            return TeaModel.build(map, self);
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams setTranscodeTemplate(String transcodeTemplate) {
            this.transcodeTemplate = transcodeTemplate;
            return this;
        }
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }
        public String getUserToken() {
            return this.userToken;
        }

    }

    public static class DescribeRtcCloudTranscodeResponseBodyTaskInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>myChannel</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("InputParam")
        public DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParam inputParam;

        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxIdleTime")
        public Long maxIdleTime;

        @NameInMap("OutputParams")
        public java.util.List<DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams> outputParams;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p><strong><strong><strong>73-8501-</strong></strong>-8ac1-72295a</strong>****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeRtcCloudTranscodeResponseBodyTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcCloudTranscodeResponseBodyTaskInfo self = new DescribeRtcCloudTranscodeResponseBodyTaskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfo setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfo setInputParam(DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParam inputParam) {
            this.inputParam = inputParam;
            return this;
        }
        public DescribeRtcCloudTranscodeResponseBodyTaskInfoInputParam getInputParam() {
            return this.inputParam;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfo setMaxIdleTime(Long maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
            return this;
        }
        public Long getMaxIdleTime() {
            return this.maxIdleTime;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfo setOutputParams(java.util.List<DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams> outputParams) {
            this.outputParams = outputParams;
            return this;
        }
        public java.util.List<DescribeRtcCloudTranscodeResponseBodyTaskInfoOutputParams> getOutputParams() {
            return this.outputParams;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRtcCloudTranscodeResponseBodyTaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
