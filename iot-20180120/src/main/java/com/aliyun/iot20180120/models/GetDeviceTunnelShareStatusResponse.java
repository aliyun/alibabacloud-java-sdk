// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceTunnelShareStatusResponse extends TeaModel {
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
    public GetDeviceTunnelShareStatusResponseData data;

    public static GetDeviceTunnelShareStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceTunnelShareStatusResponse self = new GetDeviceTunnelShareStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceTunnelShareStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceTunnelShareStatusResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDeviceTunnelShareStatusResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeviceTunnelShareStatusResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceTunnelShareStatusResponse setData(GetDeviceTunnelShareStatusResponseData data) {
        this.data = data;
        return this;
    }
    public GetDeviceTunnelShareStatusResponseData getData() {
        return this.data;
    }

    public static class GetDeviceTunnelShareStatusResponseData extends TeaModel {
        @NameInMap("ShareId")
        @Validation(required = true)
        public String shareId;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        @NameInMap("IsOpen")
        @Validation(required = true)
        public Boolean isOpen;

        @NameInMap("GmtOpened")
        @Validation(required = true)
        public Long gmtOpened;

        public static GetDeviceTunnelShareStatusResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceTunnelShareStatusResponseData self = new GetDeviceTunnelShareStatusResponseData();
            return TeaModel.build(map, self);
        }

        public GetDeviceTunnelShareStatusResponseData setShareId(String shareId) {
            this.shareId = shareId;
            return this;
        }
        public String getShareId() {
            return this.shareId;
        }

        public GetDeviceTunnelShareStatusResponseData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetDeviceTunnelShareStatusResponseData setIsOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        public GetDeviceTunnelShareStatusResponseData setGmtOpened(Long gmtOpened) {
            this.gmtOpened = gmtOpened;
            return this;
        }
        public Long getGmtOpened() {
            return this.gmtOpened;
        }

    }

}
