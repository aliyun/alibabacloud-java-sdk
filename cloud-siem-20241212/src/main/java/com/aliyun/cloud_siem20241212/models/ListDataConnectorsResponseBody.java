// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataConnectorsResponseBody extends TeaModel {
    /**
     * <p>The list of collectors.</p>
     */
    @NameInMap("DataConnector")
    public java.util.List<ListDataConnectorsResponseBodyDataConnector> dataConnector;

    /**
     * <p>The maximum number of records returned in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAASLVeIxed4466E0LVmGkzwS6hJKd9DGVGMDRM6Lu****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDataConnectorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataConnectorsResponseBody self = new ListDataConnectorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataConnectorsResponseBody setDataConnector(java.util.List<ListDataConnectorsResponseBodyDataConnector> dataConnector) {
        this.dataConnector = dataConnector;
        return this;
    }
    public java.util.List<ListDataConnectorsResponseBodyDataConnector> getDataConnector() {
        return this.dataConnector;
    }

    public ListDataConnectorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataConnectorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataConnectorsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataConnectorsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataConnectorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataConnectorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataConnectorsResponseBodyDataConnector extends TeaModel {
        /**
         * <p>The configuration item ID of the collector access object in the multi-cloud configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-smbc-prod-cloudtrail.s3.cn-north-1.amazonaws.com.cn_AKIAX4AUG6AYSJO7FAG4</p>
         */
        @NameInMap("AuthConfigId")
        public String authConfigId;

        /**
         * <p>The cloud product of the authentication configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>salesForceRestAPI</p>
         */
        @NameInMap("AuthConfigProduct")
        public String authConfigProduct;

        /**
         * <p>The cloud vendor of the authentication configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>SALESFORCE</p>
         */
        @NameInMap("AuthConfigVendor")
        public String authConfigVendor;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-01T02:14:24Z</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The collector configuration information.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;endpoint\&quot;:\&quot;csrm-sentinel.s3.cn-north-1.amazonaws.com.cn_AKIARGUYUGSX6A6VUXQJ\&quot;,\&quot;bucket\&quot;:\&quot;csrm-sentinel\&quot;,\&quot;prefix\&quot;:\&quot;AliTest/\&quot;,\&quot;format\&quot;:{\&quot;type\&quot;:\&quot;JSON\&quot;},\&quot;encoding\&quot;:\&quot;UTF-8\&quot;}</p>
         */
        @NameInMap("DataConnectorConfig")
        public String dataConnectorConfig;

        /**
         * <p>The collector ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-07423146117d77db266f78bc41f4fd80</p>
         */
        @NameInMap("DataConnectorId")
        public String dataConnectorId;

        /**
         * <p>The data connector name.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-***</p>
         */
        @NameInMap("DataConnectorName")
        public String dataConnectorName;

        /**
         * <p>The connector status.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("DataConnectorStatus")
        public String dataConnectorStatus;

        /**
         * <p>The connector type.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("DataConnectorType")
        public String dataConnectorType;

        /**
         * <p>The destination data source ID. This parameter is required only for synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-t3ywipile7gctobaunx0</p>
         */
        @NameInMap("DestDataSourceId")
        public String destDataSourceId;

        /**
         * <p>The Simple Log Service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-channel-1371069058301795-cn-shanghai</p>
         */
        @NameInMap("LogProjectName")
        public String logProjectName;

        /**
         * <p>The log storage region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("LogRegionId")
        public String logRegionId;

        /**
         * <p>The Simple Log Service Logstore name.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-wecom-crontasklog-prod</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The name of the SLS data import job associated with the collector.</p>
         * 
         * <strong>example:</strong>
         * <p>1a2b3c4d5e6f7a8b9c0d1e2f3a4b****</p>
         */
        @NameInMap("SlsIngestionJobName")
        public String slsIngestionJobName;

        /**
         * <p>The status of the SLS data import job associated with the collector.</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("SlsIngestionJobState")
        public String slsIngestionJobState;

        /**
         * <p>The source data type.</p>
         * 
         * <strong>example:</strong>
         * <p>s3</p>
         */
        @NameInMap("SrcDataType")
        public String srcDataType;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-04 22:31:54</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDataConnectorsResponseBodyDataConnector build(java.util.Map<String, ?> map) throws Exception {
            ListDataConnectorsResponseBodyDataConnector self = new ListDataConnectorsResponseBodyDataConnector();
            return TeaModel.build(map, self);
        }

        public ListDataConnectorsResponseBodyDataConnector setAuthConfigId(String authConfigId) {
            this.authConfigId = authConfigId;
            return this;
        }
        public String getAuthConfigId() {
            return this.authConfigId;
        }

        public ListDataConnectorsResponseBodyDataConnector setAuthConfigProduct(String authConfigProduct) {
            this.authConfigProduct = authConfigProduct;
            return this;
        }
        public String getAuthConfigProduct() {
            return this.authConfigProduct;
        }

        public ListDataConnectorsResponseBodyDataConnector setAuthConfigVendor(String authConfigVendor) {
            this.authConfigVendor = authConfigVendor;
            return this;
        }
        public String getAuthConfigVendor() {
            return this.authConfigVendor;
        }

        public ListDataConnectorsResponseBodyDataConnector setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListDataConnectorsResponseBodyDataConnector setDataConnectorConfig(String dataConnectorConfig) {
            this.dataConnectorConfig = dataConnectorConfig;
            return this;
        }
        public String getDataConnectorConfig() {
            return this.dataConnectorConfig;
        }

        public ListDataConnectorsResponseBodyDataConnector setDataConnectorId(String dataConnectorId) {
            this.dataConnectorId = dataConnectorId;
            return this;
        }
        public String getDataConnectorId() {
            return this.dataConnectorId;
        }

        public ListDataConnectorsResponseBodyDataConnector setDataConnectorName(String dataConnectorName) {
            this.dataConnectorName = dataConnectorName;
            return this;
        }
        public String getDataConnectorName() {
            return this.dataConnectorName;
        }

        public ListDataConnectorsResponseBodyDataConnector setDataConnectorStatus(String dataConnectorStatus) {
            this.dataConnectorStatus = dataConnectorStatus;
            return this;
        }
        public String getDataConnectorStatus() {
            return this.dataConnectorStatus;
        }

        public ListDataConnectorsResponseBodyDataConnector setDataConnectorType(String dataConnectorType) {
            this.dataConnectorType = dataConnectorType;
            return this;
        }
        public String getDataConnectorType() {
            return this.dataConnectorType;
        }

        public ListDataConnectorsResponseBodyDataConnector setDestDataSourceId(String destDataSourceId) {
            this.destDataSourceId = destDataSourceId;
            return this;
        }
        public String getDestDataSourceId() {
            return this.destDataSourceId;
        }

        public ListDataConnectorsResponseBodyDataConnector setLogProjectName(String logProjectName) {
            this.logProjectName = logProjectName;
            return this;
        }
        public String getLogProjectName() {
            return this.logProjectName;
        }

        public ListDataConnectorsResponseBodyDataConnector setLogRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }
        public String getLogRegionId() {
            return this.logRegionId;
        }

        public ListDataConnectorsResponseBodyDataConnector setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public ListDataConnectorsResponseBodyDataConnector setSlsIngestionJobName(String slsIngestionJobName) {
            this.slsIngestionJobName = slsIngestionJobName;
            return this;
        }
        public String getSlsIngestionJobName() {
            return this.slsIngestionJobName;
        }

        public ListDataConnectorsResponseBodyDataConnector setSlsIngestionJobState(String slsIngestionJobState) {
            this.slsIngestionJobState = slsIngestionJobState;
            return this;
        }
        public String getSlsIngestionJobState() {
            return this.slsIngestionJobState;
        }

        public ListDataConnectorsResponseBodyDataConnector setSrcDataType(String srcDataType) {
            this.srcDataType = srcDataType;
            return this;
        }
        public String getSrcDataType() {
            return this.srcDataType;
        }

        public ListDataConnectorsResponseBodyDataConnector setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
