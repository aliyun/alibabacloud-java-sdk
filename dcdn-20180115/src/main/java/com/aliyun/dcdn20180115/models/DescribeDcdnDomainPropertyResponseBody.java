// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainPropertyResponseBody extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The protocol. Valid values:</p>
     * <ul>
     * <li><strong>udp</strong></li>
     * <li><strong>tcp</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>udp</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34AB41F1-04A5-496F-8C8D-634BDBE6A9FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainPropertyResponseBody self = new DescribeDcdnDomainPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainPropertyResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainPropertyResponseBody setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public DescribeDcdnDomainPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
