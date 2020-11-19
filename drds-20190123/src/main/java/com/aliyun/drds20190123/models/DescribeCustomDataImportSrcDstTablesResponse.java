// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCustomDataImportSrcDstTablesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("DataImportSrcDstTables")
    @Validation(required = true)
    public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTables dataImportSrcDstTables;

    public static DescribeCustomDataImportSrcDstTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDataImportSrcDstTablesResponse self = new DescribeCustomDataImportSrcDstTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDataImportSrcDstTablesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomDataImportSrcDstTablesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeCustomDataImportSrcDstTablesResponse setDataImportSrcDstTables(DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTables dataImportSrcDstTables) {
        this.dataImportSrcDstTables = dataImportSrcDstTables;
        return this;
    }
    public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTables getDataImportSrcDstTables() {
        return this.dataImportSrcDstTables;
    }

    public static class DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesSrcTables extends TeaModel {
        // SrcTables
        @NameInMap("SrcTables")
        @Validation(required = true)
        public java.util.List<String> srcTables;

        public static DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesSrcTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesSrcTables self = new DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesSrcTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesSrcTables setSrcTables(java.util.List<String> srcTables) {
            this.srcTables = srcTables;
            return this;
        }
        public java.util.List<String> getSrcTables() {
            return this.srcTables;
        }

    }

    public static class DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesDstTables extends TeaModel {
        // DstTables
        @NameInMap("DstTables")
        @Validation(required = true)
        public java.util.List<String> dstTables;

        public static DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesDstTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesDstTables self = new DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesDstTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesDstTables setDstTables(java.util.List<String> dstTables) {
            this.dstTables = dstTables;
            return this;
        }
        public java.util.List<String> getDstTables() {
            return this.dstTables;
        }

    }

    public static class DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTables extends TeaModel {
        @NameInMap("SrcTables")
        @Validation(required = true)
        public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesSrcTables srcTables;

        @NameInMap("DstTables")
        @Validation(required = true)
        public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesDstTables dstTables;

        public static DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTables self = new DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTables();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTables setSrcTables(DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesSrcTables srcTables) {
            this.srcTables = srcTables;
            return this;
        }
        public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesSrcTables getSrcTables() {
            return this.srcTables;
        }

        public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTables setDstTables(DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesDstTables dstTables) {
            this.dstTables = dstTables;
            return this;
        }
        public DescribeCustomDataImportSrcDstTablesResponseDataImportSrcDstTablesDstTables getDstTables() {
            return this.dstTables;
        }

    }

}
