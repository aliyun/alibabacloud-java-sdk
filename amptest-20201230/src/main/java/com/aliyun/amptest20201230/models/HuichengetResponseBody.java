// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("InstanceId4")
    public String instanceId4;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static HuichengetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HuichengetResponseBody self = new HuichengetResponseBody();
        return TeaModel.build(map, self);
    }

    public HuichengetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HuichengetResponseBody setInstanceId4(String instanceId4) {
        this.instanceId4 = instanceId4;
        return this;
    }
    public String getInstanceId4() {
        return this.instanceId4;
    }

    public HuichengetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HuichengetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
