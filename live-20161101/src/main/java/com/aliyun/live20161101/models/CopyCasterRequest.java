// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterRequest extends TeaModel {
    @NameInMap("CasterName")
    public String casterName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SrcCasterId")
    public String srcCasterId;

    public static CopyCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterRequest self = new CopyCasterRequest();
        return TeaModel.build(map, self);
    }

    public CopyCasterRequest setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public CopyCasterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CopyCasterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopyCasterRequest setSrcCasterId(String srcCasterId) {
        this.srcCasterId = srcCasterId;
        return this;
    }
    public String getSrcCasterId() {
        return this.srcCasterId;
    }

}
