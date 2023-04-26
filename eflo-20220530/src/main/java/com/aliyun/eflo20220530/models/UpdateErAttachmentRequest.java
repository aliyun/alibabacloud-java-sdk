// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateErAttachmentRequest extends TeaModel {
    @NameInMap("ErAttachmentId")
    public String erAttachmentId;

    @NameInMap("ErAttachmentName")
    public String erAttachmentName;

    @NameInMap("ErId")
    public String erId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateErAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateErAttachmentRequest self = new UpdateErAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateErAttachmentRequest setErAttachmentId(String erAttachmentId) {
        this.erAttachmentId = erAttachmentId;
        return this;
    }
    public String getErAttachmentId() {
        return this.erAttachmentId;
    }

    public UpdateErAttachmentRequest setErAttachmentName(String erAttachmentName) {
        this.erAttachmentName = erAttachmentName;
        return this;
    }
    public String getErAttachmentName() {
        return this.erAttachmentName;
    }

    public UpdateErAttachmentRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public UpdateErAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
