// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeForwardTableEntriesRequest extends TeaModel {
    /**
     * <p>The EIP in the DNAT entry. The public IP address is used to access the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p>36.XXX.XXX.72</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>The ID of the DNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>fwd-5tfi6f0rutmd00xrhkag7****</p>
     */
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    /**
     * <p>The name of the DNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>test0</p>
     */
    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>The private IP address of the instance that uses the DNAT entry for Internet communication.</p>
     * 
     * <strong>example:</strong>
     * <p>10.XXX.XXX.50</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The protocol. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong>: forwards TCP packets.</li>
     * <li><strong>UDP</strong>: forwards UDP packets.</li>
     * <li><strong>Any</strong>: forwards all packets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The page number. Pages start from page <strong>1</strong>.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>100</strong>.</p>
     * <p>Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeForwardTableEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeForwardTableEntriesRequest self = new DescribeForwardTableEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeForwardTableEntriesRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public DescribeForwardTableEntriesRequest setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public DescribeForwardTableEntriesRequest setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public DescribeForwardTableEntriesRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public DescribeForwardTableEntriesRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public DescribeForwardTableEntriesRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeForwardTableEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeForwardTableEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
