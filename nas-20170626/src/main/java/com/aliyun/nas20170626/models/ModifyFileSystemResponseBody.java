// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFileSystemResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFileSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileSystemResponseBody self = new ModifyFileSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
