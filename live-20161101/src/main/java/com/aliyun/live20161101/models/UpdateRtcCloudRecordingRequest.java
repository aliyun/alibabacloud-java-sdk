// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateRtcCloudRecordingRequest extends TeaModel {
    /**
     * <p>The updated layout parameters. Leave this parameter empty in single-stream recording mode. This parameter is required in stream mixing recording mode when the transcoding output is not audio-only.</p>
     */
    @NameInMap("MixLayoutParams")
    public UpdateRtcCloudRecordingRequestMixLayoutParams mixLayoutParams;

    /**
     * <p>The updated subscription parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscribeParams")
    public UpdateRtcCloudRecordingRequestSubscribeParams subscribeParams;

    /**
     * <p>The task ID. This ID is returned by StartRtcCloudRecording. Only tasks in the running or abnormal state can be updated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>73-8501-</strong></strong>-8ac1-72295a</strong>****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateRtcCloudRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtcCloudRecordingRequest self = new UpdateRtcCloudRecordingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRtcCloudRecordingRequest setMixLayoutParams(UpdateRtcCloudRecordingRequestMixLayoutParams mixLayoutParams) {
        this.mixLayoutParams = mixLayoutParams;
        return this;
    }
    public UpdateRtcCloudRecordingRequestMixLayoutParams getMixLayoutParams() {
        return this.mixLayoutParams;
    }

    public UpdateRtcCloudRecordingRequest setSubscribeParams(UpdateRtcCloudRecordingRequestSubscribeParams subscribeParams) {
        this.subscribeParams = subscribeParams;
        return this;
    }
    public UpdateRtcCloudRecordingRequestSubscribeParams getSubscribeParams() {
        return this.subscribeParams;
    }

    public UpdateRtcCloudRecordingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground extends TeaModel {
        /**
         * <p>The display mode for the output. Valid values:</p>
         * <ul>
         * <li>0: crop. (Default)</li>
         * <li>1: scale and display with black borders.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderMode")
        public Integer renderMode;

        /**
         * <p>The URL of the background image. The maximum length is 2048 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.com/photos/my-test-picture.png">https://xxxx.com/photos/my-test-picture.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground build(java.util.Map<String, ?> map) throws Exception {
            UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground self = new UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground();
            return TeaModel.build(map, self);
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground setRenderMode(Integer renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public Integer getRenderMode() {
            return this.renderMode;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground extends TeaModel {
        /**
         * <p>The display mode for the sub-pane output. Valid values:</p>
         * <ul>
         * <li>0: crop. (Default)</li>
         * <li>1: scale and display with black borders.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderMode")
        public Integer renderMode;

        /**
         * <p>The URL of the background image. The maximum length is 2048 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.com/photos/my-test-pane-picture.png">https://xxxx.com/photos/my-test-pane-picture.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground build(java.util.Map<String, ?> map) throws Exception {
            UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground self = new UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground();
            return TeaModel.build(map, self);
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground setRenderMode(Integer renderMode) {
            this.renderMode = renderMode;
            return this;
        }
        public Integer getRenderMode() {
            return this.renderMode;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes extends TeaModel {
        /**
         * <p>The pane height as a normalized percentage. The value must be in the range of [0, 1]. (Default: 0)</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The video input stream type of the UserId. This parameter is invalid if UserId is not specified. Valid values:</p>
         * <ul>
         * <li>0: camera. (Default)</li>
         * <li>1: screen sharing.</li>
         * </ul>
         * <p>The combination of UserId and SourceType specified here must be included in SubscribeUserIdList.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Integer sourceType;

        /**
         * <p>The sub-pane background image. When a user turns off the camera, has not started stream ingest after joining, or leaves the channel midway, the corresponding image is displayed at the layout position.</p>
         */
        @NameInMap("SubBackground")
        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground subBackground;

        /**
         * <p>The UserId corresponding to this window.</p>
         * <ul>
         * <li>If UserId is not specified, windows are filled in the order in which subscribed users join the channel.</li>
         * <li>The combination of UserId and SourceType specified here must be included in SubscribeUserIdList.</li>
         * <li>Audio-only streams cannot be added to the layout.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The pane width as a normalized percentage. The value must be in the range of [0, 1]. (Default: 0)</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The X coordinate as a normalized percentage. The value must be in the range of [0, 1]. (Default: 0)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>The Y coordinate as a normalized percentage. The value must be in the range of [0, 1]. (Default: 0)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Y")
        public String y;

        /**
         * <p>The stacking order. 0 is the bottom layer, layer 1 is above layer 0, and so on. (Default: 0)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ZOrder")
        public Integer ZOrder;

        public static UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes build(java.util.Map<String, ?> map) throws Exception {
            UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes self = new UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes();
            return TeaModel.build(map, self);
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes setSourceType(Integer sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Integer getSourceType() {
            return this.sourceType;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes setSubBackground(UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground subBackground) {
            this.subBackground = subBackground;
            return this;
        }
        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground getSubBackground() {
            return this.subBackground;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes setZOrder(Integer ZOrder) {
            this.ZOrder = ZOrder;
            return this;
        }
        public Integer getZOrder() {
            return this.ZOrder;
        }

    }

    public static class UpdateRtcCloudRecordingRequestMixLayoutParams extends TeaModel {
        /**
         * <p>The global background image for stream mixing.</p>
         */
        @NameInMap("MixBackground")
        public UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground mixBackground;

        /**
         * <p>The window layout information of the subscribed users. Only UserIds with layout information configured are placed in the output. This parameter is required in stream mixing mode when recording non-audio-only files.</p>
         */
        @NameInMap("UserPanes")
        public java.util.List<UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes> userPanes;

        public static UpdateRtcCloudRecordingRequestMixLayoutParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateRtcCloudRecordingRequestMixLayoutParams self = new UpdateRtcCloudRecordingRequestMixLayoutParams();
            return TeaModel.build(map, self);
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParams setMixBackground(UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground mixBackground) {
            this.mixBackground = mixBackground;
            return this;
        }
        public UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground getMixBackground() {
            return this.mixBackground;
        }

        public UpdateRtcCloudRecordingRequestMixLayoutParams setUserPanes(java.util.List<UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes> userPanes) {
            this.userPanes = userPanes;
            return this;
        }
        public java.util.List<UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanes> getUserPanes() {
            return this.userPanes;
        }

    }

    public static class UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList extends TeaModel {
        /**
         * <p>The video input stream type of the UserId. This parameter takes effect only when the video stream is subscribed (StreamType=2). Valid values:</p>
         * <ul>
         * <li><p>0: camera. (Default)</p>
         * </li>
         * <li><p>1: screen sharing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Integer sourceType;

        /**
         * <p>The media type of the subscribed UserId. Valid values:</p>
         * <ul>
         * <li><p>0: original stream, which includes both audio and video. (Default)</p>
         * </li>
         * <li><p>1: audio-only stream.</p>
         * </li>
         * <li><p>2: video-only stream.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        /**
         * <p>The subscribed UserId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList self = new UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList();
            return TeaModel.build(map, self);
        }

        public UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList setSourceType(Integer sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Integer getSourceType() {
            return this.sourceType;
        }

        public UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UpdateRtcCloudRecordingRequestSubscribeParams extends TeaModel {
        /**
         * <p>The list of subscribed UserId entries. In single-stream recording mode, each UserId is recorded separately. In stream mixing recording mode, the audio and video of all UserIds are mixed into a single set of audio and video.</p>
         * <blockquote>
         * <ul>
         * <li>The array supports a maximum of 17 elements.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SubscribeUserIdList")
        public java.util.List<UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList> subscribeUserIdList;

        public static UpdateRtcCloudRecordingRequestSubscribeParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateRtcCloudRecordingRequestSubscribeParams self = new UpdateRtcCloudRecordingRequestSubscribeParams();
            return TeaModel.build(map, self);
        }

        public UpdateRtcCloudRecordingRequestSubscribeParams setSubscribeUserIdList(java.util.List<UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList> subscribeUserIdList) {
            this.subscribeUserIdList = subscribeUserIdList;
            return this;
        }
        public java.util.List<UpdateRtcCloudRecordingRequestSubscribeParamsSubscribeUserIdList> getSubscribeUserIdList() {
            return this.subscribeUserIdList;
        }

    }

}
