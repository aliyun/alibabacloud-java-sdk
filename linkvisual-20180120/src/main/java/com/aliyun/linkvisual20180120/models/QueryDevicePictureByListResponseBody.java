// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureByListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDevicePictureByListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDevicePictureByListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureByListResponseBody self = new QueryDevicePictureByListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureByListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDevicePictureByListResponseBody setData(QueryDevicePictureByListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDevicePictureByListResponseBodyData getData() {
        return this.data;
    }

    public QueryDevicePictureByListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDevicePictureByListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDevicePictureByListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDevicePictureByListResponseBodyDataPicData extends TeaModel {
        @NameInMap("IotId")
        public String iotId;

        @NameInMap("PicCreateTime")
        public Long picCreateTime;

        @NameInMap("PicId")
        public String picId;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("ThumbUrl")
        public String thumbUrl;

        public static QueryDevicePictureByListResponseBodyDataPicData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePictureByListResponseBodyDataPicData self = new QueryDevicePictureByListResponseBodyDataPicData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePictureByListResponseBodyDataPicData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDevicePictureByListResponseBodyDataPicData setPicCreateTime(Long picCreateTime) {
            this.picCreateTime = picCreateTime;
            return this;
        }
        public Long getPicCreateTime() {
            return this.picCreateTime;
        }

        public QueryDevicePictureByListResponseBodyDataPicData setPicId(String picId) {
            this.picId = picId;
            return this;
        }
        public String getPicId() {
            return this.picId;
        }

        public QueryDevicePictureByListResponseBodyDataPicData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryDevicePictureByListResponseBodyDataPicData setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }
        public String getThumbUrl() {
            return this.thumbUrl;
        }

    }

    public static class QueryDevicePictureByListResponseBodyData extends TeaModel {
        @NameInMap("picData")
        public java.util.List<QueryDevicePictureByListResponseBodyDataPicData> picData;

        public static QueryDevicePictureByListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDevicePictureByListResponseBodyData self = new QueryDevicePictureByListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDevicePictureByListResponseBodyData setPicData(java.util.List<QueryDevicePictureByListResponseBodyDataPicData> picData) {
            this.picData = picData;
            return this;
        }
        public java.util.List<QueryDevicePictureByListResponseBodyDataPicData> getPicData() {
            return this.picData;
        }

    }

}
