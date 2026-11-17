// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageTagsRequest extends TeaModel {
    /**
     * <p>The tag categorization to query.</p>
     * 
     * <strong>example:</strong>
     * <p>Gpu</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>A compatibility field. The current version does not use this field to specify the number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to determine whether the next query is available. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kEmoGlTNe3ekUrwnesWV1Vn+tWdc+4WoaoMP/kUNF7Gg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListImageTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListImageTagsRequest self = new ListImageTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListImageTagsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListImageTagsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImageTagsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
