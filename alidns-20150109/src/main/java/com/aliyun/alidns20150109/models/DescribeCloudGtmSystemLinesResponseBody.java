// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmSystemLinesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The system lines.</p>
     */
    @NameInMap("SystemLines")
    public DescribeCloudGtmSystemLinesResponseBodySystemLines systemLines;

    /**
     * <p>The system lines, which are in a tree structure. Only a system line is listed in this example.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;displayName\&quot;:\&quot;Default\&quot;,\&quot;id\&quot;:\&quot;default\&quot;,\&quot;isAvailable\&quot;:true,\&quot;name\&quot;:\&quot;Default\&quot;,\&quot;parentId\&quot;:\&quot;\&quot;}]</p>
     */
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
        /**
         * <p>The line code.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_r_ap-south-1</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The display name of the line.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Indicates whether the line can be selected as the source of a Domain Name System (DNS) request. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        /**
         * <p>The name of the line.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The code of the parent line.</p>
         * 
         * <strong>example:</strong>
         * <p>String	aliyun</p>
         */
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
