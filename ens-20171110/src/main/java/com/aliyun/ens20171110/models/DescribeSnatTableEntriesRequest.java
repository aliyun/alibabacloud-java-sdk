// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatTableEntriesRequest extends TeaModel {
    /**
     * <p>The ID of the Network Address Translation (NAT) gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-5tawjw5j7sgd2deujxuk0****</p>
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
     * <p>The number of entries per page. The maximum value is <strong>100</strong>.</p>
     * <p>Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the SNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-5tfjp36fsrb36zs36faj0****</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    /**
     * <p>The name of the SNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>test0</p>
     */
    @NameInMap("SnatEntryName")
    public String snatEntryName;

    /**
     * <p>The elastic IP address (EIP) specified in the SNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>58.XXXX.XXX.29</p>
     */
    @NameInMap("SnatIp")
    public String snatIp;

    /**
     * <p>The source CIDR block specified in the SNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>10.1.0.50/32</p>
     */
    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    public static DescribeSnatTableEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatTableEntriesRequest self = new DescribeSnatTableEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnatTableEntriesRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeSnatTableEntriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnatTableEntriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnatTableEntriesRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public DescribeSnatTableEntriesRequest setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public DescribeSnatTableEntriesRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public DescribeSnatTableEntriesRequest setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

}
