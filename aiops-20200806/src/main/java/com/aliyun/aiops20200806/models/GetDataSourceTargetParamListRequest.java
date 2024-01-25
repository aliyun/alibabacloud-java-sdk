// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetDataSourceTargetParamListRequest extends TeaModel {
    @NameInMap("DataSourceType")
    public Integer dataSourceType;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetDataSourceTargetParamListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceTargetParamListRequest self = new GetDataSourceTargetParamListRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceTargetParamListRequest setDataSourceType(Integer dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public Integer getDataSourceType() {
        return this.dataSourceType;
    }

    public GetDataSourceTargetParamListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
