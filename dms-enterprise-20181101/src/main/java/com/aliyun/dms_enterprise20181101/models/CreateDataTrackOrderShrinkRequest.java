// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataTrackOrderShrinkRequest extends TeaModel {
    /**
     * <p>The purpose or objective of the data tracking ticket. This parameter is used to help reduce unnecessary communication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The parameters of the ticket.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public String paramShrink;

    /**
     * <p>The IDs of the operators that are related to the ticket.</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateDataTrackOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataTrackOrderShrinkRequest self = new CreateDataTrackOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataTrackOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataTrackOrderShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public CreateDataTrackOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateDataTrackOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
