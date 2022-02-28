// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServerInstancesRequest extends TeaModel {
    @NameInMap("EipAddresses")
    public String eipAddresses;

    @NameInMap("InnerIpAddresses")
    public String innerIpAddresses;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrivateIpAddresses")
    public String privateIpAddresses;

    @NameInMap("PublicIpAddresses")
    public String publicIpAddresses;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SitePairId")
    public String sitePairId;

    public static DescribeServerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerInstancesRequest self = new DescribeServerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerInstancesRequest setEipAddresses(String eipAddresses) {
        this.eipAddresses = eipAddresses;
        return this;
    }
    public String getEipAddresses() {
        return this.eipAddresses;
    }

    public DescribeServerInstancesRequest setInnerIpAddresses(String innerIpAddresses) {
        this.innerIpAddresses = innerIpAddresses;
        return this;
    }
    public String getInnerIpAddresses() {
        return this.innerIpAddresses;
    }

    public DescribeServerInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeServerInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeServerInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeServerInstancesRequest setPrivateIpAddresses(String privateIpAddresses) {
        this.privateIpAddresses = privateIpAddresses;
        return this;
    }
    public String getPrivateIpAddresses() {
        return this.privateIpAddresses;
    }

    public DescribeServerInstancesRequest setPublicIpAddresses(String publicIpAddresses) {
        this.publicIpAddresses = publicIpAddresses;
        return this;
    }
    public String getPublicIpAddresses() {
        return this.publicIpAddresses;
    }

    public DescribeServerInstancesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeServerInstancesRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

}
