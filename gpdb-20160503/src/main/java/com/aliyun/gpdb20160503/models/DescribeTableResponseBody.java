// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeTableResponseBody extends TeaModel {
    @NameInMap("ColumnList")
    public DescribeTableResponseBodyColumnList columnList;

    /**
     * <p>The detailed information returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution status of the API operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The execution was successful.</li>
     * <li><strong>fail</strong>: The execution failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableResponseBody self = new DescribeTableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableResponseBody setColumnList(DescribeTableResponseBodyColumnList columnList) {
        this.columnList = columnList;
        return this;
    }
    public DescribeTableResponseBodyColumnList getColumnList() {
        return this.columnList;
    }

    public DescribeTableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeTableResponseBodyColumnList extends TeaModel {
        @NameInMap("ColumnList")
        public java.util.List<ColumnMetadata> columnList;

        public static DescribeTableResponseBodyColumnList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableResponseBodyColumnList self = new DescribeTableResponseBodyColumnList();
            return TeaModel.build(map, self);
        }

        public DescribeTableResponseBodyColumnList setColumnList(java.util.List<ColumnMetadata> columnList) {
            this.columnList = columnList;
            return this;
        }
        public java.util.List<ColumnMetadata> getColumnList() {
            return this.columnList;
        }

    }

}
