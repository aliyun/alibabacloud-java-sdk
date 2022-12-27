// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExecuteDataResponseBody extends TeaModel {
    // The content of the script.
    @NameInMap("Contents")
    public java.util.List<DescribeEsExecuteDataResponseBodyContents> contents;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEsExecuteDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEsExecuteDataResponseBody self = new DescribeEsExecuteDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEsExecuteDataResponseBody setContents(java.util.List<DescribeEsExecuteDataResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<DescribeEsExecuteDataResponseBodyContents> getContents() {
        return this.contents;
    }

    public DescribeEsExecuteDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEsExecuteDataResponseBodyContents extends TeaModel {
        // The column names of the chart that shows the status of the script and the time of each data entry.
        @NameInMap("Columns")
        public java.util.List<String> columns;

        // The name of the chart that shows the status of the script.
        @NameInMap("Name")
        public String name;

        // The value of each time and the column of each data entry.
        @NameInMap("Points")
        public java.util.List<String> points;

        public static DescribeEsExecuteDataResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            DescribeEsExecuteDataResponseBodyContents self = new DescribeEsExecuteDataResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public DescribeEsExecuteDataResponseBodyContents setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
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

    }

}
