// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteAdbMySqlDevParametersRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DevParamsId")
    public Long devParamsId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAdbMySqlDevParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdbMySqlDevParametersRequest self = new DeleteAdbMySqlDevParametersRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAdbMySqlDevParametersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAdbMySqlDevParametersRequest setDevParamsId(Long devParamsId) {
        this.devParamsId = devParamsId;
        return this;
    }
    public Long getDevParamsId() {
        return this.devParamsId;
    }

    public DeleteAdbMySqlDevParametersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
