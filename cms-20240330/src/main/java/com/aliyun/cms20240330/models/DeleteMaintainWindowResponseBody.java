// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteMaintainWindowResponseBody extends TeaModel {
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
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteMaintainWindowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaintainWindowResponseBody self = new DeleteMaintainWindowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMaintainWindowResponseBody setMaintainWindowId(String maintainWindowId) {
        this.maintainWindowId = maintainWindowId;
        return this;
    }
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    public DeleteMaintainWindowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
