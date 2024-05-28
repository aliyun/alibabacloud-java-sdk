// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigBasicResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateCloudGtmInstanceConfigBasicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigBasicResponseBody self = new UpdateCloudGtmInstanceConfigBasicResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigBasicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmInstanceConfigBasicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
