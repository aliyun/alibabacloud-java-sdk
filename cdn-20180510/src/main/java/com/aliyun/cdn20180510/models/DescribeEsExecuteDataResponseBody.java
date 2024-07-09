// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeEsExecuteDataResponseBody extends TeaModel {
    /**
     * <p>The content of the script.</p>
     */
    @NameInMap("Contents")
    public java.util.List<DescribeEsExecuteDataResponseBodyContents> contents;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>99D61AB3-6164-4CF2-A0DE-129C9B07618B</p>
     */
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
        /**
         * <p>The time and column names in the table that shows the status of the script.</p>
         */
        @NameInMap("Columns")
        public java.util.List<String> columns;

        /**
         * <p>The name of the table that shows the status of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>Exception</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of timestamps and values in the corresponding columns of the table that shows the status of the script.</p>
         */
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
