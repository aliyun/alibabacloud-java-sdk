// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeDriverRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("DriverIds")
    public java.util.List<String> driverIds;

    public static BatchGetEdgeDriverRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeDriverRequest self = new BatchGetEdgeDriverRequest();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeDriverRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BatchGetEdgeDriverRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public BatchGetEdgeDriverRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchGetEdgeDriverRequest setDriverIds(java.util.List<String> driverIds) {
        this.driverIds = driverIds;
        return this;
    }
    public java.util.List<String> getDriverIds() {
        return this.driverIds;
    }

}
