// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListClusterServiceConfigHistoryResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ConfigHistoryList")
    public ListClusterServiceConfigHistoryResponseBodyConfigHistoryList configHistoryList;

    public static ListClusterServiceConfigHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterServiceConfigHistoryResponseBody self = new ListClusterServiceConfigHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterServiceConfigHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterServiceConfigHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterServiceConfigHistoryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClusterServiceConfigHistoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListClusterServiceConfigHistoryResponseBody setConfigHistoryList(ListClusterServiceConfigHistoryResponseBodyConfigHistoryList configHistoryList) {
        this.configHistoryList = configHistoryList;
        return this;
    }
    public ListClusterServiceConfigHistoryResponseBodyConfigHistoryList getConfigHistoryList() {
        return this.configHistoryList;
    }

    public static class ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory extends TeaModel {
        @NameInMap("OldValue")
        public String oldValue;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Author")
        public String author;

        @NameInMap("ConfigItemName")
        public String configItemName;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("NewValue")
        public String newValue;

        @NameInMap("HostInstanceId")
        public String hostInstanceId;

        @NameInMap("ConfigFileName")
        public String configFileName;

        @NameInMap("Applied")
        public Boolean applied;

        @NameInMap("ConfigVersion")
        public String configVersion;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory build(java.util.Map<String, ?> map) throws Exception {
            ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory self = new ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory();
            return TeaModel.build(map, self);
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setConfigItemName(String configItemName) {
            this.configItemName = configItemName;
            return this;
        }
        public String getConfigItemName() {
            return this.configItemName;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setHostInstanceId(String hostInstanceId) {
            this.hostInstanceId = hostInstanceId;
            return this;
        }
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setApplied(Boolean applied) {
            this.applied = applied;
            return this;
        }
        public Boolean getApplied() {
            return this.applied;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListClusterServiceConfigHistoryResponseBodyConfigHistoryListConfigHistory setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
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
