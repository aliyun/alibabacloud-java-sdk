// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListSceneItemsRequest extends TeaModel {
    @NameInMap("OperationRuleId")
    public String operationRuleId;

    @NameInMap("SelectionRuleId")
    public String selectionRuleId;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("PreviewType")
    public String previewType;

    @NameInMap("QueryCount")
    public Integer queryCount;

    public static ListSceneItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSceneItemsRequest self = new ListSceneItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListSceneItemsRequest setOperationRuleId(String operationRuleId) {
        this.operationRuleId = operationRuleId;
        return this;
    }
    public String getOperationRuleId() {
        return this.operationRuleId;
    }

    public ListSceneItemsRequest setSelectionRuleId(String selectionRuleId) {
        this.selectionRuleId = selectionRuleId;
        return this;
    }
    public String getSelectionRuleId() {
        return this.selectionRuleId;
    }

    public ListSceneItemsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSceneItemsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListSceneItemsRequest setPreviewType(String previewType) {
        this.previewType = previewType;
        return this;
    }
    public String getPreviewType() {
        return this.previewType;
    }

    public ListSceneItemsRequest setQueryCount(Integer queryCount) {
        this.queryCount = queryCount;
        return this;
    }
    public Integer getQueryCount() {
        return this.queryCount;
    }

}
