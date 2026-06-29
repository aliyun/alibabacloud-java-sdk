// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAgenticSpaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAgenticSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgenticSpaceResponseBody self = new ModifyAgenticSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAgenticSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
