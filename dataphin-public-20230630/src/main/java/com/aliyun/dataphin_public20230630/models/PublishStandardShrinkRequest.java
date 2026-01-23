// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishStandardShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PublishCommand")
    public String publishCommandShrink;

    public static PublishStandardShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishStandardShrinkRequest self = new PublishStandardShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PublishStandardShrinkRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public PublishStandardShrinkRequest setPublishCommandShrink(String publishCommandShrink) {
        this.publishCommandShrink = publishCommandShrink;
        return this;
    }
    public String getPublishCommandShrink() {
        return this.publishCommandShrink;
    }

}
