// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AssociateNetworkCidrBlockResponseBody extends TeaModel {
    /**
     * <p>The allocated secondary CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:0:a600::/110</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The IP address type of the secondary CIDR block. Valid values:</p>
     * <ul>
     * <li>IPV4: IPv4 address.</li>
     * <li>IPV6: IPv6 address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPV6</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateNetworkCidrBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkCidrBlockResponseBody self = new AssociateNetworkCidrBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkCidrBlockResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public AssociateNetworkCidrBlockResponseBody setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public AssociateNetworkCidrBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
