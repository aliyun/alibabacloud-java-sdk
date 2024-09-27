// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressPoolRemarkResponseBody extends TeaModel {
    /**
     * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>pool-89528023225442**16</p>
     */
    @NameInMap("AddressPoolId")
    public String addressPoolId;

    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the modification operation was successful:</p>
     * <ul>
     * <li>true: Operation successful</li>
     * <li>false: Operation failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCloudGtmAddressPoolRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressPoolRemarkResponseBody self = new UpdateCloudGtmAddressPoolRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressPoolRemarkResponseBody setAddressPoolId(String addressPoolId) {
        this.addressPoolId = addressPoolId;
        return this;
    }
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    public UpdateCloudGtmAddressPoolRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmAddressPoolRemarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
