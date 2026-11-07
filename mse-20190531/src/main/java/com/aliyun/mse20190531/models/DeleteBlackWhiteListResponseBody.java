// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteBlackWhiteListResponseBody extends TeaModel {
    /**
     * <p>The response code, which is used only to indicate whether the request is successful, similar to the Success parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public DeleteBlackWhiteListResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteBlackWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackWhiteListResponseBody self = new DeleteBlackWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBlackWhiteListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteBlackWhiteListResponseBody setData(DeleteBlackWhiteListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteBlackWhiteListResponseBodyData getData() {
        return this.data;
    }

    public DeleteBlackWhiteListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteBlackWhiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteBlackWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteBlackWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteBlackWhiteListResponseBodyData extends TeaModel {
        /**
         * <p>The configuration content.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>430</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-9cdcf8e4f58144059e73ff4c5ef9****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-10 20:22:34</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-10 20:22:34</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the blacklists and whitelists entry.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the entry is a whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsWhite")
        public Boolean isWhite;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        /**
         * <p>The granularity at which the blacklist or whitelist takes effect. Valid values:</p>
         * <ul>
         * <li><p>GATEWAY: gateway-wide</p>
         * </li>
         * <li><p>DOMAIN: domain name</p>
         * </li>
         * <li><p>ROUTE: route</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GATEWAY</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The enabling status. Valid values:</p>
         * <ul>
         * <li><p>0: disabled</p>
         * </li>
         * <li><p>1: enabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Boolean status;

        /**
         * <p>Deprecated. A fixed value.</p>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
         */
        @NameInMap("Type")
        public String type;

        public static DeleteBlackWhiteListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteBlackWhiteListResponseBodyData self = new DeleteBlackWhiteListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteBlackWhiteListResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DeleteBlackWhiteListResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public DeleteBlackWhiteListResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public DeleteBlackWhiteListResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteBlackWhiteListResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DeleteBlackWhiteListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DeleteBlackWhiteListResponseBodyData setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public DeleteBlackWhiteListResponseBodyData setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public DeleteBlackWhiteListResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DeleteBlackWhiteListResponseBodyData setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public DeleteBlackWhiteListResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
