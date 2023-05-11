// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySubscribeRelationResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The IDs of the consumer groups that are created in the AMQP subscription. This parameter is returned if the **Type** parameter is set to **AMQP**.</p>
     */
    @NameInMap("ConsumerGroupIds")
    public java.util.List<String> consumerGroupIds;

    /**
     * <p>Indicates whether upstream device messages were pushed.</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     */
    @NameInMap("DeviceDataFlag")
    public Boolean deviceDataFlag;

    /**
     * <p>Indicates whether messages about device lifecycle changes were pushed.</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     */
    @NameInMap("DeviceLifeCycleFlag")
    public Boolean deviceLifeCycleFlag;

    /**
     * <p>Indicates whether messages about device status changes were pushed.</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     */
    @NameInMap("DeviceStatusChangeFlag")
    public Boolean deviceStatusChangeFlag;

    /**
     * <p>Indicates whether messages about device tag changes were pushed. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter takes effect only if the **Type** parameter is set to **AMQP**.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("DeviceTagFlag")
    public Boolean deviceTagFlag;

    /**
     * <p>Indicates whether messages about topological relationship changes of devices were pushed.</p>
     * <br>
     * <p>*   **true**: yes. The value **true** is returned only when you query a gateway product.</p>
     * <p>*   **false**: no.</p>
     */
    @NameInMap("DeviceTopoLifeCycleFlag")
    public Boolean deviceTopoLifeCycleFlag;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether messages were pushed if a gateway detected new sub-devices.</p>
     * <br>
     * <p>*   **true**: yes. The value **true** is returned only when you query a gateway product.</p>
     * <p>*   **false**: no.</p>
     */
    @NameInMap("FoundDeviceListFlag")
    public Boolean foundDeviceListFlag;

    /**
     * <p>The configurations of the MNS queue. This parameter is returned if the **Type** parameter is set to **MNS**.</p>
     * <br>
     * <p>For more information, see the "Definition of the MnsConfiguration parameter" section.</p>
     */
    @NameInMap("MnsConfiguration")
    public String mnsConfiguration;

    /**
     * <p>Indicates whether notifications about the status of OTA update batches were pushed.</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     */
    @NameInMap("OtaEventFlag")
    public Boolean otaEventFlag;

    /**
     * <p>Indicates whether notifications about OTA batch updates were pushed. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter takes effect only if the **Type** parameter is set to **AMQP**.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("OtaJobFlag")
    public Boolean otaJobFlag;

    /**
     * <p>Indicates whether messages about the version numbers of OTA modules were pushed. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter takes effect only if the **Type** parameter is set to **AMQP**.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("OtaVersionFlag")
    public Boolean otaVersionFlag;

    /**
     * <p>The ProductKey of the product that is specified for the subscription.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscribeFlags")
    public String subscribeFlags;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates whether upstream historical Thing Specification Language (TSL) data was pushed.</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     */
    @NameInMap("ThingHistoryFlag")
    public Boolean thingHistoryFlag;

    /**
     * <p>The type of the subscription. Valid values:</p>
     * <br>
     * <p>*   **MNS**</p>
     * <p>*   **AMQP**</p>
     */
    @NameInMap("Type")
    public String type;

    public static QuerySubscribeRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscribeRelationResponseBody self = new QuerySubscribeRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySubscribeRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySubscribeRelationResponseBody setConsumerGroupIds(java.util.List<String> consumerGroupIds) {
        this.consumerGroupIds = consumerGroupIds;
        return this;
    }
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

    public QuerySubscribeRelationResponseBody setDeviceDataFlag(Boolean deviceDataFlag) {
        this.deviceDataFlag = deviceDataFlag;
        return this;
    }
    public Boolean getDeviceDataFlag() {
        return this.deviceDataFlag;
    }

    public QuerySubscribeRelationResponseBody setDeviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
        this.deviceLifeCycleFlag = deviceLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceLifeCycleFlag() {
        return this.deviceLifeCycleFlag;
    }

    public QuerySubscribeRelationResponseBody setDeviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
        this.deviceStatusChangeFlag = deviceStatusChangeFlag;
        return this;
    }
    public Boolean getDeviceStatusChangeFlag() {
        return this.deviceStatusChangeFlag;
    }

    public QuerySubscribeRelationResponseBody setDeviceTagFlag(Boolean deviceTagFlag) {
        this.deviceTagFlag = deviceTagFlag;
        return this;
    }
    public Boolean getDeviceTagFlag() {
        return this.deviceTagFlag;
    }

    public QuerySubscribeRelationResponseBody setDeviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
        this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceTopoLifeCycleFlag() {
        return this.deviceTopoLifeCycleFlag;
    }

    public QuerySubscribeRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySubscribeRelationResponseBody setFoundDeviceListFlag(Boolean foundDeviceListFlag) {
        this.foundDeviceListFlag = foundDeviceListFlag;
        return this;
    }
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
    }

    public QuerySubscribeRelationResponseBody setMnsConfiguration(String mnsConfiguration) {
        this.mnsConfiguration = mnsConfiguration;
        return this;
    }
    public String getMnsConfiguration() {
        return this.mnsConfiguration;
    }

    public QuerySubscribeRelationResponseBody setOtaEventFlag(Boolean otaEventFlag) {
        this.otaEventFlag = otaEventFlag;
        return this;
    }
    public Boolean getOtaEventFlag() {
        return this.otaEventFlag;
    }

    public QuerySubscribeRelationResponseBody setOtaJobFlag(Boolean otaJobFlag) {
        this.otaJobFlag = otaJobFlag;
        return this;
    }
    public Boolean getOtaJobFlag() {
        return this.otaJobFlag;
    }

    public QuerySubscribeRelationResponseBody setOtaVersionFlag(Boolean otaVersionFlag) {
        this.otaVersionFlag = otaVersionFlag;
        return this;
    }
    public Boolean getOtaVersionFlag() {
        return this.otaVersionFlag;
    }

    public QuerySubscribeRelationResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QuerySubscribeRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySubscribeRelationResponseBody setSubscribeFlags(String subscribeFlags) {
        this.subscribeFlags = subscribeFlags;
        return this;
    }
    public String getSubscribeFlags() {
        return this.subscribeFlags;
    }

    public QuerySubscribeRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySubscribeRelationResponseBody setThingHistoryFlag(Boolean thingHistoryFlag) {
        this.thingHistoryFlag = thingHistoryFlag;
        return this;
    }
    public Boolean getThingHistoryFlag() {
        return this.thingHistoryFlag;
    }

    public QuerySubscribeRelationResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
