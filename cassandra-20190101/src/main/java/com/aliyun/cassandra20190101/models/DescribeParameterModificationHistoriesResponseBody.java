// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeParameterModificationHistoriesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Histories")
    public DescribeParameterModificationHistoriesResponseBodyHistories histories;

    public static DescribeParameterModificationHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterModificationHistoriesResponseBody self = new DescribeParameterModificationHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterModificationHistoriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeParameterModificationHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParameterModificationHistoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeParameterModificationHistoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeParameterModificationHistoriesResponseBody setHistories(DescribeParameterModificationHistoriesResponseBodyHistories histories) {
        this.histories = histories;
        return this;
    }
    public DescribeParameterModificationHistoriesResponseBodyHistories getHistories() {
        return this.histories;
    }

    public static class DescribeParameterModificationHistoriesResponseBodyHistoriesHistory extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewValue")
        public String newValue;

        public static DescribeParameterModificationHistoriesResponseBodyHistoriesHistory build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterModificationHistoriesResponseBodyHistoriesHistory self = new DescribeParameterModificationHistoriesResponseBodyHistoriesHistory();
            return TeaModel.build(map, self);
        }

        public DescribeParameterModificationHistoriesResponseBodyHistoriesHistory setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeParameterModificationHistoriesResponseBodyHistoriesHistory setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public DescribeParameterModificationHistoriesResponseBodyHistoriesHistory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeParameterModificationHistoriesResponseBodyHistoriesHistory setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

    }

    public static class DescribeParameterModificationHistoriesResponseBodyHistories extends TeaModel {
        @NameInMap("History")
        public java.util.List<DescribeParameterModificationHistoriesResponseBodyHistoriesHistory> history;

        public static DescribeParameterModificationHistoriesResponseBodyHistories build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterModificationHistoriesResponseBodyHistories self = new DescribeParameterModificationHistoriesResponseBodyHistories();
            return TeaModel.build(map, self);
        }

        public DescribeParameterModificationHistoriesResponseBodyHistories setHistory(java.util.List<DescribeParameterModificationHistoriesResponseBodyHistoriesHistory> history) {
            this.history = history;
            return this;
        }
        public java.util.List<DescribeParameterModificationHistoriesResponseBodyHistoriesHistory> getHistory() {
            return this.history;
        }

    }

}
