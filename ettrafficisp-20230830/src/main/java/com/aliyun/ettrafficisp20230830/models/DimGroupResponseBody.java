// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class DimGroupResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Object data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static DimGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DimGroupResponseBody self = new DimGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DimGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DimGroupResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DimGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DimGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
