// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutDataSourceConfigRequest extends TeaModel {
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

    @NameInMap("OperaUid")
    public String operaUid;

    public static PutDataSourceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDataSourceConfigRequest self = new PutDataSourceConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutDataSourceConfigRequest setDataSourceDescribe(String dataSourceDescribe) {
        this.dataSourceDescribe = dataSourceDescribe;
        return this;
    }
    public String getDataSourceDescribe() {
        return this.dataSourceDescribe;
    }

    public PutDataSourceConfigRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public PutDataSourceConfigRequest setDataSourceParams(String dataSourceParams) {
        this.dataSourceParams = dataSourceParams;
        return this;
    }
    public String getDataSourceParams() {
        return this.dataSourceParams;
    }

    public PutDataSourceConfigRequest setDataSourceParamsMapping(String dataSourceParamsMapping) {
        this.dataSourceParamsMapping = dataSourceParamsMapping;
        return this;
    }
    public String getDataSourceParamsMapping() {
        return this.dataSourceParamsMapping;
    }

    public PutDataSourceConfigRequest setDataSourceType(Integer dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public Integer getDataSourceType() {
        return this.dataSourceType;
    }

    public PutDataSourceConfigRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
