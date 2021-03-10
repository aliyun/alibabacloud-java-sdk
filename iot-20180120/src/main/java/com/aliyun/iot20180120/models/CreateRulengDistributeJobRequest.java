// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRulengDistributeJobRequest extends TeaModel {
    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("SourceInstanceId")
    @Validation(required = true)
    public String sourceInstanceId;

    @NameInMap("TargetInstanceId")
    @Validation(required = true)
    public String targetInstanceId;

    public static CreateRulengDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRulengDistributeJobRequest self = new CreateRulengDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRulengDistributeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateRulengDistributeJobRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateRulengDistributeJobRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

}
