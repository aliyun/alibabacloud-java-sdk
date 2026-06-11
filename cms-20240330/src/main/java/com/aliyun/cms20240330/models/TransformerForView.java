// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TransformerForView extends TeaModel {
    /**
     * <p>The transform operations.</p>
     */
    @NameInMap("actions")
    public java.util.List<TransformAction> actions;

    /**
     * <p>The time when the converter was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether the converter is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The filter settings.</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>Indicates whether to exit after a match is processed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("quitAfterMatch")
    public Boolean quitAfterMatch;

    /**
     * <p>The sort ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sortId")
    public Integer sortId;

    /**
     * <p>The transformer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1123123123123</p>
     */
    @NameInMap("transformerId")
    public String transformerId;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试处理流</p>
     */
    @NameInMap("transformerName")
    public String transformerName;

    /**
     * <p>The time when the converter was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-16T02:27:01Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123123123**</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static TransformerForView build(java.util.Map<String, ?> map) throws Exception {
        TransformerForView self = new TransformerForView();
        return TeaModel.build(map, self);
    }

    public TransformerForView setActions(java.util.List<TransformAction> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<TransformAction> getActions() {
        return this.actions;
    }

    public TransformerForView setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TransformerForView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TransformerForView setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public TransformerForView setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public TransformerForView setQuitAfterMatch(Boolean quitAfterMatch) {
        this.quitAfterMatch = quitAfterMatch;
        return this;
    }
    public Boolean getQuitAfterMatch() {
        return this.quitAfterMatch;
    }

    public TransformerForView setSortId(Integer sortId) {
        this.sortId = sortId;
        return this;
    }
    public Integer getSortId() {
        return this.sortId;
    }

    public TransformerForView setTransformerId(String transformerId) {
        this.transformerId = transformerId;
        return this;
    }
    public String getTransformerId() {
        return this.transformerId;
    }

    public TransformerForView setTransformerName(String transformerName) {
        this.transformerName = transformerName;
        return this;
    }
    public String getTransformerName() {
        return this.transformerName;
    }

    public TransformerForView setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public TransformerForView setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public TransformerForView setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
