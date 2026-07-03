// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataSourceRequest extends TeaModel {
    /**
     * <p>The source of the data. Valid values:</p>
     * <ul>
     * <li><p>center</p>
     * </li>
     * <li><p>custom</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>center</p>
     */
    @NameInMap("DataSourceFrom")
    public String dataSourceFrom;

    /**
     * <p>A list of data source IDs.</p>
     */
    @NameInMap("DataSourceIds")
    public java.util.List<String> dataSourceIds;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>AD_LOG</p>
     */
    @NameInMap("DataSourceName")
    public String dataSourceName;

    /**
     * <p>Specifies whether to automatically discover new data sources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DataSourceRecognizeEnabled")
    public Boolean dataSourceRecognizeEnabled;

    /**
     * <p>The data source recognizer.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_waf_flow_log_1766185894104675</p>
     */
    @NameInMap("DataSourceRecognizer")
    public String dataSourceRecognizer;

    /**
     * <p>The IDs of associated data access instances.</p>
     */
    @NameInMap("DataSourceReferences")
    public java.util.List<String> dataSourceReferences;

    /**
     * <p>The list of Simple Log Service projects.</p>
     */
    @NameInMap("DataSourceStores")
    public java.util.List<CreateDataSourceRequestDataSourceStores> dataSourceStores;

    /**
     * <p>The ID of the data source template.</p>
     * 
     * <strong>example:</strong>
     * <p>dst_alibaba_cloud_nas_audit_log_1358117679873357</p>
     */
    @NameInMap("DataSourceTemplateId")
    public String dataSourceTemplateId;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p>preset</p>
     * </li>
     * <li><p>custom</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>preset</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the Simple Log Service project.</p>
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
     * <p>The name of the Simple Log Service Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>mde_raw</p>
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
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>desc: descending.</p>
     * </li>
     * <li><p>asc: ascending.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The region of the Management Hub. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Assets are outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member whose perspective the administrator assumes.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static CreateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceRequest self = new CreateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceRequest setDataSourceFrom(String dataSourceFrom) {
        this.dataSourceFrom = dataSourceFrom;
        return this;
    }
    public String getDataSourceFrom() {
        return this.dataSourceFrom;
    }

    public CreateDataSourceRequest setDataSourceIds(java.util.List<String> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
        return this;
    }
    public java.util.List<String> getDataSourceIds() {
        return this.dataSourceIds;
    }

    public CreateDataSourceRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public CreateDataSourceRequest setDataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
        this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
        return this;
    }
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    public CreateDataSourceRequest setDataSourceRecognizer(String dataSourceRecognizer) {
        this.dataSourceRecognizer = dataSourceRecognizer;
        return this;
    }
    public String getDataSourceRecognizer() {
        return this.dataSourceRecognizer;
    }

    public CreateDataSourceRequest setDataSourceReferences(java.util.List<String> dataSourceReferences) {
        this.dataSourceReferences = dataSourceReferences;
        return this;
    }
    public java.util.List<String> getDataSourceReferences() {
        return this.dataSourceReferences;
    }

    public CreateDataSourceRequest setDataSourceStores(java.util.List<CreateDataSourceRequestDataSourceStores> dataSourceStores) {
        this.dataSourceStores = dataSourceStores;
        return this;
    }
    public java.util.List<CreateDataSourceRequestDataSourceStores> getDataSourceStores() {
        return this.dataSourceStores;
    }

    public CreateDataSourceRequest setDataSourceTemplateId(String dataSourceTemplateId) {
        this.dataSourceTemplateId = dataSourceTemplateId;
        return this;
    }
    public String getDataSourceTemplateId() {
        return this.dataSourceTemplateId;
    }

    public CreateDataSourceRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public CreateDataSourceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDataSourceRequest setLogProjectName(String logProjectName) {
        this.logProjectName = logProjectName;
        return this;
    }
    public String getLogProjectName() {
        return this.logProjectName;
    }

    public CreateDataSourceRequest setLogRegionId(String logRegionId) {
        this.logRegionId = logRegionId;
        return this;
    }
    public String getLogRegionId() {
        return this.logRegionId;
    }

    public CreateDataSourceRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public CreateDataSourceRequest setLogUserId(Long logUserId) {
        this.logUserId = logUserId;
        return this;
    }
    public Long getLogUserId() {
        return this.logUserId;
    }

    public CreateDataSourceRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public CreateDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataSourceRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static class CreateDataSourceRequestDataSourceStores extends TeaModel {
        /**
         * <p>The source of the data. Valid values:</p>
         * <ul>
         * <li><p>center</p>
         * </li>
         * <li><p>custom</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("DataSourceStoreFrom")
        public String dataSourceStoreFrom;

        /**
         * <p>The ID of the log storage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataSourceStoreId")
        public String dataSourceStoreId;

        /**
         * <p>The status of the log storage. Valid values:</p>
         * <ul>
         * <li><p>normal</p>
         * </li>
         * <li><p>abnormal</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("DataSourceStoreStatus")
        public String dataSourceStoreStatus;

        /**
         * <p>The name of the Simple Log Service project.</p>
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
         * <p>The name of the Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>actiontrail_management-events</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        public static CreateDataSourceRequestDataSourceStores build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSourceRequestDataSourceStores self = new CreateDataSourceRequestDataSourceStores();
            return TeaModel.build(map, self);
        }

        public CreateDataSourceRequestDataSourceStores setDataSourceStoreFrom(String dataSourceStoreFrom) {
            this.dataSourceStoreFrom = dataSourceStoreFrom;
            return this;
        }
        public String getDataSourceStoreFrom() {
            return this.dataSourceStoreFrom;
        }

        public CreateDataSourceRequestDataSourceStores setDataSourceStoreId(String dataSourceStoreId) {
            this.dataSourceStoreId = dataSourceStoreId;
            return this;
        }
        public String getDataSourceStoreId() {
            return this.dataSourceStoreId;
        }

        public CreateDataSourceRequestDataSourceStores setDataSourceStoreStatus(String dataSourceStoreStatus) {
            this.dataSourceStoreStatus = dataSourceStoreStatus;
            return this;
        }
        public String getDataSourceStoreStatus() {
            return this.dataSourceStoreStatus;
        }

        public CreateDataSourceRequestDataSourceStores setLogProjectName(String logProjectName) {
            this.logProjectName = logProjectName;
            return this;
        }
        public String getLogProjectName() {
            return this.logProjectName;
        }

        public CreateDataSourceRequestDataSourceStores setLogRegionId(String logRegionId) {
            this.logRegionId = logRegionId;
            return this;
        }
        public String getLogRegionId() {
            return this.logRegionId;
        }

        public CreateDataSourceRequestDataSourceStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

    }

}
