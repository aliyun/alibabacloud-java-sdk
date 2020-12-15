// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListVehicleDetailsResponse extends TeaModel {
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
    public java.util.List<ListVehicleDetailsResponseData> data;

    public static ListVehicleDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVehicleDetailsResponse self = new ListVehicleDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListVehicleDetailsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVehicleDetailsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVehicleDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVehicleDetailsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListVehicleDetailsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVehicleDetailsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVehicleDetailsResponse setData(java.util.List<ListVehicleDetailsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVehicleDetailsResponseData> getData() {
        return this.data;
    }

    public static class ListVehicleDetailsResponseData extends TeaModel {
        @NameInMap("VehicleId")
        @Validation(required = true)
        public String vehicleId;

        @NameInMap("VehicleColor")
        @Validation(required = true)
        public String vehicleColor;

        @NameInMap("TargetImageStoragePath")
        @Validation(required = true)
        public String targetImageStoragePath;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("PersonType")
        @Validation(required = true)
        public String personType;

        @NameInMap("PrefOutTime")
        @Validation(required = true)
        public String prefOutTime;

        @NameInMap("PopularPoi")
        @Validation(required = true)
        public String popularPoi;

        @NameInMap("PopularAddress")
        @Validation(required = true)
        public String popularAddress;

        @NameInMap("SourceImageStoragePath")
        @Validation(required = true)
        public String sourceImageStoragePath;

        @NameInMap("VehicleClass")
        @Validation(required = true)
        public String vehicleClass;

        @NameInMap("VehicleApplication")
        @Validation(required = true)
        public String vehicleApplication;

        @NameInMap("PersonId")
        @Validation(required = true)
        public String personId;

        @NameInMap("PlateId")
        @Validation(required = true)
        public String plateId;

        public static ListVehicleDetailsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListVehicleDetailsResponseData self = new ListVehicleDetailsResponseData();
            return TeaModel.build(map, self);
        }

        public ListVehicleDetailsResponseData setVehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }
        public String getVehicleId() {
            return this.vehicleId;
        }

        public ListVehicleDetailsResponseData setVehicleColor(String vehicleColor) {
            this.vehicleColor = vehicleColor;
            return this;
        }
        public String getVehicleColor() {
            return this.vehicleColor;
        }

        public ListVehicleDetailsResponseData setTargetImageStoragePath(String targetImageStoragePath) {
            this.targetImageStoragePath = targetImageStoragePath;
            return this;
        }
        public String getTargetImageStoragePath() {
            return this.targetImageStoragePath;
        }

        public ListVehicleDetailsResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListVehicleDetailsResponseData setPersonType(String personType) {
            this.personType = personType;
            return this;
        }
        public String getPersonType() {
            return this.personType;
        }

        public ListVehicleDetailsResponseData setPrefOutTime(String prefOutTime) {
            this.prefOutTime = prefOutTime;
            return this;
        }
        public String getPrefOutTime() {
            return this.prefOutTime;
        }

        public ListVehicleDetailsResponseData setPopularPoi(String popularPoi) {
            this.popularPoi = popularPoi;
            return this;
        }
        public String getPopularPoi() {
            return this.popularPoi;
        }

        public ListVehicleDetailsResponseData setPopularAddress(String popularAddress) {
            this.popularAddress = popularAddress;
            return this;
        }
        public String getPopularAddress() {
            return this.popularAddress;
        }

        public ListVehicleDetailsResponseData setSourceImageStoragePath(String sourceImageStoragePath) {
            this.sourceImageStoragePath = sourceImageStoragePath;
            return this;
        }
        public String getSourceImageStoragePath() {
            return this.sourceImageStoragePath;
        }

        public ListVehicleDetailsResponseData setVehicleClass(String vehicleClass) {
            this.vehicleClass = vehicleClass;
            return this;
        }
        public String getVehicleClass() {
            return this.vehicleClass;
        }

        public ListVehicleDetailsResponseData setVehicleApplication(String vehicleApplication) {
            this.vehicleApplication = vehicleApplication;
            return this;
        }
        public String getVehicleApplication() {
            return this.vehicleApplication;
        }

        public ListVehicleDetailsResponseData setPersonId(String personId) {
            this.personId = personId;
            return this;
        }
        public String getPersonId() {
            return this.personId;
        }

        public ListVehicleDetailsResponseData setPlateId(String plateId) {
            this.plateId = plateId;
            return this;
        }
        public String getPlateId() {
            return this.plateId;
        }

    }

}
