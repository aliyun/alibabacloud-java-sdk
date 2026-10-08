// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListScheduleTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListScheduleTemplatesCommand")
    public String listScheduleTemplatesCommandShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListScheduleTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleTemplatesShrinkRequest self = new ListScheduleTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduleTemplatesShrinkRequest setListScheduleTemplatesCommandShrink(String listScheduleTemplatesCommandShrink) {
        this.listScheduleTemplatesCommandShrink = listScheduleTemplatesCommandShrink;
        return this;
    }
    public String getListScheduleTemplatesCommandShrink() {
        return this.listScheduleTemplatesCommandShrink;
    }

    public ListScheduleTemplatesShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListScheduleTemplatesShrinkRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
