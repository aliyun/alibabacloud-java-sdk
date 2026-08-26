// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetTrustedOriginResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-example</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The trusted origin.</p>
     */
    @NameInMap("TrustedOrigin")
    public GetTrustedOriginResponseBodyTrustedOrigin trustedOrigin;

    public static GetTrustedOriginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrustedOriginResponseBody self = new GetTrustedOriginResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrustedOriginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrustedOriginResponseBody setTrustedOrigin(GetTrustedOriginResponseBodyTrustedOrigin trustedOrigin) {
        this.trustedOrigin = trustedOrigin;
        return this;
    }
    public GetTrustedOriginResponseBodyTrustedOrigin getTrustedOrigin() {
        return this.trustedOrigin;
    }

    public static class GetTrustedOriginResponseBodyTrustedOrigin extends TeaModel {
        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T08:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_example</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The browser origin.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://console.qoder.com">https://console.qoder.com</a></p>
         */
        @NameInMap("Origin")
        public String origin;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the trusted origin.</p>
         * 
         * <strong>example:</strong>
         * <p>Qoder Production Console</p>
         */
        @NameInMap("TrustOriginName")
        public String trustOriginName;

        /**
         * <p>The ID of the trusted origin.</p>
         * 
         * <strong>example:</strong>
         * <p>to_example</p>
         */
        @NameInMap("TrustedOriginId")
        public String trustedOriginId;

        /**
         * <p>The trusted origin scene.</p>
         */
        @NameInMap("TrustedOriginScene")
        public java.util.List<String> trustedOriginScene;

        /**
         * <p>The update time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T08:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetTrustedOriginResponseBodyTrustedOrigin build(java.util.Map<String, ?> map) throws Exception {
            GetTrustedOriginResponseBodyTrustedOrigin self = new GetTrustedOriginResponseBodyTrustedOrigin();
            return TeaModel.build(map, self);
        }

        public GetTrustedOriginResponseBodyTrustedOrigin setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTrustedOriginResponseBodyTrustedOrigin setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTrustedOriginResponseBodyTrustedOrigin setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public GetTrustedOriginResponseBodyTrustedOrigin setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTrustedOriginResponseBodyTrustedOrigin setTrustOriginName(String trustOriginName) {
            this.trustOriginName = trustOriginName;
            return this;
        }
        public String getTrustOriginName() {
            return this.trustOriginName;
        }

        public GetTrustedOriginResponseBodyTrustedOrigin setTrustedOriginId(String trustedOriginId) {
            this.trustedOriginId = trustedOriginId;
            return this;
        }
        public String getTrustedOriginId() {
            return this.trustedOriginId;
        }

        public GetTrustedOriginResponseBodyTrustedOrigin setTrustedOriginScene(java.util.List<String> trustedOriginScene) {
            this.trustedOriginScene = trustedOriginScene;
            return this;
        }
        public java.util.List<String> getTrustedOriginScene() {
            return this.trustedOriginScene;
        }

        public GetTrustedOriginResponseBodyTrustedOrigin setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
