// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoSqlOptimizeStatusRequest extends TeaModel {
    @NameInMap("Instances")
    public String instances;

    @NameInMap("Status")
    public Integer status;

    public static UpdateAutoSqlOptimizeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoSqlOptimizeStatusRequest self = new UpdateAutoSqlOptimizeStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoSqlOptimizeStatusRequest setInstances(String instances) {
        this.instances = instances;
        return this;
    }
    public String getInstances() {
        return this.instances;
    }

    public UpdateAutoSqlOptimizeStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
