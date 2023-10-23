// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GenerateDeviceRequest extends TeaModel {
    @NameInMap("Amount")
    public Long amount;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProjectId")
    public String projectId;

    public static GenerateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceRequest self = new GenerateDeviceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public GenerateDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public GenerateDeviceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
