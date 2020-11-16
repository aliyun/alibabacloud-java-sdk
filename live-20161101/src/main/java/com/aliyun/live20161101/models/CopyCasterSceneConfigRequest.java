// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterSceneConfigRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("FromSceneId")
    @Validation(required = true)
    public String fromSceneId;

    @NameInMap("ToSceneId")
    @Validation(required = true)
    public String toSceneId;

    public static CopyCasterSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterSceneConfigRequest self = new CopyCasterSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public CopyCasterSceneConfigRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public CopyCasterSceneConfigRequest setFromSceneId(String fromSceneId) {
        this.fromSceneId = fromSceneId;
        return this;
    }
    public String getFromSceneId() {
        return this.fromSceneId;
    }

    public CopyCasterSceneConfigRequest setToSceneId(String toSceneId) {
        this.toSceneId = toSceneId;
        return this;
    }
    public String getToSceneId() {
        return this.toSceneId;
    }

}
