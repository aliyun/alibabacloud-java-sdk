// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListResourceCategoriesRequest extends TeaModel {
    /**
     * <p>The maximum number of records to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. If more entries are to be returned on the next page, a pagination token is returned. Note: If this parameter returns data, it indicates there is a next page. You can use the returned NextToken as a request parameter to obtain the next page of data until it returns Null, indicating all data has been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>cae**********699</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rc-123****7890</p>
     */
    @NameInMap("ResourceCategoryId")
    public String resourceCategoryId;

    public static ListResourceCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceCategoriesRequest self = new ListResourceCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceCategoriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceCategoriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceCategoriesRequest setResourceCategoryId(String resourceCategoryId) {
        this.resourceCategoryId = resourceCategoryId;
        return this;
    }
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

}
