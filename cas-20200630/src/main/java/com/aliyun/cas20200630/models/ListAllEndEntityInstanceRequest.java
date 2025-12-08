// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class ListAllEndEntityInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>37633</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("RecursiveChildren")
    public Integer recursiveChildren;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    public static ListAllEndEntityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllEndEntityInstanceRequest self = new ListAllEndEntityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListAllEndEntityInstanceRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAllEndEntityInstanceRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAllEndEntityInstanceRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAllEndEntityInstanceRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public ListAllEndEntityInstanceRequest setRecursiveChildren(Integer recursiveChildren) {
        this.recursiveChildren = recursiveChildren;
        return this;
    }
    public Integer getRecursiveChildren() {
        return this.recursiveChildren;
    }

    public ListAllEndEntityInstanceRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
