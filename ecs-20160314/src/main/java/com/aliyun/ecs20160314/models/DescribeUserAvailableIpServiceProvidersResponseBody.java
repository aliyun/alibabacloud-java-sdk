// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeUserAvailableIpServiceProvidersResponseBody extends TeaModel {
    @NameInMap("IpServiceProviders")
    public IpServiceProviders ipServiceProviders;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserAvailableIpServiceProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAvailableIpServiceProvidersResponseBody self = new DescribeUserAvailableIpServiceProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserAvailableIpServiceProvidersResponseBody setIpServiceProviders(IpServiceProviders ipServiceProviders) {
        this.ipServiceProviders = ipServiceProviders;
        return this;
    }
    public IpServiceProviders getIpServiceProviders() {
        return this.ipServiceProviders;
    }

    public DescribeUserAvailableIpServiceProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class IpServiceProvider extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static IpServiceProvider build(java.util.Map<String, ?> map) throws Exception {
            IpServiceProvider self = new IpServiceProvider();
            return TeaModel.build(map, self);
        }

        public IpServiceProvider setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class IpServiceProviders extends TeaModel {
        @NameInMap("IpServiceProvider")
        public java.util.List<IpServiceProvider> ipServiceProvider;

        public static IpServiceProviders build(java.util.Map<String, ?> map) throws Exception {
            IpServiceProviders self = new IpServiceProviders();
            return TeaModel.build(map, self);
        }

        public IpServiceProviders setIpServiceProvider(java.util.List<IpServiceProvider> ipServiceProvider) {
            this.ipServiceProvider = ipServiceProvider;
            return this;
        }
        public java.util.List<IpServiceProvider> getIpServiceProvider() {
            return this.ipServiceProvider;
        }

    }

}
