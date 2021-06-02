// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryRobotListRequest extends TeaModel {
    // corpId
    @NameInMap("CorpId")
    public String corpId;

    // openInstanceId
    @NameInMap("OpenInstanceId")
    public String openInstanceId;

    // productionType
    @NameInMap("ProductionType")
    public Integer productionType;

    public static QueryRobotListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotListRequest self = new QueryRobotListRequest();
        return TeaModel.build(map, self);
    }

    public QueryRobotListRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public QueryRobotListRequest setOpenInstanceId(String openInstanceId) {
        this.openInstanceId = openInstanceId;
        return this;
    }
    public String getOpenInstanceId() {
        return this.openInstanceId;
    }

    public QueryRobotListRequest setProductionType(Integer productionType) {
        this.productionType = productionType;
        return this;
    }
    public Integer getProductionType() {
        return this.productionType;
    }

}
