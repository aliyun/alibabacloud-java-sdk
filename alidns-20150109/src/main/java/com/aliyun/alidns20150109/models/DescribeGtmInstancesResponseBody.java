// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstancesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("GtmInstances")
    public java.util.List<DescribeGtmInstancesResponseBodyGtmInstances> gtmInstances;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static DescribeGtmInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstancesResponseBody self = new DescribeGtmInstancesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeGtmInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmInstancesResponseBody setGtmInstances(java.util.List<DescribeGtmInstancesResponseBodyGtmInstances> gtmInstances) {
        this.gtmInstances = gtmInstances;
        return this;
    }
    public java.util.List<DescribeGtmInstancesResponseBodyGtmInstances> getGtmInstances() {
        return this.gtmInstances;
    }

    public DescribeGtmInstancesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmInstancesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class DescribeGtmInstancesResponseBodyGtmInstances extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("AccessStrategyNum")
        public Integer accessStrategyNum;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CnameMode")
        public String cnameMode;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("AlertGroup")
        public String alertGroup;

        @NameInMap("AddressPoolNum")
        public Integer addressPoolNum;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("LbaStrategy")
        public String lbaStrategy;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("UserDomainName")
        public String userDomainName;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeGtmInstancesResponseBodyGtmInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstancesResponseBodyGtmInstances self = new DescribeGtmInstancesResponseBodyGtmInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setAccessStrategyNum(Integer accessStrategyNum) {
            this.accessStrategyNum = accessStrategyNum;
            return this;
        }
        public Integer getAccessStrategyNum() {
            return this.accessStrategyNum;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setCnameMode(String cnameMode) {
            this.cnameMode = cnameMode;
            return this;
        }
        public String getCnameMode() {
            return this.cnameMode;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setAlertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public String getAlertGroup() {
            return this.alertGroup;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setAddressPoolNum(Integer addressPoolNum) {
            this.addressPoolNum = addressPoolNum;
            return this;
        }
        public Integer getAddressPoolNum() {
            return this.addressPoolNum;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setLbaStrategy(String lbaStrategy) {
            this.lbaStrategy = lbaStrategy;
            return this;
        }
        public String getLbaStrategy() {
            return this.lbaStrategy;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setUserDomainName(String userDomainName) {
            this.userDomainName = userDomainName;
            return this;
        }
        public String getUserDomainName() {
            return this.userDomainName;
        }

        public DescribeGtmInstancesResponseBodyGtmInstances setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
