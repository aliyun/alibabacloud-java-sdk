// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceTunnelShareStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeviceTunnelShareStatusResponseBodyData data;

    public static GetDeviceTunnelShareStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceTunnelShareStatusResponseBody self = new GetDeviceTunnelShareStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceTunnelShareStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceTunnelShareStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDeviceTunnelShareStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeviceTunnelShareStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceTunnelShareStatusResponseBody setData(GetDeviceTunnelShareStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceTunnelShareStatusResponseBodyData getData() {
        return this.data;
    }

    public static class GetDeviceTunnelShareStatusResponseBodyData extends TeaModel {
        @NameInMap("ShareId")
        public String shareId;

        @NameInMap("Password")
        public String password;

        @NameInMap("IsOpen")
        public Boolean isOpen;

        @NameInMap("GmtOpened")
        public Long gmtOpened;

        public static GetDeviceTunnelShareStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceTunnelShareStatusResponseBodyData self = new GetDeviceTunnelShareStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceTunnelShareStatusResponseBodyData setShareId(String shareId) {
            this.shareId = shareId;
            return this;
        }
        public String getShareId() {
            return this.shareId;
        }

        public GetDeviceTunnelShareStatusResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetDeviceTunnelShareStatusResponseBodyData setIsOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        public GetDeviceTunnelShareStatusResponseBodyData setGmtOpened(Long gmtOpened) {
            this.gmtOpened = gmtOpened;
            return this;
        }
        public Long getGmtOpened() {
            return this.gmtOpened;
        }

    }

}
