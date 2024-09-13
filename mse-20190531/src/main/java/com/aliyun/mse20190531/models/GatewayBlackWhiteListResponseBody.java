// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayBlackWhiteListResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GatewayBlackWhiteListResponseBodyData data;

    /**
     * <p>The placeholder in the dynamic error message. This parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic message. This parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58E06A0A-BD2C-47A0-99C2-B100F353****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GatewayBlackWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GatewayBlackWhiteListResponseBody self = new GatewayBlackWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public GatewayBlackWhiteListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GatewayBlackWhiteListResponseBody setData(GatewayBlackWhiteListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GatewayBlackWhiteListResponseBodyData getData() {
        return this.data;
    }

    public GatewayBlackWhiteListResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GatewayBlackWhiteListResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GatewayBlackWhiteListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GatewayBlackWhiteListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GatewayBlackWhiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GatewayBlackWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GatewayBlackWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GatewayBlackWhiteListResponseBodyDataResult extends TeaModel {
        /**
         * <p>The content of the blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-5017305290e14centbrveca****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The time when the blacklist or whitelist was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-02T02:43:40.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the rule was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-02T02:43:40.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the blacklist and whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>549</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Specifies whether to enable the whitelist feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsWhite")
        public Boolean isWhite;

        /**
         * <p>The name of the blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The comment.</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>549</p>
         */
        @NameInMap("ResourceId")
        public Long resourceId;

        /**
         * <p>The list of resource IDs in the JSON format.</p>
         * <ul>
         * <li>If the value of the ResourceType parameter is ROUTE, the value of this parameter is the list of route IDs.</li>
         * <li>If the value of the ResourceType parameter is DOMAIN, the value of this parameter is the list of domain names.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[234]</p>
         */
        @NameInMap("ResourceIdJsonList")
        public String resourceIdJsonList;

        /**
         * <p>The description of the resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ResourceIdNameJson")
        public String resourceIdNameJson;

        /**
         * <p>The effective scope of the blacklist or whitelist. Valid values:</p>
         * <ul>
         * <li>GATEWAY</li>
         * <li>DOMAIN</li>
         * <li>ROUTE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GATEWAY</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The status of the blacklist or whitelist.</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the blacklist and whitelist. The value is fixed to IP address blacklist and whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
         */
        @NameInMap("Type")
        public String type;

        public static GatewayBlackWhiteListResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GatewayBlackWhiteListResponseBodyDataResult self = new GatewayBlackWhiteListResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GatewayBlackWhiteListResponseBodyDataResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setIsWhite(Boolean isWhite) {
            this.isWhite = isWhite;
            return this;
        }
        public Boolean getIsWhite() {
            return this.isWhite;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setResourceIdJsonList(String resourceIdJsonList) {
            this.resourceIdJsonList = resourceIdJsonList;
            return this;
        }
        public String getResourceIdJsonList() {
            return this.resourceIdJsonList;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setResourceIdNameJson(String resourceIdNameJson) {
            this.resourceIdNameJson = resourceIdNameJson;
            return this;
        }
        public String getResourceIdNameJson() {
            return this.resourceIdNameJson;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GatewayBlackWhiteListResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GatewayBlackWhiteListResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The returned information.</p>
         */
        @NameInMap("Result")
        public java.util.List<GatewayBlackWhiteListResponseBodyDataResult> result;

        /**
         * <p>The total number of instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static GatewayBlackWhiteListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GatewayBlackWhiteListResponseBodyData self = new GatewayBlackWhiteListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GatewayBlackWhiteListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GatewayBlackWhiteListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GatewayBlackWhiteListResponseBodyData setResult(java.util.List<GatewayBlackWhiteListResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GatewayBlackWhiteListResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GatewayBlackWhiteListResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
