// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddThingTopoRequest extends TeaModel {
    /**
     * <p>The name of the gateway.</p>
     */
    @NameInMap("GwDeviceName")
    public String gwDeviceName;

    /**
     * <p>The key of the product to which the gateway belongs.</p>
     */
    @NameInMap("GwProductKey")
    public String gwProductKey;

    /**
     * <p>The ID of the instance. On the **Overview** page in the IoT Platform console, you can view the ID of the instance.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</p>
     * <p>>*   If no **Overview** page or instance ID appears in the IoT Platform console, ignore this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
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
        /**
         * <p>The client ID of the sub-device. The ID can be the serial number (SN) or media access control (MAC) address of the device. This parameter is optional.</p>
         * <br>
         * <p>> If this parameter is included in the value of the **TopoAddItem.N.Sign** parameter, you must specify this parameter.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The name of each sub-device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The key of the product to which the sub-device belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The signature of the sub-device.</p>
         * <br>
         * <p>Set the Sign parameter to the result of the **SignMethod(deviceSecret,content)** function.</p>
         * <br>
         * <p>To obtain the **content** parameter, sort all sub-device parameters that are submitted to the server, except the Sign and SignMethod parameters, in alphabetical order. Then, concatenate the parameters and values in sequence. No concatenation symbol is required to separate these parameters and values.</p>
         * <br>
         * <p>For example, you want to specify the following parameters for a sub-device: **ClientId=868575026974305, DeviceName=868575026974305, ProductKey=a1PB5fp1234, SignMethod=hmacmd5, timestamp=1646277090411, and deviceSecret=1234**. In this case, the signature function is `hmacmd5(1234, clientId868575026974305deviceName868575026974305productKeya1PB5fp1234timestamp1646277090411)`, and the calculation result is `3BA0DFA4C477B40C007D84D30D6466CC`.</p>
         * <br>
         * <p>>  In the preceding example, **ClientId** indicates the client ID of the sub-device. You can specify a custom client ID.</p>
         * <br>
         * <p>For more information about how to calculate the signature value, see [How do I obtain MQTT parameters for authentication?](~~292635~~). The signature value is the calculated value of the passwd parameter.</p>
         */
        @NameInMap("Sign")
        public String sign;

        /**
         * <p>The signature algorithm. Valid values: **hmacSha1**, **hmacSha256**, **hmacMd5**, and **Sha256**. The value is not case-sensitive.</p>
         */
        @NameInMap("SignMethod")
        public String signMethod;

        /**
         * <p>The timestamp in UTC. This parameter is optional.</p>
         * <br>
         * <p>> If this parameter is included in the value of the **TopoAddItem.N.Sign** parameter, you must specify this parameter.</p>
         */
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
