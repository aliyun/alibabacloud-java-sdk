// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopIdsByVulNamesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DesktopItems")
    @Validation(required = true)
    public java.util.List<DescribeDesktopIdsByVulNamesResponseDesktopItems> desktopItems;

    public static DescribeDesktopIdsByVulNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopIdsByVulNamesResponse self = new DescribeDesktopIdsByVulNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopIdsByVulNamesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDesktopIdsByVulNamesResponse setDesktopItems(java.util.List<DescribeDesktopIdsByVulNamesResponseDesktopItems> desktopItems) {
        this.desktopItems = desktopItems;
        return this;
    }
    public java.util.List<DescribeDesktopIdsByVulNamesResponseDesktopItems> getDesktopItems() {
        return this.desktopItems;
    }

    public static class DescribeDesktopIdsByVulNamesResponseDesktopItems extends TeaModel {
        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("DesktopName")
        @Validation(required = true)
        public String desktopName;

        public static DescribeDesktopIdsByVulNamesResponseDesktopItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDesktopIdsByVulNamesResponseDesktopItems self = new DescribeDesktopIdsByVulNamesResponseDesktopItems();
            return TeaModel.build(map, self);
        }

        public DescribeDesktopIdsByVulNamesResponseDesktopItems setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeDesktopIdsByVulNamesResponseDesktopItems setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

    }

}
