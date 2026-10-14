// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizQpsResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyElasticBizQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBizQpsResponseBody self = new ModifyElasticBizQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBizQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
