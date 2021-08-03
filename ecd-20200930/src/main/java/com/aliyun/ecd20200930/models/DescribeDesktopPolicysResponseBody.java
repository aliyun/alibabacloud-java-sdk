// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopPolicysResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DescribeDesktopPolicys")
    public java.util.List<DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys> describeDesktopPolicys;

    public static DescribeDesktopPolicysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopPolicysResponseBody self = new DescribeDesktopPolicysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopPolicysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopPolicysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopPolicysResponseBody setDescribeDesktopPolicys(java.util.List<DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys> describeDesktopPolicys) {
        this.describeDesktopPolicys = describeDesktopPolicys;
        return this;
    }
    public java.util.List<DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys> getDescribeDesktopPolicys() {
        return this.describeDesktopPolicys;
    }

    public static class DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys extends TeaModel {
        @NameInMap("UsbRedirect")
        public String usbRedirect;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("Watermark")
        public String watermark;

        @NameInMap("Clipboard")
        public String clipboard;

        @NameInMap("LocalDrive")
        public String localDrive;

        public static DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys self = new DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys setUsbRedirect(String usbRedirect) {
            this.usbRedirect = usbRedirect;
            return this;
        }
        public String getUsbRedirect() {
            return this.usbRedirect;
        }

        public DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys setWatermark(String watermark) {
            this.watermark = watermark;
            return this;
        }
        public String getWatermark() {
            return this.watermark;
        }

        public DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public DescribeDesktopPolicysResponseBodyDescribeDesktopPolicys setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

    }

}
