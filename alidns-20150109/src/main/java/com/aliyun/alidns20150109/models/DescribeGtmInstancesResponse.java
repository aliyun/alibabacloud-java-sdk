// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("GtmInstances")
    @Validation(required = true)
    public DescribeGtmInstancesResponseGtmInstances gtmInstances;

    public static DescribeGtmInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstancesResponse self = new DescribeGtmInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmInstancesResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmInstancesResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmInstancesResponse setGtmInstances(DescribeGtmInstancesResponseGtmInstances gtmInstances) {
        this.gtmInstances = gtmInstances;
        return this;
    }
    public DescribeGtmInstancesResponseGtmInstances getGtmInstances() {
        return this.gtmInstances;
    }

    public static class DescribeGtmInstancesResponseGtmInstancesGtmInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("Cname")
        @Validation(required = true)
        public String cname;

        @NameInMap("UserDomainName")
        @Validation(required = true)
        public String userDomainName;

        @NameInMap("VersionCode")
        @Validation(required = true)
        public String versionCode;

        @NameInMap("Ttl")
        @Validation(required = true)
        public Integer ttl;

        @NameInMap("LbaStrategy")
        @Validation(required = true)
        public String lbaStrategy;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("ExpireTimestamp")
        @Validation(required = true)
        public Long expireTimestamp;

        @NameInMap("AlertGroup")
        @Validation(required = true)
        public String alertGroup;

        @NameInMap("CnameMode")
        @Validation(required = true)
        public String cnameMode;

        @NameInMap("AccessStrategyNum")
        @Validation(required = true)
        public Integer accessStrategyNum;

        @NameInMap("AddressPoolNum")
        @Validation(required = true)
        public Integer addressPoolNum;

        public static DescribeGtmInstancesResponseGtmInstancesGtmInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstancesResponseGtmInstancesGtmInstance self = new DescribeGtmInstancesResponseGtmInstancesGtmInstance();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setUserDomainName(String userDomainName) {
            this.userDomainName = userDomainName;
            return this;
        }
        public String getUserDomainName() {
            return this.userDomainName;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setLbaStrategy(String lbaStrategy) {
            this.lbaStrategy = lbaStrategy;
            return this;
        }
        public String getLbaStrategy() {
            return this.lbaStrategy;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setAlertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public String getAlertGroup() {
            return this.alertGroup;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setCnameMode(String cnameMode) {
            this.cnameMode = cnameMode;
            return this;
        }
        public String getCnameMode() {
            return this.cnameMode;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setAccessStrategyNum(Integer accessStrategyNum) {
            this.accessStrategyNum = accessStrategyNum;
            return this;
        }
        public Integer getAccessStrategyNum() {
            return this.accessStrategyNum;
        }

        public DescribeGtmInstancesResponseGtmInstancesGtmInstance setAddressPoolNum(Integer addressPoolNum) {
            this.addressPoolNum = addressPoolNum;
            return this;
        }
        public Integer getAddressPoolNum() {
            return this.addressPoolNum;
        }

    }

    public static class DescribeGtmInstancesResponseGtmInstances extends TeaModel {
        @NameInMap("GtmInstance")
        @Validation(required = true)
        public java.util.List<DescribeGtmInstancesResponseGtmInstancesGtmInstance> gtmInstance;

        public static DescribeGtmInstancesResponseGtmInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstancesResponseGtmInstances self = new DescribeGtmInstancesResponseGtmInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGtmInstancesResponseGtmInstances setGtmInstance(java.util.List<DescribeGtmInstancesResponseGtmInstancesGtmInstance> gtmInstance) {
            this.gtmInstance = gtmInstance;
            return this;
        }
        public java.util.List<DescribeGtmInstancesResponseGtmInstancesGtmInstance> getGtmInstance() {
            return this.gtmInstance;
        }

    }

}
