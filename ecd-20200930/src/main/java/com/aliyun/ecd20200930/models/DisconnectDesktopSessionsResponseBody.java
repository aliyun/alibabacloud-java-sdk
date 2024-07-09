// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DisconnectDesktopSessionsResponseBody extends TeaModel {
    /**
     * <p>The list of invalid sessions.</p>
     */
    @NameInMap("InvalidSessions")
    public java.util.List<DisconnectDesktopSessionsResponseBodyInvalidSessions> invalidSessions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2507CFA8-FEAB-5208-98F5-5E028C50XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisconnectDesktopSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisconnectDesktopSessionsResponseBody self = new DisconnectDesktopSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DisconnectDesktopSessionsResponseBody setInvalidSessions(java.util.List<DisconnectDesktopSessionsResponseBodyInvalidSessions> invalidSessions) {
        this.invalidSessions = invalidSessions;
        return this;
    }
    public java.util.List<DisconnectDesktopSessionsResponseBodyInvalidSessions> getInvalidSessions() {
        return this.invalidSessions;
    }

    public DisconnectDesktopSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DisconnectDesktopSessionsResponseBodyInvalidSessions extends TeaModel {
        /**
         * <p>The cloud desktop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-2jv6wugbkp65pxxxx</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The end user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>wy01</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        public static DisconnectDesktopSessionsResponseBodyInvalidSessions build(java.util.Map<String, ?> map) throws Exception {
            DisconnectDesktopSessionsResponseBodyInvalidSessions self = new DisconnectDesktopSessionsResponseBodyInvalidSessions();
            return TeaModel.build(map, self);
        }

        public DisconnectDesktopSessionsResponseBodyInvalidSessions setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DisconnectDesktopSessionsResponseBodyInvalidSessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

    }

}
