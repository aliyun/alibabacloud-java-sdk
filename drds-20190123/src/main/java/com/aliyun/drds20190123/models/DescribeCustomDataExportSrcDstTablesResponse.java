// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCustomDataExportSrcDstTablesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("DataExportSrcDstTables")
    @Validation(required = true)
    public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTables dataExportSrcDstTables;

    public static DescribeCustomDataExportSrcDstTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDataExportSrcDstTablesResponse self = new DescribeCustomDataExportSrcDstTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDataExportSrcDstTablesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomDataExportSrcDstTablesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeCustomDataExportSrcDstTablesResponse setDataExportSrcDstTables(DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTables dataExportSrcDstTables) {
        this.dataExportSrcDstTables = dataExportSrcDstTables;
        return this;
    }
    public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTables getDataExportSrcDstTables() {
        return this.dataExportSrcDstTables;
    }

    public static class DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesSrcTables extends TeaModel {
        // SrcTables
        @NameInMap("SrcTables")
        @Validation(required = true)
        public java.util.List<String> srcTables;

        public static DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesSrcTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesSrcTables self = new DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesSrcTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesSrcTables setSrcTables(java.util.List<String> srcTables) {
            this.srcTables = srcTables;
            return this;
        }
        public java.util.List<String> getSrcTables() {
            return this.srcTables;
        }

    }

    public static class DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesDstTables extends TeaModel {
        // DstTables
        @NameInMap("DstTables")
        @Validation(required = true)
        public java.util.List<String> dstTables;

        public static DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesDstTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesDstTables self = new DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesDstTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesDstTables setDstTables(java.util.List<String> dstTables) {
            this.dstTables = dstTables;
            return this;
        }
        public java.util.List<String> getDstTables() {
            return this.dstTables;
        }

    }

    public static class DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTables extends TeaModel {
        @NameInMap("SrcTables")
        @Validation(required = true)
        public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesSrcTables srcTables;

        @NameInMap("DstTables")
        @Validation(required = true)
        public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesDstTables dstTables;

        public static DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTables self = new DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTables setSrcTables(DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesSrcTables srcTables) {
            this.srcTables = srcTables;
            return this;
        }
        public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesSrcTables getSrcTables() {
            return this.srcTables;
        }

        public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTables setDstTables(DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesDstTables dstTables) {
            this.dstTables = dstTables;
            return this;
        }
        public DescribeCustomDataExportSrcDstTablesResponseDataExportSrcDstTablesDstTables getDstTables() {
            return this.dstTables;
        }

    }

}
