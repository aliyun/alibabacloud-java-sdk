// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyModelResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4173F95B-360C-460C-9F6C-4A960B904411</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelResponseBody self = new ModifyModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
