// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListAuthorizationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>auth-433aead756057ffec22d5b1ef27ac</p>
     */
    @NameInMap("authorizationId")
    public String authorizationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>others</p>
     */
    @NameInMap("authorizationType")
    public String authorizationType;

    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
