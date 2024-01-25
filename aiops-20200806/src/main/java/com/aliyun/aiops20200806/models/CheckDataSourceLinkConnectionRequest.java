// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CheckDataSourceLinkConnectionRequest extends TeaModel {
    @NameInMap("DataSourceParams")
    public String dataSourceParams;

    @NameInMap("DataSourceType")
    public Integer dataSourceType;

    @NameInMap("OperaUid")
    public String operaUid;

    public static CheckDataSourceLinkConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataSourceLinkConnectionRequest self = new CheckDataSourceLinkConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CheckDataSourceLinkConnectionRequest setDataSourceParams(String dataSourceParams) {
        this.dataSourceParams = dataSourceParams;
        return this;
    }
    public String getDataSourceParams() {
        return this.dataSourceParams;
    }

    public CheckDataSourceLinkConnectionRequest setDataSourceType(Integer dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public Integer getDataSourceType() {
        return this.dataSourceType;
    }

    public CheckDataSourceLinkConnectionRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
