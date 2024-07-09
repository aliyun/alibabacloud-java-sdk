// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchDescribeCdnIpInfoRequest extends TeaModel {
    /**
     * <p>The list of IP addresses to query. Separate IP addresses with commas (,). You can specify up to 20 IP addresses at a time.</p>
     * <blockquote>
     * <ul>
     * <li>Example of an IPv4 address: 192.0.2.1</li>
     * <li>Example of an IPv6 address: 2001:db8:ffff:ffff:ffff:\<em>\</em>\<em>\</em>:ffff.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111.XXX.XXX.230,47.XXX.XXX.243</p>
     */
    @NameInMap("IpAddrList")
    public String ipAddrList;

    /**
     * <p>The language of the query results. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Simplified Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
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
