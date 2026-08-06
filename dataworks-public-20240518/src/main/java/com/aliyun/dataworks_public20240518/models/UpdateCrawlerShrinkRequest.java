// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCrawlerShrinkRequest extends TeaModel {
    @NameInMap("EnableAiComment")
    public Boolean enableAiComment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("Options")
    public String optionsShrink;

    /**
     * <strong>example:</strong>
     * <p>Serverless_res_group_1234567890123456_1234567890</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    @NameInMap("Scope")
    public String scopeShrink;

    public static UpdateCrawlerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrawlerShrinkRequest self = new UpdateCrawlerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCrawlerShrinkRequest setEnableAiComment(Boolean enableAiComment) {
        this.enableAiComment = enableAiComment;
        return this;
    }
    public Boolean getEnableAiComment() {
        return this.enableAiComment;
    }

    public UpdateCrawlerShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateCrawlerShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

    public UpdateCrawlerShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateCrawlerShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public UpdateCrawlerShrinkRequest setScopeShrink(String scopeShrink) {
        this.scopeShrink = scopeShrink;
        return this;
    }
    public String getScopeShrink() {
        return this.scopeShrink;
    }

}
