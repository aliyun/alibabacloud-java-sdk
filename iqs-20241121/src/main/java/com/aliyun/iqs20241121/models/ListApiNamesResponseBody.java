// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListApiNamesResponseBody extends TeaModel {
    @NameInMap("apiNames")
    public java.util.List<String> apiNames;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ECB2144C-E277-5434-80E6-12D26678D364</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListApiNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiNamesResponseBody self = new ListApiNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiNamesResponseBody setApiNames(java.util.List<String> apiNames) {
        this.apiNames = apiNames;
        return this;
    }
    public java.util.List<String> getApiNames() {
        return this.apiNames;
    }

    public ListApiNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
