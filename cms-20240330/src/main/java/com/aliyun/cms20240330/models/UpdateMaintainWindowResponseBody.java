// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateMaintainWindowResponseBody extends TeaModel {
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
     * <p>0CEC5375-C554-562B-A65F-*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaintainWindowResponseBody self = new UpdateMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMaintainWindowResponseBody setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public UpdateMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
