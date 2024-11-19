// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSubscribeRelationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>nJRaJPn5U1JITGfjBO9l00****</p>
     */
    @NameInMap("ConsumerGroupIds")
    public java.util.List<String> consumerGroupIds;

    /**
     * <p>Specifies whether to push upstream device messages. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeviceDataFlag")
    public Boolean deviceDataFlag;

    /**
     * <p>Specifies whether to push messages about device lifecycle changes. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeviceLifeCycleFlag")
    public Boolean deviceLifeCycleFlag;

    /**
     * <p>Specifies whether to push messages about device status changes. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeviceStatusChangeFlag")
    public Boolean deviceStatusChangeFlag;

    /**
     * <p>Specifies whether to push messages about topological relationship changes of devices. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes. This parameter takes effect only if the <strong>Type</strong> parameter is set to <strong>AMQP</strong>.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeviceTagFlag")
    public Boolean deviceTagFlag;

    /**
     * <p>Specifies whether to push messages about topological relationship changes of devices. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes. This parameter is valid only for gateway products.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeviceTopoLifeCycleFlag")
    public Boolean deviceTopoLifeCycleFlag;

    /**
     * <p>Specifies whether to push messages if a gateway detects new sub-devices. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes. This parameter is valid only for gateway products.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FoundDeviceListFlag")
    public Boolean foundDeviceListFlag;

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
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The configurations of the MNS queue. This parameter is required if the <strong>Type</strong> parameter is set to <strong>AMQP</strong>.</p>
     * <p>For more information, see the &quot;Definition of the MnsConfiguration parameter&quot; section.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;queueName&quot;: &quot;mns-test-topic1&quot;,     &quot;regionName&quot;: &quot;cn-shanghai&quot;,     &quot;role&quot;: {         &quot;roleArn&quot;: &quot;acs:ram::5645***:role/aliyuniotaccessingmnsrole&quot;,         &quot;roleName&quot;: &quot;AliyunIOTAccessingMNSRole&quot;     } }</p>
     */
    @NameInMap("MnsConfiguration")
    public String mnsConfiguration;

    /**
     * <p>Specifies whether to push notifications about the status of OTA update batches. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OtaEventFlag")
    public Boolean otaEventFlag;

    /**
     * <p>Specifies whether to push notifications about the statuses of OTA update batches. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes. This parameter takes effect only if the <strong>Type</strong> parameter is set to <strong>AMQP</strong>.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OtaJobFlag")
    public Boolean otaJobFlag;

    /**
     * <p>Specifies whether to push messages about OTA module version numbers. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes. This parameter takes effect only if the <strong>Type</strong> parameter is set to <strong>AMQP</strong>.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OtaVersionFlag")
    public Boolean otaVersionFlag;

    /**
     * <p>The <strong>ProductKey</strong> of the product that is specified for the subscription.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1fyXVF****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <strong>example:</strong>
     * <p>{     &quot;jt808DeviceDataFlag&quot;: true }</p>
     */
    @NameInMap("SubscribeFlags")
    public String subscribeFlags;

    /**
     * <p>Specifies whether to push upstream historical Thing Specification Language (TSL) data. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong>: no.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ThingHistoryFlag")
    public Boolean thingHistoryFlag;

    /**
     * <p>The type of the subscription. Valid values:</p>
     * <ul>
     * <li><strong>MNS</strong></li>
     * <li><strong>AMQP</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AMQP</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateSubscribeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscribeRelationRequest self = new UpdateSubscribeRelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscribeRelationRequest setConsumerGroupIds(java.util.List<String> consumerGroupIds) {
        this.consumerGroupIds = consumerGroupIds;
        return this;
    }
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

    public UpdateSubscribeRelationRequest setDeviceDataFlag(Boolean deviceDataFlag) {
        this.deviceDataFlag = deviceDataFlag;
        return this;
    }
    public Boolean getDeviceDataFlag() {
        return this.deviceDataFlag;
    }

    public UpdateSubscribeRelationRequest setDeviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
        this.deviceLifeCycleFlag = deviceLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceLifeCycleFlag() {
        return this.deviceLifeCycleFlag;
    }

    public UpdateSubscribeRelationRequest setDeviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
        this.deviceStatusChangeFlag = deviceStatusChangeFlag;
        return this;
    }
    public Boolean getDeviceStatusChangeFlag() {
        return this.deviceStatusChangeFlag;
    }

    public UpdateSubscribeRelationRequest setDeviceTagFlag(Boolean deviceTagFlag) {
        this.deviceTagFlag = deviceTagFlag;
        return this;
    }
    public Boolean getDeviceTagFlag() {
        return this.deviceTagFlag;
    }

    public UpdateSubscribeRelationRequest setDeviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
        this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceTopoLifeCycleFlag() {
        return this.deviceTopoLifeCycleFlag;
    }

    public UpdateSubscribeRelationRequest setFoundDeviceListFlag(Boolean foundDeviceListFlag) {
        this.foundDeviceListFlag = foundDeviceListFlag;
        return this;
    }
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
    }

    public UpdateSubscribeRelationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSubscribeRelationRequest setMnsConfiguration(String mnsConfiguration) {
        this.mnsConfiguration = mnsConfiguration;
        return this;
    }
    public String getMnsConfiguration() {
        return this.mnsConfiguration;
    }

    public UpdateSubscribeRelationRequest setOtaEventFlag(Boolean otaEventFlag) {
        this.otaEventFlag = otaEventFlag;
        return this;
    }
    public Boolean getOtaEventFlag() {
        return this.otaEventFlag;
    }

    public UpdateSubscribeRelationRequest setOtaJobFlag(Boolean otaJobFlag) {
        this.otaJobFlag = otaJobFlag;
        return this;
    }
    public Boolean getOtaJobFlag() {
        return this.otaJobFlag;
    }

    public UpdateSubscribeRelationRequest setOtaVersionFlag(Boolean otaVersionFlag) {
        this.otaVersionFlag = otaVersionFlag;
        return this;
    }
    public Boolean getOtaVersionFlag() {
        return this.otaVersionFlag;
    }

    public UpdateSubscribeRelationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateSubscribeRelationRequest setSubscribeFlags(String subscribeFlags) {
        this.subscribeFlags = subscribeFlags;
        return this;
    }
    public String getSubscribeFlags() {
        return this.subscribeFlags;
    }

    public UpdateSubscribeRelationRequest setThingHistoryFlag(Boolean thingHistoryFlag) {
        this.thingHistoryFlag = thingHistoryFlag;
        return this;
    }
    public Boolean getThingHistoryFlag() {
        return this.thingHistoryFlag;
    }

    public UpdateSubscribeRelationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
