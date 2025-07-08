// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryOpencFlagNewResponseBody extends TeaModel {
    @NameInMap("IsOpen")
    public Integer isOpen;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryOpencFlagNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOpencFlagNewResponseBody self = new QueryOpencFlagNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOpencFlagNewResponseBody setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    public Integer getIsOpen() {
        return this.isOpen;
    }

    public QueryOpencFlagNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
