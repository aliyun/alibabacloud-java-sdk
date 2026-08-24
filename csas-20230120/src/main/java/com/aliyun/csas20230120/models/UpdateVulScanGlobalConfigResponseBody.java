// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVulScanGlobalConfigResponseBody extends TeaModel {
    /**
     * <p>The maximum download rate for vulnerability patches on a single user terminal device. Unit: Byte/s. A value of 0 indicates no speed limit.</p>
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
     * <p>The vulnerability fix configuration for WUYING Workspace. This configuration applies only to user terminal devices of the Cloud Desktop type.</p>
     */
    @NameInMap("WuyingVulFixConfig")
    @Deprecated
    public UpdateVulScanGlobalConfigResponseBodyWuyingVulFixConfig wuyingVulFixConfig;

    public static UpdateVulScanGlobalConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVulScanGlobalConfigResponseBody self = new UpdateVulScanGlobalConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVulScanGlobalConfigResponseBody setMaxDownloadSpeed(Integer maxDownloadSpeed) {
        this.maxDownloadSpeed = maxDownloadSpeed;
        return this;
    }
    public Integer getMaxDownloadSpeed() {
        return this.maxDownloadSpeed;
    }

    public UpdateVulScanGlobalConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    @Deprecated
    public UpdateVulScanGlobalConfigResponseBody setWuyingVulFixConfig(UpdateVulScanGlobalConfigResponseBodyWuyingVulFixConfig wuyingVulFixConfig) {
        this.wuyingVulFixConfig = wuyingVulFixConfig;
        return this;
    }
    public UpdateVulScanGlobalConfigResponseBodyWuyingVulFixConfig getWuyingVulFixConfig() {
        return this.wuyingVulFixConfig;
    }

    public static class UpdateVulScanGlobalConfigResponseBodyWuyingVulFixConfig extends TeaModel {
        /**
         * <p>Specifies whether to prohibit shutdown during the fix process to prevent system exceptions caused by shutting down during patch installation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Prohibit shutdown.</li>
         * <li><strong>false</strong>: Do not prohibit shutdown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AntiShutdownSwitch")
        @Deprecated
        public Boolean antiShutdownSwitch;

        /**
         * <p>Specifies whether to create a snapshot for the cloud desktop before the fix for rollback in case of fix failure. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Create a snapshot.</li>
         * <li><strong>false</strong>: Do not create a snapshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SnapshotSwitch")
        @Deprecated
        public Boolean snapshotSwitch;

        public static UpdateVulScanGlobalConfigResponseBodyWuyingVulFixConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateVulScanGlobalConfigResponseBodyWuyingVulFixConfig self = new UpdateVulScanGlobalConfigResponseBodyWuyingVulFixConfig();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public UpdateVulScanGlobalConfigResponseBodyWuyingVulFixConfig setAntiShutdownSwitch(Boolean antiShutdownSwitch) {
            this.antiShutdownSwitch = antiShutdownSwitch;
            return this;
        }
        public Boolean getAntiShutdownSwitch() {
            return this.antiShutdownSwitch;
        }

        @Deprecated
        public UpdateVulScanGlobalConfigResponseBodyWuyingVulFixConfig setSnapshotSwitch(Boolean snapshotSwitch) {
            this.snapshotSwitch = snapshotSwitch;
            return this;
        }
        public Boolean getSnapshotSwitch() {
            return this.snapshotSwitch;
        }

    }

}
