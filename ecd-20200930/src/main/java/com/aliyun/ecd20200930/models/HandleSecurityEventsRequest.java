// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class HandleSecurityEventsRequest extends TeaModel {
    /**
     * <p>The operation to handle multiple alerts of the same type at a time.</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    /**
     * <p>The return value from the operation to handle multiple alerts of the same type at a time.\</p>
     * <p>This parameter is required only if you set the OperationCode parameter to `kill_and_quara` or `block_ip`. This parameter is not required if you set the OperationCode parameter to other values.</p>
     */
    @NameInMap("OperationParams")
    public String operationParams;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The alerts.</p>
     */
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
        /**
         * <p>The ID of the cloud desktop.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The ID of the alert.</p>
         */
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
