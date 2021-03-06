// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySubscribeRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Type")
    public String type;

    @NameInMap("DeviceDataFlag")
    public Boolean deviceDataFlag;

    @NameInMap("DeviceLifeCycleFlag")
    public Boolean deviceLifeCycleFlag;

    @NameInMap("DeviceStatusChangeFlag")
    public Boolean deviceStatusChangeFlag;

    @NameInMap("DeviceTopoLifeCycleFlag")
    public Boolean deviceTopoLifeCycleFlag;

    @NameInMap("FoundDeviceListFlag")
    public Boolean foundDeviceListFlag;

    @NameInMap("OtaEventFlag")
    public Boolean otaEventFlag;

    @NameInMap("ThingHistoryFlag")
    public Boolean thingHistoryFlag;

    @NameInMap("MnsConfiguration")
    public String mnsConfiguration;

    @NameInMap("DeviceTagFlag")
    public Boolean deviceTagFlag;

    @NameInMap("OtaVersionFlag")
    public Boolean otaVersionFlag;

    @NameInMap("OtaJobFlag")
    public Boolean otaJobFlag;

    @NameInMap("ConsumerGroupIds")
    public java.util.List<String> consumerGroupIds;

    public static QuerySubscribeRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscribeRelationResponseBody self = new QuerySubscribeRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySubscribeRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySubscribeRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySubscribeRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySubscribeRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySubscribeRelationResponseBody setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QuerySubscribeRelationResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
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

    public QuerySubscribeRelationResponseBody setDeviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
        this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceTopoLifeCycleFlag() {
        return this.deviceTopoLifeCycleFlag;
    }

    public QuerySubscribeRelationResponseBody setFoundDeviceListFlag(Boolean foundDeviceListFlag) {
        this.foundDeviceListFlag = foundDeviceListFlag;
        return this;
    }
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
    }

    public QuerySubscribeRelationResponseBody setOtaEventFlag(Boolean otaEventFlag) {
        this.otaEventFlag = otaEventFlag;
        return this;
    }
    public Boolean getOtaEventFlag() {
        return this.otaEventFlag;
    }

    public QuerySubscribeRelationResponseBody setThingHistoryFlag(Boolean thingHistoryFlag) {
        this.thingHistoryFlag = thingHistoryFlag;
        return this;
    }
    public Boolean getThingHistoryFlag() {
        return this.thingHistoryFlag;
    }

    public QuerySubscribeRelationResponseBody setMnsConfiguration(String mnsConfiguration) {
        this.mnsConfiguration = mnsConfiguration;
        return this;
    }
    public String getMnsConfiguration() {
        return this.mnsConfiguration;
    }

    public QuerySubscribeRelationResponseBody setDeviceTagFlag(Boolean deviceTagFlag) {
        this.deviceTagFlag = deviceTagFlag;
        return this;
    }
    public Boolean getDeviceTagFlag() {
        return this.deviceTagFlag;
    }

    public QuerySubscribeRelationResponseBody setOtaVersionFlag(Boolean otaVersionFlag) {
        this.otaVersionFlag = otaVersionFlag;
        return this;
    }
    public Boolean getOtaVersionFlag() {
        return this.otaVersionFlag;
    }

    public QuerySubscribeRelationResponseBody setOtaJobFlag(Boolean otaJobFlag) {
        this.otaJobFlag = otaJobFlag;
        return this;
    }
    public Boolean getOtaJobFlag() {
        return this.otaJobFlag;
    }

    public QuerySubscribeRelationResponseBody setConsumerGroupIds(java.util.List<String> consumerGroupIds) {
        this.consumerGroupIds = consumerGroupIds;
        return this;
    }
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

}
