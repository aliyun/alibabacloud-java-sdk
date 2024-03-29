// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteAuthResourceResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DeleteAuthResourceResponseBodyData data;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAuthResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthResourceResponseBody self = new DeleteAuthResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAuthResourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteAuthResourceResponseBody setData(DeleteAuthResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAuthResourceResponseBodyData getData() {
        return this.data;
    }

    public DeleteAuthResourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteAuthResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAuthResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAuthResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteAuthResourceResponseBodyData extends TeaModel {
        /**
         * <p>The authentication ID.</p>
         */
        @NameInMap("AuthId")
        public Long authId;

        /**
         * <p>The ID of the domain name.</p>
         */
        @NameInMap("DomainId")
        public Long domainId;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the gateway.</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the primary key.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the whitelist mode is enabled.</p>
         */
        @NameInMap("IsWhite")
        public Boolean isWhite;

        /**
         * <p>The path.</p>
         */
        @NameInMap("Path")
        public String path;

        public static DeleteAuthResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAuthResourceResponseBodyData self = new DeleteAuthResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAuthResourceResponseBodyData setAuthId(Long authId) {
            this.authId = authId;
            return this;
        }
        public Long getAuthId() {
            return this.authId;
        }

        public DeleteAuthResourceResponseBodyData setDomainId(Long domainId) {
            this.domainId = domainId;
            return this;
        }
        public Long getDomainId() {
            return this.domainId;
        }

        public DeleteAuthResourceResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DeleteAuthResourceResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public DeleteAuthResourceResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public DeleteAuthResourceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteAuthResourceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteAuthResourceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteAuthResourceResponseBodyData setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public DeleteAuthResourceResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
