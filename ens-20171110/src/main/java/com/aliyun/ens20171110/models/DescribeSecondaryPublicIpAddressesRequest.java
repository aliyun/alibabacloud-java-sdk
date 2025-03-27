// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSecondaryPublicIpAddressesRequest extends TeaModel {
    /**
     * <p>The ID of the edge node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-44</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("EnsRegionIds")
    public java.util.List<String> ensRegionIds;

    /**
     * <p>The Internet service provider. Valid values:</p>
     * <ul>
     * <li>cmcc: China Mobile.</li>
     * <li>unicom: China Unicom.</li>
     * <li>telecom: China Telecom.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>unicom</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The secondary IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>12.XXX.XXX.4</p>
     */
    @NameInMap("SecondaryPublicIpAddress")
    public String secondaryPublicIpAddress;

    /**
     * <p>The ID of the secondary public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>spi-5wys0pio93c9f9ukzj2f2fwyr</p>
     */
    @NameInMap("SecondaryPublicIpId")
    public String secondaryPublicIpId;

    public static DescribeSecondaryPublicIpAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecondaryPublicIpAddressesRequest self = new DescribeSecondaryPublicIpAddressesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecondaryPublicIpAddressesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeSecondaryPublicIpAddressesRequest setEnsRegionIds(java.util.List<String> ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public DescribeSecondaryPublicIpAddressesRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeSecondaryPublicIpAddressesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSecondaryPublicIpAddressesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSecondaryPublicIpAddressesRequest setSecondaryPublicIpAddress(String secondaryPublicIpAddress) {
        this.secondaryPublicIpAddress = secondaryPublicIpAddress;
        return this;
    }
    public String getSecondaryPublicIpAddress() {
        return this.secondaryPublicIpAddress;
    }

    public DescribeSecondaryPublicIpAddressesRequest setSecondaryPublicIpId(String secondaryPublicIpId) {
        this.secondaryPublicIpId = secondaryPublicIpId;
        return this;
    }
    public String getSecondaryPublicIpId() {
        return this.secondaryPublicIpId;
    }

}
