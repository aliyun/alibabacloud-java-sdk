// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSourceRequest extends TeaModel {
    /**
     * <p>The data source. Valid values:</p>
     * <ul>
     * <li>center</li>
     * <li>custom</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("DataSourceFrom")
    public String dataSourceFrom;

    /**
     * <p>The data source ID. This parameter is required and specifies the ID of the data source to update. If it is not provided, the API returns a 400 error.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-014frtpy28m5ct2eoyo1</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The data source name.</p>
     * 
     * <strong>example:</strong>
     * <p>ActiontrailLog</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>Specifies whether to automatically discover new Logstores.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSourceRecognizeEnabled")
    public Boolean dataSourceRecognizeEnabled;

    /**
     * <p>The list of Simple Log Service Logstores.</p>
     */
    @NameInMap("DataSourceStores")
    public java.util.List<UpdateDataSourceRequestDataSourceStores> dataSourceStores;

    /**
     * <p>The language of the response messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English. This parameter is required. If it is not provided, the service returns a 400 error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The Simple Log Service project name.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
     */
    @NameInMap("LogProjectName")
    public String logProjectName;

    /**
     * <p>The ID of the log storage region.</p>
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
     * <p>cn-rds-sqlaudit</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The user ID for data ingestion.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("LogUserId")
    public Long logUserId;

    /**
     * <p>The field used to sort the rule list. Valid values:</p>
     * <ul>
     * <li>GmtModified: Sort by modification time.</li>
     * <li>Id: Sort by rule ID (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Id</p>
     */
    @NameInMap("OrderField")
    public String orderField;

    /**
     * <p>The region where the data management center of the threat analysis service is located. Select the management center region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member account that the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceRequest self = new UpdateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceRequest setDataSourceFrom(String dataSourceFrom) {
        this.dataSourceFrom = dataSourceFrom;
        return this;
    }
    public String getDataSourceFrom() {
        return this.dataSourceFrom;
    }

    public UpdateDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public UpdateDataSourceRequest setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
        this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
        return this;
    }
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    public UpdateDataSourceRequest setDataSourceStores(java.util.List<UpdateDataSourceRequestDataSourceStores> dataSourceStores) {
        this.dataSourceStores = dataSourceStores;
        return this;
    }
    public java.util.List<UpdateDataSourceRequestDataSourceStores> getDataSourceStores() {
        return this.dataSourceStores;
    }

    public UpdateDataSourceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataSourceRequest setLogProjectName(String logProjectName) {
        this.logProjectName = logProjectName;
        return this;
    }
    public String getLogProjectName() {
        return this.logProjectName;
    }

    public UpdateDataSourceRequest setLogRegionId(String logRegionId) {
        this.logRegionId = logRegionId;
        return this;
    }
    public String getLogRegionId() {
        return this.logRegionId;
    }

    public UpdateDataSourceRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public UpdateDataSourceRequest setLogUserId(Long logUserId) {
        this.logUserId = logUserId;
        return this;
    }
    public Long getLogUserId() {
        return this.logUserId;
    }

    public UpdateDataSourceRequest setOrderField(String orderField) {
        this.orderField = orderField;
        return this;
    }
    public String getOrderField() {
        return this.orderField;
    }

    public UpdateDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataSourceRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static class UpdateDataSourceRequestDataSourceStores extends TeaModel {
        /**
         * <p>The data source. Valid values:</p>
         * <ul>
         * <li>center</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("DataSourceStoreFrom")
        public String dataSourceStoreFrom;

        /**
         * <p>The log storage ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataSourceStoreId")
        public String dataSourceStoreId;

        /**
         * <p>The Simple Log Service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-cloudsiem-data-173326*******-cn-hangzhou</p>
         */
        @NameInMap("LogProjectName")
        public String logProjectName;

        /**
         * <p>The ID of the log storage region.</p>
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
         * <p>cn-rds-sqlaudit</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        public static UpdateDataSourceRequestDataSourceStores build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataSourceRequestDataSourceStores self = new UpdateDataSourceRequestDataSourceStores();
            return TeaModel.build(map, self);
        }

        public UpdateDataSourceRequestDataSourceStores setDataSourceStoreFrom(String dataSourceStoreFrom) {
            this.dataSourceStoreFrom = dataSourceStoreFrom;
            return this;
        }
        public String getDataSourceStoreFrom() {
            return this.dataSourceStoreFrom;
        }

        public UpdateDataSourceRequestDataSourceStores setDataSourceStoreId(String dataSourceStoreId) {
            this.dataSourceStoreId = dataSourceStoreId;
            return this;
        }
        public String getDataSourceStoreId() {
            return this.dataSourceStoreId;
        }

        public UpdateDataSourceRequestDataSourceStores setLogProjectName(String logProjectName) {
            this.logProjectName = logProjectName;
            return this;
        }
        public String getLogProjectName() {
            return this.logProjectName;
        }

        public UpdateDataSourceRequestDataSourceStores setLogRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }
        public String getLogRegionId() {
            return this.logRegionId;
        }

        public UpdateDataSourceRequestDataSourceStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

    }

}
