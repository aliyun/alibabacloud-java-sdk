// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindAuthTicketsRequest extends TeaModel {
    // gatewayId
    @NameInMap("gatewayId")
    public Long gatewayId;

    // name
    @NameInMap("name")
    public String name;

    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    public static FindAuthTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        FindAuthTicketsRequest self = new FindAuthTicketsRequest();
        return TeaModel.build(map, self);
    }

    public FindAuthTicketsRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public FindAuthTicketsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FindAuthTicketsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public FindAuthTicketsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
