// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateCrawlerShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable AI metadata description. This parameter is supported only when SupportAiComment returned by GetCrawlerTypeCapabilities is set to true. If this parameter is not specified, the existing value remains unchanged.</p>
     */
    @NameInMap("EnableAiComment")
    public Boolean enableAiComment;

    /**
     * <p>The ID of the metadata crawler. You can call ListCrawlers to query crawler IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The extension configurations for the crawler type. Only the specified configuration items are updated. Unspecified configuration items remain unchanged. The supported keys and values are determined by the SupportedOptionKeys returned by GetCrawlerTypeCapabilities.</p>
     */
    @NameInMap("Options")
    public String optionsShrink;

    /**
     * <p>The ID of the Serverless 2.0 resource group used to run the collection task. Whether this parameter is supported and whether it is required depend on the capabilities returned by GetCrawlerTypeCapabilities. If this parameter is not specified, the existing value remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>Serverless_res_group_1234567890123456_1234567890</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The scheduling configuration. If this parameter is specified, the scheduling method is updated. If this parameter is not specified, the existing value remains unchanged.</p>
     */
    @NameInMap("ScheduleConfig")
    public String scheduleConfigShrink;

    /**
     * <p>The collection scope configuration. If this parameter is specified, the collection scope is updated. If this parameter is not specified, the existing value remains unchanged.</p>
     */
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
