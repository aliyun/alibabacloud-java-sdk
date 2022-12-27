// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class InstanceOperateResponse extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Message")
    public String message;

    public static InstanceOperateResponse build(java.util.Map<String, ?> map) throws Exception {
        InstanceOperateResponse self = new InstanceOperateResponse();
        return TeaModel.build(map, self);
    }

    public InstanceOperateResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public InstanceOperateResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceOperateResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
