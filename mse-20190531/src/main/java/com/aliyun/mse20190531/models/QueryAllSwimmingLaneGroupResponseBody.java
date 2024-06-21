// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryAllSwimmingLaneGroupResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     * 
     * <strong>example:</strong>
     * <p>[{id:100,name:&quot;test&quot;}]</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryAllSwimmingLaneGroupResponseBodyData> data;

    /**
     * <p>The dynamic part in the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request is successful, a success message is returned.</li>
     * <li>If the request fails, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The request was successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>54973C90-F379-4372-9AA5-053A3F7****</p>
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

    public static QueryAllSwimmingLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAllSwimmingLaneGroupResponseBody self = new QueryAllSwimmingLaneGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAllSwimmingLaneGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAllSwimmingLaneGroupResponseBody setData(java.util.List<QueryAllSwimmingLaneGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAllSwimmingLaneGroupResponseBodyData> getData() {
        return this.data;
    }

    public QueryAllSwimmingLaneGroupResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryAllSwimmingLaneGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryAllSwimmingLaneGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryAllSwimmingLaneGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAllSwimmingLaneGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllSwimmingLaneGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAllSwimmingLaneGroupResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abcde@abcde,abcde@abcde</p>
         */
        @NameInMap("AppIds")
        public String appIds;

        @NameInMap("CanaryModel")
        public Integer canaryModel;

        /**
         * <strong>example:</strong>
         * <p>mse:abcde@abcde</p>
         */
        @NameInMap("EntryApp")
        public String entryApp;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>Client</p>
         */
        @NameInMap("MessageQueueFilterSide")
        public String messageQueueFilterSide;

        @NameInMap("MessageQueueGrayEnable")
        public Boolean messageQueueGrayEnable;

        /**
         * <strong>example:</strong>
         * <p>swimmingGroup</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Paths")
        public String paths;

        @NameInMap("RecordCanaryDetail")
        public Boolean recordCanaryDetail;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryAllSwimmingLaneGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAllSwimmingLaneGroupResponseBodyData self = new QueryAllSwimmingLaneGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setAppIds(String appIds) {
            this.appIds = appIds;
            return this;
        }
        public String getAppIds() {
            return this.appIds;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setCanaryModel(Integer canaryModel) {
            this.canaryModel = canaryModel;
            return this;
        }
        public Integer getCanaryModel() {
            return this.canaryModel;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setEntryApp(String entryApp) {
            this.entryApp = entryApp;
            return this;
        }
        public String getEntryApp() {
            return this.entryApp;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setMessageQueueFilterSide(String messageQueueFilterSide) {
            this.messageQueueFilterSide = messageQueueFilterSide;
            return this;
        }
        public String getMessageQueueFilterSide() {
            return this.messageQueueFilterSide;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setMessageQueueGrayEnable(Boolean messageQueueGrayEnable) {
            this.messageQueueGrayEnable = messageQueueGrayEnable;
            return this;
        }
        public Boolean getMessageQueueGrayEnable() {
            return this.messageQueueGrayEnable;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setPaths(String paths) {
            this.paths = paths;
            return this;
        }
        public String getPaths() {
            return this.paths;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setRecordCanaryDetail(Boolean recordCanaryDetail) {
            this.recordCanaryDetail = recordCanaryDetail;
            return this;
        }
        public Boolean getRecordCanaryDetail() {
            return this.recordCanaryDetail;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryAllSwimmingLaneGroupResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
