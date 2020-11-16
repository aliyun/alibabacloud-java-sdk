// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopPolicysResponse extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DescribeDesktopPolicys")
    @Validation(required = true)
    public java.util.List<DescribeDesktopPolicysResponseDescribeDesktopPolicys> describeDesktopPolicys;

    public static DescribeDesktopPolicysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopPolicysResponse self = new DescribeDesktopPolicysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopPolicysResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDesktopPolicysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopPolicysResponse setDescribeDesktopPolicys(java.util.List<DescribeDesktopPolicysResponseDescribeDesktopPolicys> describeDesktopPolicys) {
        this.describeDesktopPolicys = describeDesktopPolicys;
        return this;
    }
    public java.util.List<DescribeDesktopPolicysResponseDescribeDesktopPolicys> getDescribeDesktopPolicys() {
        return this.describeDesktopPolicys;
    }

    public static class DescribeDesktopPolicysResponseDescribeDesktopPolicys extends TeaModel {
        @NameInMap("Clipboard")
        @Validation(required = true)
        public String clipboard;

        @NameInMap("LocalDrive")
        @Validation(required = true)
        public String localDrive;

        @NameInMap("UsbRedirect")
        @Validation(required = true)
        public String usbRedirect;

        @NameInMap("Watermark")
        @Validation(required = true)
        public String watermark;

        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        public static DescribeDesktopPolicysResponseDescribeDesktopPolicys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopPolicysResponseDescribeDesktopPolicys self = new DescribeDesktopPolicysResponseDescribeDesktopPolicys();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopPolicysResponseDescribeDesktopPolicys setClipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public String getClipboard() {
            return this.clipboard;
        }

        public DescribeDesktopPolicysResponseDescribeDesktopPolicys setLocalDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }
        public String getLocalDrive() {
            return this.localDrive;
        }

        public DescribeDesktopPolicysResponseDescribeDesktopPolicys setUsbRedirect(String usbRedirect) {
            this.usbRedirect = usbRedirect;
            return this;
        }
        public String getUsbRedirect() {
            return this.usbRedirect;
        }

        public DescribeDesktopPolicysResponseDescribeDesktopPolicys setWatermark(String watermark) {
            this.watermark = watermark;
            return this;
        }
        public String getWatermark() {
            return this.watermark;
        }

        public DescribeDesktopPolicysResponseDescribeDesktopPolicys setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

    }

}
