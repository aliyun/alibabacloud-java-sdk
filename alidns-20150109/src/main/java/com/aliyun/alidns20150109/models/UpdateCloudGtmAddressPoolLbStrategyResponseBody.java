// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolLbStrategyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pool-89528023225442**16</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCloudGtmAddressPoolLbStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolLbStrategyResponseBody self = new UpdateCloudGtmAddressPoolLbStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolLbStrategyResponseBody setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public UpdateCloudGtmAddressPoolLbStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmAddressPoolLbStrategyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
