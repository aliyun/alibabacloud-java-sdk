// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceMethodPageRequest extends TeaModel {
    /**
     * <p>The language in which you want the results to be displayed. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hkhonxxxxx@f3f75ed8ffxxxxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>example-app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The IP address of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>223.5.5.5</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The full name of the Controller class to which the interface belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>com.alibabacloud.mse.demo.a.AController</p>
     */
    @NameInMap("MethodController")
    public String methodController;

    /**
     * <p>The method name.</p>
     * 
     * <strong>example:</strong>
     * <p>aMethod</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The Microservices Engine (MSE) namespace to which the application belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request path that corresponds to the interface.</p>
     * 
     * <strong>example:</strong>
     * <p>/a</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The group to which the service belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("ServiceGroup")
    public String serviceGroup;

    /**
     * <p>The name of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>sc-A</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>springCloud</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static GetServiceMethodPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMethodPageRequest self = new GetServiceMethodPageRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceMethodPageRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetServiceMethodPageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetServiceMethodPageRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
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

    public GetServiceMethodPageRequest setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }
    public String getServiceGroup() {
        return this.serviceGroup;
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

}
