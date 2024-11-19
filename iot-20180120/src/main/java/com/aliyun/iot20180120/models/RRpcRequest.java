// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RRpcRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>240</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>The name of the device that receives the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
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
     * <p>The ProductKey of the product to which the device belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aldfeSe****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RequestBase64Byte")
    public String requestBase64Byte;

    /**
     * <p>The timeout period of a response. Unit: milliseconds. Valid values: 1000 to 8000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The custom revert-RPC (RRPC) topic. Before you can use a custom RRPC topic, you must configure the device. For more information, see <a href="https://help.aliyun.com/document_detail/90570.html">Use custom topics</a>.</p>
     * <p>If you do not configure this parameter, the default RRPC topic is used.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static RRpcRequest build(java.util.Map<String, ?> map) throws Exception {
        RRpcRequest self = new RRpcRequest();
        return TeaModel.build(map, self);
    }

    public RRpcRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public RRpcRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RRpcRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RRpcRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public RRpcRequest setRequestBase64Byte(String requestBase64Byte) {
        this.requestBase64Byte = requestBase64Byte;
        return this;
    }
    public String getRequestBase64Byte() {
        return this.requestBase64Byte;
    }

    public RRpcRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public RRpcRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
