// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsRequest extends TeaModel {
    // The operation to handle multiple alerts of the same type at a time. Valid values:
    // 
    // *   deal: quarantines the webshell file of the malicious process.
    // *   kill_and_quara: terminates the malicious process for which the alert is generated and quarantines the source file of the malicious process.
    // *   kill_virus: removes persistent virus by using the deep cleanup method.
    // *   block_ip: blocks access requests from malicious IP addresses.
    // *   ignore: ignores the alerts.
    // *   mark_mis_info: marks the alerts as false positives by adding the alerts to the whitelist.
    // *   rm_mark_mis_info: cancels false positives by removing the alerts from the whitelist.
    // *   offline_handled: marks the alerts as handled.
    @NameInMap("OperationCode")
    public String operationCode;

    // The return value from the operation to handle multiple alerts of the same type at a time.
    // 
    // This parameter is required only if the OperationCode parameter is set to `kill_and_quara` or `block_ip`. This parameter is not required if the OperationCode parameter is set to other values.
    @NameInMap("OperationParams")
    public String operationParams;

    // The ID of the region.
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
        // The ID of the cloud desktop.
        @NameInMap("DesktopId")
        public String desktopId;

        // The ID of the alert.
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
