// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceConsumersPageRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>efbda488-7b33-432f-a40d-<strong><strong>0047</strong></strong></p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>The service group.</p>
     * 
     * <strong>example:</strong>
     * <p>DUBBO</p>
     */
    @NameInMap("group")
    public String group;

    /**
     * <p>The IP address of the service provider. Fuzzy searches are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>10.20.x.xx</p>
     */
    @NameInMap("ip")
    public String ip;

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
     * <p>The type of the service registry. This parameter is deprecated. You can ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>nacos</p>
     */
    @NameInMap("registryType")
    public String registryType;

    /**
     * <p>The ID of the service. This parameter is deprecated. You can ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibabacloud.hipstershop.CartService</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibabacloud.hipstershop.CartService</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>The type of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>dubbo</p>
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
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The source of the service. Set the value to edas.</p>
     * 
     * <strong>example:</strong>
     * <p>edas</p>
     */
    @NameInMap("source")
    public String source;

    public static GetServiceConsumersPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConsumersPageRequest self = new GetServiceConsumersPageRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceConsumersPageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetServiceConsumersPageRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetServiceConsumersPageRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetServiceConsumersPageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetServiceConsumersPageRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public GetServiceConsumersPageRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetServiceConsumersPageRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetServiceConsumersPageRequest setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public GetServiceConsumersPageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceConsumersPageRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetServiceConsumersPageRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetServiceConsumersPageRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceConsumersPageRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public GetServiceConsumersPageRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
