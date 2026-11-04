// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryVoiceIntercomRequest extends TeaModel {
    /**
     * <p>The DeviceName of the IPC device.
     * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>camera1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The device ID of the IPC device. The ID is issued by IoT Platform and is the unique identifier of the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the ID.</p>
     * <blockquote>
     * <p>Notice:  As the unique identifier of the device, <strong>IotId</strong> has a one-to-one mapping with the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>C47T6xwp6ms4bNlkHRWCg4****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>If an <strong>ID</strong> value is available, you must specify the <strong>ID</strong>. Otherwise, the call fails.</li>
     * <li>If the <strong>Instance Overview</strong> page or the <strong>ID</strong> value is not available, you do not need to specify this parameter.</li>
     * </ul>
     * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y*****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the IPC device belongs.
     * You can view the information about all products under the current account on the <strong>Products</strong> page in the IoT Platform console or by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The connection protocol type for voice intercom. Valid values:</p>
     * <ul>
     * <li><strong>ws</strong>: WebSocket. Call this operation to obtain the web voice call address when you implement the voice intercom feature on web clients. &lt;props=&quot;china&quot;&gt;<ph>For more information about how to implement the voice intercom feature between web clients and devices, see <a href="https://help.aliyun.com/document_detail/2545966.html">Web voice intercom integration guide</a>.</ph></li>
     * <li><strong>rtmp</strong> (default): Real-Time Messaging Protocol (RTMP). Call this operation to obtain the corresponding voice call address when you implement the voice intercom feature by using players in Android and iOS applications. For more information about how to implement the voice intercom feature between Android and iOS applications and devices, see <a href="https://help.aliyun.com/document_detail/260925.html">Android voice intercom</a> and <a href="https://help.aliyun.com/document_detail/253953.html">iOS voice intercom</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("Scheme")
    public String scheme;

    public static QueryVoiceIntercomRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceIntercomRequest self = new QueryVoiceIntercomRequest();
        return TeaModel.build(map, self);
    }

    public QueryVoiceIntercomRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryVoiceIntercomRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryVoiceIntercomRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryVoiceIntercomRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryVoiceIntercomRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

}
