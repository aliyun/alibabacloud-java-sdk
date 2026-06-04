// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetMetaEntityResponseBody extends TeaModel {
    @NameInMap("MetaEntity")
    public MetaEntity metaEntity;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0A04C673-BEFA-5803-94E5-89E2D9F8C567</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaEntityResponseBody self = new GetMetaEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaEntityResponseBody setMetaEntity(MetaEntity metaEntity) {
        this.metaEntity = metaEntity;
        return this;
    }
    public MetaEntity getMetaEntity() {
        return this.metaEntity;
    }

    public GetMetaEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
