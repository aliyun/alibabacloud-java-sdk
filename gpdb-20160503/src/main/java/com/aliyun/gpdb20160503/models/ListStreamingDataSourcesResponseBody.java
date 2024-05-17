// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListStreamingDataSourcesResponseBody extends TeaModel {
    @NameInMap("DataSourceItems")
    public java.util.List<ListStreamingDataSourcesResponseBodyDataSourceItems> dataSourceItems;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListStreamingDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStreamingDataSourcesResponseBody self = new ListStreamingDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStreamingDataSourcesResponseBody setDataSourceItems(java.util.List<ListStreamingDataSourcesResponseBodyDataSourceItems> dataSourceItems) {
        this.dataSourceItems = dataSourceItems;
        return this;
    }
    public java.util.List<ListStreamingDataSourcesResponseBodyDataSourceItems> getDataSourceItems() {
        return this.dataSourceItems;
    }

    public ListStreamingDataSourcesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStreamingDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStreamingDataSourcesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListStreamingDataSourcesResponseBodyDataSourceItems extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataSourceConfig")
        public String dataSourceConfig;

        @NameInMap("DataSourceDescription")
        public String dataSourceDescription;

        @NameInMap("DataSourceId")
        public Integer dataSourceId;

        @NameInMap("DataSourceName")
        public String dataSourceName;

        @NameInMap("DataSourceType")
        public String dataSourceType;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ServiceId")
        public Integer serviceId;

        @NameInMap("Status")
        public String status;

        public static ListStreamingDataSourcesResponseBodyDataSourceItems build(java.util.Map<String, ?> map) throws Exception {
            ListStreamingDataSourcesResponseBodyDataSourceItems self = new ListStreamingDataSourcesResponseBodyDataSourceItems();
            return TeaModel.build(map, self);
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setDataSourceConfig(String dataSourceConfig) {
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }
        public String getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setDataSourceDescription(String dataSourceDescription) {
            this.dataSourceDescription = dataSourceDescription;
            return this;
        }
        public String getDataSourceDescription() {
            return this.dataSourceDescription;
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setDataSourceId(Integer dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Integer getDataSourceId() {
            return this.dataSourceId;
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setServiceId(Integer serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Integer getServiceId() {
            return this.serviceId;
        }

        public ListStreamingDataSourcesResponseBodyDataSourceItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
