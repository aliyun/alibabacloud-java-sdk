// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeIntegratedServiceStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NonCompliantNotification</p>
     */
    @NameInMap("AggregatorDeliveryDataType")
    public String aggregatorDeliveryDataType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>2E265A38-84D9-5083-A333-B33A2B46D139</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIntegratedServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntegratedServiceStatusResponseBody self = new DescribeIntegratedServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIntegratedServiceStatusResponseBody setAggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
        this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
        return this;
    }
    public String getAggregatorDeliveryDataType() {
        return this.aggregatorDeliveryDataType;
    }

    public DescribeIntegratedServiceStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DescribeIntegratedServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
