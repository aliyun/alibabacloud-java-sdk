// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigsResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListIntegrationConfigsResponseBodyData> data;

    /**
     * <p>id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1023</p>
         */
        @NameInMap("integrationConfigId")
        public Long integrationConfigId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isReceivedEvent")
        public Boolean isReceivedEvent;

        /**
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("monitorSourceId")
        public Long monitorSourceId;

        /**
         * <strong>example:</strong>
         * <p>Zabbix</p>
         */
        @NameInMap("monitorSourceName")
        public String monitorSourceName;

        /**
         * <strong>example:</strong>
         * <p>Zabbix</p>
         */
        @NameInMap("monitorSourceShortName")
        public String monitorSourceShortName;

        @NameInMap("monitorSourceType")
        public Integer monitorSourceType;

        /**
         * <strong>example:</strong>
         * <p>NOT_INTEGRATED</p>
         */
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

        public ListIntegrationConfigsResponseBodyData setMonitorSourceType(Integer monitorSourceType) {
            this.monitorSourceType = monitorSourceType;
            return this;
        }
        public Integer getMonitorSourceType() {
            return this.monitorSourceType;
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
