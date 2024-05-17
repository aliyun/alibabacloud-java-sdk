// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListExternalDataSourcesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListExternalDataSourcesResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListExternalDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExternalDataSourcesResponseBody self = new ListExternalDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExternalDataSourcesResponseBody setItems(java.util.List<ListExternalDataSourcesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListExternalDataSourcesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListExternalDataSourcesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExternalDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExternalDataSourcesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListExternalDataSourcesResponseBodyItems extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataSourceDescription")
        public String dataSourceDescription;

        @NameInMap("DataSourceDir")
        public String dataSourceDir;

        @NameInMap("DataSourceId")
        public Integer dataSourceId;

        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DataSourceStatus")
        public String dataSourceStatus;

        @NameInMap("DataSourceType")
        public String dataSourceType;

        @NameInMap("ExternalDataServiceId")
        public Integer externalDataServiceId;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("StatusMessage")
        public String statusMessage;

        public static ListExternalDataSourcesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListExternalDataSourcesResponseBodyItems self = new ListExternalDataSourcesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListExternalDataSourcesResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListExternalDataSourcesResponseBodyItems setDataSourceDescription(String dataSourceDescription) {
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }
        public String getDataSourceDescription() {
            return this.dataSourceDescription;
        }

        public ListExternalDataSourcesResponseBodyItems setDataSourceDir(String dataSourceDir) {
            this.dataSourceDir = dataSourceDir;
            return this;
        }
        public String getDataSourceDir() {
            return this.dataSourceDir;
        }

        public ListExternalDataSourcesResponseBodyItems setDataSourceId(Integer dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Integer getDataSourceId() {
            return this.dataSourceId;
        }

        public ListExternalDataSourcesResponseBodyItems setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListExternalDataSourcesResponseBodyItems setDataSourceStatus(String dataSourceStatus) {
            this.dataSourceStatus = dataSourceStatus;
            return this;
        }
        public String getDataSourceStatus() {
            return this.dataSourceStatus;
        }

        public ListExternalDataSourcesResponseBodyItems setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListExternalDataSourcesResponseBodyItems setExternalDataServiceId(Integer externalDataServiceId) {
            this.externalDataServiceId = externalDataServiceId;
            return this;
        }
        public Integer getExternalDataServiceId() {
            return this.externalDataServiceId;
        }

        public ListExternalDataSourcesResponseBodyItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListExternalDataSourcesResponseBodyItems setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

}
