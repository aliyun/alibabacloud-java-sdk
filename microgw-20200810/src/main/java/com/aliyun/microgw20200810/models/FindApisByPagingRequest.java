// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindApisByPagingRequest extends TeaModel {
    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    // status
    @NameInMap("status")
    public String status;

    // name
    @NameInMap("name")
    public String name;

    // aliasName
    @NameInMap("aliasName")
    public String aliasName;

    public static FindApisByPagingRequest build(java.util.Map<String, ?> map) throws Exception {
        FindApisByPagingRequest self = new FindApisByPagingRequest();
        return TeaModel.build(map, self);
    }

    public FindApisByPagingRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public FindApisByPagingRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public FindApisByPagingRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FindApisByPagingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FindApisByPagingRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

}
