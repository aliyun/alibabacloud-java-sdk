// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainPropertyResponseBody extends TeaModel {
    /**
     * <p>The name of the protocol. Valid values:</p>
     * <br>
     * <p>*   **udp**: User Datagram Protocol (UDP)</p>
     * <p>*   **tcp**: Transmission Control Protocol (TCP)</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>>  The maximum number of times that users can call this operation per second is 10.</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The accelerated domain name that is queried.</p>
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
