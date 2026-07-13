// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmGlobalAlertResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the global alert configuration was successfully updated. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The update was successful.</p>
     * </li>
     * <li><p><code>false</code>: The update failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCloudGtmGlobalAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmGlobalAlertResponseBody self = new UpdateCloudGtmGlobalAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmGlobalAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmGlobalAlertResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
