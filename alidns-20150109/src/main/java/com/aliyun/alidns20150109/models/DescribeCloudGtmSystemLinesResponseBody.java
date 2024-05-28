// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmSystemLinesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SystemLines")
    public DescribeCloudGtmSystemLinesResponseBodySystemLines systemLines;

    @NameInMap("SystemLinesTree")
    public String systemLinesTree;

    public static DescribeCloudGtmSystemLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmSystemLinesResponseBody self = new DescribeCloudGtmSystemLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmSystemLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudGtmSystemLinesResponseBody setSystemLines(DescribeCloudGtmSystemLinesResponseBodySystemLines systemLines) {
        this.systemLines = systemLines;
        return this;
    }
    public DescribeCloudGtmSystemLinesResponseBodySystemLines getSystemLines() {
        return this.systemLines;
    }

    public DescribeCloudGtmSystemLinesResponseBody setSystemLinesTree(String systemLinesTree) {
        this.systemLinesTree = systemLinesTree;
        return this;
    }
    public String getSystemLinesTree() {
        return this.systemLinesTree;
    }

    public static class DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentCode")
        public String parentCode;

        public static DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine self = new DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        public DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

    }

    public static class DescribeCloudGtmSystemLinesResponseBodySystemLines extends TeaModel {
        @NameInMap("SystemLine")
        public java.util.List<DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine> systemLine;

        public static DescribeCloudGtmSystemLinesResponseBodySystemLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudGtmSystemLinesResponseBodySystemLines self = new DescribeCloudGtmSystemLinesResponseBodySystemLines();
            return TeaModel.build(map, self);
        }

        public DescribeCloudGtmSystemLinesResponseBodySystemLines setSystemLine(java.util.List<DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine> systemLine) {
            this.systemLine = systemLine;
            return this;
        }
        public java.util.List<DescribeCloudGtmSystemLinesResponseBodySystemLinesSystemLine> getSystemLine() {
            return this.systemLine;
        }

    }

}
