// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeEventMetaInfoResponseBody extends TeaModel {
    /**
     * <p>The metadata of O\&amp;M tasks.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeEventMetaInfoResponseBodyItems> items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94F92113-FF63-5E57-8401-6FE123AD11DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEventMetaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventMetaInfoResponseBody self = new DescribeEventMetaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventMetaInfoResponseBody setItems(java.util.List<DescribeEventMetaInfoResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeEventMetaInfoResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeEventMetaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventMetaInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEventMetaInfoResponseBodyItems extends TeaModel {
        /**
         * <p>The code of the O\&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The type of the O\&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <p>Task.TaskStatus</p>
         */
        @NameInMap("SourceCode")
        public String sourceCode;

        public static DescribeEventMetaInfoResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventMetaInfoResponseBodyItems self = new DescribeEventMetaInfoResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeEventMetaInfoResponseBodyItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeEventMetaInfoResponseBodyItems setSourceCode(String sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }
        public String getSourceCode() {
            return this.sourceCode;
        }

    }

}
