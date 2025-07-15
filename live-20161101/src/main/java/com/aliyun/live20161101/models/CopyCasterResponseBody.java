// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterResponseBody extends TeaModel {
    /**
     * <p>The ID of the new production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>1909f043-e3d3-49e9-82d6-4329ec4a****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CopyCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterResponseBody self = new CopyCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyCasterResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public CopyCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
