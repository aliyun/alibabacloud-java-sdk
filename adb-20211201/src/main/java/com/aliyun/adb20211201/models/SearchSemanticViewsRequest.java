// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SearchSemanticViewsRequest extends TeaModel {
    /**
     * <p>The ADB cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp*****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The text content to search.</p>
     * 
     * <strong>example:</strong>
     * <p>Sales revenue</p>
     */
    @NameInMap("QueryText")
    public String queryText;

    /**
     * <p>The number of most relevant documents to return.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    public static SearchSemanticViewsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchSemanticViewsRequest self = new SearchSemanticViewsRequest();
        return TeaModel.build(map, self);
    }

    public SearchSemanticViewsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SearchSemanticViewsRequest setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }
    public String getQueryText() {
        return this.queryText;
    }

    public SearchSemanticViewsRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

}
