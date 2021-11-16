// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListIntegrationConfigsResponseBodyData> data;

    @NameInMap("requestId")
    public String requestId;

    public static ListIntegrationConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationConfigsResponseBody self = new ListIntegrationConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationConfigsResponseBody setData(java.util.List<ListIntegrationConfigsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIntegrationConfigsResponseBodyData> getData() {
        return this.data;
    }

    public ListIntegrationConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIntegrationConfigsResponseBodyData extends TeaModel {
        // 集成配置id
        @NameInMap("integrationConfigId")
        public Long integrationConfigId;

        // 是否已接受报警
        @NameInMap("isReceivedEvent")
        public Boolean isReceivedEvent;

        // 监控源id
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        // 监控源名城
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        // 监控源简称
        @NameInMap("monitorSourceShortName")
        public String monitorSourceShortName;

        // 集成配置状态
        @NameInMap("status")
        public String status;

        public static ListIntegrationConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationConfigsResponseBodyData self = new ListIntegrationConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIntegrationConfigsResponseBodyData setIntegrationConfigId(Long integrationConfigId) {
            this.integrationConfigId = integrationConfigId;
            return this;
        }
        public Long getIntegrationConfigId() {
            return this.integrationConfigId;
        }

        public ListIntegrationConfigsResponseBodyData setIsReceivedEvent(Boolean isReceivedEvent) {
            this.isReceivedEvent = isReceivedEvent;
            return this;
        }
        public Boolean getIsReceivedEvent() {
            return this.isReceivedEvent;
        }

        public ListIntegrationConfigsResponseBodyData setMonitorSourceId(Long monitorSourceId) {
            this.monitorSourceId = monitorSourceId;
            return this;
        }
        public Long getMonitorSourceId() {
            return this.monitorSourceId;
        }

        public ListIntegrationConfigsResponseBodyData setMonitorSourceName(String monitorSourceName) {
            this.monitorSourceName = monitorSourceName;
            return this;
        }
        public String getMonitorSourceName() {
            return this.monitorSourceName;
        }

        public ListIntegrationConfigsResponseBodyData setMonitorSourceShortName(String monitorSourceShortName) {
            this.monitorSourceShortName = monitorSourceShortName;
            return this;
        }
        public String getMonitorSourceShortName() {
            return this.monitorSourceShortName;
        }

        public ListIntegrationConfigsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
