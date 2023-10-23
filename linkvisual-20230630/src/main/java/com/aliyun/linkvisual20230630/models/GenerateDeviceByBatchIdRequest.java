// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GenerateDeviceByBatchIdRequest extends TeaModel {
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ProjectId")
    public String projectId;

    public static GenerateDeviceByBatchIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDeviceByBatchIdRequest self = new GenerateDeviceByBatchIdRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDeviceByBatchIdRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public GenerateDeviceByBatchIdRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public GenerateDeviceByBatchIdRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
