// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListExternalDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The Hadoop external table services.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListExternalDataSourcesResponseBodyItems> items;

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
     * <p>BBE00C04-A3E8-4114-881D-0480A72CB92E</p>
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
        /**
         * <p>The time when the service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-08T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DataSourceDescription")
        public String dataSourceDescription;

        /**
         * <p>The service directory in which Hadoop-related configuration files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>HadoopDir</p>
         */
        @NameInMap("DataSourceDir")
        public String dataSourceDir;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DataSourceId")
        public Integer dataSourceId;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs_pxf</p>
         */
        @NameInMap("DataSourceName")
        public String dataSourceName;

        /**
         * <p>The status of the service. Valid values:</p>
         * <ul>
         * <li>init</li>
         * <li>running</li>
         * <li>exception</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DataSourceStatus")
        public String dataSourceStatus;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ExternalDataServiceId")
        public Integer externalDataServiceId;

        /**
         * <p>The time when the service was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-08T16:00:00Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The information about the service status. For example, if the service is in the exception state, the cause of the exception is displayed. If the service is in the running state, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
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
