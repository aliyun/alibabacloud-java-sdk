// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopInfoResponseBody extends TeaModel {
    /**
     * <p>Details of the cloud computers.</p>
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
         * <p>The connection status of the user. Valid values:</p>
         * <br>
         * <p>*   Connected</p>
         * <p>*   Disconnected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The version of the image that is used by the cloud computer.</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>The cloud computer ID.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The status of the cloud computer. Valid values:</p>
         * <br>
         * <p>*   Pending: The cloud computer is being created.</p>
         * <p>*   Starting: The cloud computer is being started.</p>
         * <p>*   Running: The cloud computer is running.</p>
         * <p>*   Stopping: The cloud computer is being stopped.</p>
         * <p>*   Stopped: The cloud computer is stopped.</p>
         * <p>*   Expired: The cloud computer is expired.</p>
         * <p>*   Deleted: The cloud computer is deleted.</p>
         * <p>*   Failed: Failed to create the cloud computer.</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The information about flags that are used to manage cloud computers.</p>
         */
        @NameInMap("ManagementFlag")
        public java.util.List<String> managementFlag;

        /**
         * <p>The size of the update package. Unit: KB.</p>
         */
        @NameInMap("NewAppSize")
        public Long newAppSize;

        /**
         * <p>The destination version to which the image of the cloud computer can be updated.</p>
         */
        @NameInMap("NewAppVersion")
        public String newAppVersion;

        /**
         * <p>The description of the destination version to which the image of the cloud computer can be updated.</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The first time when the cloud computer was started.</p>
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
