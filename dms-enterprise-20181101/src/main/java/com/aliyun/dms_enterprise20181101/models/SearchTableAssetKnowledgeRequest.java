// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchTableAssetKnowledgeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Integer offset;

    /**
     * <strong>example:</strong>
     * <p>订单</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("ShowType")
    public String showType;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order_info</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static SearchTableAssetKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTableAssetKnowledgeRequest self = new SearchTableAssetKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public SearchTableAssetKnowledgeRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public SearchTableAssetKnowledgeRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public SearchTableAssetKnowledgeRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SearchTableAssetKnowledgeRequest setShowType(String showType) {
        this.showType = showType;
        return this;
    }
    public String getShowType() {
        return this.showType;
    }

    public SearchTableAssetKnowledgeRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public SearchTableAssetKnowledgeRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
