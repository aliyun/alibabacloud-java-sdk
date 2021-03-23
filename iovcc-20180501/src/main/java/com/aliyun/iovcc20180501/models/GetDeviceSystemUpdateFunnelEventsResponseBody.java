// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetDeviceSystemUpdateFunnelEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EventList")
    public java.util.List<GetDeviceSystemUpdateFunnelEventsResponseBodyEventList> eventList;

    public static GetDeviceSystemUpdateFunnelEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceSystemUpdateFunnelEventsResponseBody self = new GetDeviceSystemUpdateFunnelEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceSystemUpdateFunnelEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceSystemUpdateFunnelEventsResponseBody setEventList(java.util.List<GetDeviceSystemUpdateFunnelEventsResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<GetDeviceSystemUpdateFunnelEventsResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public static class GetDeviceSystemUpdateFunnelEventsResponseBodyEventList extends TeaModel {
        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("TargetVersion")
        public String targetVersion;

        @NameInMap("Event")
        public String event;

        @NameInMap("ReportTime")
        public String reportTime;

        @NameInMap("ReportTimestamp")
        public Long reportTimestamp;

        public static GetDeviceSystemUpdateFunnelEventsResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceSystemUpdateFunnelEventsResponseBodyEventList self = new GetDeviceSystemUpdateFunnelEventsResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public GetDeviceSystemUpdateFunnelEventsResponseBodyEventList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDeviceSystemUpdateFunnelEventsResponseBodyEventList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDeviceSystemUpdateFunnelEventsResponseBodyEventList setTargetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }
        public String getTargetVersion() {
            return this.targetVersion;
        }

        public GetDeviceSystemUpdateFunnelEventsResponseBodyEventList setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetDeviceSystemUpdateFunnelEventsResponseBodyEventList setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public GetDeviceSystemUpdateFunnelEventsResponseBodyEventList setReportTimestamp(Long reportTimestamp) {
            this.reportTimestamp = reportTimestamp;
            return this;
        }
        public Long getReportTimestamp() {
            return this.reportTimestamp;
        }

    }

}
