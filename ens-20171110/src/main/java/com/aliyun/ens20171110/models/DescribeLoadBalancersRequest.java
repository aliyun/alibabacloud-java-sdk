// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersRequest extends TeaModel {
    /**
     * <p>The IP address that the ELB instance uses to provide services.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.8</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou-10</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the ELB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5q73cv04zeyh43lh74lp4****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the ELB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The status of the ELB instance. Valid values:</p>
     * <ul>
     * <li><strong>Active</strong> (default): The listener for the instance can forward the received traffic based on the rule.</li>
     * <li><strong>InActive</strong>: The listener for the instance does not forward the received traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InActive</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The ID of the network.</p>
     * 
     * <strong>example:</strong>
     * <p>n-5s9ayrxsd9hszrlt5fgv2****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: <strong>10</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the backend server.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5f67ffjc004wwz0t****</p>
     */
    @NameInMap("ServerId")
    public String serverId;

    /**
     * <p>The ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-5sy773iy25rulsmgskmba****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static DescribeLoadBalancersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancersRequest self = new DescribeLoadBalancersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancersRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DescribeLoadBalancersRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public DescribeLoadBalancersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeLoadBalancersRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public DescribeLoadBalancersRequest setLoadBalancerStatus(String loadBalancerStatus) {
        this.loadBalancerStatus = loadBalancerStatus;
        return this;
    }
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    public DescribeLoadBalancersRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public DescribeLoadBalancersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadBalancersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadBalancersRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public DescribeLoadBalancersRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
