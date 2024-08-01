// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of queried instances.</p>
     */
    @NameInMap("GtmInstances")
    public DescribeGtmInstancesResponseBodyGtmInstances gtmInstances;

    /**
     * <p>The returned page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>193B0163-7F93-42DF-AB05-ACEEB7D22707</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeGtmInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstancesResponseBody self = new DescribeGtmInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstancesResponseBody setGtmInstances(DescribeGtmInstancesResponseBodyGtmInstances gtmInstances) {
        this.gtmInstances = gtmInstances;
        return this;
    }
    public DescribeGtmInstancesResponseBodyGtmInstances getGtmInstances() {
        return this.gtmInstances;
    }

    public DescribeGtmInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstancesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmInstancesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance extends TeaModel {
        /**
         * <p>The number of access policies.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AccessStrategyNum")
        public Integer accessStrategyNum;

        /**
         * <p>The number of address pools.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AddressPoolNum")
        public Integer addressPoolNum;

        /**
         * <p>The name of the alert group.</p>
         * 
         * <strong>example:</strong>
         * <p>[\\&quot;R\&amp;D group\\&quot;]</p>
         */
        @NameInMap("AlertGroup")
        public String alertGroup;

        /**
         * <p>The CNAME domain name that is used to access the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance1.14.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The CNAME domain name used to access the instance. Valid values:</p>
         * <ul>
         * <li><strong>SYSTEM_ASSIGN</strong>: A CNAME domain name assigned by the system is used.</li>
         * <li><strong>CUSTOM</strong>: A custom CNAME domain name is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ASSIGN</p>
         */
        @NameInMap("CnameMode")
        public String cnameMode;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-06-06T11:34Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The UNIX timestamp that indicates when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1528284856000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The time when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-06-06T11:34Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The UNIX timestamp that indicates when the instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1528284856000</p>
         */
        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The load balancing policy that is used. Valid values:</p>
         * <ul>
         * <li><strong>ALL_RR</strong>: Load balancing</li>
         * <li><strong>RATIO</strong>: Weighted round-robin</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RATIO</p>
         */
        @NameInMap("LbaStrategy")
        public String lbaStrategy;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2q2jqpjh***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The global time to live (TTL).</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The domain name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("UserDomainName")
        public String userDomainName;

        /**
         * <p>The version code of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>biaozhun</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        public static DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance self = new DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setAccessStrategyNum(Integer accessStrategyNum) {
            this.accessStrategyNum = accessStrategyNum;
            return this;
        }
        public Integer getAccessStrategyNum() {
            return this.accessStrategyNum;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setAddressPoolNum(Integer addressPoolNum) {
            this.addressPoolNum = addressPoolNum;
            return this;
        }
        public Integer getAddressPoolNum() {
            return this.addressPoolNum;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setAlertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public String getAlertGroup() {
            return this.alertGroup;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setCnameMode(String cnameMode) {
            this.cnameMode = cnameMode;
            return this;
        }
        public String getCnameMode() {
            return this.cnameMode;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setLbaStrategy(String lbaStrategy) {
            this.lbaStrategy = lbaStrategy;
            return this;
        }
        public String getLbaStrategy() {
            return this.lbaStrategy;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setUserDomainName(String userDomainName) {
            this.userDomainName = userDomainName;
            return this;
        }
        public String getUserDomainName() {
            return this.userDomainName;
        }

        public DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

    public static class DescribeGtmInstancesResponseBodyGtmInstances extends TeaModel {
        @NameInMap("GtmInstance")
        public java.util.List<DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance> gtmInstance;

        public static DescribeGtmInstancesResponseBodyGtmInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstancesResponseBodyGtmInstances self = new DescribeGtmInstancesResponseBodyGtmInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setGtmInstance(java.util.List<DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance> gtmInstance) {
            this.gtmInstance = gtmInstance;
            return this;
        }
        public java.util.List<DescribeGtmInstancesResponseBodyGtmInstancesGtmInstance> getGtmInstance() {
            return this.gtmInstance;
        }

    }

}
