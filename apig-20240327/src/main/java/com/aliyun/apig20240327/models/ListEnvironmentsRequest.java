// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListEnvironmentsRequest extends TeaModel {
    @NameInMap("aliasLike")
    public String aliasLike;

    /**
     * <strong>example:</strong>
     * <p>gw-cptv6ktlhtgnqr73h8d1</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>test-gw</p>
     */
    @NameInMap("gatewayNameLike")
    public String gatewayNameLike;

    /**
     * <strong>example:</strong>
     * <p>test</p>
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

    public static ListEnvironmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsRequest self = new ListEnvironmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsRequest setAliasLike(String aliasLike) {
        this.aliasLike = aliasLike;
        return this;
    }
    public String getAliasLike() {
        return this.aliasLike;
    }

    public ListEnvironmentsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListEnvironmentsRequest setGatewayNameLike(String gatewayNameLike) {
        this.gatewayNameLike = gatewayNameLike;
        return this;
    }
    public String getGatewayNameLike() {
        return this.gatewayNameLike;
    }

    public ListEnvironmentsRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListEnvironmentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEnvironmentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
