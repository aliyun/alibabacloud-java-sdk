// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteErAttachmentRequest extends TeaModel {
    @NameInMap("ErAttachmentId")
    public String erAttachmentId;

    @NameInMap("ErId")
    public String erId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteErAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteErAttachmentRequest self = new DeleteErAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteErAttachmentRequest setErAttachmentId(String erAttachmentId) {
        this.erAttachmentId = erAttachmentId;
        return this;
    }
    public String getErAttachmentId() {
        return this.erAttachmentId;
    }

    public DeleteErAttachmentRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public DeleteErAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
