// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("InstanceIdList")
    public String instanceIdList;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Orderby")
    public String orderby;

    @NameInMap("Orderdire")
    public String orderdire;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<DescribeInstanceListRequestTag> tag;

    public static DescribeInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceListRequest self = new DescribeInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInstanceListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstanceListRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeInstanceListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceListRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeInstanceListRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceListRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeInstanceListRequest setOrderby(String orderby) {
        this.orderby = orderby;
        return this;
    }
    public String getOrderby() {
        return this.orderby;
    }

    public DescribeInstanceListRequest setOrderdire(String orderdire) {
        this.orderdire = orderdire;
        return this;
    }
    public String getOrderdire() {
        return this.orderdire;
    }

    public DescribeInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceListRequest setTag(java.util.List<DescribeInstanceListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstanceListRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeInstanceListRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceListRequestTag self = new DescribeInstanceListRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstanceListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
