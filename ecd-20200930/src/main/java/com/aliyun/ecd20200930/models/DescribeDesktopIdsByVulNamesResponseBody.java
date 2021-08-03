// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopIdsByVulNamesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DesktopItems")
    public java.util.List<DescribeDesktopIdsByVulNamesResponseBodyDesktopItems> desktopItems;

    public static DescribeDesktopIdsByVulNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopIdsByVulNamesResponseBody self = new DescribeDesktopIdsByVulNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopIdsByVulNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopIdsByVulNamesResponseBody setDesktopItems(java.util.List<DescribeDesktopIdsByVulNamesResponseBodyDesktopItems> desktopItems) {
        this.desktopItems = desktopItems;
        return this;
    }
    public java.util.List<DescribeDesktopIdsByVulNamesResponseBodyDesktopItems> getDesktopItems() {
        return this.desktopItems;
    }

    public static class DescribeDesktopIdsByVulNamesResponseBodyDesktopItems extends TeaModel {
        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("DesktopId")
        public String desktopId;

        public static DescribeDesktopIdsByVulNamesResponseBodyDesktopItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopIdsByVulNamesResponseBodyDesktopItems self = new DescribeDesktopIdsByVulNamesResponseBodyDesktopItems();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopIdsByVulNamesResponseBodyDesktopItems setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeDesktopIdsByVulNamesResponseBodyDesktopItems setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

    }

}
