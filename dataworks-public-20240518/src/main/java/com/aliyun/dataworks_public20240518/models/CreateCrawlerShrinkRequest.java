// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCrawlerShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("EnableAiComment")
    public Boolean enableAiComment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example_crawler</p>
     */
    @NameInMap("Name")
    public String name;

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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>starrocks</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateCrawlerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCrawlerShrinkRequest self = new CreateCrawlerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCrawlerShrinkRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateCrawlerShrinkRequest setEnableAiComment(Boolean enableAiComment) {
        this.enableAiComment = enableAiComment;
        return this;
    }
    public Boolean getEnableAiComment() {
        return this.enableAiComment;
    }

    public CreateCrawlerShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCrawlerShrinkRequest setOptionsShrink(String optionsShrink) {
        this.optionsShrink = optionsShrink;
        return this;
    }
    public String getOptionsShrink() {
        return this.optionsShrink;
    }

    public CreateCrawlerShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCrawlerShrinkRequest setScheduleConfigShrink(String scheduleConfigShrink) {
        this.scheduleConfigShrink = scheduleConfigShrink;
        return this;
    }
    public String getScheduleConfigShrink() {
        return this.scheduleConfigShrink;
    }

    public CreateCrawlerShrinkRequest setScopeShrink(String scopeShrink) {
        this.scopeShrink = scopeShrink;
        return this;
    }
    public String getScopeShrink() {
        return this.scopeShrink;
    }

    public CreateCrawlerShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
