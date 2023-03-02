// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIntegrationConfigResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetIntegrationConfigResponseBodyData data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetIntegrationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationConfigResponseBody self = new GetIntegrationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegrationConfigResponseBody setData(GetIntegrationConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIntegrationConfigResponseBodyData getData() {
        return this.data;
    }

    public GetIntegrationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIntegrationConfigResponseBodyData extends TeaModel {
        @NameInMap("accessKey")
        public String accessKey;

        @NameInMap("integrationConfigId")
        public Long integrationConfigId;

        @NameInMap("isReceivedEvent")
        public Boolean isReceivedEvent;

        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        @NameInMap("monitorSourceShortName")
        public String monitorSourceShortName;

        @NameInMap("status")
        public String status;

        public static GetIntegrationConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIntegrationConfigResponseBodyData self = new GetIntegrationConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIntegrationConfigResponseBodyData setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetIntegrationConfigResponseBodyData setIntegrationConfigId(Long integrationConfigId) {
            this.integrationConfigId = integrationConfigId;
            return this;
        }
        public Long getIntegrationConfigId() {
            return this.integrationConfigId;
        }

        public GetIntegrationConfigResponseBodyData setIsReceivedEvent(Boolean isReceivedEvent) {
            this.isReceivedEvent = isReceivedEvent;
            return this;
        }
        public Boolean getIsReceivedEvent() {
            return this.isReceivedEvent;
        }

        public GetIntegrationConfigResponseBodyData setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public GetIntegrationConfigResponseBodyData setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public GetIntegrationConfigResponseBodyData setMonitorSourceShortName(String monitorSourceShortName) {
            this.monitorSourceShortName = monitorSourceShortName;
            return this;
        }
        public String getMonitorSourceShortName() {
            return this.monitorSourceShortName;
        }

        public GetIntegrationConfigResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
