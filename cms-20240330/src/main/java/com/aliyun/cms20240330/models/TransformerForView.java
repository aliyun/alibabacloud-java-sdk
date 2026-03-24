// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TransformerForView extends TeaModel {
    /**
     * <p>转换操作</p>
     */
    @NameInMap("actions")
    public java.util.List<TransformAction> actions;

    /**
     * <p>创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>是否启用</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>筛选设置</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>匹配处理后退出</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("quitAfterMatch")
    public Boolean quitAfterMatch;

    /**
     * <p>排序数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sortId")
    public Integer sortId;

    /**
     * <p>transformer Id</p>
     * 
     * <strong>example:</strong>
     * <p>1123123123123</p>
     */
    @NameInMap("transformerId")
    public String transformerId;

    /**
     * <p>名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试处理流</p>
     */
    @NameInMap("transformerName")
    public String transformerName;

    /**
     * <p>更新时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-16T02:27:01Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>用户id</p>
     * 
     * <strong>example:</strong>
     * <p>123123123**</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>workspace</p>
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
