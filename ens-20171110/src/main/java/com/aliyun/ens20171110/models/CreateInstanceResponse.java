// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("InstanceIds")
    @Validation(required = true)
    public CreateInstanceResponseInstanceIds instanceIds;

    public static CreateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponse self = new CreateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateInstanceResponse setInstanceIds(CreateInstanceResponseInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public CreateInstanceResponseInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public static class CreateInstanceResponseInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public java.util.List<String> instanceId;

        public static CreateInstanceResponseInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseInstanceIds self = new CreateInstanceResponseInstanceIds();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}
