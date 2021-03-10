// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductFilterConfigRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("PropertyTimestampFilter")
    public Boolean propertyTimestampFilter;

    @NameInMap("PropertyValueFilter")
    public Boolean propertyValueFilter;

    public static UpdateProductFilterConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductFilterConfigRequest self = new UpdateProductFilterConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductFilterConfigRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public UpdateProductFilterConfigRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public UpdateProductFilterConfigRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateProductFilterConfigRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateProductFilterConfigRequest setPropertyTimestampFilter(Boolean propertyTimestampFilter) {
        this.propertyTimestampFilter = propertyTimestampFilter;
        return this;
    }
    public Boolean getPropertyTimestampFilter() {
        return this.propertyTimestampFilter;
    }

    public UpdateProductFilterConfigRequest setPropertyValueFilter(Boolean propertyValueFilter) {
        this.propertyValueFilter = propertyValueFilter;
        return this;
    }
    public Boolean getPropertyValueFilter() {
        return this.propertyValueFilter;
    }

}
