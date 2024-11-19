// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchAddThingTopoRequest extends TeaModel {
    /**
     * <p>The name of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gateway</p>
     */
    @NameInMap("GwDeviceName")
    public String gwDeviceName;

    /**
     * <p>The key of the product to which the gateway belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1vL7cp****</p>
     */
    @NameInMap("GwProductKey")
    public String gwProductKey;

    /**
     * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the ID of the instance.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or instance ID appears in the IoT Platform console, ignore this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
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
         * <blockquote>
         * <p>If this parameter is included in the value of the <strong>TopoAddItem.N.Sign</strong> parameter, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****device1</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The name of each sub-device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The key of the product to which the sub-device belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The signature of the sub-device.</p>
         * <p>Set the Sign parameter to the result of the <strong>SignMethod(deviceSecret,content)</strong> function.</p>
         * <p>To obtain the <strong>content</strong> parameter, sort all sub-device parameters that are submitted to the server, except the Sign and SignMethod parameters, in alphabetical order. Then, concatenate the parameters and values in sequence. No concatenation symbol is required to separate these parameters and values.</p>
         * <p>For example, you want to specify the following parameters for a sub-device: <strong>ClientId=868575026974305, DeviceName=868575026974305, ProductKey=a1PB5fp1234, SignMethod=hmacmd5, timestamp=1646277090411, and deviceSecret=1234</strong>. In this case, the signature function is <code>hmacmd5(1234, clientId868575026974305deviceName868575026974305productKeya1PB5fp1234timestamp1646277090411)</code>, and the calculation result is <code>3BA0DFA4C477B40C007D84D30D6466CC</code>.</p>
         * <blockquote>
         * <p> In the preceding example, <strong>ClientId</strong> indicates the client ID of the sub-device. You can specify a custom client ID.</p>
         * </blockquote>
         * <p>For more information about how to calculate the signature value, see <a href="https://help.aliyun.com/document_detail/292635.html">How do I obtain MQTT parameters for authentication?</a>. The signature value is the calculated value of the passwd parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C1C1606D61884C5F16C9EA6622E5****</p>
         */
        @NameInMap("Sign")
        public String sign;

        /**
         * <p>The signature algorithm. Valid values: <strong>hmacSha1</strong>, <strong>hmacSha256</strong>, <strong>hmacMd5</strong>, and <strong>Sha256</strong>. The value is not case-sensitive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hmacMd5</p>
         */
        @NameInMap("SignMethod")
        public String signMethod;

        /**
         * <p>The timestamp in UTC. This parameter is optional.</p>
         * <blockquote>
         * <p>If this parameter is included in the value of the <strong>TopoAddItem.N.Sign</strong> parameter, you must specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1579335899000</p>
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
