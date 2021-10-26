// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListServicesResponseBody extends TeaModel {
    // 下次查询token
    @NameInMap("nextToken")
    public String nextToken;

    // 服务列表
    @NameInMap("services")
    public java.util.List<ListServicesResponseBodyServices> services;

    public static ListServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponseBody self = new ListServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServicesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServicesResponseBody setServices(java.util.List<ListServicesResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ListServicesResponseBodyServices> getServices() {
        return this.services;
    }

    public static class ListServicesResponseBodyServices extends TeaModel {
        // 创建时间
        @NameInMap("createdTime")
        public String createdTime;

        // 服务描述
        @NameInMap("description")
        public String description;

        // 公网访问设置
        @NameInMap("internetAccess")
        public Boolean internetAccess;

        // 上次更新时间
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        @NameInMap("logConfig")
        public LogConfig logConfig;

        @NameInMap("nasConfig")
        public NASConfig nasConfig;

        // 服务角色
        @NameInMap("role")
        public String role;

        // 服务ID
        @NameInMap("serviceId")
        public String serviceId;

        // 服务信息
        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("tracingConfig")
        public TracingConfig tracingConfig;

        @NameInMap("vpcConfig")
        public VPCConfig vpcConfig;

        public static ListServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            ListServicesResponseBodyServices self = new ListServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public ListServicesResponseBodyServices setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListServicesResponseBodyServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListServicesResponseBodyServices setInternetAccess(Boolean internetAccess) {
            this.internetAccess = internetAccess;
            return this;
        }
        public Boolean getInternetAccess() {
            return this.internetAccess;
        }

        public ListServicesResponseBodyServices setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListServicesResponseBodyServices setLogConfig(LogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public LogConfig getLogConfig() {
            return this.logConfig;
        }

        public ListServicesResponseBodyServices setNasConfig(NASConfig nasConfig) {
            this.nasConfig = nasConfig;
            return this;
        }
        public NASConfig getNasConfig() {
            return this.nasConfig;
        }

        public ListServicesResponseBodyServices setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListServicesResponseBodyServices setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListServicesResponseBodyServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListServicesResponseBodyServices setTracingConfig(TracingConfig tracingConfig) {
            this.tracingConfig = tracingConfig;
            return this;
        }
        public TracingConfig getTracingConfig() {
            return this.tracingConfig;
        }

        public ListServicesResponseBodyServices setVpcConfig(VPCConfig vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public VPCConfig getVpcConfig() {
            return this.vpcConfig;
        }

    }

}
