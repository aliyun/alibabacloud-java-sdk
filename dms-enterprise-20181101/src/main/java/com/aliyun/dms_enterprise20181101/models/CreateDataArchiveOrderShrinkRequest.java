// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataArchiveOrderShrinkRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Param")
    public String paramShrink;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("PluginType")
    public String pluginType;

    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    @NameInMap("Tid")
    public Long tid;

    public static CreateDataArchiveOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataArchiveOrderShrinkRequest self = new CreateDataArchiveOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataArchiveOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataArchiveOrderShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public CreateDataArchiveOrderShrinkRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateDataArchiveOrderShrinkRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public CreateDataArchiveOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateDataArchiveOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
