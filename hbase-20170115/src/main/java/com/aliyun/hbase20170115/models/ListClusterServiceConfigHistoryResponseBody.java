// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ListClusterServiceConfigHistoryResponseBody extends TeaModel {
    @NameInMap("ConfigHistoryList")
    public ListClusterServiceConfigHistoryResponseBodyConfigHistoryList configHistoryList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListClusterServiceConfigHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceConfigHistoryResponseBody self = new ListClusterServiceConfigHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceConfigHistoryResponseBody setConfigHistoryList(ListClusterServiceConfigHistoryResponseBodyConfigHistoryList configHistoryList) {
        this.configHistoryList = configHistoryList;
        return this;
    }
    public ListClusterServiceConfigHistoryResponseBodyConfigHistoryList getConfigHistoryList() {
        return this.configHistoryList;
    }

    public ListClusterServiceConfigHistoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterServiceConfigHistoryResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListClusterServiceConfigHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterServiceConfigHistoryResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Effective")
        public String effective;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("OldValue")
        public String oldValue;

        public static ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory self = new ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setEffective(String effective) {
            this.effective = effective;
            return this;
        }
        public String getEffective() {
            return this.effective;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

    }

    public static class ListClusterServiceConfigHistoryResponseBodyConfigHistoryList extends TeaModel {
        @NameInMap("ConfigHistory")
        public java.util.List<ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory> configHistory;

        public static ListClusterServiceConfigHistoryResponseBodyConfigHistoryList build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceConfigHistoryResponseBodyConfigHistoryList self = new ListClusterServiceConfigHistoryResponseBodyConfigHistoryList();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryList setConfigHistory(java.util.List<ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory> configHistory) {
            this.configHistory = configHistory;
            return this;
        }
        public java.util.List<ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory> getConfigHistory() {
            return this.configHistory;
        }

    }

}
