// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetAllRegistryRequest extends TeaModel {
    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    // name
    @NameInMap("name")
    public String name;

    // type
    @NameInMap("type")
    public Long type;

    // groupBy
    @NameInMap("groupBy")
    public Boolean groupBy;

    public static GetAllRegistryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllRegistryRequest self = new GetAllRegistryRequest();
        return TeaModel.build(map, self);
    }

    public GetAllRegistryRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetAllRegistryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetAllRegistryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAllRegistryRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public GetAllRegistryRequest setGroupBy(Boolean groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public Boolean getGroupBy() {
        return this.groupBy;
    }

}
