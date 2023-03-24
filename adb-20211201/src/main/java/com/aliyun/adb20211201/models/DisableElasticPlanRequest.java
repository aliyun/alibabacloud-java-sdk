// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DisableElasticPlanRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    public static DisableElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableElasticPlanRequest self = new DisableElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public DisableElasticPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DisableElasticPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

}
