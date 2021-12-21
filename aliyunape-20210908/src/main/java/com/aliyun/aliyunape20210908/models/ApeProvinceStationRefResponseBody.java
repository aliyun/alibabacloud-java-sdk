// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunape20210908.models;

import com.aliyun.tea.*;

public class ApeProvinceStationRefResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public ApeProvinceStationRefResponseBodyData data;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // rt
    @NameInMap("Rt")
    public Long rt;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static ApeProvinceStationRefResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApeProvinceStationRefResponseBody self = new ApeProvinceStationRefResponseBody();
        return TeaModel.build(map, self);
    }

    public ApeProvinceStationRefResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApeProvinceStationRefResponseBody setData(ApeProvinceStationRefResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApeProvinceStationRefResponseBodyData getData() {
        return this.data;
    }

    public ApeProvinceStationRefResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApeProvinceStationRefResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApeProvinceStationRefResponseBody setRt(Long rt) {
        this.rt = rt;
        return this;
    }
    public Long getRt() {
        return this.rt;
    }

    public ApeProvinceStationRefResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApeProvinceStationRefResponseBodyDataDataList extends TeaModel {
        @NameInMap("Adcode")
        public Long adcode;

        @NameInMap("City")
        public String city;

        @NameInMap("Cnty")
        public String cnty;

        @NameInMap("Country")
        public String country;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Lat")
        public String lat;

        @NameInMap("Lon")
        public String lon;

        @NameInMap("ProvinceCode")
        public Long provinceCode;

        @NameInMap("ProvinceName")
        public String provinceName;

        @NameInMap("StationId")
        public Long stationId;

        @NameInMap("StationName")
        public String stationName;

        public static ApeProvinceStationRefResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            ApeProvinceStationRefResponseBodyDataDataList self = new ApeProvinceStationRefResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public ApeProvinceStationRefResponseBodyDataDataList setAdcode(Long adcode) {
            this.adcode = adcode;
            return this;
        }
        public Long getAdcode() {
            return this.adcode;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setCnty(String cnty) {
            this.cnty = cnty;
            return this;
        }
        public String getCnty() {
            return this.cnty;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setLat(String lat) {
            this.lat = lat;
            return this;
        }
        public String getLat() {
            return this.lat;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setLon(String lon) {
            this.lon = lon;
            return this;
        }
        public String getLon() {
            return this.lon;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setProvinceCode(Long provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }
        public Long getProvinceCode() {
            return this.provinceCode;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setStationId(Long stationId) {
            this.stationId = stationId;
            return this;
        }
        public Long getStationId() {
            return this.stationId;
        }

        public ApeProvinceStationRefResponseBodyDataDataList setStationName(String stationName) {
            this.stationName = stationName;
            return this;
        }
        public String getStationName() {
            return this.stationName;
        }

    }

    public static class ApeProvinceStationRefResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("Current")
        public Long current;

        @NameInMap("PageSize")
        public Long pageSize;

        // total
        @NameInMap("Total")
        public Long total;

        public static ApeProvinceStationRefResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ApeProvinceStationRefResponseBodyDataPageInfo self = new ApeProvinceStationRefResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ApeProvinceStationRefResponseBodyDataPageInfo setCurrent(Long current) {
            this.current = current;
            return this;
        }
        public Long getCurrent() {
            return this.current;
        }

        public ApeProvinceStationRefResponseBodyDataPageInfo setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ApeProvinceStationRefResponseBodyDataPageInfo setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ApeProvinceStationRefResponseBodyData extends TeaModel {
        // dataList
        @NameInMap("DataList")
        public java.util.List<ApeProvinceStationRefResponseBodyDataDataList> dataList;

        // pageInfo
        @NameInMap("PageInfo")
        public ApeProvinceStationRefResponseBodyDataPageInfo pageInfo;

        public static ApeProvinceStationRefResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApeProvinceStationRefResponseBodyData self = new ApeProvinceStationRefResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApeProvinceStationRefResponseBodyData setDataList(java.util.List<ApeProvinceStationRefResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<ApeProvinceStationRefResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public ApeProvinceStationRefResponseBodyData setPageInfo(ApeProvinceStationRefResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ApeProvinceStationRefResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
