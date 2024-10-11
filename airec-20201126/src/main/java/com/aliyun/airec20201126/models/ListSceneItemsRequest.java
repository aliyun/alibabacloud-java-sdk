// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListSceneItemsRequest extends TeaModel {
    @NameInMap("operationRuleId")
    public String operationRuleId;

    @NameInMap("page")
    public Integer page;

    @NameInMap("previewType")
    public String previewType;

    @NameInMap("queryCount")
    public Integer queryCount;

    @NameInMap("selectionRuleId")
    public String selectionRuleId;

    @NameInMap("size")
    public Integer size;

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

    public ListSceneItemsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
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

    public ListSceneItemsRequest setSelectionRuleId(String selectionRuleId) {
        this.selectionRuleId = selectionRuleId;
        return this;
    }
    public String getSelectionRuleId() {
        return this.selectionRuleId;
    }

    public ListSceneItemsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
