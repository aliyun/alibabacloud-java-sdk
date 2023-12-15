// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVpcAccessesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Port")
    public String port;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tag")
    public java.util.List<DescribeVpcAccessesRequestTag> tag;

    @NameInMap("VpcAccessId")
    public String vpcAccessId;

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

    public DescribeVpcAccessesRequest setTag(java.util.List<DescribeVpcAccessesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVpcAccessesRequestTag> getTag() {
        return this.tag;
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

    public static class DescribeVpcAccessesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVpcAccessesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcAccessesRequestTag self = new DescribeVpcAccessesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpcAccessesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpcAccessesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
