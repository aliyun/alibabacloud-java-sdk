// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureInfoWithVectorIdsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetPictureInfoWithVectorIdsResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetPictureInfoWithVectorIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPictureInfoWithVectorIdsResponseBody self = new GetPictureInfoWithVectorIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPictureInfoWithVectorIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPictureInfoWithVectorIdsResponseBody setData(java.util.List<GetPictureInfoWithVectorIdsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPictureInfoWithVectorIdsResponseBodyData> getData() {
        return this.data;
    }

    public GetPictureInfoWithVectorIdsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPictureInfoWithVectorIdsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPictureInfoWithVectorIdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPictureInfoWithVectorIdsResponseBodyData extends TeaModel {
        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("GatewayIotId")
        public String gatewayIotId;

        @NameInMap("IotId")
        public String iotId;

        public static GetPictureInfoWithVectorIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPictureInfoWithVectorIdsResponseBodyData self = new GetPictureInfoWithVectorIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPictureInfoWithVectorIdsResponseBodyData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public GetPictureInfoWithVectorIdsResponseBodyData setGatewayIotId(String gatewayIotId) {
            this.gatewayIotId = gatewayIotId;
            return this;
        }
        public String getGatewayIotId() {
            return this.gatewayIotId;
        }

        public GetPictureInfoWithVectorIdsResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
