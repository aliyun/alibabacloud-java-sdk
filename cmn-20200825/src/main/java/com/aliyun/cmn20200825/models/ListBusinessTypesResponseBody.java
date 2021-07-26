// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListBusinessTypesResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // 数组，返回示例目录。
    @NameInMap("BusinessType")
    public java.util.List<ListBusinessTypesResponseBodyBusinessType> businessType;

    public static ListBusinessTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessTypesResponseBody self = new ListBusinessTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBusinessTypesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListBusinessTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBusinessTypesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListBusinessTypesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListBusinessTypesResponseBody setBusinessType(java.util.List<ListBusinessTypesResponseBodyBusinessType> businessType) {
        this.businessType = businessType;
        return this;
    }
    public java.util.List<ListBusinessTypesResponseBodyBusinessType> getBusinessType() {
        return this.businessType;
    }

    public static class ListBusinessTypesResponseBodyBusinessType extends TeaModel {
        // 修改时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 资源一级ID
        @NameInMap("BusinessTypeId")
        public String businessTypeId;

        // 业务类型名称
        @NameInMap("Name")
        public String name;

        // 业务类型缩写
        @NameInMap("Abbreviation")
        public String abbreviation;

        // 掩码
        @NameInMap("Mask")
        public String mask;

        // 网关地址位置，正数为正数序号，负数为倒数序号
        @NameInMap("Gateway")
        public Long gateway;

        // 是否复用 reuse/single
        @NameInMap("Sharing")
        public String sharing;

        // 分配方向，0表示正向，1表示反向
        @NameInMap("Direction")
        public Long direction;

        // 保留地址数目
        @NameInMap("ReserveNumber")
        public Long reserveNumber;

        // 业务类型大类
        @NameInMap("Type")
        public String type;

        // 绑定的园区类型
        @NameInMap("ZoneType")
        public String zoneType;

        // 有效时间
        @NameInMap("LeaseTime")
        public String leaseTime;

        // Vlan
        @NameInMap("Vlan")
        public String vlan;

        // 业务类型地址申请完对应的动作，DHCP表示需要触发DHCP变更
        @NameInMap("ActionFlag")
        public String actionFlag;

        public static ListBusinessTypesResponseBodyBusinessType build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessTypesResponseBodyBusinessType self = new ListBusinessTypesResponseBodyBusinessType();
            return TeaModel.build(map, self);
        }

        public ListBusinessTypesResponseBodyBusinessType setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListBusinessTypesResponseBodyBusinessType setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBusinessTypesResponseBodyBusinessType setBusinessTypeId(String businessTypeId) {
            this.businessTypeId = businessTypeId;
            return this;
        }
        public String getBusinessTypeId() {
            return this.businessTypeId;
        }

        public ListBusinessTypesResponseBodyBusinessType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBusinessTypesResponseBodyBusinessType setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public ListBusinessTypesResponseBodyBusinessType setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ListBusinessTypesResponseBodyBusinessType setGateway(Long gateway) {
            this.gateway = gateway;
            return this;
        }
        public Long getGateway() {
            return this.gateway;
        }

        public ListBusinessTypesResponseBodyBusinessType setSharing(String sharing) {
            this.sharing = sharing;
            return this;
        }
        public String getSharing() {
            return this.sharing;
        }

        public ListBusinessTypesResponseBodyBusinessType setDirection(Long direction) {
            this.direction = direction;
            return this;
        }
        public Long getDirection() {
            return this.direction;
        }

        public ListBusinessTypesResponseBodyBusinessType setReserveNumber(Long reserveNumber) {
            this.reserveNumber = reserveNumber;
            return this;
        }
        public Long getReserveNumber() {
            return this.reserveNumber;
        }

        public ListBusinessTypesResponseBodyBusinessType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListBusinessTypesResponseBodyBusinessType setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

        public ListBusinessTypesResponseBodyBusinessType setLeaseTime(String leaseTime) {
            this.leaseTime = leaseTime;
            return this;
        }
        public String getLeaseTime() {
            return this.leaseTime;
        }

        public ListBusinessTypesResponseBodyBusinessType setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

        public ListBusinessTypesResponseBodyBusinessType setActionFlag(String actionFlag) {
            this.actionFlag = actionFlag;
            return this;
        }
        public String getActionFlag() {
            return this.actionFlag;
        }

    }

}
