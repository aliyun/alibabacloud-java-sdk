// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopInfoResponseBody extends TeaModel {
    /**
     * <p>Basic desktop information.</p>
     */
    @NameInMap("Desktops")
    public java.util.List<DescribeDesktopInfoResponseBodyDesktops> desktops;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>062B1439-709A-580E-85DF-CE97A1560565</p>
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
         * <p>User connection status.</p>
         * 
         * <strong>example:</strong>
         * <p>Disconnected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>Desktop image version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.4.0-R-***</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>Desktop group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-3uiojcc0j4kh7****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>Desktop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The status of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The management flag.</p>
         */
        @NameInMap("ManagementFlag")
        public java.util.List<String> managementFlag;

        /**
         * <p>Upgrade package size, in KB.</p>
         * 
         * <strong>example:</strong>
         * <p>568533470</p>
         */
        @NameInMap("NewAppSize")
        public Long newAppSize;

        /**
         * <p>Desktop upgradable image version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.0-R-***</p>
         */
        @NameInMap("NewAppVersion")
        public String newAppVersion;

        /**
         * <p>Description of the upgradable image version.</p>
         * 
         * <strong>example:</strong>
         * <p>Test upgrade package 03-07</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>Desktop first startup time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-06T08:31Z</p>
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

        public DescribeDesktopInfoResponseBodyDesktops setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
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
