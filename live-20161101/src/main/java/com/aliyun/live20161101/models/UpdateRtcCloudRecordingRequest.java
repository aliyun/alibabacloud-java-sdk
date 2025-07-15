// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateRtcCloudRecordingRequest extends TeaModel {
    @NameInMap("MixLayoutParams")
    public UpdateRtcCloudRecordingRequestMixLayoutParams mixLayoutParams;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubscribeParams")
    public UpdateRtcCloudRecordingRequestSubscribeParams subscribeParams;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderMode")
        public Integer renderMode;

        /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RenderMode")
        public Integer renderMode;

        /**
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
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Integer sourceType;

        @NameInMap("SubBackground")
        public UpdateRtcCloudRecordingRequestMixLayoutParamsUserPanesSubBackground subBackground;

        /**
         * <strong>example:</strong>
         * <p>userA</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Y")
        public String y;

        /**
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
        @NameInMap("MixBackground")
        public UpdateRtcCloudRecordingRequestMixLayoutParamsMixBackground mixBackground;

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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceType")
        public Integer sourceType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        /**
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
