// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 0 indicates that the request is successful.</p>
     * <br>
     * <p>>  If you call this operation by using SDKs, the return value is of the integer type. If you call this operation by using common methods or HTTP requests, the return value is of the string type.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The IDs of instances.</p>
     */
    @NameInMap("InstanceIds")
    public CreateInstanceResponseBodyInstanceIds instanceIds;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateInstanceResponseBody setInstanceIds(CreateInstanceResponseBodyInstanceIds instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public CreateInstanceResponseBodyInstanceIds getInstanceIds() {
        return this.instanceIds;
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateInstanceResponseBodyInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static CreateInstanceResponseBodyInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyInstanceIds self = new CreateInstanceResponseBodyInstanceIds();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

}
