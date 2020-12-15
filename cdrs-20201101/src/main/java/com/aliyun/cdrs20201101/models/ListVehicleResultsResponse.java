// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListVehicleResultsResponse extends TeaModel {
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
    public java.util.List<ListVehicleResultsResponseData> data;

    public static ListVehicleResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVehicleResultsResponse self = new ListVehicleResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListVehicleResultsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVehicleResultsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVehicleResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVehicleResultsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListVehicleResultsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVehicleResultsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVehicleResultsResponse setData(java.util.List<ListVehicleResultsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVehicleResultsResponseData> getData() {
        return this.data;
    }

    public static class ListVehicleResultsResponseData extends TeaModel {
        @NameInMap("VehicleId")
        @Validation(required = true)
        public String vehicleId;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("VehicleClass")
        @Validation(required = true)
        public String vehicleClass;

        @NameInMap("Profession")
        @Validation(required = true)
        public String profession;

        @NameInMap("LiveAddress")
        @Validation(required = true)
        public String liveAddress;

        @NameInMap("PlateId")
        @Validation(required = true)
        public String plateId;

        @NameInMap("VehicleApplication")
        @Validation(required = true)
        public String vehicleApplication;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static ListVehicleResultsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListVehicleResultsResponseData self = new ListVehicleResultsResponseData();
            return TeaModel.build(map, self);
        }

        public ListVehicleResultsResponseData setVehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }
        public String getVehicleId() {
            return this.vehicleId;
        }

        public ListVehicleResultsResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListVehicleResultsResponseData setVehicleClass(String vehicleClass) {
            this.vehicleClass = vehicleClass;
            return this;
        }
        public String getVehicleClass() {
            return this.vehicleClass;
        }

        public ListVehicleResultsResponseData setProfession(String profession) {
            this.profession = profession;
            return this;
        }
        public String getProfession() {
            return this.profession;
        }

        public ListVehicleResultsResponseData setLiveAddress(String liveAddress) {
            this.liveAddress = liveAddress;
            return this;
        }
        public String getLiveAddress() {
            return this.liveAddress;
        }

        public ListVehicleResultsResponseData setPlateId(String plateId) {
            this.plateId = plateId;
            return this;
        }
        public String getPlateId() {
            return this.plateId;
        }

        public ListVehicleResultsResponseData setVehicleApplication(String vehicleApplication) {
            this.vehicleApplication = vehicleApplication;
            return this;
        }
        public String getVehicleApplication() {
            return this.vehicleApplication;
        }

        public ListVehicleResultsResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListVehicleResultsResponseData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
