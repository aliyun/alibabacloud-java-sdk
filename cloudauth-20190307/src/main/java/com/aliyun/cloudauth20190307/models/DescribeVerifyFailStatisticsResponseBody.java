// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyFailStatisticsResponseBody extends TeaModel {
    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>C2C596D1-B14B-5D79-9672-61D7686912B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Authentication result.</p>
     */
    @NameInMap("ResultObject")
    public DescribeVerifyFailStatisticsResponseBodyResultObject resultObject;

    public static DescribeVerifyFailStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyFailStatisticsResponseBody self = new DescribeVerifyFailStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyFailStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyFailStatisticsResponseBody setResultObject(DescribeVerifyFailStatisticsResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyFailStatisticsResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Failure count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>Date: Date</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16</p>
         */
        @NameInMap("Rate")
        public String rate;

        public static DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems self = new DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class DescribeVerifyFailStatisticsResponseBodyResultObjectColumn extends TeaModel {
        /**
         * <p>Column information.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems> items;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeVerifyFailStatisticsResponseBodyResultObjectColumn build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyFailStatisticsResponseBodyResultObjectColumn self = new DescribeVerifyFailStatisticsResponseBodyResultObjectColumn();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectColumn setItems(java.util.List<DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeVerifyFailStatisticsResponseBodyResultObjectColumnItems> getItems() {
            return this.items;
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectColumn setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Count.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>Date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-16</p>
         */
        @NameInMap("Date")
        public String date;

        public static DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData self = new DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class DescribeVerifyFailStatisticsResponseBodyResultObjectLineItems extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Returned quantity data.</p>
         */
        @NameInMap("Data")
        public java.util.List<DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData> data;

        public static DescribeVerifyFailStatisticsResponseBodyResultObjectLineItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyFailStatisticsResponseBodyResultObjectLineItems self = new DescribeVerifyFailStatisticsResponseBodyResultObjectLineItems();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectLineItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectLineItems setData(java.util.List<DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeVerifyFailStatisticsResponseBodyResultObjectLineItemsData> getData() {
            return this.data;
        }

    }

    public static class DescribeVerifyFailStatisticsResponseBodyResultObjectLine extends TeaModel {
        /**
         * <p>Column information.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeVerifyFailStatisticsResponseBodyResultObjectLineItems> items;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeVerifyFailStatisticsResponseBodyResultObjectLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyFailStatisticsResponseBodyResultObjectLine self = new DescribeVerifyFailStatisticsResponseBodyResultObjectLine();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectLine setItems(java.util.List<DescribeVerifyFailStatisticsResponseBodyResultObjectLineItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeVerifyFailStatisticsResponseBodyResultObjectLineItems> getItems() {
            return this.items;
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObjectLine setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeVerifyFailStatisticsResponseBodyResultObject extends TeaModel {
        /**
         * <p>Line chart of failure reasons.</p>
         */
        @NameInMap("Column")
        public DescribeVerifyFailStatisticsResponseBodyResultObjectColumn column;

        /**
         * <p>Bar chart of failure reasons.</p>
         */
        @NameInMap("Line")
        public DescribeVerifyFailStatisticsResponseBodyResultObjectLine line;

        public static DescribeVerifyFailStatisticsResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyFailStatisticsResponseBodyResultObject self = new DescribeVerifyFailStatisticsResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObject setColumn(DescribeVerifyFailStatisticsResponseBodyResultObjectColumn column) {
            this.column = column;
            return this;
        }
        public DescribeVerifyFailStatisticsResponseBodyResultObjectColumn getColumn() {
            return this.column;
        }

        public DescribeVerifyFailStatisticsResponseBodyResultObject setLine(DescribeVerifyFailStatisticsResponseBodyResultObjectLine line) {
            this.line = line;
            return this;
        }
        public DescribeVerifyFailStatisticsResponseBodyResultObjectLine getLine() {
            return this.line;
        }

    }

}
