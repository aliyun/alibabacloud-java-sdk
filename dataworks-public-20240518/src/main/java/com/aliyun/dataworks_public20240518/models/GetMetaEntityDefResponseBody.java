// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetMetaEntityDefResponseBody extends TeaModel {
    @NameInMap("MetaEntityDef")
    public MetaEntityDef metaEntityDef;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C636A747-7E4E-594D-94CD-2B4F8A9A9A63</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaEntityDefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaEntityDefResponseBody self = new GetMetaEntityDefResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaEntityDefResponseBody setMetaEntityDef(MetaEntityDef metaEntityDef) {
        this.metaEntityDef = metaEntityDef;
        return this;
    }
    public MetaEntityDef getMetaEntityDef() {
        return this.metaEntityDef;
    }

    public GetMetaEntityDefResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaEntityDefResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
