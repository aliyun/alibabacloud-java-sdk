// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DisconnectDesktopSessionsResponseBody extends TeaModel {
    @NameInMap("InvalidSessions")
    public java.util.List<DisconnectDesktopSessionsResponseBodyInvalidSessions> invalidSessions;

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
        @NameInMap("DesktopId")
        public String desktopId;

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
