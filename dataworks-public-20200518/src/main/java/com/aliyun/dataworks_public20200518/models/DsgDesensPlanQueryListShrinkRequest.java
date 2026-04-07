// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanQueryListShrinkRequest extends TeaModel {
    /**
     * <p>The owner of the data masking rule.</p>
     * 
     * <strong>example:</strong>
     * <p>user1</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the sensitive field.</p>
     * 
     * <strong>example:</strong>
     * <p>phone</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The ID of the level-2 data masking scenario. You can call the <a href="https://help.aliyun.com/document_detail/2786322.html">DsgSceneQuerySceneListByName</a> operation to query the list of IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>The status of the data masking rule. Valid values:</p>
     * <ul>
     * <li>0: expired</li>
     * <li>1: effective</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    @NameInMap("columns")
    public String columnsShrink;

    @NameInMap("dataType")
    public String dataType;

    @NameInMap("emptyNotDesesn")
    public String emptyNotDesesn;

    public static DsgDesensPlanQueryListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanQueryListShrinkRequest self = new DsgDesensPlanQueryListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanQueryListShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DsgDesensPlanQueryListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DsgDesensPlanQueryListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DsgDesensPlanQueryListShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DsgDesensPlanQueryListShrinkRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DsgDesensPlanQueryListShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DsgDesensPlanQueryListShrinkRequest setColumnsShrink(String columnsShrink) {
        this.columnsShrink = columnsShrink;
        return this;
    }
    public String getColumnsShrink() {
        return this.columnsShrink;
    }

    public DsgDesensPlanQueryListShrinkRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DsgDesensPlanQueryListShrinkRequest setEmptyNotDesesn(String emptyNotDesesn) {
        this.emptyNotDesesn = emptyNotDesesn;
        return this;
    }
    public String getEmptyNotDesesn() {
        return this.emptyNotDesesn;
    }

}
