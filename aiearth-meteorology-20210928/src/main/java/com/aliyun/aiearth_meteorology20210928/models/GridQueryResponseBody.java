// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20210928.models;

import com.aliyun.tea.*;

public class GridQueryResponseBody extends TeaModel {
    // 响应码
    @NameInMap("code")
    public Long code;

    // 响应信息
    @NameInMap("message")
    public String message;

    // 响应结果
    @NameInMap("module")
    public GridQueryResponseBodyModule module;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    public static GridQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GridQueryResponseBody self = new GridQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public GridQueryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GridQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GridQueryResponseBody setModule(GridQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GridQueryResponseBodyModule getModule() {
        return this.module;
    }

    public GridQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GridQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GridQueryResponseBodyModuleList extends TeaModel {
        // 数据类型
        @NameInMap("dataType")
        public String dataType;

        // 要素
        @NameInMap("element")
        public String element;

        // 要素单位
        @NameInMap("elementUnit")
        public String elementUnit;

        // 预报时间
        @NameInMap("forecastTimestamp")
        public String forecastTimestamp;

        // 查询点纬度
        @NameInMap("latitude")
        public Double latitude;

        // 查询点经度
        @NameInMap("longitude")
        public Double longitude;

        // 起报时间
        @NameInMap("reportTimestamp")
        public String reportTimestamp;

        // 当前网格值
        @NameInMap("value")
        public Double value;

        public static GridQueryResponseBodyModuleList build(java.util.Map<String, ?> map) throws Exception {
            GridQueryResponseBodyModuleList self = new GridQueryResponseBodyModuleList();
            return TeaModel.build(map, self);
        }

        public GridQueryResponseBodyModuleList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GridQueryResponseBodyModuleList setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public GridQueryResponseBodyModuleList setElementUnit(String elementUnit) {
            this.elementUnit = elementUnit;
            return this;
        }
        public String getElementUnit() {
            return this.elementUnit;
        }

        public GridQueryResponseBodyModuleList setForecastTimestamp(String forecastTimestamp) {
            this.forecastTimestamp = forecastTimestamp;
            return this;
        }
        public String getForecastTimestamp() {
            return this.forecastTimestamp;
        }

        public GridQueryResponseBodyModuleList setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }
        public Double getLatitude() {
            return this.latitude;
        }

        public GridQueryResponseBodyModuleList setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }
        public Double getLongitude() {
            return this.longitude;
        }

        public GridQueryResponseBodyModuleList setReportTimestamp(String reportTimestamp) {
            this.reportTimestamp = reportTimestamp;
            return this;
        }
        public String getReportTimestamp() {
            return this.reportTimestamp;
        }

        public GridQueryResponseBodyModuleList setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GridQueryResponseBodyModule extends TeaModel {
        // 分页结果列表
        @NameInMap("list")
        public java.util.List<GridQueryResponseBodyModuleList> list;

        // 分页编号
        @NameInMap("pageNo")
        public Integer pageNo;

        // 分页大小
        @NameInMap("pageSize")
        public Integer pageSize;

        public static GridQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GridQueryResponseBodyModule self = new GridQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GridQueryResponseBodyModule setList(java.util.List<GridQueryResponseBodyModuleList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GridQueryResponseBodyModuleList> getList() {
            return this.list;
        }

        public GridQueryResponseBodyModule setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GridQueryResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
