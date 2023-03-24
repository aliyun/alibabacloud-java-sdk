// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteElasticPlanRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    public static DeleteElasticPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticPlanRequest self = new DeleteElasticPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteElasticPlanRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteElasticPlanRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

}
