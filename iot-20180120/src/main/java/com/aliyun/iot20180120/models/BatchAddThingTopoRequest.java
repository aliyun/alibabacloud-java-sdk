// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddThingTopoRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TopoAddItem")
    public java.util.List<BatchAddThingTopoRequestTopoAddItem> topoAddItem;

    @NameInMap("GwProductKey")
    public String gwProductKey;

    @NameInMap("Ext")
    public String ext;

    @NameInMap("GwDeviceName")
    public String gwDeviceName;

    public static BatchAddThingTopoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddThingTopoRequest self = new BatchAddThingTopoRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddThingTopoRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public BatchAddThingTopoRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public BatchAddThingTopoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public BatchAddThingTopoRequest setTopoAddItem(java.util.List<BatchAddThingTopoRequestTopoAddItem> topoAddItem) {
        this.topoAddItem = topoAddItem;
        return this;
    }
    public java.util.List<BatchAddThingTopoRequestTopoAddItem> getTopoAddItem() {
        return this.topoAddItem;
    }

    public BatchAddThingTopoRequest setGwProductKey(String gwProductKey) {
        this.gwProductKey = gwProductKey;
        return this;
    }
    public String getGwProductKey() {
        return this.gwProductKey;
    }

    public BatchAddThingTopoRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public BatchAddThingTopoRequest setGwDeviceName(String gwDeviceName) {
        this.gwDeviceName = gwDeviceName;
        return this;
    }
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    public static class BatchAddThingTopoRequestTopoAddItem extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("SignMethod")
        public String signMethod;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("ClientId")
        public String clientId;

        public static BatchAddThingTopoRequestTopoAddItem build(java.util.Map<String, ?> map) throws Exception {
            BatchAddThingTopoRequestTopoAddItem self = new BatchAddThingTopoRequestTopoAddItem();
            return TeaModel.build(map, self);
        }

        public BatchAddThingTopoRequestTopoAddItem setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public BatchAddThingTopoRequestTopoAddItem setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchAddThingTopoRequestTopoAddItem setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public BatchAddThingTopoRequestTopoAddItem setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public BatchAddThingTopoRequestTopoAddItem setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public BatchAddThingTopoRequestTopoAddItem setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

}
