// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeVpcAccessesRequest extends TeaModel {
    /**
     * <p>Whether to conduct precise queries</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AccurateQuery")
    public Boolean accurateQuery;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.199.26.***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the authorization. The name must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>wuying-edm-svc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The service port.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("Port")
    public String port;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The port number.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeVpcAccessesRequestTag> tag;

    /**
     * <p>The ID of the VPC authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*****ssds24</p>
     */
    @NameInMap("VpcAccessId")
    public String vpcAccessId;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf657qec7lx42paw3qxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeVpcAccessesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcAccessesRequest self = new DescribeVpcAccessesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcAccessesRequest setAccurateQuery(Boolean accurateQuery) {
        this.accurateQuery = accurateQuery;
        return this;
    }
    public Boolean getAccurateQuery() {
        return this.accurateQuery;
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>appname</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
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
