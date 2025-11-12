// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeNodeTypeResponseBody extends TeaModel {
    @NameInMap("DiskQuantity")
    public Integer diskQuantity;

    /**
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("EniHighDenseQuantity")
    public Integer eniHighDenseQuantity;

    /**
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("EniIpv6AddressQuantity")
    public Integer eniIpv6AddressQuantity;

    /**
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("EniPrivateIpAddressQuantity")
    public Integer eniPrivateIpAddressQuantity;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("EniQuantity")
    public Integer eniQuantity;

    /**
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNodeTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeTypeResponseBody self = new DescribeNodeTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeTypeResponseBody setDiskQuantity(Integer diskQuantity) {
        this.diskQuantity = diskQuantity;
        return this;
    }
    public Integer getDiskQuantity() {
        return this.diskQuantity;
    }

    public DescribeNodeTypeResponseBody setEniHighDenseQuantity(Integer eniHighDenseQuantity) {
        this.eniHighDenseQuantity = eniHighDenseQuantity;
        return this;
    }
    public Integer getEniHighDenseQuantity() {
        return this.eniHighDenseQuantity;
    }

    public DescribeNodeTypeResponseBody setEniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
        this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
        return this;
    }
    public Integer getEniIpv6AddressQuantity() {
        return this.eniIpv6AddressQuantity;
    }

    public DescribeNodeTypeResponseBody setEniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
        this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
        return this;
    }
    public Integer getEniPrivateIpAddressQuantity() {
        return this.eniPrivateIpAddressQuantity;
    }

    public DescribeNodeTypeResponseBody setEniQuantity(Integer eniQuantity) {
        this.eniQuantity = eniQuantity;
        return this;
    }
    public Integer getEniQuantity() {
        return this.eniQuantity;
    }

    public DescribeNodeTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
