// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class TransformerForModify extends TeaModel {
    /**
     * <p>转换操作</p>
     */
    @NameInMap("actions")
    public java.util.List<TransformAction> actions;

    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>筛选条件</p>
     */
    @NameInMap("filterSetting")
    public FilterSetting filterSetting;

    /**
     * <p>匹配处理后退出</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("transformerName")
    public String transformerName;

    public static TransformerForModify build(java.util.Map<String, ?> map) throws Exception {
        TransformerForModify self = new TransformerForModify();
        return TeaModel.build(map, self);
    }

    public TransformerForModify setActions(java.util.List<TransformAction> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<TransformAction> getActions() {
        return this.actions;
    }

    public TransformerForModify setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TransformerForModify setFilterSetting(FilterSetting filterSetting) {
        this.filterSetting = filterSetting;
        return this;
    }
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    public TransformerForModify setQuitAfterMatch(Boolean quitAfterMatch) {
        this.quitAfterMatch = quitAfterMatch;
        return this;
    }
    public Boolean getQuitAfterMatch() {
        return this.quitAfterMatch;
    }

    public TransformerForModify setSortId(Integer sortId) {
        this.sortId = sortId;
        return this;
    }
    public Integer getSortId() {
        return this.sortId;
    }

    public TransformerForModify setTransformerName(String transformerName) {
        this.transformerName = transformerName;
        return this;
    }
    public String getTransformerName() {
        return this.transformerName;
    }

}
