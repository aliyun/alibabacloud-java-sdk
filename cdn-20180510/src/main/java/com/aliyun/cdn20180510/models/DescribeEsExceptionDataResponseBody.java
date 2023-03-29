// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExceptionDataResponseBody extends TeaModel {
    /**
     * <p>The content of the script.</p>
     */
    @NameInMap("Contents")
    public java.util.List<DescribeEsExceptionDataResponseBodyContents> contents;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEsExceptionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEsExceptionDataResponseBody self = new DescribeEsExceptionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEsExceptionDataResponseBody setContents(java.util.List<DescribeEsExceptionDataResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<DescribeEsExceptionDataResponseBodyContents> getContents() {
        return this.contents;
    }

    public DescribeEsExceptionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEsExceptionDataResponseBodyContentsPoints extends TeaModel {
        @NameInMap("Points")
        public java.util.List<String> points;

        public static DescribeEsExceptionDataResponseBodyContentsPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeEsExceptionDataResponseBodyContentsPoints self = new DescribeEsExceptionDataResponseBodyContentsPoints();
            return TeaModel.build(map, self);
        }

        public DescribeEsExceptionDataResponseBodyContentsPoints setPoints(java.util.List<String> points) {
            this.points = points;
            return this;
        }
        public java.util.List<String> getPoints() {
            return this.points;
        }

    }

    public static class DescribeEsExceptionDataResponseBodyContents extends TeaModel {
        /**
         * <p>The column names of the chart that shows the errors of the script and the time of each data entry.</p>
         */
        @NameInMap("Columns")
        public java.util.List<String> columns;

        /**
         * <p>The name of the chart that shows the errors of the script.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of each time and the column of each data entry.</p>
         */
        @NameInMap("Points")
        public java.util.List<DescribeEsExceptionDataResponseBodyContentsPoints> points;

        public static DescribeEsExceptionDataResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            DescribeEsExceptionDataResponseBodyContents self = new DescribeEsExceptionDataResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public DescribeEsExceptionDataResponseBodyContents setColumns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        public DescribeEsExceptionDataResponseBodyContents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEsExceptionDataResponseBodyContents setPoints(java.util.List<DescribeEsExceptionDataResponseBodyContentsPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<DescribeEsExceptionDataResponseBodyContentsPoints> getPoints() {
            return this.points;
        }

    }

}
