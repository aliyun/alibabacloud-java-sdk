// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsRequest extends TeaModel {
    @NameInMap("OperationCode")
    public String operationCode;

    @NameInMap("OperationParams")
    public String operationParams;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityEvent")
    public java.util.List<HandleSecurityEventsRequestSecurityEvent> securityEvent;

    public static HandleSecurityEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleSecurityEventsRequest self = new HandleSecurityEventsRequest();
        return TeaModel.build(map, self);
    }

    public HandleSecurityEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

    public HandleSecurityEventsRequest setOperationParams(String operationParams) {
        this.operationParams = operationParams;
        return this;
    }
    public String getOperationParams() {
        return this.operationParams;
    }

    public HandleSecurityEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public HandleSecurityEventsRequest setSecurityEvent(java.util.List<HandleSecurityEventsRequestSecurityEvent> securityEvent) {
        this.securityEvent = securityEvent;
        return this;
    }
    public java.util.List<HandleSecurityEventsRequestSecurityEvent> getSecurityEvent() {
        return this.securityEvent;
    }

    public static class HandleSecurityEventsRequestSecurityEvent extends TeaModel {
        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("SecurityEventId")
        public String securityEventId;

        public static HandleSecurityEventsRequestSecurityEvent build(java.util.Map<String, ?> map) throws Exception {
            HandleSecurityEventsRequestSecurityEvent self = new HandleSecurityEventsRequestSecurityEvent();
            return TeaModel.build(map, self);
        }

        public HandleSecurityEventsRequestSecurityEvent setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public HandleSecurityEventsRequestSecurityEvent setSecurityEventId(String securityEventId) {
            this.securityEventId = securityEventId;
            return this;
        }
        public String getSecurityEventId() {
            return this.securityEventId;
        }

    }

}
