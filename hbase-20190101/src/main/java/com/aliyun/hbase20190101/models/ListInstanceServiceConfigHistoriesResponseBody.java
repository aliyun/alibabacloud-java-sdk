// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListInstanceServiceConfigHistoriesResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ConfigureHistoryList")
    public ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryList configureHistoryList;

    public static ListInstanceServiceConfigHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceServiceConfigHistoriesResponseBody self = new ListInstanceServiceConfigHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceServiceConfigHistoriesResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public ListInstanceServiceConfigHistoriesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListInstanceServiceConfigHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceServiceConfigHistoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceServiceConfigHistoriesResponseBody setConfigureHistoryList(ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryList configureHistoryList) {
        this.configureHistoryList = configureHistoryList;
        return this;
    }
    public ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryList getConfigureHistoryList() {
        return this.configureHistoryList;
    }

    public static class ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig extends TeaModel {
        @NameInMap("Effective")
        public String effective;

        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ConfigureName")
        public String configureName;

        @NameInMap("NewValue")
        public String newValue;

        public static ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig self = new ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig();
            return TeaModel.build(map, self);
        }

        public ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig setEffective(String effective) {
            this.effective = effective;
            return this;
        }
        public String getEffective() {
            return this.effective;
        }

        public ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig setConfigureName(String configureName) {
            this.configureName = configureName;
            return this;
        }
        public String getConfigureName() {
            return this.configureName;
        }

        public ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

    }

    public static class ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryList extends TeaModel {
        @NameInMap("Config")
        public java.util.List<ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig> config;

        public static ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryList self = new ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryList();
            return TeaModel.build(map, self);
        }

        public ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryList setConfig(java.util.List<ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<ListInstanceServiceConfigHistoriesResponseBodyConfigureHistoryListConfig> getConfig() {
            return this.config;
        }

    }

}
