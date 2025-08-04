// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitSmartAuditShrinkRequest extends TeaModel {
    @NameInMap("ImageUrlList")
    public String imageUrlListShrink;

    @NameInMap("SubCodes")
    public String subCodesShrink;

    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("imageUrls")
    public String imageUrlsShrink;

    public static SubmitSmartAuditShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartAuditShrinkRequest self = new SubmitSmartAuditShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSmartAuditShrinkRequest setImageUrlListShrink(String imageUrlListShrink) {
        this.imageUrlListShrink = imageUrlListShrink;
        return this;
    }
    public String getImageUrlListShrink() {
        return this.imageUrlListShrink;
    }

    public SubmitSmartAuditShrinkRequest setSubCodesShrink(String subCodesShrink) {
        this.subCodesShrink = subCodesShrink;
        return this;
    }
    public String getSubCodesShrink() {
        return this.subCodesShrink;
    }

    public SubmitSmartAuditShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitSmartAuditShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SubmitSmartAuditShrinkRequest setImageUrlsShrink(String imageUrlsShrink) {
        this.imageUrlsShrink = imageUrlsShrink;
        return this;
    }
    public String getImageUrlsShrink() {
        return this.imageUrlsShrink;
    }

}
