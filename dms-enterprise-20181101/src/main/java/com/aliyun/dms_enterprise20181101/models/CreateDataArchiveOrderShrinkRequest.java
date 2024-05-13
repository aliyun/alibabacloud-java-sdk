// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataArchiveOrderShrinkRequest extends TeaModel {
    /**
     * <p>The description of the task.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The parameters for archiving data.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public String paramShrink;

    /**
     * <p>The ID of the parent ticket. A parent ticket is generated only when a child ticket is created.</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The type of the plug-in. Default value: DATA_ARCHIVE.</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The list of the related users.</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    /**
     * <p>The tenant ID. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
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
