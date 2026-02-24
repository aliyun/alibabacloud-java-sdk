// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetIntegratedServiceStatusResponseBody extends TeaModel {
    @NameInMap("AggregatorDeliveryDataType")
    public String aggregatorDeliveryDataType;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("IntegratedTypes")
    public String integratedTypes;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIntegratedServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegratedServiceStatusResponseBody self = new GetIntegratedServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegratedServiceStatusResponseBody setAggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
        this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
        return this;
    }
    public String getAggregatorDeliveryDataType() {
        return this.aggregatorDeliveryDataType;
    }

    public GetIntegratedServiceStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public GetIntegratedServiceStatusResponseBody setIntegratedTypes(String integratedTypes) {
        this.integratedTypes = integratedTypes;
        return this;
    }
    public String getIntegratedTypes() {
        return this.integratedTypes;
    }

    public GetIntegratedServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
