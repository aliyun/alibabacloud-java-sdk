// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public QueryDevicePictureFileResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePictureFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureFileResponseBody self = new QueryDevicePictureFileResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePictureFileResponseBody setData(QueryDevicePictureFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePictureFileResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePictureFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePictureFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePictureFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePictureFileResponseBodyData extends TeaModel {
        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("PicCreateTime")
        public Long picCreateTime;

        @NameInMap("PicId")
        public String picId;

        @NameInMap("ThumbUrl")
        public String thumbUrl;

        @NameInMap("IotId")
        public String iotId;

        public static QueryDevicePictureFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePictureFileResponseBodyData self = new QueryDevicePictureFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePictureFileResponseBodyData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryDevicePictureFileResponseBodyData setPicCreateTime(Long picCreateTime) {
            this.picCreateTime = picCreateTime;
            return this;
        }
        public Long getPicCreateTime() {
            return this.picCreateTime;
        }

        public QueryDevicePictureFileResponseBodyData setPicId(String picId) {
            this.picId = picId;
            return this;
        }
        public String getPicId() {
            return this.picId;
        }

        public QueryDevicePictureFileResponseBodyData setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }
        public String getThumbUrl() {
            return this.thumbUrl;
        }

        public QueryDevicePictureFileResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
