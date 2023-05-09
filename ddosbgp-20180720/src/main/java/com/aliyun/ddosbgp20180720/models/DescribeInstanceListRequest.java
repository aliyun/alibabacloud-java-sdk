// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceListRequest extends TeaModel {
    /**
     * <p>The details about the Anti-DDoS Origin instance.</p>
     */
    @NameInMap("InstanceIdList")
    public String instanceIdList;

    /**
     * <p>The IDs of the Anti-DDoS Origin instances to query. Specify the value is in the `["<Instance ID 1>","<Instance ID 2>",……]` format.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceTypeList")
    public java.util.List<String> instanceTypeList;

    /**
     * <p>The remarks of the Anti-DDoS Origin instance to query. Fuzzy match is supported.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The time when the instance was purchased. This value is a UNIX timestamp. Unit: milliseconds.</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The mitigation plan of the Anti-DDoS Origin instance to query. Valid values:</p>
     * <br>
     * <p>*   **0**: the Professional mitigation plan</p>
     * <p>*   **1**: the Enterprise mitigation plan</p>
     */
    @NameInMap("Orderby")
    public String orderby;

    /**
     * <p>The key of the tag that is added to the Anti-DDoS Origin instance to query.</p>
     */
    @NameInMap("Orderdire")
    public String orderdire;

    /**
     * <p>The total number of Anti-DDoS Origin instances.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The IP address of the object that is protected by the Anti-DDoS Origin instance to query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the Anti-DDoS Origin instance to query resides.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Indicates whether auto-renewal is enabled for the instance. Valid values:</p>
     * <br>
     * <p>*   **true**: enabled</p>
     * <p>*   **false**: disabled</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <br>
     * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeInstanceListRequestTag> tag;

    public static DescribeInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceListRequest self = new DescribeInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceListRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public DescribeInstanceListRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceListRequest setInstanceTypeList(java.util.List<String> instanceTypeList) {
        this.instanceTypeList = instanceTypeList;
        return this;
    }
    public java.util.List<String> getInstanceTypeList() {
        return this.instanceTypeList;
    }

    public DescribeInstanceListRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeInstanceListRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
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

    public DescribeInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeInstanceListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstanceListRequest setTag(java.util.List<DescribeInstanceListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstanceListRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeInstanceListRequestTag extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The field that is used to sort the Anti-DDoS Origin instances. Set the value to **expireTime**, which indicates that the instances are sorted based on the expiration time.</p>
         * <br>
         * <p>You can set the **Orderdire** parameter to specify the sorting method.</p>
         */
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
