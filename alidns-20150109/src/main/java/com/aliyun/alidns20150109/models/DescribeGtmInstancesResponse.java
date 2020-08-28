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

    }

    public static class DescribeGtmInstancesResponseGtmInstances extends TeaModel {
        @NameInMap("GtmInstance")
        @Validation(required = true)
        public java.util.List<DescribeGtmInstancesResponseGtmInstancesGtmInstance> gtmInstance;

        public static DescribeGtmInstancesResponseGtmInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmInstancesResponseGtmInstances self = new DescribeGtmInstancesResponseGtmInstances();
            return TeaModel.build(map, self);
        }

    }

}
