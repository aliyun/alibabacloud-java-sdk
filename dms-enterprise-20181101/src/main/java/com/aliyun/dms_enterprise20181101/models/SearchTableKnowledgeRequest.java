// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchTableKnowledgeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>查看当前的灰度情况</p>
     */
    @NameInMap("Query")
    public String query;

    public static SearchTableKnowledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTableKnowledgeRequest self = new SearchTableKnowledgeRequest();
        return TeaModel.build(map, self);
    }

    public SearchTableKnowledgeRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public SearchTableKnowledgeRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public SearchTableKnowledgeRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
