// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetRowsVisibilityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>stxxxx</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SetRowsVisibilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRowsVisibilityResponseBody self = new SetRowsVisibilityResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRowsVisibilityResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SetRowsVisibilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
