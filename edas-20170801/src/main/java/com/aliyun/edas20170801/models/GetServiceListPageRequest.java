// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceListPageRequest extends TeaModel {
    /**
     * <p>The namespace.</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The source of the data. Valid values:</p>
     * <br>
     * <p>*   `agent`: Use this value if you use the service query feature of the latest version to pass the query result.</p>
     * <p>*   `registry`: Use this value if you use the service query feature of the earlier version to pass the query result.</p>
     */
    @NameInMap("origin")
    public String origin;

    /**
     * <p>The number of the page to return. Pages start from Page 0.</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The type of the service. Valid values:</p>
     * <br>
     * <p>*   `app`: searches by application.</p>
     * <p>*   `service`: searches by service.</p>
     * <p>*   `providerIp`: searches by IP address.</p>
     */
    @NameInMap("searchType")
    public String searchType;

    /**
     * <p>The keyword used for the search.</p>
     * <br>
     * <p>*   Set this parameter to the ID of the application if you set the searchType parameter to app.``</p>
     * <p>*   Set this parameter to the name of the service if you set the serachType parameter to service.``</p>
     * <p>*   Set this parameter to the IP address of the application if you set the searchType parameter to providerIp.</p>
     */
    @NameInMap("searchValue")
    public String searchValue;

    /**
     * <p>The type of the service. Valid values:</p>
     * <br>
     * <p>*   `dubbo`</p>
     * <p>*   `springCloud`</p>
     * <p>*   `hsf`</p>
     * <p>*   `istio`</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <p>Specifies the provider side or the consumer side. Valid values:</p>
     * <br>
     * <p>*   provider</p>
     * <p>*   consumer</p>
     */
    @NameInMap("side")
    public String side;

    /**
     * <p>The number of entries to return on each page.</p>
     */
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
