// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupResponseBody extends TeaModel {
    /**
     * <p>The name of the MSE namespace.</p>
     */
    @NameInMap("Data")
    public CreateOrUpdateSwimmingLaneGroupResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

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
     * <p>true: The request was successful. false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOrUpdateSwimmingLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneGroupResponseBody self = new CreateOrUpdateSwimmingLaneGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setData(CreateOrUpdateSwimmingLaneGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOrUpdateSwimmingLaneGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOrUpdateSwimmingLaneGroupResponseBodyData extends TeaModel {
        @NameInMap("AppIds")
        public String appIds;

        @NameInMap("DbGrayEnable")
        public String dbGrayEnable;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("EntryApp")
        public String entryApp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MessageQueueFilterSide")
        public String messageQueueFilterSide;

        @NameInMap("MessageQueueGrayEnable")
        public Boolean messageQueueGrayEnable;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("RecordCanaryDetail")
        public Boolean recordCanaryDetail;

        @NameInMap("Region")
        public String region;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UserId")
        public String userId;

        public static CreateOrUpdateSwimmingLaneGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneGroupResponseBodyData self = new CreateOrUpdateSwimmingLaneGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setAppIds(String appIds) {
            this.appIds = appIds;
            return this;
        }
        public String getAppIds() {
            return this.appIds;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setDbGrayEnable(String dbGrayEnable) {
            this.dbGrayEnable = dbGrayEnable;
            return this;
        }
        public String getDbGrayEnable() {
            return this.dbGrayEnable;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setEntryApp(String entryApp) {
            this.entryApp = entryApp;
            return this;
        }
        public String getEntryApp() {
            return this.entryApp;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setMessageQueueFilterSide(String messageQueueFilterSide) {
            this.messageQueueFilterSide = messageQueueFilterSide;
            return this;
        }
        public String getMessageQueueFilterSide() {
            return this.messageQueueFilterSide;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setMessageQueueGrayEnable(Boolean messageQueueGrayEnable) {
            this.messageQueueGrayEnable = messageQueueGrayEnable;
            return this;
        }
        public Boolean getMessageQueueGrayEnable() {
            return this.messageQueueGrayEnable;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setRecordCanaryDetail(Boolean recordCanaryDetail) {
            this.recordCanaryDetail = recordCanaryDetail;
            return this;
        }
        public Boolean getRecordCanaryDetail() {
            return this.recordCanaryDetail;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
