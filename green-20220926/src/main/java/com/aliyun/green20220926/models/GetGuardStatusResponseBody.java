// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetGuardStatusResponseBody extends TeaModel {
    /**
     * <p>The list of log scan statistics.</p>
     */
    @NameInMap("LogScanStatus")
    public java.util.List<GetGuardStatusResponseBodyLogScanStatus> logScanStatus;

    /**
     * <p>The list of protection status statistics.</p>
     */
    @NameInMap("ProtectionStatus")
    public java.util.List<GetGuardStatusResponseBodyProtectionStatus> protectionStatus;

    /**
     * <p>The list of real-time protection statistics.</p>
     */
    @NameInMap("RealTimeStatus")
    public java.util.List<GetGuardStatusResponseBodyRealTimeStatus> realTimeStatus;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. This ID can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGuardStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGuardStatusResponseBody self = new GetGuardStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGuardStatusResponseBody setLogScanStatus(java.util.List<GetGuardStatusResponseBodyLogScanStatus> logScanStatus) {
        this.logScanStatus = logScanStatus;
        return this;
    }
    public java.util.List<GetGuardStatusResponseBodyLogScanStatus> getLogScanStatus() {
        return this.logScanStatus;
    }

    public GetGuardStatusResponseBody setProtectionStatus(java.util.List<GetGuardStatusResponseBodyProtectionStatus> protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }
    public java.util.List<GetGuardStatusResponseBodyProtectionStatus> getProtectionStatus() {
        return this.protectionStatus;
    }

    public GetGuardStatusResponseBody setRealTimeStatus(java.util.List<GetGuardStatusResponseBodyRealTimeStatus> realTimeStatus) {
        this.realTimeStatus = realTimeStatus;
        return this;
    }
    public java.util.List<GetGuardStatusResponseBodyRealTimeStatus> getRealTimeStatus() {
        return this.realTimeStatus;
    }

    public GetGuardStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGuardStatusResponseBodyLogScanStatus extends TeaModel {
        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>enabled: Running.</li>
         * <li>disabled: Not accessed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>ai_app_scan_bailian</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetGuardStatusResponseBodyLogScanStatus build(java.util.Map<String, ?> map) throws Exception {
            GetGuardStatusResponseBodyLogScanStatus self = new GetGuardStatusResponseBodyLogScanStatus();
            return TeaModel.build(map, self);
        }

        public GetGuardStatusResponseBodyLogScanStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGuardStatusResponseBodyLogScanStatus setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetGuardStatusResponseBodyProtectionStatus extends TeaModel {
        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>enabled: Running.</li>
         * <li>disabled: Not accessed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetGuardStatusResponseBodyProtectionStatus build(java.util.Map<String, ?> map) throws Exception {
            GetGuardStatusResponseBodyProtectionStatus self = new GetGuardStatusResponseBodyProtectionStatus();
            return TeaModel.build(map, self);
        }

        public GetGuardStatusResponseBodyProtectionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGuardStatusResponseBodyProtectionStatus setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetGuardStatusResponseBodyRealTimeStatus extends TeaModel {
        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>enabled: Running.</li>
         * <li>disabled: Not accessed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetGuardStatusResponseBodyRealTimeStatus build(java.util.Map<String, ?> map) throws Exception {
            GetGuardStatusResponseBodyRealTimeStatus self = new GetGuardStatusResponseBodyRealTimeStatus();
            return TeaModel.build(map, self);
        }

        public GetGuardStatusResponseBodyRealTimeStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGuardStatusResponseBodyRealTimeStatus setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
