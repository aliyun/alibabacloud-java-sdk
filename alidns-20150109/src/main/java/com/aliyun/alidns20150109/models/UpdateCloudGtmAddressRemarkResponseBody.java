// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmAddressRemarkResponseBody extends TeaModel {
    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the modification operation was successful:</p>
     * <ul>
     * <li>true: Operation was successful</li>
     * <li>false: Operation was failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCloudGtmAddressRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmAddressRemarkResponseBody self = new UpdateCloudGtmAddressRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmAddressRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmAddressRemarkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
