// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExceptionDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Contents")
    public java.util.List<DescribeEsExceptionDataResponseBodyContents> contents;

    public static DescribeEsExceptionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEsExceptionDataResponseBody self = new DescribeEsExceptionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEsExceptionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEsExceptionDataResponseBody setContents(java.util.List<DescribeEsExceptionDataResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<DescribeEsExceptionDataResponseBodyContents> getContents() {
        return this.contents;
    }

    public static class DescribeEsExceptionDataResponseBodyContents extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Points")
        public java.util.List<String> points;

        @NameInMap("Columns")
        public java.util.List<String> columns;

        public static DescribeEsExceptionDataResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            DescribeEsExceptionDataResponseBodyContents self = new DescribeEsExceptionDataResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public DescribeEsExceptionDataResponseBodyContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEsExceptionDataResponseBodyContents setPoints(java.util.List<String> points) {
            this.points = points;
            return this;
        }
        public java.util.List<String> getPoints() {
            return this.points;
        }

        public DescribeEsExceptionDataResponseBodyContents setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

    }

}
