// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class ListDomainUnitCellsResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<ListDomainUnitCellsResponseBodyData> data;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("ip")
    public String ip;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("message")
    public String message;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("httpCode")
    public Integer httpCode;

    public static ListDomainUnitCellsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainUnitCellsResponseBody self = new ListDomainUnitCellsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainUnitCellsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListDomainUnitCellsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDomainUnitCellsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDomainUnitCellsResponseBody setData(java.util.List<ListDomainUnitCellsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDomainUnitCellsResponseBodyData> getData() {
        return this.data;
    }

    public ListDomainUnitCellsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDomainUnitCellsResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListDomainUnitCellsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDomainUnitCellsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDomainUnitCellsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDomainUnitCellsResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class ListDomainUnitCellsResponseBodyDataCells extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("isDeleted")
        public Boolean isDeleted;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("zoneIds")
        public java.util.List<String> zoneIds;

        @NameInMap("unitFlag")
        public String unitFlag;

        @NameInMap("cellFlag")
        public String cellFlag;

        @NameInMap("cellName")
        public String cellName;

        @NameInMap("cellOrder")
        public Long cellOrder;

        @NameInMap("rootOrgId")
        public String rootOrgId;

        @NameInMap("unitType")
        public String unitType;

        @NameInMap("creatorRootUserId")
        public String creatorRootUserId;

        @NameInMap("flowIsolated")
        public Boolean flowIsolated;

        @NameInMap("hasBackIp")
        public Boolean hasBackIp;

        public static ListDomainUnitCellsResponseBodyDataCells build(java.util.Map<String, ?> map) throws Exception {
            ListDomainUnitCellsResponseBodyDataCells self = new ListDomainUnitCellsResponseBodyDataCells();
            return TeaModel.build(map, self);
        }

        public ListDomainUnitCellsResponseBodyDataCells setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDomainUnitCellsResponseBodyDataCells setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListDomainUnitCellsResponseBodyDataCells setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDomainUnitCellsResponseBodyDataCells setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListDomainUnitCellsResponseBodyDataCells setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDomainUnitCellsResponseBodyDataCells setZoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public java.util.List<String> getZoneIds() {
            return this.zoneIds;
        }

        public ListDomainUnitCellsResponseBodyDataCells setUnitFlag(String unitFlag) {
            this.unitFlag = unitFlag;
            return this;
        }
        public String getUnitFlag() {
            return this.unitFlag;
        }

        public ListDomainUnitCellsResponseBodyDataCells setCellFlag(String cellFlag) {
            this.cellFlag = cellFlag;
            return this;
        }
        public String getCellFlag() {
            return this.cellFlag;
        }

        public ListDomainUnitCellsResponseBodyDataCells setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public ListDomainUnitCellsResponseBodyDataCells setCellOrder(Long cellOrder) {
            this.cellOrder = cellOrder;
            return this;
        }
        public Long getCellOrder() {
            return this.cellOrder;
        }

        public ListDomainUnitCellsResponseBodyDataCells setRootOrgId(String rootOrgId) {
            this.rootOrgId = rootOrgId;
            return this;
        }
        public String getRootOrgId() {
            return this.rootOrgId;
        }

        public ListDomainUnitCellsResponseBodyDataCells setUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }
        public String getUnitType() {
            return this.unitType;
        }

        public ListDomainUnitCellsResponseBodyDataCells setCreatorRootUserId(String creatorRootUserId) {
            this.creatorRootUserId = creatorRootUserId;
            return this;
        }
        public String getCreatorRootUserId() {
            return this.creatorRootUserId;
        }

        public ListDomainUnitCellsResponseBodyDataCells setFlowIsolated(Boolean flowIsolated) {
            this.flowIsolated = flowIsolated;
            return this;
        }
        public Boolean getFlowIsolated() {
            return this.flowIsolated;
        }

        public ListDomainUnitCellsResponseBodyDataCells setHasBackIp(Boolean hasBackIp) {
            this.hasBackIp = hasBackIp;
            return this;
        }
        public Boolean getHasBackIp() {
            return this.hasBackIp;
        }

    }

    public static class ListDomainUnitCellsResponseBodyData extends TeaModel {
        @NameInMap("id")
        public Long id;

        // 是否被删除
        @NameInMap("isDeleted")
        public Boolean isDeleted;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // 主用户
        @NameInMap("rootUserId")
        public String rootUserId;

        // 单元标
        @NameInMap("unitFlag")
        public String unitFlag;

        // 单元名
        @NameInMap("unitName")
        public String unitName;

        @NameInMap("regionId")
        public String regionId;

        // region名
        @NameInMap("regionName")
        public String regionName;

        // 组织树根结点的rootUserId
        @NameInMap("rootOrgId")
        public String rootOrgId;

        // 单元归属的多活类型
        @NameInMap("unitType")
        public String unitType;

        // 排序标识
        @NameInMap("unitOrder")
        public Long unitOrder;

        @NameInMap("zoneIds")
        public java.util.List<String> zoneIds;

        // 单元角色
        @NameInMap("unitRoles")
        public java.util.List<String> unitRoles;

        // 单元格
        @NameInMap("cells")
        public java.util.List<ListDomainUnitCellsResponseBodyDataCells> cells;

        public static ListDomainUnitCellsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDomainUnitCellsResponseBodyData self = new ListDomainUnitCellsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDomainUnitCellsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDomainUnitCellsResponseBodyData setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListDomainUnitCellsResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDomainUnitCellsResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListDomainUnitCellsResponseBodyData setRootUserId(String rootUserId) {
            this.rootUserId = rootUserId;
            return this;
        }
        public String getRootUserId() {
            return this.rootUserId;
        }

        public ListDomainUnitCellsResponseBodyData setUnitFlag(String unitFlag) {
            this.unitFlag = unitFlag;
            return this;
        }
        public String getUnitFlag() {
            return this.unitFlag;
        }

        public ListDomainUnitCellsResponseBodyData setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

        public ListDomainUnitCellsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDomainUnitCellsResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListDomainUnitCellsResponseBodyData setRootOrgId(String rootOrgId) {
            this.rootOrgId = rootOrgId;
            return this;
        }
        public String getRootOrgId() {
            return this.rootOrgId;
        }

        public ListDomainUnitCellsResponseBodyData setUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }
        public String getUnitType() {
            return this.unitType;
        }

        public ListDomainUnitCellsResponseBodyData setUnitOrder(Long unitOrder) {
            this.unitOrder = unitOrder;
            return this;
        }
        public Long getUnitOrder() {
            return this.unitOrder;
        }

        public ListDomainUnitCellsResponseBodyData setZoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public java.util.List<String> getZoneIds() {
            return this.zoneIds;
        }

        public ListDomainUnitCellsResponseBodyData setUnitRoles(java.util.List<String> unitRoles) {
            this.unitRoles = unitRoles;
            return this;
        }
        public java.util.List<String> getUnitRoles() {
            return this.unitRoles;
        }

        public ListDomainUnitCellsResponseBodyData setCells(java.util.List<ListDomainUnitCellsResponseBodyDataCells> cells) {
            this.cells = cells;
            return this;
        }
        public java.util.List<ListDomainUnitCellsResponseBodyDataCells> getCells() {
            return this.cells;
        }

    }

}
