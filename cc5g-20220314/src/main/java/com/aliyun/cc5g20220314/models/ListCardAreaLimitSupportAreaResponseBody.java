// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListCardAreaLimitSupportAreaResponseBody extends TeaModel {
    @NameInMap("Provinces")
    public java.util.List<String> provinces;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCardAreaLimitSupportAreaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCardAreaLimitSupportAreaResponseBody self = new ListCardAreaLimitSupportAreaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCardAreaLimitSupportAreaResponseBody setProvinces(java.util.List<String> provinces) {
        this.provinces = provinces;
        return this;
    }
    public java.util.List<String> getProvinces() {
        return this.provinces;
    }

    public ListCardAreaLimitSupportAreaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
