// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StartK8sApplicationResponseBody extends TeaModel {
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static StartK8sApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartK8sApplicationResponseBody self = new StartK8sApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public StartK8sApplicationResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public StartK8sApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public StartK8sApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartK8sApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
