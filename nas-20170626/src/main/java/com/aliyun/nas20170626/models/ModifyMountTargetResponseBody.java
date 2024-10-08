// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyMountTargetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FF387D95-34C4-4879-B65A-99D1FA1B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMountTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMountTargetResponseBody self = new ModifyMountTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMountTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
