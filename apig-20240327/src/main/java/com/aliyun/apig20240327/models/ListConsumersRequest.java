// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumersRequest extends TeaModel {
    /**
     * <p>The instance type. Valid values: <strong>AI</strong> and <strong>API</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <p>The name used to perform a fuzzy search for operations.</p>
     * 
     * <strong>example:</strong>
     * <p>UI-test</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>The page number to return. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListConsumersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumersRequest self = new ListConsumersRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumersRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListConsumersRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListConsumersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConsumersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
