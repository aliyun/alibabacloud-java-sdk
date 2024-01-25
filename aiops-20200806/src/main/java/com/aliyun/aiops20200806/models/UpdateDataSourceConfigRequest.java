// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateDataSourceConfigRequest extends TeaModel {
    @NameInMap("DataSourceDescribe")
    public String dataSourceDescribe;

    @NameInMap("DataSourceName")
    public String dataSourceName;

    @NameInMap("DataSourceParams")
    public String dataSourceParams;

    @NameInMap("DataSourceParamsMapping")
    public String dataSourceParamsMapping;

    @NameInMap("DataSourceType")
    public Integer dataSourceType;

    @NameInMap("Id")
    public Long id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdateDataSourceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceConfigRequest self = new UpdateDataSourceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceConfigRequest setDataSourceDescribe(String dataSourceDescribe) {
        this.dataSourceDescribe = dataSourceDescribe;
        return this;
    }
    public String getDataSourceDescribe() {
        return this.dataSourceDescribe;
    }

    public UpdateDataSourceConfigRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public UpdateDataSourceConfigRequest setDataSourceParams(String dataSourceParams) {
        this.dataSourceParams = dataSourceParams;
        return this;
    }
    public String getDataSourceParams() {
        return this.dataSourceParams;
    }

    public UpdateDataSourceConfigRequest setDataSourceParamsMapping(String dataSourceParamsMapping) {
        this.dataSourceParamsMapping = dataSourceParamsMapping;
        return this;
    }
    public String getDataSourceParamsMapping() {
        return this.dataSourceParamsMapping;
    }

    public UpdateDataSourceConfigRequest setDataSourceType(Integer dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public Integer getDataSourceType() {
        return this.dataSourceType;
    }

    public UpdateDataSourceConfigRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDataSourceConfigRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
