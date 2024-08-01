// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressManualAvailableStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0F32959D-417B-4D66-8463-68606605E3E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCloudGtmAddressManualAvailableStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressManualAvailableStatusResponseBody self = new UpdateCloudGtmAddressManualAvailableStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressManualAvailableStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmAddressManualAvailableStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
