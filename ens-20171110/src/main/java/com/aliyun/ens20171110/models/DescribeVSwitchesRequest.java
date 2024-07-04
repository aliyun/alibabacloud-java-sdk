// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeVSwitchesRequest extends TeaModel {
    /**
     * <p>The ID of the edge node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-xian-unicom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the VPC to which the vSwitches belong.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-25cdvfeq58pl****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The order in which you want to sort the returned data. Example: {&quot;EnsRegionId&quot;:&quot;desc&quot;}.</p>
     * <p>By default, the nodes are sorted by IDs in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EnsRegionId&quot;:&quot;desc&quot;}</p>
     */
    @NameInMap("OrderByParams")
    public String orderByParams;

    /**
     * <p>The page number of the returned page. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-5m9xhlq8oh***</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The name of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>testVSwitchName</p>
     */
    @NameInMap("VSwitchName")
    public String vSwitchName;

    public static DescribeVSwitchesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVSwitchesRequest self = new DescribeVSwitchesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVSwitchesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeVSwitchesRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeVSwitchesRequest setOrderByParams(String orderByParams) {
        this.orderByParams = orderByParams;
        return this;
    }
    public String getOrderByParams() {
        return this.orderByParams;
    }

    public DescribeVSwitchesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVSwitchesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVSwitchesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVSwitchesRequest setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

}
