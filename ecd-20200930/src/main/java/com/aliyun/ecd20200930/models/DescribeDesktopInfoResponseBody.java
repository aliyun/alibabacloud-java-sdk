// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopInfoResponseBody extends TeaModel {
    @NameInMap("Desktops")
    public java.util.List<DescribeDesktopInfoResponseBodyDesktops> desktops;

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
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("DesktopStatus")
        public String desktopStatus;

        @NameInMap("ManagementFlag")
        public java.util.List<String> managementFlag;

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

        public DescribeDesktopInfoResponseBodyDesktops setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
