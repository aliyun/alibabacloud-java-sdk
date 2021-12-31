// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVpcAccessesRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // VPC授权名称
    @NameInMap("Name")
    public String name;

    // 当前页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页展示条目
    @NameInMap("PageSize")
    public Integer pageSize;

    // 端口号
    @NameInMap("Port")
    public String port;

    @NameInMap("SecurityToken")
    public String securityToken;

    // Vpc授权ID
    @NameInMap("VpcAccessId")
    public String vpcAccessId;

    // Vpc ID
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeVpcAccessesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAccessesRequest self = new DescribeVpcAccessesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcAccessesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeVpcAccessesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVpcAccessesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcAccessesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcAccessesRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribeVpcAccessesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeVpcAccessesRequest setVpcAccessId(String vpcAccessId) {
        this.vpcAccessId = vpcAccessId;
        return this;
    }
    public String getVpcAccessId() {
        return this.vpcAccessId;
    }

    public DescribeVpcAccessesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
