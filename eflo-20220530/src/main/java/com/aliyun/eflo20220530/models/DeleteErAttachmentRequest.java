// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteErAttachmentRequest extends TeaModel {
    /**
     * <p>The ID of the network connection instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-attachment-5n3nsmvl</p>
     */
    @NameInMap("ErAttachmentId")
    public String erAttachmentId;

    /**
     * <p>Lingjun HUB Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-opy1wrfv</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
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
