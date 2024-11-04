// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TransformerForView extends TeaModel {
    @NameInMap("actions")
    public java.util.List<TransformAction> actions;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    @NameInMap("quitAfterMatch")
    public Boolean quitAfterMatch;

    @NameInMap("sortId")
    public Integer sortId;

    @NameInMap("transformerId")
    public String transformerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("transformerName")
    public String transformerName;

    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("userId")
    public String userId;

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
