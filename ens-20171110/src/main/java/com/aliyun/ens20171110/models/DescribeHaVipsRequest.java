// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeHaVipsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-beijing-cmcc</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <strong>example:</strong>
     * <p>10.5.XX.XX</p>
     */
    @NameInMap("HaVipAddress")
    public String haVipAddress;

    /**
     * <strong>example:</strong>
     * <p>havip-5p14t****</p>
     */
    @NameInMap("HaVipId")
    public String haVipId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>n-57gqcdfvx6n****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>vsw-5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static DescribeHaVipsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHaVipsRequest self = new DescribeHaVipsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHaVipsRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeHaVipsRequest setHaVipAddress(String haVipAddress) {
        this.haVipAddress = haVipAddress;
        return this;
    }
    public String getHaVipAddress() {
        return this.haVipAddress;
    }

    public DescribeHaVipsRequest setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }
    public String getHaVipId() {
        return this.haVipId;
    }

    public DescribeHaVipsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeHaVipsRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeHaVipsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHaVipsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeHaVipsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeHaVipsRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
