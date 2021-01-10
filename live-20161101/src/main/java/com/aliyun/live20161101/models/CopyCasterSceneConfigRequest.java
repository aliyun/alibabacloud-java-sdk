// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterSceneConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("FromSceneId")
    public String fromSceneId;

    @NameInMap("ToSceneId")
    public String toSceneId;

    public static CopyCasterSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterSceneConfigRequest self = new CopyCasterSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public CopyCasterSceneConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
