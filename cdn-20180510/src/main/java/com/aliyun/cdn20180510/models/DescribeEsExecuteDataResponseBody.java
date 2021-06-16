// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExecuteDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Contents")
    public java.util.List<DescribeEsExecuteDataResponseBodyContents> contents;

    public static DescribeEsExecuteDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEsExecuteDataResponseBody self = new DescribeEsExecuteDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEsExecuteDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEsExecuteDataResponseBody setContents(java.util.List<DescribeEsExecuteDataResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<DescribeEsExecuteDataResponseBodyContents> getContents() {
        return this.contents;
    }

    public static class DescribeEsExecuteDataResponseBodyContents extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Points")
        public java.util.List<String> points;

        @NameInMap("Columns")
        public java.util.List<String> columns;

        public static DescribeEsExecuteDataResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            DescribeEsExecuteDataResponseBodyContents self = new DescribeEsExecuteDataResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public DescribeEsExecuteDataResponseBodyContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEsExecuteDataResponseBodyContents setPoints(java.util.List<String> points) {
            this.points = points;
            return this;
        }
        public java.util.List<String> getPoints() {
            return this.points;
        }

        public DescribeEsExecuteDataResponseBodyContents setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

    }

}
