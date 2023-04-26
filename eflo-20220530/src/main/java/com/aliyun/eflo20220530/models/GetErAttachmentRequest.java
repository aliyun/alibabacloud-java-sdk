// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErAttachmentRequest extends TeaModel {
    @NameInMap("ErAttachmentId")
    public String erAttachmentId;

    @NameInMap("ErId")
    public String erId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetErAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErAttachmentRequest self = new GetErAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public GetErAttachmentRequest setErAttachmentId(String erAttachmentId) {
        this.erAttachmentId = erAttachmentId;
        return this;
    }
    public String getErAttachmentId() {
        return this.erAttachmentId;
    }

    public GetErAttachmentRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public GetErAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
