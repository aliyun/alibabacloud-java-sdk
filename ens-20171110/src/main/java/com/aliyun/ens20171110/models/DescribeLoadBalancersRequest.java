// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersRequest extends TeaModel {
    /**
     * <p>The service address of the load balancing instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ENS edge zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-guangzhou-10</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The list of ENS edge zone IDs.</p>
     */
    @NameInMap("EnsRegionIds")
    public java.util.List<String> ensRegionIds;

    /**
     * <p>The ID of the load balancing instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5q73cv04zeyh43lh74lp4****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the load balancing instance.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The listener status of the load balancing instance. Valid values:</p>
     * <ul>
     * <li><strong>Active</strong>: The listeners in the instance can forward accepted traffic based on rules.</li>
     * <li><strong>InActive</strong>: The listeners in the instance no longer forward accepted traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InActive</p>
     */
    @NameInMap("LoadBalancerStatus")
    public String loadBalancerStatus;

    /**
     * <p>The type of the load balancing instance.</p>
     * 
     * <strong>example:</strong>
     * <p>CLB</p>
     */
    @NameInMap("LoadBalancerType")
    public String loadBalancerType;

    /**
     * <p>The network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>n-5s9ayrxsd9hszrlt5fgv2****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The page number of the list. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The Settings for the number of entries per page during paging in a paged query. Default value: 10. Valid values: <strong>10</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The backend server instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5f67ffjc004wwz0t****</p>
     */
    @NameInMap("ServerId")
    public String serverId;

    /**
     * <p>The vSwitch ID.</p>
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

    public DescribeLoadBalancersRequest setEnsRegionIds(java.util.List<String> ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
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

    public DescribeLoadBalancersRequest setLoadBalancerType(String loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }
    public String getLoadBalancerType() {
        return this.loadBalancerType;
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
