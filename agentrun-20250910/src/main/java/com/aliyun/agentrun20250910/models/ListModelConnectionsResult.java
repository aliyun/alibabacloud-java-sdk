// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelConnectionsResult extends TeaModel {
    /**
     * <p>Indicates the request status. A value of SUCCESS means the request was successful. For failed requests, this field contains the corresponding error type.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of model connections.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ListModelConnectionsOutput data;

    /**
     * <p>The unique request ID, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListModelConnectionsResult build(java.util.Map<String, ?> map) throws Exception {
        ListModelConnectionsResult self = new ListModelConnectionsResult();
        return TeaModel.build(map, self);
    }

    public ListModelConnectionsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelConnectionsResult setData(ListModelConnectionsOutput data) {
        this.data = data;
        return this;
    }
    public ListModelConnectionsOutput getData() {
        return this.data;
    }

    public ListModelConnectionsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
