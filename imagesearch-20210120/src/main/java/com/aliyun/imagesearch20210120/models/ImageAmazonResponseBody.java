// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageAmazonResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImageAmazonResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ImageAmazonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageAmazonResponseBody self = new ImageAmazonResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageAmazonResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImageAmazonResponseBody setData(ImageAmazonResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageAmazonResponseBodyData getData() {
        return this.data;
    }

    public ImageAmazonResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageAmazonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageAmazonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageAmazonResponseBodyData extends TeaModel {
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static ImageAmazonResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageAmazonResponseBodyData self = new ImageAmazonResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageAmazonResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
