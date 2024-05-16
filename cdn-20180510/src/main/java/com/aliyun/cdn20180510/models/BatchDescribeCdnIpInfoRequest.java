// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchDescribeCdnIpInfoRequest extends TeaModel {
    /**
     * <p>The list of IP addresses to query. Separate IP addresses with commas (,). You can specify up to 20 IP addresses at a time.</p>
     * <br>
     * <p>> *   Example of an IPv4 address: 192.0.2.1</p>
     * <p>>*   Example of an IPv6 address: 2001:db8:ffff:ffff:ffff:\\*\\*\\*\\*:ffff.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpAddrList")
    public String ipAddrList;

    @NameInMap("Language")
    public String language;

    public static BatchDescribeCdnIpInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDescribeCdnIpInfoRequest self = new BatchDescribeCdnIpInfoRequest();
        return TeaModel.build(map, self);
    }

    public BatchDescribeCdnIpInfoRequest setIpAddrList(String ipAddrList) {
        this.ipAddrList = ipAddrList;
        return this;
    }
    public String getIpAddrList() {
        return this.ipAddrList;
    }

    public BatchDescribeCdnIpInfoRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
