// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListEnvironmentsRequest extends TeaModel {
    /**
     * <p>Environment alias, fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("aliasLike")
    public String aliasLike;

    /**
     * <p>Gateway ID, exact search.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-cptv6ktlhtgnqr73h8d1</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <p>Gateway name, fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>test-gw</p>
     */
    @NameInMap("gatewayNameLike")
    public String gatewayNameLike;

    /**
     * <p>The gateway type</p>
     * 
     * <strong>example:</strong>
     * <p>APIGateway</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>Environment name, fuzzy search.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>Page number, default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2sy66mftleiq</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

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

    public ListEnvironmentsRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
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

    public ListEnvironmentsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
