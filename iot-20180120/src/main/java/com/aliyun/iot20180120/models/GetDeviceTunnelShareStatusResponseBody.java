// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceTunnelShareStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDeviceTunnelShareStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>request parameter error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ACC1D51C-1A58-440E-92A7-71AB61C6595A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDeviceTunnelShareStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceTunnelShareStatusResponseBody self = new GetDeviceTunnelShareStatusResponseBody();
        return TeaModel.build(map, self);
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

    public GetDeviceTunnelShareStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class GetDeviceTunnelShareStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1617941371000</p>
         */
        @NameInMap("GmtOpened")
        public Long gmtOpened;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsOpen")
        public Boolean isOpen;

        /**
         * <strong>example:</strong>
         * <p>848bbfa0e9a31e579502869920b4d4c********</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>18f72f95cad34ca3aeabeeefcb******</p>
         */
        @NameInMap("ShareId")
        public String shareId;

        public static GetDeviceTunnelShareStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceTunnelShareStatusResponseBodyData self = new GetDeviceTunnelShareStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceTunnelShareStatusResponseBodyData setGmtOpened(Long gmtOpened) {
            this.gmtOpened = gmtOpened;
            return this;
        }
        public Long getGmtOpened() {
            return this.gmtOpened;
        }

        public GetDeviceTunnelShareStatusResponseBodyData setIsOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }
        public Boolean getIsOpen() {
            return this.isOpen;
        }

        public GetDeviceTunnelShareStatusResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetDeviceTunnelShareStatusResponseBodyData setShareId(String shareId) {
            this.shareId = shareId;
            return this;
        }
        public String getShareId() {
            return this.shareId;
        }

    }

}
