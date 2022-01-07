// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeOssPreSignedAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateEdgeOssPreSignedAddressResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateEdgeOssPreSignedAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeOssPreSignedAddressResponseBody self = new CreateEdgeOssPreSignedAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEdgeOssPreSignedAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEdgeOssPreSignedAddressResponseBody setData(CreateEdgeOssPreSignedAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEdgeOssPreSignedAddressResponseBodyData getData() {
        return this.data;
    }

    public CreateEdgeOssPreSignedAddressResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateEdgeOssPreSignedAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEdgeOssPreSignedAddressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEdgeOssPreSignedAddressResponseBodyData extends TeaModel {
        @NameInMap("OssAddress")
        public String ossAddress;

        @NameInMap("OssPreSignedAddress")
        public String ossPreSignedAddress;

        public static CreateEdgeOssPreSignedAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEdgeOssPreSignedAddressResponseBodyData self = new CreateEdgeOssPreSignedAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEdgeOssPreSignedAddressResponseBodyData setOssAddress(String ossAddress) {
            this.ossAddress = ossAddress;
            return this;
        }
        public String getOssAddress() {
            return this.ossAddress;
        }

        public CreateEdgeOssPreSignedAddressResponseBodyData setOssPreSignedAddress(String ossPreSignedAddress) {
            this.ossPreSignedAddress = ossPreSignedAddress;
            return this;
        }
        public String getOssPreSignedAddress() {
            return this.ossPreSignedAddress;
        }

    }

}
