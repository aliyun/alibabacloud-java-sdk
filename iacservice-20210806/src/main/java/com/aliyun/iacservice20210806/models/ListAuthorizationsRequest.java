// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListAuthorizationsRequest extends TeaModel {
    @NameInMap("authorizationId")
    public String authorizationId;

    @NameInMap("authorizationType")
    public String authorizationType;

    @NameInMap("keyword")
    public String keyword;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListAuthorizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationsRequest self = new ListAuthorizationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationsRequest setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }
    public String getAuthorizationId() {
        return this.authorizationId;
    }

    public ListAuthorizationsRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public ListAuthorizationsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListAuthorizationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
