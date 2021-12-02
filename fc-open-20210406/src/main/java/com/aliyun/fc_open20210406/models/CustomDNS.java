// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CustomDNS extends TeaModel {
    // DNS resolver 配置参数列表
    @NameInMap("dnsOptions")
    public java.util.List<DNSOption> dnsOptions;

    // DNS 服务器的 IP 地址列表
    @NameInMap("nameServers")
    public java.util.List<String> nameServers;

    // DNS 搜索域的列表
    @NameInMap("searches")
    public java.util.List<String> searches;

    public static CustomDNS build(java.util.Map<String, ?> map) throws Exception {
        CustomDNS self = new CustomDNS();
        return TeaModel.build(map, self);
    }

    public CustomDNS setDnsOptions(java.util.List<DNSOption> dnsOptions) {
        this.dnsOptions = dnsOptions;
        return this;
    }
    public java.util.List<DNSOption> getDnsOptions() {
        return this.dnsOptions;
    }

    public CustomDNS setNameServers(java.util.List<String> nameServers) {
        this.nameServers = nameServers;
        return this;
    }
    public java.util.List<String> getNameServers() {
        return this.nameServers;
    }

    public CustomDNS setSearches(java.util.List<String> searches) {
        this.searches = searches;
        return this;
    }
    public java.util.List<String> getSearches() {
        return this.searches;
    }

}
