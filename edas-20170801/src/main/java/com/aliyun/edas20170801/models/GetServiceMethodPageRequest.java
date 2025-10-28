// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceMethodPageRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>310b18c3-1dbe-4807-<strong><strong>-18d7d637</strong></strong></p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>The group to which the service belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>DUBBO</p>
     */
    @NameInMap("group")
    public String group;

    /**
     * <p>The IP address of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("ip")
    public String ip;

    /**
     * <p>The controller method.</p>
     * 
     * <strong>example:</strong>
     * <p>com.aliware.edas.DemoController</p>
     */
    @NameInMap("methodController")
    public String methodController;

    /**
     * <p>The name of the method.</p>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou:doc-test</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The source of the data. Valid values:</p>
     * <ul>
     * <li>agent: Use this value if you use the service query feature of the latest version to pass the query result.</li>
     * <li>registry: Use this value if you use the service query feature of the earlier version to pass the query result.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agent</p>
     */
    @NameInMap("origin")
    public String origin;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request path.</p>
     * 
     * <strong>example:</strong>
     * <p>/echo/{str}</p>
     */
    @NameInMap("path")
    public String path;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The type of the service registry.</p>
     * 
     * <strong>example:</strong>
     * <p>nacos</p>
     */
    @NameInMap("registryType")
    public String registryType;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>edas.service.consumer</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>edas.service.consumer</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>The type of the service. Valid values:</p>
     * <ul>
     * <li>dubbo: Dubbo service</li>
     * <li>springCloud: Spring Cloud service</li>
     * <li>hsf: High-speed Service Framework (HSF) service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>springCloud</p>
     */
    @NameInMap("serviceType")
    public String serviceType;

    /**
     * <p>The version of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("serviceVersion")
    public String serviceVersion;

    /**
     * <p>The source of the service. Set the value to edas.</p>
     * 
     * <strong>example:</strong>
     * <p>edas</p>
     */
    @NameInMap("source")
    public String source;

    public static GetServiceMethodPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMethodPageRequest self = new GetServiceMethodPageRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceMethodPageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetServiceMethodPageRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetServiceMethodPageRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetServiceMethodPageRequest setMethodController(String methodController) {
        this.methodController = methodController;
        return this;
    }
    public String getMethodController() {
        return this.methodController;
    }

    public GetServiceMethodPageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetServiceMethodPageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetServiceMethodPageRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public GetServiceMethodPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetServiceMethodPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetServiceMethodPageRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetServiceMethodPageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetServiceMethodPageRequest setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public GetServiceMethodPageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceMethodPageRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetServiceMethodPageRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetServiceMethodPageRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceMethodPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
