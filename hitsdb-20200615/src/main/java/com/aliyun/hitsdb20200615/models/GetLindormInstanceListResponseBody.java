// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceListResponseBody extends TeaModel {
    @NameInMap("InstanceList")
    public java.util.List<GetLindormInstanceListResponseBodyInstanceList> instanceList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static GetLindormInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceListResponseBody self = new GetLindormInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceListResponseBody setInstanceList(java.util.List<GetLindormInstanceListResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<GetLindormInstanceListResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public GetLindormInstanceListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetLindormInstanceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLindormInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormInstanceListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetLindormInstanceListResponseBodyInstanceList extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("CreateMilliseconds")
        public Long createMilliseconds;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("ExpiredMilliseconds")
        public Long expiredMilliseconds;

        @NameInMap("InstanceAlias")
        public String instanceAlias;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceStorage")
        public String instanceStorage;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetLindormInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceListResponseBodyInstanceList self = new GetLindormInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceListResponseBodyInstanceList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetLindormInstanceListResponseBodyInstanceList setCreateMilliseconds(Long createMilliseconds) {
            this.createMilliseconds = createMilliseconds;
            return this;
        }
        public Long getCreateMilliseconds() {
            return this.createMilliseconds;
        }

        public GetLindormInstanceListResponseBodyInstanceList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLindormInstanceListResponseBodyInstanceList setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public GetLindormInstanceListResponseBodyInstanceList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetLindormInstanceListResponseBodyInstanceList setExpiredMilliseconds(Long expiredMilliseconds) {
            this.expiredMilliseconds = expiredMilliseconds;
            return this;
        }
        public Long getExpiredMilliseconds() {
            return this.expiredMilliseconds;
        }

        public GetLindormInstanceListResponseBodyInstanceList setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public GetLindormInstanceListResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetLindormInstanceListResponseBodyInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetLindormInstanceListResponseBodyInstanceList setInstanceStorage(String instanceStorage) {
            this.instanceStorage = instanceStorage;
            return this;
        }
        public String getInstanceStorage() {
            return this.instanceStorage;
        }

        public GetLindormInstanceListResponseBodyInstanceList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetLindormInstanceListResponseBodyInstanceList setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetLindormInstanceListResponseBodyInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetLindormInstanceListResponseBodyInstanceList setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetLindormInstanceListResponseBodyInstanceList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetLindormInstanceListResponseBodyInstanceList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
