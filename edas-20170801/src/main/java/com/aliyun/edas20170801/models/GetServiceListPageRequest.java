// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceListPageRequest extends TeaModel {
    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou:doc-test</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The source of the data. Valid values:</p>
     * <ul>
     * <li><code>agent</code>: Use this value if you use the service query feature of the latest version to pass the query result.</li>
     * <li><code>registry</code>: Use this value if you use the service query feature of the earlier version to pass the query result.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Agent</p>
     */
    @NameInMap("origin")
    public String origin;

    /**
     * <p>The number of the page to return. Pages start from Page 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The type of the service. Valid values:</p>
     * <ul>
     * <li><code>app</code>: searches by application.</li>
     * <li><code>service</code>: searches by service.</li>
     * <li><code>providerIp</code>: searches by IP address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>App</p>
     */
    @NameInMap("searchType")
    public String searchType;

    /**
     * <p>The keyword used for the search.</p>
     * <ul>
     * <li>Set this parameter to the ID of the application if you set the searchType parameter to app.``</li>
     * <li>Set this parameter to the name of the service if you set the serachType parameter to service.``</li>
     * <li>Set this parameter to the IP address of the application if you set the searchType parameter to providerIp.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>com.alibaba.edas.HelloService</p>
     */
    @NameInMap("searchValue")
    public String searchValue;

    /**
     * <p>The type of the service. Valid values:</p>
     * <ul>
     * <li><code>dubbo</code></li>
     * <li><code>springCloud</code></li>
     * <li><code>hsf</code></li>
     * <li><code>istio</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SpringCloud</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <p>Specifies the provider side or the consumer side. Valid values:</p>
     * <ul>
     * <li>provider</li>
     * <li>consumer</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>provider</p>
     */
    @NameInMap("side")
    public String side;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
