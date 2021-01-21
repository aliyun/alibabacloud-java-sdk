// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureInfoWithVectorIdsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<GetPictureInfoWithVectorIdsResponseData> data;

    public static GetPictureInfoWithVectorIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPictureInfoWithVectorIdsResponse self = new GetPictureInfoWithVectorIdsResponse();
        return TeaModel.build(map, self);
    }

    public GetPictureInfoWithVectorIdsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPictureInfoWithVectorIdsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPictureInfoWithVectorIdsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPictureInfoWithVectorIdsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPictureInfoWithVectorIdsResponse setData(java.util.List<GetPictureInfoWithVectorIdsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPictureInfoWithVectorIdsResponseData> getData() {
        return this.data;
    }

    public static class GetPictureInfoWithVectorIdsResponseData extends TeaModel {
        @NameInMap("PicUrl")
        @Validation(required = true)
        public String picUrl;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("GatewayIotId")
        @Validation(required = true)
        public String gatewayIotId;

        public static GetPictureInfoWithVectorIdsResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetPictureInfoWithVectorIdsResponseData self = new GetPictureInfoWithVectorIdsResponseData();
            return TeaModel.build(map, self);
        }

        public GetPictureInfoWithVectorIdsResponseData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public GetPictureInfoWithVectorIdsResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetPictureInfoWithVectorIdsResponseData setGatewayIotId(String gatewayIotId) {
            this.gatewayIotId = gatewayIotId;
            return this;
        }
        public String getGatewayIotId() {
            return this.gatewayIotId;
        }

    }

}
