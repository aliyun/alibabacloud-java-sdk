// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetCloudGtmInstanceConfigLogSwitchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetCloudGtmInstanceConfigLogSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCloudGtmInstanceConfigLogSwitchResponseBody self = new SetCloudGtmInstanceConfigLogSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCloudGtmInstanceConfigLogSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetCloudGtmInstanceConfigLogSwitchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
