// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExceptionDataResponseBody extends TeaModel {
    /**
     * <p>The content of the script for which an error was reported.</p>
     */
    @NameInMap("Contents")
    public java.util.List<DescribeEsExceptionDataResponseBodyContents> contents;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>99D61AB3-6164-4CF2-A0DE-129C9B07618B</p>
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

    public static class DescribeEsExceptionDataResponseBodyContents extends TeaModel {
        /**
         * <p>Information about the time column and the error column name.</p>
         */
        @NameInMap("Columns")
        public java.util.List<String> columns;

        /**
         * <p>The name of the table that shows the errors of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>401</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time columns and error column names.</p>
         */
        @NameInMap("Points")
        public java.util.List<String> points;

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

        public DescribeEsExceptionDataResponseBodyContents setPoints(java.util.List<String> points) {
            this.points = points;
            return this;
        }
        public java.util.List<String> getPoints() {
            return this.points;
        }

    }

}
