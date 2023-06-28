// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CustomDNS extends TeaModel {
    @NameInMap("dnsOptions")
    public java.util.List<DNSOption> dnsOptions;

    @NameInMap("nameServers")
    public java.util.List<String> nameServers;

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
