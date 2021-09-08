// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySubscribeRelationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("DeviceDataFlag")
    @Validation(required = true)
    public Boolean deviceDataFlag;

    @NameInMap("DeviceLifeCycleFlag")
    @Validation(required = true)
    public Boolean deviceLifeCycleFlag;

    @NameInMap("DeviceStatusChangeFlag")
    @Validation(required = true)
    public Boolean deviceStatusChangeFlag;

    @NameInMap("DeviceTopoLifeCycleFlag")
    @Validation(required = true)
    public Boolean deviceTopoLifeCycleFlag;

    @NameInMap("FoundDeviceListFlag")
    @Validation(required = true)
    public Boolean foundDeviceListFlag;

    @NameInMap("OtaEventFlag")
    @Validation(required = true)
    public Boolean otaEventFlag;

    @NameInMap("ThingHistoryFlag")
    @Validation(required = true)
    public Boolean thingHistoryFlag;

    @NameInMap("MnsConfiguration")
    @Validation(required = true)
    public String mnsConfiguration;

    @NameInMap("DeviceTagFlag")
    @Validation(required = true)
    public Boolean deviceTagFlag;

    @NameInMap("OtaVersionFlag")
    @Validation(required = true)
    public Boolean otaVersionFlag;

    @NameInMap("OtaJobFlag")
    @Validation(required = true)
    public Boolean otaJobFlag;

    @NameInMap("ConsumerGroupIds")
    @Validation(required = true)
    public java.util.List<String> consumerGroupIds;

    public static QuerySubscribeRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscribeRelationResponse self = new QuerySubscribeRelationResponse();
        return TeaModel.build(map, self);
    }

    public QuerySubscribeRelationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySubscribeRelationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QuerySubscribeRelationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySubscribeRelationResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySubscribeRelationResponse setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QuerySubscribeRelationResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QuerySubscribeRelationResponse setDeviceDataFlag(Boolean deviceDataFlag) {
        this.deviceDataFlag = deviceDataFlag;
        return this;
    }
    public Boolean getDeviceDataFlag() {
        return this.deviceDataFlag;
    }

    public QuerySubscribeRelationResponse setDeviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
        this.deviceLifeCycleFlag = deviceLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceLifeCycleFlag() {
        return this.deviceLifeCycleFlag;
    }

    public QuerySubscribeRelationResponse setDeviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
        this.deviceStatusChangeFlag = deviceStatusChangeFlag;
        return this;
    }
    public Boolean getDeviceStatusChangeFlag() {
        return this.deviceStatusChangeFlag;
    }

    public QuerySubscribeRelationResponse setDeviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
        this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceTopoLifeCycleFlag() {
        return this.deviceTopoLifeCycleFlag;
    }

    public QuerySubscribeRelationResponse setFoundDeviceListFlag(Boolean foundDeviceListFlag) {
        this.foundDeviceListFlag = foundDeviceListFlag;
        return this;
    }
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
    }

    public QuerySubscribeRelationResponse setOtaEventFlag(Boolean otaEventFlag) {
        this.otaEventFlag = otaEventFlag;
        return this;
    }
    public Boolean getOtaEventFlag() {
        return this.otaEventFlag;
    }

    public QuerySubscribeRelationResponse setThingHistoryFlag(Boolean thingHistoryFlag) {
        this.thingHistoryFlag = thingHistoryFlag;
        return this;
    }
    public Boolean getThingHistoryFlag() {
        return this.thingHistoryFlag;
    }

    public QuerySubscribeRelationResponse setMnsConfiguration(String mnsConfiguration) {
        this.mnsConfiguration = mnsConfiguration;
        return this;
    }
    public String getMnsConfiguration() {
        return this.mnsConfiguration;
    }

    public QuerySubscribeRelationResponse setDeviceTagFlag(Boolean deviceTagFlag) {
        this.deviceTagFlag = deviceTagFlag;
        return this;
    }
    public Boolean getDeviceTagFlag() {
        return this.deviceTagFlag;
    }

    public QuerySubscribeRelationResponse setOtaVersionFlag(Boolean otaVersionFlag) {
        this.otaVersionFlag = otaVersionFlag;
        return this;
    }
    public Boolean getOtaVersionFlag() {
        return this.otaVersionFlag;
    }

    public QuerySubscribeRelationResponse setOtaJobFlag(Boolean otaJobFlag) {
        this.otaJobFlag = otaJobFlag;
        return this;
    }
    public Boolean getOtaJobFlag() {
        return this.otaJobFlag;
    }

    public QuerySubscribeRelationResponse setConsumerGroupIds(java.util.List<String> consumerGroupIds) {
        this.consumerGroupIds = consumerGroupIds;
        return this;
    }
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

}
