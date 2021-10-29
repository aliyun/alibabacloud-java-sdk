// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageSegmentationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ImageSegmentationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ImageSegmentationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageSegmentationResponseBody self = new ImageSegmentationResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageSegmentationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ImageSegmentationResponseBody setData(ImageSegmentationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageSegmentationResponseBodyData getData() {
        return this.data;
    }

    public ImageSegmentationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageSegmentationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageSegmentationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageSegmentationResponseBodyData extends TeaModel {
        @NameInMap("PicUrl")
        public String picUrl;

        public static ImageSegmentationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageSegmentationResponseBodyData self = new ImageSegmentationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageSegmentationResponseBodyData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

    }

}
