// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddThingTopoRequest extends TeaModel {
    @NameInMap("GwDeviceName")
    public String gwDeviceName;

    @NameInMap("GwProductKey")
    public String gwProductKey;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TopoAddItem")
    public java.util.List<BatchAddThingTopoRequestTopoAddItem> topoAddItem;

    public static BatchAddThingTopoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchAddThingTopoRequest self = new BatchAddThingTopoRequest();
        return TeaModel.build(map, self);
    }

    public BatchAddThingTopoRequest setGwDeviceName(String gwDeviceName) {
        this.gwDeviceName = gwDeviceName;
        return this;
    }
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    public BatchAddThingTopoRequest setGwProductKey(String gwProductKey) {
        this.gwProductKey = gwProductKey;
        return this;
    }
    public String getGwProductKey() {
        return this.gwProductKey;
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

    public static class BatchAddThingTopoRequestTopoAddItem extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("SignMethod")
        public String signMethod;

        @NameInMap("Timestamp")
        public String timestamp;

        public static BatchAddThingTopoRequestTopoAddItem build(java.util.Map<String, ?> map) throws Exception {
            BatchAddThingTopoRequestTopoAddItem self = new BatchAddThingTopoRequestTopoAddItem();
            return TeaModel.build(map, self);
        }

        public BatchAddThingTopoRequestTopoAddItem setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public BatchAddThingTopoRequestTopoAddItem setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchAddThingTopoRequestTopoAddItem setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
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

    }

}
