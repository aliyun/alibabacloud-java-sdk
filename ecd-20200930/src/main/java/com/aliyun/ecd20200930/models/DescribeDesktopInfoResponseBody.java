// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopInfoResponseBody extends TeaModel {
    /**
     * <p>The details about the cloud desktops.</p>
     */
    @NameInMap("Desktops")
    public java.util.List<DescribeDesktopInfoResponseBodyDesktops> desktops;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopInfoResponseBody self = new DescribeDesktopInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopInfoResponseBody setDesktops(java.util.List<DescribeDesktopInfoResponseBodyDesktops> desktops) {
        this.desktops = desktops;
        return this;
    }
    public java.util.List<DescribeDesktopInfoResponseBodyDesktops> getDesktops() {
        return this.desktops;
    }

    public DescribeDesktopInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopInfoResponseBodyDesktops extends TeaModel {
        /**
         * <p>The connection status of the end user. Valid values:</p>
         * <br>
         * <p>*   Connected</p>
         * <p>*   Disconnected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The current version of the cloud desktop.</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>The cloud desktop ID.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The status of the cloud desktop. Valid values:</p>
         * <br>
         * <p>*   Pending</p>
         * <p>*   Starting</p>
         * <p>*   Running</p>
         * <p>*   Stopping</p>
         * <p>*   Stopped</p>
         * <p>*   Expired</p>
         * <p>*   Deleted</p>
         * <p>*   Failed</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The flag that is used to manage the cloud desktop.</p>
         */
        @NameInMap("ManagementFlag")
        public java.util.List<String> managementFlag;

        @NameInMap("NewAppSize")
        public Long newAppSize;

        @NameInMap("NewAppVersion")
        public String newAppVersion;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The first time when the cloud desktop was started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeDesktopInfoResponseBodyDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopInfoResponseBodyDesktops self = new DescribeDesktopInfoResponseBodyDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopInfoResponseBodyDesktops setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeDesktopInfoResponseBodyDesktops setCurrentAppVersion(String currentAppVersion) {
            this.currentAppVersion = currentAppVersion;
            return this;
        }
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        public DescribeDesktopInfoResponseBodyDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopInfoResponseBodyDesktops setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeDesktopInfoResponseBodyDesktops setManagementFlag(java.util.List<String> managementFlag) {
            this.managementFlag = managementFlag;
            return this;
        }
        public java.util.List<String> getManagementFlag() {
            return this.managementFlag;
        }

        public DescribeDesktopInfoResponseBodyDesktops setNewAppSize(Long newAppSize) {
            this.newAppSize = newAppSize;
            return this;
        }
        public Long getNewAppSize() {
            return this.newAppSize;
        }

        public DescribeDesktopInfoResponseBodyDesktops setNewAppVersion(String newAppVersion) {
            this.newAppVersion = newAppVersion;
            return this;
        }
        public String getNewAppVersion() {
            return this.newAppVersion;
        }

        public DescribeDesktopInfoResponseBodyDesktops setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeDesktopInfoResponseBodyDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
