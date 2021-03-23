// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetDeviceAppUpdateFunnelEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EventList")
    public java.util.List<GetDeviceAppUpdateFunnelEventsResponseBodyEventList> eventList;

    public static GetDeviceAppUpdateFunnelEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceAppUpdateFunnelEventsResponseBody self = new GetDeviceAppUpdateFunnelEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceAppUpdateFunnelEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceAppUpdateFunnelEventsResponseBody setEventList(java.util.List<GetDeviceAppUpdateFunnelEventsResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<GetDeviceAppUpdateFunnelEventsResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public static class GetDeviceAppUpdateFunnelEventsResponseBodyEventList extends TeaModel {
        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("TargetVersionCode")
        public String targetVersionCode;

        @NameInMap("Event")
        public String event;

        @NameInMap("ReportTime")
        public String reportTime;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("ReportTimestamp")
        public Long reportTimestamp;

        public static GetDeviceAppUpdateFunnelEventsResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceAppUpdateFunnelEventsResponseBodyEventList self = new GetDeviceAppUpdateFunnelEventsResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public GetDeviceAppUpdateFunnelEventsResponseBodyEventList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDeviceAppUpdateFunnelEventsResponseBodyEventList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDeviceAppUpdateFunnelEventsResponseBodyEventList setTargetVersionCode(String targetVersionCode) {
            this.targetVersionCode = targetVersionCode;
            return this;
        }
        public String getTargetVersionCode() {
            return this.targetVersionCode;
        }

        public GetDeviceAppUpdateFunnelEventsResponseBodyEventList setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetDeviceAppUpdateFunnelEventsResponseBodyEventList setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public GetDeviceAppUpdateFunnelEventsResponseBodyEventList setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public GetDeviceAppUpdateFunnelEventsResponseBodyEventList setReportTimestamp(Long reportTimestamp) {
            this.reportTimestamp = reportTimestamp;
            return this;
        }
        public Long getReportTimestamp() {
            return this.reportTimestamp;
        }

    }

}
