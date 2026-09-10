// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnableMaintainWindowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123-12-312-31-23123</p>
     */
    @NameInMap("maintainWindowId")
    public String maintainWindowId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EnableMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableMaintainWindowResponseBody self = new EnableMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableMaintainWindowResponseBody setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public EnableMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
