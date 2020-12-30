// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreSchemaDetailsResponseBody extends TeaModel {
    @NameInMap("RestoreSchema")
    public DescribeRestoreSchemaDetailsResponseBodyRestoreSchema restoreSchema;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRestoreSchemaDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreSchemaDetailsResponseBody self = new DescribeRestoreSchemaDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreSchemaDetailsResponseBody setRestoreSchema(DescribeRestoreSchemaDetailsResponseBodyRestoreSchema restoreSchema) {
        this.restoreSchema = restoreSchema;
        return this;
    }
    public DescribeRestoreSchemaDetailsResponseBodyRestoreSchema getRestoreSchema() {
        return this.restoreSchema;
    }

    public DescribeRestoreSchemaDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("Table")
        public String table;

        public static DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail self = new DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetails extends TeaModel {
        @NameInMap("RestoreSchemaDetail")
        public java.util.List<DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail> restoreSchemaDetail;

        public static DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetails self = new DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetails();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetails setRestoreSchemaDetail(java.util.List<DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail> restoreSchemaDetail) {
            this.restoreSchemaDetail = restoreSchemaDetail;
            return this;
        }
        public java.util.List<DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetailsRestoreSchemaDetail> getRestoreSchemaDetail() {
            return this.restoreSchemaDetail;
        }

    }

    public static class DescribeRestoreSchemaDetailsResponseBodyRestoreSchema extends TeaModel {
        @NameInMap("Succeed")
        public Integer succeed;

        @NameInMap("RestoreSchemaDetails")
        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetails restoreSchemaDetails;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("Fail")
        public Integer fail;

        @NameInMap("Total")
        public Long total;

        public static DescribeRestoreSchemaDetailsResponseBodyRestoreSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreSchemaDetailsResponseBodyRestoreSchema self = new DescribeRestoreSchemaDetailsResponseBodyRestoreSchema();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchema setSucceed(Integer succeed) {
            this.succeed = succeed;
            return this;
        }
        public Integer getSucceed() {
            return this.succeed;
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchema setRestoreSchemaDetails(DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetails restoreSchemaDetails) {
            this.restoreSchemaDetails = restoreSchemaDetails;
            return this;
        }
        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchemaRestoreSchemaDetails getRestoreSchemaDetails() {
            return this.restoreSchemaDetails;
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchema setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchema setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchema setFail(Integer fail) {
            this.fail = fail;
            return this;
        }
        public Integer getFail() {
            return this.fail;
        }

        public DescribeRestoreSchemaDetailsResponseBodyRestoreSchema setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
