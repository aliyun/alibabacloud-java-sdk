// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListLineageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityQualifiedName")
    public String entityQualifiedName;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListLineageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLineageRequest self = new ListLineageRequest();
        return TeaModel.build(map, self);
    }

    public ListLineageRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListLineageRequest setEntityQualifiedName(String entityQualifiedName) {
        this.entityQualifiedName = entityQualifiedName;
        return this;
    }
    public String getEntityQualifiedName() {
        return this.entityQualifiedName;
    }

    public ListLineageRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListLineageRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLineageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
