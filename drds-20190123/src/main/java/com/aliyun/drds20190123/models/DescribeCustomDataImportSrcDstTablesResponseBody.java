// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCustomDataImportSrcDstTablesResponseBody extends TeaModel {
    @NameInMap("DataImportSrcDstTables")
    public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTables dataImportSrcDstTables;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomDataImportSrcDstTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDataImportSrcDstTablesResponseBody self = new DescribeCustomDataImportSrcDstTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDataImportSrcDstTablesResponseBody setDataImportSrcDstTables(DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTables dataImportSrcDstTables) {
        this.dataImportSrcDstTables = dataImportSrcDstTables;
        return this;
    }
    public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTables getDataImportSrcDstTables() {
        return this.dataImportSrcDstTables;
    }

    public DescribeCustomDataImportSrcDstTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomDataImportSrcDstTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesDstTables extends TeaModel {
        @NameInMap("DstTables")
        public java.util.List<String> dstTables;

        public static DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesDstTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesDstTables self = new DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesDstTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesDstTables setDstTables(java.util.List<String> dstTables) {
            this.dstTables = dstTables;
            return this;
        }
        public java.util.List<String> getDstTables() {
            return this.dstTables;
        }

    }

    public static class DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesSrcTables extends TeaModel {
        @NameInMap("SrcTables")
        public java.util.List<String> srcTables;

        public static DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesSrcTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesSrcTables self = new DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesSrcTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesSrcTables setSrcTables(java.util.List<String> srcTables) {
            this.srcTables = srcTables;
            return this;
        }
        public java.util.List<String> getSrcTables() {
            return this.srcTables;
        }

    }

    public static class DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTables extends TeaModel {
        @NameInMap("DstTables")
        public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesDstTables dstTables;

        @NameInMap("SrcTables")
        public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesSrcTables srcTables;

        public static DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTables self = new DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTables setDstTables(DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesDstTables dstTables) {
            this.dstTables = dstTables;
            return this;
        }
        public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesDstTables getDstTables() {
            return this.dstTables;
        }

        public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTables setSrcTables(DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesSrcTables srcTables) {
            this.srcTables = srcTables;
            return this;
        }
        public DescribeCustomDataImportSrcDstTablesResponseBodyDataImportSrcDstTablesSrcTables getSrcTables() {
            return this.srcTables;
        }

    }

}
