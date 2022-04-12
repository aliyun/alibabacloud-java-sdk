// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindEcsSlbResponseBody extends TeaModel {
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static BindEcsSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindEcsSlbResponseBody self = new BindEcsSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public BindEcsSlbResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public BindEcsSlbResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BindEcsSlbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindEcsSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
