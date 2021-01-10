// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddThingTopoShrinkRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("GwProductKey")
    public String gwProductKey;

    @NameInMap("Ext")
    public String extShrink;

    @NameInMap("GwDeviceName")
    public String gwDeviceName;

    @NameInMap("TopoAddItem")
    public java.util.List<BatchAddThingTopoShrinkRequestTopoAddItem> topoAddItem;

    public static BatchAddThingTopoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddThingTopoShrinkRequest self = new BatchAddThingTopoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddThingTopoShrinkRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BatchAddThingTopoShrinkRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public BatchAddThingTopoShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchAddThingTopoShrinkRequest setGwProductKey(String gwProductKey) {
        this.gwProductKey = gwProductKey;
        return this;
    }
    public String getGwProductKey() {
        return this.gwProductKey;
    }

    public BatchAddThingTopoShrinkRequest setExtShrink(String extShrink) {
        this.extShrink = extShrink;
        return this;
    }
    public String getExtShrink() {
        return this.extShrink;
    }

    public BatchAddThingTopoShrinkRequest setGwDeviceName(String gwDeviceName) {
        this.gwDeviceName = gwDeviceName;
        return this;
    }
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    public BatchAddThingTopoShrinkRequest setTopoAddItem(java.util.List<BatchAddThingTopoShrinkRequestTopoAddItem> topoAddItem) {
        this.topoAddItem = topoAddItem;
        return this;
    }
    public java.util.List<BatchAddThingTopoShrinkRequestTopoAddItem> getTopoAddItem() {
        return this.topoAddItem;
    }

    public static class BatchAddThingTopoShrinkRequestTopoAddItem extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("SignMethod")
        public String signMethod;

        @NameInMap("ClientId")
        public String clientId;

        public static BatchAddThingTopoShrinkRequestTopoAddItem build(java.util.Map<String, ?> map) throws Exception {
            BatchAddThingTopoShrinkRequestTopoAddItem self = new BatchAddThingTopoShrinkRequestTopoAddItem();
            return TeaModel.build(map, self);
        }

        public BatchAddThingTopoShrinkRequestTopoAddItem setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public BatchAddThingTopoShrinkRequestTopoAddItem setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchAddThingTopoShrinkRequestTopoAddItem setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public BatchAddThingTopoShrinkRequestTopoAddItem setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public BatchAddThingTopoShrinkRequestTopoAddItem setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public BatchAddThingTopoShrinkRequestTopoAddItem setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

}
