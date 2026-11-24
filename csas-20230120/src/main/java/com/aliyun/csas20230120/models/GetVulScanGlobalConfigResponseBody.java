// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetVulScanGlobalConfigResponseBody extends TeaModel {
    /**
     * <p>The maximum download rate of vulnerability patches for a single user terminal device. Unit: Byte/s. A value of 0 indicates no rate limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1048576</p>
     */
    @NameInMap("MaxDownloadSpeed")
    public Integer maxDownloadSpeed;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The vulnerability fix configuration for WUYING Cloud Desktop. This configuration takes effect only for user terminal devices of the WUYING Cloud Desktop type.</p>
     */
    @NameInMap("WuyingVulFixConfig")
    public GetVulScanGlobalConfigResponseBodyWuyingVulFixConfig wuyingVulFixConfig;

    public static GetVulScanGlobalConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVulScanGlobalConfigResponseBody self = new GetVulScanGlobalConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVulScanGlobalConfigResponseBody setMaxDownloadSpeed(Integer maxDownloadSpeed) {
        this.maxDownloadSpeed = maxDownloadSpeed;
        return this;
    }
    public Integer getMaxDownloadSpeed() {
        return this.maxDownloadSpeed;
    }

    public GetVulScanGlobalConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVulScanGlobalConfigResponseBody setWuyingVulFixConfig(GetVulScanGlobalConfigResponseBodyWuyingVulFixConfig wuyingVulFixConfig) {
        this.wuyingVulFixConfig = wuyingVulFixConfig;
        return this;
    }
    public GetVulScanGlobalConfigResponseBodyWuyingVulFixConfig getWuyingVulFixConfig() {
        return this.wuyingVulFixConfig;
    }

    public static class GetVulScanGlobalConfigResponseBodyWuyingVulFixConfig extends TeaModel {
        /**
         * <p>Specifies whether to prohibit shutdown during the fix process to prevent system exceptions caused by shutdown during patch installation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Shutdown is prohibited.</li>
         * <li><strong>false</strong>: Shutdown is not prohibited.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AntiShutdownSwitch")
        public Boolean antiShutdownSwitch;

        /**
         * <p>Specifies whether to create a snapshot for the Cloud Desktop before the fix process to allow rollback if the fix fails. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A snapshot is created.</li>
         * <li><strong>false</strong>: No snapshot is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SnapshotSwitch")
        public Boolean snapshotSwitch;

        public static GetVulScanGlobalConfigResponseBodyWuyingVulFixConfig build(java.util.Map<String, ?> map) throws Exception {
            GetVulScanGlobalConfigResponseBodyWuyingVulFixConfig self = new GetVulScanGlobalConfigResponseBodyWuyingVulFixConfig();
            return TeaModel.build(map, self);
        }

        public GetVulScanGlobalConfigResponseBodyWuyingVulFixConfig setAntiShutdownSwitch(Boolean antiShutdownSwitch) {
            this.antiShutdownSwitch = antiShutdownSwitch;
            return this;
        }
        public Boolean getAntiShutdownSwitch() {
            return this.antiShutdownSwitch;
        }

        public GetVulScanGlobalConfigResponseBodyWuyingVulFixConfig setSnapshotSwitch(Boolean snapshotSwitch) {
            this.snapshotSwitch = snapshotSwitch;
            return this;
        }
        public Boolean getSnapshotSwitch() {
            return this.snapshotSwitch;
        }

    }

}
