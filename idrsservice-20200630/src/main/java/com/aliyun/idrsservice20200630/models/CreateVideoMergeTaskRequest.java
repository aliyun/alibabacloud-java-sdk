// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateVideoMergeTaskRequest extends TeaModel {
    @NameInMap("VideoMergeRequest")
    public CreateVideoMergeTaskRequestVideoMergeRequest videoMergeRequest;

    public static CreateVideoMergeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoMergeTaskRequest self = new CreateVideoMergeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoMergeTaskRequest setVideoMergeRequest(CreateVideoMergeTaskRequestVideoMergeRequest videoMergeRequest) {
        this.videoMergeRequest = videoMergeRequest;
        return this;
    }
    public CreateVideoMergeTaskRequestVideoMergeRequest getVideoMergeRequest() {
        return this.videoMergeRequest;
    }

    public static class CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Height")
        public Long height;

        @NameInMap("PositionX")
        public Long positionX;

        @NameInMap("PositionY")
        public Long positionY;

        @NameInMap("Width")
        public Long width;

        public static CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles self = new CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles();
            return TeaModel.build(map, self);
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles setPositionX(Long positionX) {
            this.positionX = positionX;
            return this;
        }
        public Long getPositionX() {
            return this.positionX;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles setPositionY(Long positionY) {
            this.positionY = positionY;
            return this;
        }
        public Long getPositionY() {
            return this.positionY;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles extends TeaModel {
        @NameInMap("Height")
        public Long height;

        @NameInMap("InputNum")
        public Long inputNum;

        @NameInMap("VideoStyles")
        public java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles> videoStyles;

        @NameInMap("Width")
        public Long width;

        public static CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles self = new CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles();
            return TeaModel.build(map, self);
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles setInputNum(Long inputNum) {
            this.inputNum = inputNum;
            return this;
        }
        public Long getInputNum() {
            return this.inputNum;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles setVideoStyles(java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles> videoStyles) {
            this.videoStyles = videoStyles;
            return this;
        }
        public java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles> getVideoStyles() {
            return this.videoStyles;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class CreateVideoMergeTaskRequestVideoMergeRequestVideoList extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("MergeBeginTime")
        public Long mergeBeginTime;

        @NameInMap("MergeEndTime")
        public Long mergeEndTime;

        @NameInMap("PrimeVideo")
        public Boolean primeVideo;

        @NameInMap("StartTime")
        public Long startTime;

        public static CreateVideoMergeTaskRequestVideoMergeRequestVideoList build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoMergeTaskRequestVideoMergeRequestVideoList self = new CreateVideoMergeTaskRequestVideoMergeRequestVideoList();
            return TeaModel.build(map, self);
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestVideoList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestVideoList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestVideoList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestVideoList setMergeBeginTime(Long mergeBeginTime) {
            this.mergeBeginTime = mergeBeginTime;
            return this;
        }
        public Long getMergeBeginTime() {
            return this.mergeBeginTime;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestVideoList setMergeEndTime(Long mergeEndTime) {
            this.mergeEndTime = mergeEndTime;
            return this;
        }
        public Long getMergeEndTime() {
            return this.mergeEndTime;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestVideoList setPrimeVideo(Boolean primeVideo) {
            this.primeVideo = primeVideo;
            return this;
        }
        public Boolean getPrimeVideo() {
            return this.primeVideo;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestVideoList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateVideoMergeTaskRequestVideoMergeRequestWatermark extends TeaModel {
        @NameInMap("FontColor")
        public String fontColor;

        @NameInMap("FontSize")
        public Long fontSize;

        @NameInMap("PositionX")
        public Long positionX;

        @NameInMap("PositionY")
        public Long positionY;

        @NameInMap("Text")
        public String text;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static CreateVideoMergeTaskRequestVideoMergeRequestWatermark build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoMergeTaskRequestVideoMergeRequestWatermark self = new CreateVideoMergeTaskRequestVideoMergeRequestWatermark();
            return TeaModel.build(map, self);
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestWatermark setFontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }
        public String getFontColor() {
            return this.fontColor;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestWatermark setFontSize(Long fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Long getFontSize() {
            return this.fontSize;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestWatermark setPositionX(Long positionX) {
            this.positionX = positionX;
            return this;
        }
        public Long getPositionX() {
            return this.positionX;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestWatermark setPositionY(Long positionY) {
            this.positionY = positionY;
            return this;
        }
        public Long getPositionY() {
            return this.positionY;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestWatermark setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequestWatermark setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class CreateVideoMergeTaskRequestVideoMergeRequest extends TeaModel {
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        @NameInMap("LayoutStyles")
        public java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles> layoutStyles;

        @NameInMap("VideoList")
        public java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestVideoList> videoList;

        @NameInMap("Watermark")
        public CreateVideoMergeTaskRequestVideoMergeRequestWatermark watermark;

        public static CreateVideoMergeTaskRequestVideoMergeRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoMergeTaskRequestVideoMergeRequest self = new CreateVideoMergeTaskRequestVideoMergeRequest();
            return TeaModel.build(map, self);
        }

        public CreateVideoMergeTaskRequestVideoMergeRequest setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequest setLayoutStyles(java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles> layoutStyles) {
            this.layoutStyles = layoutStyles;
            return this;
        }
        public java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles> getLayoutStyles() {
            return this.layoutStyles;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequest setVideoList(java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestVideoList> videoList) {
            this.videoList = videoList;
            return this;
        }
        public java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestVideoList> getVideoList() {
            return this.videoList;
        }

        public CreateVideoMergeTaskRequestVideoMergeRequest setWatermark(CreateVideoMergeTaskRequestVideoMergeRequestWatermark watermark) {
            this.watermark = watermark;
            return this;
        }
        public CreateVideoMergeTaskRequestVideoMergeRequestWatermark getWatermark() {
            return this.watermark;
        }

    }

}
