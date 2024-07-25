// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHttpApiOperationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>GET</p>
     */
    @NameInMap("method")
    public String method;

    /**
     * <strong>example:</strong>
     * <p>GetUser</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

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

    /**
     * <strong>example:</strong>
     * <p>/v1</p>
     */
    @NameInMap("pathLike")
    public String pathLike;

    public static ListHttpApiOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHttpApiOperationsRequest self = new ListHttpApiOperationsRequest();
        return TeaModel.build(map, self);
    }

    public ListHttpApiOperationsRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public ListHttpApiOperationsRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListHttpApiOperationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHttpApiOperationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHttpApiOperationsRequest setPathLike(String pathLike) {
        this.pathLike = pathLike;
        return this;
    }
    public String getPathLike() {
        return this.pathLike;
    }

}
