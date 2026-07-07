// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ActivateEdgeMobileAgentResponseBody extends TeaModel {
    /**
     * <p>The response data object.</p>
     */
    @NameInMap("Data")
    public ActivateEdgeMobileAgentResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5C5CEF0A-D6E1-58D3-8750-67DB4F82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ActivateEdgeMobileAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateEdgeMobileAgentResponseBody self = new ActivateEdgeMobileAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateEdgeMobileAgentResponseBody setData(ActivateEdgeMobileAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ActivateEdgeMobileAgentResponseBodyData getData() {
        return this.data;
    }

    public ActivateEdgeMobileAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ActivateEdgeMobileAgentResponseBodyData extends TeaModel {
        /**
         * <p>The assigned API key. The plaintext value is returned only upon the first activation.</p>
         * 
         * <strong>example:</strong>
         * <p>cpk-81vfd8t8zdfxdf*****</p>
         */
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>The device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sn-0001eevqa6jeapl*****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>Indicates whether the request is an idempotent duplicate request.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Idempotent")
        public Boolean idempotent;

        /**
         * <p>The EdgeMobile instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>em-uto81vfd8t8z****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ActivateEdgeMobileAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ActivateEdgeMobileAgentResponseBodyData self = new ActivateEdgeMobileAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ActivateEdgeMobileAgentResponseBodyData setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public ActivateEdgeMobileAgentResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ActivateEdgeMobileAgentResponseBodyData setIdempotent(Boolean idempotent) {
            this.idempotent = idempotent;
            return this;
        }
        public Boolean getIdempotent() {
            return this.idempotent;
        }

        public ActivateEdgeMobileAgentResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
