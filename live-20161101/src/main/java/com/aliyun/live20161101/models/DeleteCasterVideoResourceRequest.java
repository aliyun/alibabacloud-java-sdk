// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterVideoResourceRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public String resourceId;

    public static DeleteCasterVideoResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterVideoResourceRequest self = new DeleteCasterVideoResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCasterVideoResourceRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterVideoResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
