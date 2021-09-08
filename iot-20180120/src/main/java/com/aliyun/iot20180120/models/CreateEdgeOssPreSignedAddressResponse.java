// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeOssPreSignedAddressResponse extends TeaModel {
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
    public CreateEdgeOssPreSignedAddressResponseData data;

    public static CreateEdgeOssPreSignedAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeOssPreSignedAddressResponse self = new CreateEdgeOssPreSignedAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeOssPreSignedAddressResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEdgeOssPreSignedAddressResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateEdgeOssPreSignedAddressResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEdgeOssPreSignedAddressResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateEdgeOssPreSignedAddressResponse setData(CreateEdgeOssPreSignedAddressResponseData data) {
        this.data = data;
        return this;
    }
    public CreateEdgeOssPreSignedAddressResponseData getData() {
        return this.data;
    }

    public static class CreateEdgeOssPreSignedAddressResponseData extends TeaModel {
        @NameInMap("OssPreSignedAddress")
        @Validation(required = true)
        public String ossPreSignedAddress;

        @NameInMap("OssAddress")
        @Validation(required = true)
        public String ossAddress;

        public static CreateEdgeOssPreSignedAddressResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateEdgeOssPreSignedAddressResponseData self = new CreateEdgeOssPreSignedAddressResponseData();
            return TeaModel.build(map, self);
        }

        public CreateEdgeOssPreSignedAddressResponseData setOssPreSignedAddress(String ossPreSignedAddress) {
            this.ossPreSignedAddress = ossPreSignedAddress;
            return this;
        }
        public String getOssPreSignedAddress() {
            return this.ossPreSignedAddress;
        }

        public CreateEdgeOssPreSignedAddressResponseData setOssAddress(String ossAddress) {
            this.ossAddress = ossAddress;
            return this;
        }
        public String getOssAddress() {
            return this.ossAddress;
        }

    }

}
