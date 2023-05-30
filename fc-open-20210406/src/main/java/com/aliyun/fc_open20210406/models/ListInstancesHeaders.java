// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListInstancesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>Queries the available instances of a function.</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    public static ListInstancesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesHeaders self = new ListInstancesHeaders();
        return TeaModel.build(map, self);
    }

    public ListInstancesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListInstancesHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

}
