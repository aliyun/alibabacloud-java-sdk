// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListStreamingDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The queried data sources.</p>
     */
    @NameInMap("DataSourceItems")
    public java.util.List<ListStreamingDataSourcesResponseBodyDataSourceItems> dataSourceItems;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The time when the data source was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The configurations of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;brokers&quot;:&quot;broker0:9091,broker1:9091&quot;,&quot;topic&quot;:&quot;topic&quot;}</p>
         */
        @NameInMap("DataSourceConfig")
        public String dataSourceConfig;

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test-kafka</p>
         */
        @NameInMap("DataSourceDescription")
        public String dataSourceDescription;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataSourceId")
        public Integer dataSourceId;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test-kafka</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>kafka</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kafka</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>The information about the service status. For example, if the service is in the exception state, the cause of the exception is displayed. If the service is in the running state, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the data source was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T17:00:00Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServiceId")
        public Integer serviceId;

        /**
         * <p>The status of the service. Valid values:</p>
         * <ul>
         * <li>init</li>
         * <li>running</li>
         * <li>exception</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
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
