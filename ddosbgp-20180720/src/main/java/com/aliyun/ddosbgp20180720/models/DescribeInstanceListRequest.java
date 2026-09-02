// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeInstanceListRequest extends TeaModel {
    /**
     * <p>The IDs of the Anti-DDoS Origin instances to query. Specify the value in the <code>[&quot;&lt;Instance ID 1&gt;&quot;,&quot;&lt;Instance ID 2&gt;&quot;,……]</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ddosbgp-cn-oew1pjrk****&quot;]</p>
     */
    @NameInMap("InstanceIdList")
    public String instanceIdList;

    /**
     * <p>The mitigation plan type of the Anti-DDoS Origin instance to query. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Professional.</li>
     * <li><strong>1</strong>: Enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The mitigation plan types of the Anti-DDoS Origin instances to query.</p>
     */
    @NameInMap("InstanceTypeList")
    public java.util.List<String> instanceTypeList;

    /**
     * <p>The protected IP address of the Anti-DDoS Origin instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>47.89.XX.XX</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The protocol type of the IP assets protected by the Anti-DDoS Origin instance to query. Valid values:</p>
     * <ul>
     * <li><strong>IPv4</strong>: IPv4 protocol.</li>
     * <li><strong>IPv6</strong>: IPv6 protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The sort field for the Anti-DDoS Origin instance list. The value is fixed as <strong>expireTime</strong>, which indicates sorting by instance expiration time.</p>
     * <p>You can use the <strong>Orderdire</strong> parameter to specify the sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>expireTime</p>
     */
    @NameInMap("Orderby")
    public String orderby;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong> (default): descending order by expiration time.</li>
     * <li><strong>asc</strong>: ascending order by expiration time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Orderdire")
    public String orderdire;

    /**
     * <p>The page number of the current page in a paging query. Settings the current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of instances on each page in a paging query. Settings the number of instances per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the Anti-DDoS Origin instance to query.</p>
     * <blockquote>
     * <h2>You can call <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> to query all region IDs supported by Anti-DDoS Origin.</h2>
     * <p>Notice: This parameter is required. If it is not specified, the API returns DDosBgp.CheckError.InvalidRegion(400).</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remark of the Anti-DDoS Origin instance to query. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
     * <p>If you do not specify this parameter, the default resource group is used.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags bound to the Anti-DDoS Origin instances to query.</p>
     */
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
         * <p>The key of the tag bound to the Anti-DDoS Origin instance to query.</p>
         * 
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag bound to the Anti-DDoS Origin instance to query.</p>
         * 
         * <strong>example:</strong>
         * <p>test-value</p>
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
