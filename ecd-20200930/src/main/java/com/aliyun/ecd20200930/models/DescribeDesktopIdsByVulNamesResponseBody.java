// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopIdsByVulNamesResponseBody extends TeaModel {
    /**
     * <p>Details about cloud desktops.</p>
     */
    @NameInMap("DesktopItems")
    public java.util.List<DescribeDesktopIdsByVulNamesResponseBodyDesktopItems> desktopItems;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDesktopIdsByVulNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopIdsByVulNamesResponseBody self = new DescribeDesktopIdsByVulNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopIdsByVulNamesResponseBody setDesktopItems(java.util.List<DescribeDesktopIdsByVulNamesResponseBodyDesktopItems> desktopItems) {
        this.desktopItems = desktopItems;
        return this;
    }
    public java.util.List<DescribeDesktopIdsByVulNamesResponseBodyDesktopItems> getDesktopItems() {
        return this.desktopItems;
    }

    public DescribeDesktopIdsByVulNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDesktopIdsByVulNamesResponseBodyDesktopItems extends TeaModel {
        /**
         * <p>The ID of the cloud desktop.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud desktop.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        public static DescribeDesktopIdsByVulNamesResponseBodyDesktopItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopIdsByVulNamesResponseBodyDesktopItems self = new DescribeDesktopIdsByVulNamesResponseBodyDesktopItems();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopIdsByVulNamesResponseBodyDesktopItems setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopIdsByVulNamesResponseBodyDesktopItems setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

    }

}
