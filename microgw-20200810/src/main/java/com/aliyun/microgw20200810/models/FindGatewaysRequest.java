// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindGatewaysRequest extends TeaModel {
    // gatewayUniqueId
    @NameInMap("gatewayUniqueId")
    public String gatewayUniqueId;

    // name
    @NameInMap("name")
    public String name;

    // region
    @NameInMap("region")
    public String region;

    // gatewayTypes
    @NameInMap("gatewayTypes")
    public String gatewayTypes;

    // status
    @NameInMap("status")
    public String status;

    // pageNumber
    @NameInMap("pageNumber")
    public String pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public String pageSize;

    public static FindGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        FindGatewaysRequest self = new FindGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public FindGatewaysRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public FindGatewaysRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FindGatewaysRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public FindGatewaysRequest setGatewayTypes(String gatewayTypes) {
        this.gatewayTypes = gatewayTypes;
        return this;
    }
    public String getGatewayTypes() {
        return this.gatewayTypes;
    }

    public FindGatewaysRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FindGatewaysRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public FindGatewaysRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
