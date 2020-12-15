// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapImageDetailsResponse extends TeaModel {
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
    public java.util.List<ListCityMapImageDetailsResponseData> data;

    public static ListCityMapImageDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapImageDetailsResponse self = new ListCityMapImageDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListCityMapImageDetailsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCityMapImageDetailsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCityMapImageDetailsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCityMapImageDetailsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCityMapImageDetailsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCityMapImageDetailsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListCityMapImageDetailsResponse setData(java.util.List<ListCityMapImageDetailsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCityMapImageDetailsResponseData> getData() {
        return this.data;
    }

    public static class ListCityMapImageDetailsResponseData extends TeaModel {
        @NameInMap("PersonTargetImageStoragePath")
        @Validation(required = true)
        public String personTargetImageStoragePath;

        @NameInMap("AgeLowerLimit")
        @Validation(required = true)
        public String ageLowerLimit;

        @NameInMap("AgeUpLimit")
        @Validation(required = true)
        public String ageUpLimit;

        @NameInMap("VehicleColor")
        @Validation(required = true)
        public String vehicleColor;

        @NameInMap("TrousersColor")
        @Validation(required = true)
        public String trousersColor;

        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("AgeLowerLimitReliability")
        @Validation(required = true)
        public String ageLowerLimitReliability;

        @NameInMap("GenderCodeReliability")
        @Validation(required = true)
        public String genderCodeReliability;

        @NameInMap("VehicleClassReliability")
        @Validation(required = true)
        public String vehicleClassReliability;

        @NameInMap("RecordId")
        @Validation(required = true)
        public String recordId;

        @NameInMap("AgeCodeReliability")
        @Validation(required = true)
        public String ageCodeReliability;

        @NameInMap("SourceImageStoragePath")
        @Validation(required = true)
        public String sourceImageStoragePath;

        @NameInMap("VehicleClass")
        @Validation(required = true)
        public String vehicleClass;

        @NameInMap("MotorTargetImageStoragePath")
        @Validation(required = true)
        public String motorTargetImageStoragePath;

        @NameInMap("CoatColor")
        @Validation(required = true)
        public String coatColor;

        @NameInMap("FaceTargetImageStoragePath")
        @Validation(required = true)
        public String faceTargetImageStoragePath;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("VehicleColorReliability")
        @Validation(required = true)
        public String vehicleColorReliability;

        @NameInMap("TrousersColorReliability")
        @Validation(required = true)
        public String trousersColorReliability;

        @NameInMap("CoatColorReliability")
        @Validation(required = true)
        public String coatColorReliability;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public String leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public String leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public String rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public String rightBottomY;

        public static ListCityMapImageDetailsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCityMapImageDetailsResponseData self = new ListCityMapImageDetailsResponseData();
            return TeaModel.build(map, self);
        }

        public ListCityMapImageDetailsResponseData setPersonTargetImageStoragePath(String personTargetImageStoragePath) {
            this.personTargetImageStoragePath = personTargetImageStoragePath;
            return this;
        }
        public String getPersonTargetImageStoragePath() {
            return this.personTargetImageStoragePath;
        }

        public ListCityMapImageDetailsResponseData setAgeLowerLimit(String ageLowerLimit) {
            this.ageLowerLimit = ageLowerLimit;
            return this;
        }
        public String getAgeLowerLimit() {
            return this.ageLowerLimit;
        }

        public ListCityMapImageDetailsResponseData setAgeUpLimit(String ageUpLimit) {
            this.ageUpLimit = ageUpLimit;
            return this;
        }
        public String getAgeUpLimit() {
            return this.ageUpLimit;
        }

        public ListCityMapImageDetailsResponseData setVehicleColor(String vehicleColor) {
            this.vehicleColor = vehicleColor;
            return this;
        }
        public String getVehicleColor() {
            return this.vehicleColor;
        }

        public ListCityMapImageDetailsResponseData setTrousersColor(String trousersColor) {
            this.trousersColor = trousersColor;
            return this;
        }
        public String getTrousersColor() {
            return this.trousersColor;
        }

        public ListCityMapImageDetailsResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListCityMapImageDetailsResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListCityMapImageDetailsResponseData setAgeLowerLimitReliability(String ageLowerLimitReliability) {
            this.ageLowerLimitReliability = ageLowerLimitReliability;
            return this;
        }
        public String getAgeLowerLimitReliability() {
            return this.ageLowerLimitReliability;
        }

        public ListCityMapImageDetailsResponseData setGenderCodeReliability(String genderCodeReliability) {
            this.genderCodeReliability = genderCodeReliability;
            return this;
        }
        public String getGenderCodeReliability() {
            return this.genderCodeReliability;
        }

        public ListCityMapImageDetailsResponseData setVehicleClassReliability(String vehicleClassReliability) {
            this.vehicleClassReliability = vehicleClassReliability;
            return this;
        }
        public String getVehicleClassReliability() {
            return this.vehicleClassReliability;
        }

        public ListCityMapImageDetailsResponseData setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public ListCityMapImageDetailsResponseData setAgeCodeReliability(String ageCodeReliability) {
            this.ageCodeReliability = ageCodeReliability;
            return this;
        }
        public String getAgeCodeReliability() {
            return this.ageCodeReliability;
        }

        public ListCityMapImageDetailsResponseData setSourceImageStoragePath(String sourceImageStoragePath) {
            this.sourceImageStoragePath = sourceImageStoragePath;
            return this;
        }
        public String getSourceImageStoragePath() {
            return this.sourceImageStoragePath;
        }

        public ListCityMapImageDetailsResponseData setVehicleClass(String vehicleClass) {
            this.vehicleClass = vehicleClass;
            return this;
        }
        public String getVehicleClass() {
            return this.vehicleClass;
        }

        public ListCityMapImageDetailsResponseData setMotorTargetImageStoragePath(String motorTargetImageStoragePath) {
            this.motorTargetImageStoragePath = motorTargetImageStoragePath;
            return this;
        }
        public String getMotorTargetImageStoragePath() {
            return this.motorTargetImageStoragePath;
        }

        public ListCityMapImageDetailsResponseData setCoatColor(String coatColor) {
            this.coatColor = coatColor;
            return this;
        }
        public String getCoatColor() {
            return this.coatColor;
        }

        public ListCityMapImageDetailsResponseData setFaceTargetImageStoragePath(String faceTargetImageStoragePath) {
            this.faceTargetImageStoragePath = faceTargetImageStoragePath;
            return this;
        }
        public String getFaceTargetImageStoragePath() {
            return this.faceTargetImageStoragePath;
        }

        public ListCityMapImageDetailsResponseData setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListCityMapImageDetailsResponseData setVehicleColorReliability(String vehicleColorReliability) {
            this.vehicleColorReliability = vehicleColorReliability;
            return this;
        }
        public String getVehicleColorReliability() {
            return this.vehicleColorReliability;
        }

        public ListCityMapImageDetailsResponseData setTrousersColorReliability(String trousersColorReliability) {
            this.trousersColorReliability = trousersColorReliability;
            return this;
        }
        public String getTrousersColorReliability() {
            return this.trousersColorReliability;
        }

        public ListCityMapImageDetailsResponseData setCoatColorReliability(String coatColorReliability) {
            this.coatColorReliability = coatColorReliability;
            return this;
        }
        public String getCoatColorReliability() {
            return this.coatColorReliability;
        }

        public ListCityMapImageDetailsResponseData setLeftTopX(String leftTopX) {
            this.leftTopX = leftTopX;
            return this;
        }
        public String getLeftTopX() {
            return this.leftTopX;
        }

        public ListCityMapImageDetailsResponseData setLeftTopY(String leftTopY) {
            this.leftTopY = leftTopY;
            return this;
        }
        public String getLeftTopY() {
            return this.leftTopY;
        }

        public ListCityMapImageDetailsResponseData setRightBottomX(String rightBottomX) {
            this.rightBottomX = rightBottomX;
            return this;
        }
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        public ListCityMapImageDetailsResponseData setRightBottomY(String rightBottomY) {
            this.rightBottomY = rightBottomY;
            return this;
        }
        public String getRightBottomY() {
            return this.rightBottomY;
        }

    }

}
