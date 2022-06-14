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
        // 当前布局中，包含的合并视频名称，与输入视频名称对应
        @NameInMap("FileName")
        public String fileName;

        // 当前布局中，此文件视频画面输出高度
        @NameInMap("Height")
        public Long height;

        // 相对于视频左上点，x轴距离
        @NameInMap("PositionX")
        public Long positionX;

        // 相对于左上点，y轴距离
        @NameInMap("PositionY")
        public Long positionY;

        // 当前布局中，此文件视频画面输出宽
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
        // 输出视频高度，同一个合并任务不管展现多少画面，高度要一致
        @NameInMap("Height")
        public Long height;

        // 视频画面个数
        @NameInMap("InputNum")
        public Long inputNum;

        // 视频画面设置，如果inputNum为2，表示当前布局为2个画面，视频画面数组元素为每个画面的布局，以及对应合并视频文件名
        @NameInMap("VideoStyles")
        public java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestLayoutStylesVideoStyles> videoStyles;

        // 输出视频宽度，同一个合并任务不管展现多少画面，宽度要一致
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
        // 视频结束时间，单位s(秒)，如果视频不需要裁剪，为视频结束时间，例 ： 120
        @NameInMap("EndTime")
        public Long endTime;

        // 文件名称，同一个任务中，文件名称唯一，例：test1.mp4
        @NameInMap("FileName")
        public String fileName;

        // 文件地址，公网可以访问，无鉴权
        @NameInMap("FileUrl")
        public String fileUrl;

        // 合并到主视频时间，单位s(秒)，例如 5，说明在主视频 到第5秒开始并入
        @NameInMap("MergeBeginTime")
        public Long mergeBeginTime;

        // 合并到主视频结束时间，单位s(秒)，例如 15，说明在主视频 到第15秒结束并入，总的合并时间要小于等于视频长度，并入视频都是从非主视频0秒开始
        @NameInMap("MergeEndTime")
        public Long mergeEndTime;

        // 是否主视频，主视频为合并视频时间轴基准
        @NameInMap("PrimeVideo")
        public Boolean primeVideo;

        // 视频结束时间，单位s(秒)，如果视频不需要裁剪，为视频开始时间，设置0例 ： 0
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
        // 字体颜色
        @NameInMap("FontColor")
        public String fontColor;

        // 字体大小
        @NameInMap("FontSize")
        public Long fontSize;

        // 位置x轴，相对于左上
        @NameInMap("PositionX")
        public Long positionX;

        // 位置y轴，相对于左上
        @NameInMap("PositionY")
        public Long positionY;

        // 水印文本
        @NameInMap("Text")
        public String text;

        // 水印时间戳，10位，精度到秒
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
        // 回调地址，http或https，通知合成任务事件，请求方提供post接口回调，响应时间2s之内。例：
        //  @PostMapping("/task/callback")
        //     public JSONObject callback(@RequestBody JSONObject request){
        //         log.info(request.toJSONString());
        //         request.put("code",200);
        //         //异步处理回调信息，无返回
        //         //todo dealRequest(request)
        //         return request;
        // 
        //     }。
        // 回调请求体：
        // {
        //     "code": 1004,
        //     "message": "success",
        //     "taskId": "xxxxxxxxx",//任务id
        //     "fileUrl":"https://xxxx" // 合并文件返回地址，只有 code 1004 返回
        //     
        // }
        // 
        // 1001, "任务处理开始",
        // 1002, "文件合成完毕",
        // 1003, "文件上传完毕",
        // 1004, "任务处理结束",
        // -1005, "合并文件上传异常",
        // -1006, "任务处理异常"
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        // 布局参数，整个合并过程中，同时出现最多画面个数，就是需要设置的布局个数，比如同时最多出现合并的5个视频画面，最少出现一个视频画面，不会出现2个画面情况，就需要 从1，3，4，5个画面的布局。需要根据各个视频开始结束时间，以及合并主视频时间，计算动态画面个数
        @NameInMap("LayoutStyles")
        public java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestLayoutStyles> layoutStyles;

        // 待合并视频列表，一次不要超过10个
        @NameInMap("VideoList")
        public java.util.List<CreateVideoMergeTaskRequestVideoMergeRequestVideoList> videoList;

        // 水印设置
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
