// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetUnitTypeAndUnitDefinesResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetUnitTypeAndUnitDefinesResponseBodyData> data;

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

    public static GetUnitTypeAndUnitDefinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUnitTypeAndUnitDefinesResponseBody self = new GetUnitTypeAndUnitDefinesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUnitTypeAndUnitDefinesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetUnitTypeAndUnitDefinesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUnitTypeAndUnitDefinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUnitTypeAndUnitDefinesResponseBody setData(java.util.List<GetUnitTypeAndUnitDefinesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUnitTypeAndUnitDefinesResponseBodyData> getData() {
        return this.data;
    }

    public GetUnitTypeAndUnitDefinesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUnitTypeAndUnitDefinesResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetUnitTypeAndUnitDefinesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetUnitTypeAndUnitDefinesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUnitTypeAndUnitDefinesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetUnitTypeAndUnitDefinesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells extends TeaModel {
        // 单元格创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 地域ID
        @NameInMap("regionId")
        public String regionId;

        // 包含的可用区ID列表
        @NameInMap("zoneIds")
        public java.util.List<String> zoneIds;

        // 单元唯一标识
        @NameInMap("unitFlag")
        public String unitFlag;

        // 单元格唯一标识
        @NameInMap("cellFlag")
        public String cellFlag;

        // 单元格名称
        @NameInMap("cellName")
        public String cellName;

        // 业务类型唯一标识
        @NameInMap("unitType")
        public String unitType;

        // 是否流量隔离。开启流量隔离，单元格流量比例固定为0，需要单独配置引流规则。
        @NameInMap("flowIsolated")
        public Boolean flowIsolated;

        public static GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells build(java.util.Map<String, ?> map) throws Exception {
            GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells self = new GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells();
            return TeaModel.build(map, self);
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells setZoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public java.util.List<String> getZoneIds() {
            return this.zoneIds;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells setUnitFlag(String unitFlag) {
            this.unitFlag = unitFlag;
            return this;
        }
        public String getUnitFlag() {
            return this.unitFlag;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells setCellFlag(String cellFlag) {
            this.cellFlag = cellFlag;
            return this;
        }
        public String getCellFlag() {
            return this.cellFlag;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells setCellName(String cellName) {
            this.cellName = cellName;
            return this;
        }
        public String getCellName() {
            return this.cellName;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells setUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }
        public String getUnitType() {
            return this.unitType;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells setFlowIsolated(Boolean flowIsolated) {
            this.flowIsolated = flowIsolated;
            return this;
        }
        public Boolean getFlowIsolated() {
            return this.flowIsolated;
        }

    }

    public static class GetUnitTypeAndUnitDefinesResponseBodyDataUnits extends TeaModel {
        // 单元创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 单元唯一标识
        @NameInMap("unitFlag")
        public String unitFlag;

        // 单元名称
        @NameInMap("unitName")
        public String unitName;

        // 地域ID
        @NameInMap("regionId")
        public String regionId;

        // 业务类型唯一标识
        @NameInMap("unitType")
        public String unitType;

        // 可用区ID列表
        @NameInMap("zoneIds")
        public java.util.List<String> zoneIds;

        // 单元角色列表。值为 中心单元：center，副中心单元：standby，普通多活单元：normal
        @NameInMap("unitRoles")
        public java.util.List<String> unitRoles;

        // 包含的单元格定义列表
        @NameInMap("cells")
        public java.util.List<GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells> cells;

        public static GetUnitTypeAndUnitDefinesResponseBodyDataUnits build(java.util.Map<String, ?> map) throws Exception {
            GetUnitTypeAndUnitDefinesResponseBodyDataUnits self = new GetUnitTypeAndUnitDefinesResponseBodyDataUnits();
            return TeaModel.build(map, self);
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnits setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnits setUnitFlag(String unitFlag) {
            this.unitFlag = unitFlag;
            return this;
        }
        public String getUnitFlag() {
            return this.unitFlag;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnits setUnitName(String unitName) {
            this.unitName = unitName;
            return this;
        }
        public String getUnitName() {
            return this.unitName;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnits setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnits setUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }
        public String getUnitType() {
            return this.unitType;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnits setZoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public java.util.List<String> getZoneIds() {
            return this.zoneIds;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnits setUnitRoles(java.util.List<String> unitRoles) {
            this.unitRoles = unitRoles;
            return this;
        }
        public java.util.List<String> getUnitRoles() {
            return this.unitRoles;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyDataUnits setCells(java.util.List<GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells> cells) {
            this.cells = cells;
            return this;
        }
        public java.util.List<GetUnitTypeAndUnitDefinesResponseBodyDataUnitsCells> getCells() {
            return this.cells;
        }

    }

    public static class GetUnitTypeAndUnitDefinesResponseBodyData extends TeaModel {
        // 创建业务类型的时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 业务类型唯一标识
        @NameInMap("unitType")
        public String unitType;

        // 业务类型名称
        @NameInMap("name")
        public String name;

        // 包含的单元定义列表
        @NameInMap("units")
        public java.util.List<GetUnitTypeAndUnitDefinesResponseBodyDataUnits> units;

        public static GetUnitTypeAndUnitDefinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUnitTypeAndUnitDefinesResponseBodyData self = new GetUnitTypeAndUnitDefinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUnitTypeAndUnitDefinesResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyData setUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }
        public String getUnitType() {
            return this.unitType;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUnitTypeAndUnitDefinesResponseBodyData setUnits(java.util.List<GetUnitTypeAndUnitDefinesResponseBodyDataUnits> units) {
            this.units = units;
            return this;
        }
        public java.util.List<GetUnitTypeAndUnitDefinesResponseBodyDataUnits> getUnits() {
            return this.units;
        }

    }

}
