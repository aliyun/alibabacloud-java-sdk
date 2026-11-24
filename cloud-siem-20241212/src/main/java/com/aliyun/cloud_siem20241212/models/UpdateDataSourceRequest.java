// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSourceRequest extends TeaModel {
    @NameInMap("DataSourceFrom")
    public String dataSourceFrom;

    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceRecognizeEnabled")
    public Boolean dataSourceRecognizeEnabled;

    @NameInMap("DataSourceStores")
    public java.util.List<UpdateDataSourceRequestDataSourceStores> dataSourceStores;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LogProjectName")
    public String logProjectName;

    @NameInMap("LogRegionId")
    public String logRegionId;

    @NameInMap("LogStoreName")
    public String logStoreName;

    @NameInMap("LogUserId")
    public Long logUserId;

    @NameInMap("OrderField")
    public String orderField;

    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("DataSourceStoreFrom")
        public String dataSourceStoreFrom;

        @NameInMap("DataSourceStoreId")
        public String dataSourceStoreId;

        @NameInMap("LogProjectName")
        public String logProjectName;

        @NameInMap("LogRegionId")
        public String logRegionId;

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
