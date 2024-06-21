// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ReleaseDdosOriginInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B4B379C2-9319-4C6B-B579-FE36831B09F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseDdosOriginInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseDdosOriginInstanceResponseBody self = new ReleaseDdosOriginInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseDdosOriginInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
