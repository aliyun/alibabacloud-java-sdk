// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmInstanceConfigResponseBody extends TeaModel {
    @NameInMap("ConfigId")
    public Boolean configId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCloudGtmInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmInstanceConfigResponseBody self = new CreateCloudGtmInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmInstanceConfigResponseBody setConfigId(Boolean configId) {
        this.configId = configId;
        return this;
    }
    public Boolean getConfigId() {
        return this.configId;
    }

    public CreateCloudGtmInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudGtmInstanceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
