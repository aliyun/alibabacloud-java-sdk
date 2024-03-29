// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreFullDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RestoreFull")
    public DescribeRestoreFullDetailsResponseBodyRestoreFull restoreFull;

    public static DescribeRestoreFullDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreFullDetailsResponseBody self = new DescribeRestoreFullDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreFullDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreFullDetailsResponseBody setRestoreFull(DescribeRestoreFullDetailsResponseBodyRestoreFull restoreFull) {
        this.restoreFull = restoreFull;
        return this;
    }
    public DescribeRestoreFullDetailsResponseBodyRestoreFull getRestoreFull() {
        return this.restoreFull;
    }

    public static class DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail extends TeaModel {
        @NameInMap("DataSize")
        public String dataSize;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("Process")
        public String process;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Table")
        public String table;

        public static DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail self = new DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetails extends TeaModel {
        @NameInMap("RestoreFullDetail")
        public java.util.List<DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail> restoreFullDetail;

        public static DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetails self = new DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetails();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetails setRestoreFullDetail(java.util.List<DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail> restoreFullDetail) {
            this.restoreFullDetail = restoreFullDetail;
            return this;
        }
        public java.util.List<DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetailsRestoreFullDetail> getRestoreFullDetail() {
            return this.restoreFullDetail;
        }

    }

    public static class DescribeRestoreFullDetailsResponseBodyRestoreFull extends TeaModel {
        @NameInMap("DataSize")
        public String dataSize;

        @NameInMap("Fail")
        public Integer fail;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RestoreFullDetails")
        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetails restoreFullDetails;

        @NameInMap("Speed")
        public String speed;

        @NameInMap("Succeed")
        public Integer succeed;

        @NameInMap("Total")
        public Long total;

        public static DescribeRestoreFullDetailsResponseBodyRestoreFull build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreFullDetailsResponseBodyRestoreFull self = new DescribeRestoreFullDetailsResponseBodyRestoreFull();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFull setDataSize(String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public String getDataSize() {
            return this.dataSize;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFull setFail(Integer fail) {
            this.fail = fail;
            return this;
        }
        public Integer getFail() {
            return this.fail;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFull setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFull setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFull setRestoreFullDetails(DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetails restoreFullDetails) {
            this.restoreFullDetails = restoreFullDetails;
            return this;
        }
        public DescribeRestoreFullDetailsResponseBodyRestoreFullRestoreFullDetails getRestoreFullDetails() {
            return this.restoreFullDetails;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFull setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFull setSucceed(Integer succeed) {
            this.succeed = succeed;
            return this;
        }
        public Integer getSucceed() {
            return this.succeed;
        }

        public DescribeRestoreFullDetailsResponseBodyRestoreFull setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
