// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigEnableStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateCloudGtmInstanceConfigEnableStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigEnableStatusResponseBody self = new UpdateCloudGtmInstanceConfigEnableStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigEnableStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmInstanceConfigEnableStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
