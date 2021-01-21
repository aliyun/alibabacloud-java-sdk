// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDevicePictureFileResponseData data;

    public static QueryDevicePictureFileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureFileResponse self = new QueryDevicePictureFileResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureFileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePictureFileResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDevicePictureFileResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePictureFileResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePictureFileResponse setData(QueryDevicePictureFileResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePictureFileResponseData getData() {
        return this.data;
    }

    public static class QueryDevicePictureFileResponseData extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("PicCreateTime")
        @Validation(required = true)
        public Long picCreateTime;

        @NameInMap("PicId")
        @Validation(required = true)
        public String picId;

        @NameInMap("PicUrl")
        @Validation(required = true)
        public String picUrl;

        @NameInMap("ThumbUrl")
        @Validation(required = true)
        public String thumbUrl;

        public static QueryDevicePictureFileResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePictureFileResponseData self = new QueryDevicePictureFileResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePictureFileResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDevicePictureFileResponseData setPicCreateTime(Long picCreateTime) {
            this.picCreateTime = picCreateTime;
            return this;
        }
        public Long getPicCreateTime() {
            return this.picCreateTime;
        }

        public QueryDevicePictureFileResponseData setPicId(String picId) {
            this.picId = picId;
            return this;
        }
        public String getPicId() {
            return this.picId;
        }

        public QueryDevicePictureFileResponseData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryDevicePictureFileResponseData setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }
        public String getThumbUrl() {
            return this.thumbUrl;
        }

    }

}
