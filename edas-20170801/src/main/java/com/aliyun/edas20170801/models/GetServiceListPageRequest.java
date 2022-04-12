// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceListPageRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("origin")
    public String origin;

    @NameInMap("page")
    public Integer page;

    @NameInMap("region")
    public String region;

    @NameInMap("searchType")
    public String searchType;

    @NameInMap("searchValue")
    public String searchValue;

    @NameInMap("serviceType")
    public String serviceType;

    @NameInMap("side")
    public String side;

    @NameInMap("size")
    public Integer size;

    public static GetServiceListPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListPageRequest self = new GetServiceListPageRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceListPageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetServiceListPageRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public GetServiceListPageRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetServiceListPageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetServiceListPageRequest setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public GetServiceListPageRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public GetServiceListPageRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetServiceListPageRequest setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

    public GetServiceListPageRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
