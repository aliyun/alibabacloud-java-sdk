// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceTunnelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateDeviceTunnelResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDeviceTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceTunnelResponseBody self = new CreateDeviceTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeviceTunnelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDeviceTunnelResponseBody setData(CreateDeviceTunnelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDeviceTunnelResponseBodyData getData() {
        return this.data;
    }

    public CreateDeviceTunnelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDeviceTunnelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeviceTunnelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDeviceTunnelResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>521c43e4-a6da-***</p>
         */
        @NameInMap("SourceAccessToken")
        public String sourceAccessToken;

        @NameInMap("SourceURI")
        public String sourceURI;

        /**
         * <strong>example:</strong>
         * <p>d4098041-***</p>
         */
        @NameInMap("TunnelId")
        public String tunnelId;

        public static CreateDeviceTunnelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDeviceTunnelResponseBodyData self = new CreateDeviceTunnelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDeviceTunnelResponseBodyData setSourceAccessToken(String sourceAccessToken) {
            this.sourceAccessToken = sourceAccessToken;
            return this;
        }
        public String getSourceAccessToken() {
            return this.sourceAccessToken;
        }

        public CreateDeviceTunnelResponseBodyData setSourceURI(String sourceURI) {
            this.sourceURI = sourceURI;
            return this;
        }
        public String getSourceURI() {
            return this.sourceURI;
        }

        public CreateDeviceTunnelResponseBodyData setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

    }

}
