// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateErAttachmentRequest extends TeaModel {
    /**
     * <p>The connection ID of the Lingjun HUB network instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-attachment-i1ioibyf</p>
     */
    @NameInMap("ErAttachmentId")
    public String erAttachmentId;

    /**
     * <p>Lingjun HUB Network Instance Connection Name</p>
     * 
     * <strong>example:</strong>
     * <p>er-attachment-wulanchabu-main</p>
     */
    @NameInMap("ErAttachmentName")
    public String erAttachmentName;

    /**
     * <p>Lingjun HUB ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
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
