// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCustomDataExportSrcDstTablesResponseBody extends TeaModel {
    @NameInMap("DataExportSrcDstTables")
    public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTables dataExportSrcDstTables;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomDataExportSrcDstTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDataExportSrcDstTablesResponseBody self = new DescribeCustomDataExportSrcDstTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDataExportSrcDstTablesResponseBody setDataExportSrcDstTables(DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTables dataExportSrcDstTables) {
        this.dataExportSrcDstTables = dataExportSrcDstTables;
        return this;
    }
    public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTables getDataExportSrcDstTables() {
        return this.dataExportSrcDstTables;
    }

    public DescribeCustomDataExportSrcDstTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomDataExportSrcDstTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesDstTables extends TeaModel {
        @NameInMap("DstTables")
        public java.util.List<String> dstTables;

        public static DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesDstTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesDstTables self = new DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesDstTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesDstTables setDstTables(java.util.List<String> dstTables) {
            this.dstTables = dstTables;
            return this;
        }
        public java.util.List<String> getDstTables() {
            return this.dstTables;
        }

    }

    public static class DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesSrcTables extends TeaModel {
        @NameInMap("SrcTables")
        public java.util.List<String> srcTables;

        public static DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesSrcTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesSrcTables self = new DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesSrcTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesSrcTables setSrcTables(java.util.List<String> srcTables) {
            this.srcTables = srcTables;
            return this;
        }
        public java.util.List<String> getSrcTables() {
            return this.srcTables;
        }

    }

    public static class DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTables extends TeaModel {
        @NameInMap("DstTables")
        public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesDstTables dstTables;

        @NameInMap("SrcTables")
        public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesSrcTables srcTables;

        public static DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTables self = new DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTables setDstTables(DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesDstTables dstTables) {
            this.dstTables = dstTables;
            return this;
        }
        public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesDstTables getDstTables() {
            return this.dstTables;
        }

        public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTables setSrcTables(DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesSrcTables srcTables) {
            this.srcTables = srcTables;
            return this;
        }
        public DescribeCustomDataExportSrcDstTablesResponseBodyDataExportSrcDstTablesSrcTables getSrcTables() {
            return this.srcTables;
        }

    }

}
