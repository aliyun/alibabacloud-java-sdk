// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetBlackWhiteListResponseBody extends TeaModel {
    // The status code returned. A value of 200 indicates that the request is successful.
    @NameInMap("Code")
    public Integer code;

    // The details of the data.
    @NameInMap("Data")
    public GetBlackWhiteListResponseBodyData data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // - `true`: The request is successful. 
    // - `false`: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static GetBlackWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBlackWhiteListResponseBody self = new GetBlackWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBlackWhiteListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBlackWhiteListResponseBody setData(GetBlackWhiteListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBlackWhiteListResponseBodyData getData() {
        return this.data;
    }

    public GetBlackWhiteListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBlackWhiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBlackWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBlackWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBlackWhiteListResponseBodyData extends TeaModel {
        // The content of the blacklist.
        @NameInMap("Content")
        public String content;

        // The ID of the gateway.
        @NameInMap("GatewayId")
        public Long gatewayId;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        // The time when the blacklist or whitelist was created.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The time when the blacklist or whitelist was last modified.
        @NameInMap("GmtModified")
        public String gmtModified;

        // ID.
        @NameInMap("Id")
        public Long id;

        // Indicates whether the whitelist is queried.
        @NameInMap("IsWhite")
        public Boolean isWhite;

        // The ID of the resource.
        @NameInMap("ResourceId")
        public Long resourceId;

        // The type of the resource.
        @NameInMap("ResourceType")
        public String resourceType;

        // The status of the blacklist or whitelist.
        @NameInMap("Status")
        public String status;

        // The type of the blacklist or whitelist.
        @NameInMap("Type")
        public String type;

        public static GetBlackWhiteListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBlackWhiteListResponseBodyData self = new GetBlackWhiteListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBlackWhiteListResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetBlackWhiteListResponseBodyData setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetBlackWhiteListResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetBlackWhiteListResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBlackWhiteListResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBlackWhiteListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBlackWhiteListResponseBodyData setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public GetBlackWhiteListResponseBodyData setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public GetBlackWhiteListResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetBlackWhiteListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBlackWhiteListResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
