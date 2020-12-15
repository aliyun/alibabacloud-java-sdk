// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListVehicleTopResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListVehicleTopResponseData> data;

    public static ListVehicleTopResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVehicleTopResponse self = new ListVehicleTopResponse();
        return TeaModel.build(map, self);
    }

    public ListVehicleTopResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVehicleTopResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVehicleTopResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVehicleTopResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListVehicleTopResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVehicleTopResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVehicleTopResponse setData(java.util.List<ListVehicleTopResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVehicleTopResponseData> getData() {
        return this.data;
    }

    public static class ListVehicleTopResponseData extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("VehicleId")
        @Validation(required = true)
        public String vehicleId;

        @NameInMap("PoiId")
        @Validation(required = true)
        public String poiId;

        @NameInMap("PoiName")
        @Validation(required = true)
        public String poiName;

        @NameInMap("PassHour")
        @Validation(required = true)
        public String passHour;

        @NameInMap("Frequency")
        @Validation(required = true)
        public String frequency;

        public static ListVehicleTopResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListVehicleTopResponseData self = new ListVehicleTopResponseData();
            return TeaModel.build(map, self);
        }

        public ListVehicleTopResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListVehicleTopResponseData setVehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }
        public String getVehicleId() {
            return this.vehicleId;
        }

        public ListVehicleTopResponseData setPoiId(String poiId) {
            this.poiId = poiId;
            return this;
        }
        public String getPoiId() {
            return this.poiId;
        }

        public ListVehicleTopResponseData setPoiName(String poiName) {
            this.poiName = poiName;
            return this;
        }
        public String getPoiName() {
            return this.poiName;
        }

        public ListVehicleTopResponseData setPassHour(String passHour) {
            this.passHour = passHour;
            return this;
        }
        public String getPassHour() {
            return this.passHour;
        }

        public ListVehicleTopResponseData setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }
        public String getFrequency() {
            return this.frequency;
        }

    }

}
