// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelServicesResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListModelServicesOutput data;

    @NameInMap("requestId")
    public String requestId;

    public static ListModelServicesResult build(java.util.Map<String, ?> map) throws Exception {
        ListModelServicesResult self = new ListModelServicesResult();
        return TeaModel.build(map, self);
    }

    public ListModelServicesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelServicesResult setData(ListModelServicesOutput data) {
        this.data = data;
        return this;
    }
    public ListModelServicesOutput getData() {
        return this.data;
    }

    public ListModelServicesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
