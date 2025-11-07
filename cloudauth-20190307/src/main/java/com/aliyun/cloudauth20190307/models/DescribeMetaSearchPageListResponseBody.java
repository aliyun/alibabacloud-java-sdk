// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeMetaSearchPageListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeMetaSearchPageListResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>5176EB42-6EE7-510B-9388-35018DF3175B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeMetaSearchPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaSearchPageListResponseBody self = new DescribeMetaSearchPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetaSearchPageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeMetaSearchPageListResponseBody setItems(java.util.List<DescribeMetaSearchPageListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeMetaSearchPageListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeMetaSearchPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMetaSearchPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetaSearchPageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeMetaSearchPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeMetaSearchPageListResponseBodyItemsRequest extends TeaModel {
        @NameInMap("VehicleNum")
        public String vehicleNum;

        /**
         * <strong>example:</strong>
         * <p>52</p>
         */
        @NameInMap("VehicleType")
        public String vehicleType;

        @NameInMap("VehicleTypeName")
        public String vehicleTypeName;

        public static DescribeMetaSearchPageListResponseBodyItemsRequest build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaSearchPageListResponseBodyItemsRequest self = new DescribeMetaSearchPageListResponseBodyItemsRequest();
            return TeaModel.build(map, self);
        }

        public DescribeMetaSearchPageListResponseBodyItemsRequest setVehicleNum(String vehicleNum) {
            this.vehicleNum = vehicleNum;
            return this;
        }
        public String getVehicleNum() {
            return this.vehicleNum;
        }

        public DescribeMetaSearchPageListResponseBodyItemsRequest setVehicleType(String vehicleType) {
            this.vehicleType = vehicleType;
            return this;
        }
        public String getVehicleType() {
            return this.vehicleType;
        }

        public DescribeMetaSearchPageListResponseBodyItemsRequest setVehicleTypeName(String vehicleTypeName) {
            this.vehicleTypeName = vehicleTypeName;
            return this;
        }
        public String getVehicleTypeName() {
            return this.vehicleTypeName;
        }

    }

    public static class DescribeMetaSearchPageListResponseBodyItemsResponseData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ApprovedCount")
        public String approvedCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ApprovedLoad")
        public String approvedLoad;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AxleCount")
        public String axleCount;

        /**
         * <strong>example:</strong>
         * <p>1630</p>
         */
        @NameInMap("BackWheelDistance")
        public String backWheelDistance;

        /**
         * <strong>example:</strong>
         * <p>622848001714440xxxx</p>
         */
        @NameInMap("BankCard")
        public String bankCard;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        @NameInMap("Brand")
        public String brand;

        @NameInMap("Color")
        public String color;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Displacement")
        public String displacement;

        /**
         * <strong>example:</strong>
         * <p>N7YJ113PA</p>
         */
        @NameInMap("EngineNum")
        public String engineNum;

        /**
         * <strong>example:</strong>
         * <p>CA6GV30TD</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <strong>example:</strong>
         * <p>1630</p>
         */
        @NameInMap("FrontWheelDistance")
        public String frontWheelDistance;

        @NameInMap("FuelType")
        public String fuelType;

        /**
         * <strong>example:</strong>
         * <p>2026-07-31 00:00:00</p>
         */
        @NameInMap("InspectionDate")
        public String inspectionDate;

        /**
         * <strong>example:</strong>
         * <p>HQ7002BEV67</p>
         */
        @NameInMap("ModelNum")
        public String modelNum;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Power")
        public String power;

        /**
         * <strong>example:</strong>
         * <p>2015-08-24 00:00:00</p>
         */
        @NameInMap("RegistrationDate")
        public String registrationDate;

        /**
         * <strong>example:</strong>
         * <p>2022-08-13 00:00:00</p>
         */
        @NameInMap("ReleaseDate")
        public String releaseDate;

        /**
         * <strong>example:</strong>
         * <p>2099-12-31 00:00:00</p>
         */
        @NameInMap("RetirementDate")
        public String retirementDate;

        /**
         * <strong>example:</strong>
         * <p>2350</p>
         */
        @NameInMap("TotalMass")
        public String totalMass;

        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1900</p>
         */
        @NameInMap("UnladenMass")
        public String unladenMass;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UseProperty")
        public String useProperty;

        @NameInMap("VehicleState")
        public String vehicleState;

        /**
         * <strong>example:</strong>
         * <p>LDC643T44G3667219</p>
         */
        @NameInMap("Vin")
        public String vin;

        /**
         * <strong>example:</strong>
         * <p>2750</p>
         */
        @NameInMap("WheelBase")
        public String wheelBase;

        public static DescribeMetaSearchPageListResponseBodyItemsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaSearchPageListResponseBodyItemsResponseData self = new DescribeMetaSearchPageListResponseBodyItemsResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setApprovedCount(String approvedCount) {
            this.approvedCount = approvedCount;
            return this;
        }
        public String getApprovedCount() {
            return this.approvedCount;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setApprovedLoad(String approvedLoad) {
            this.approvedLoad = approvedLoad;
            return this;
        }
        public String getApprovedLoad() {
            return this.approvedLoad;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setAxleCount(String axleCount) {
            this.axleCount = axleCount;
            return this;
        }
        public String getAxleCount() {
            return this.axleCount;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setBackWheelDistance(String backWheelDistance) {
            this.backWheelDistance = backWheelDistance;
            return this;
        }
        public String getBackWheelDistance() {
            return this.backWheelDistance;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setBankCard(String bankCard) {
            this.bankCard = bankCard;
            return this;
        }
        public String getBankCard() {
            return this.bankCard;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setDisplacement(String displacement) {
            this.displacement = displacement;
            return this;
        }
        public String getDisplacement() {
            return this.displacement;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setEngineNum(String engineNum) {
            this.engineNum = engineNum;
            return this;
        }
        public String getEngineNum() {
            return this.engineNum;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setFrontWheelDistance(String frontWheelDistance) {
            this.frontWheelDistance = frontWheelDistance;
            return this;
        }
        public String getFrontWheelDistance() {
            return this.frontWheelDistance;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }
        public String getFuelType() {
            return this.fuelType;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setInspectionDate(String inspectionDate) {
            this.inspectionDate = inspectionDate;
            return this;
        }
        public String getInspectionDate() {
            return this.inspectionDate;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setModelNum(String modelNum) {
            this.modelNum = modelNum;
            return this;
        }
        public String getModelNum() {
            return this.modelNum;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setPower(String power) {
            this.power = power;
            return this;
        }
        public String getPower() {
            return this.power;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public String getRegistrationDate() {
            return this.registrationDate;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setRetirementDate(String retirementDate) {
            this.retirementDate = retirementDate;
            return this;
        }
        public String getRetirementDate() {
            return this.retirementDate;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setTotalMass(String totalMass) {
            this.totalMass = totalMass;
            return this;
        }
        public String getTotalMass() {
            return this.totalMass;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setUnladenMass(String unladenMass) {
            this.unladenMass = unladenMass;
            return this;
        }
        public String getUnladenMass() {
            return this.unladenMass;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setUseProperty(String useProperty) {
            this.useProperty = useProperty;
            return this;
        }
        public String getUseProperty() {
            return this.useProperty;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setVehicleState(String vehicleState) {
            this.vehicleState = vehicleState;
            return this;
        }
        public String getVehicleState() {
            return this.vehicleState;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setVin(String vin) {
            this.vin = vin;
            return this;
        }
        public String getVin() {
            return this.vin;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponseData setWheelBase(String wheelBase) {
            this.wheelBase = wheelBase;
            return this;
        }
        public String getWheelBase() {
            return this.wheelBase;
        }

    }

    public static class DescribeMetaSearchPageListResponseBodyItemsResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public DescribeMetaSearchPageListResponseBodyItemsResponseData data;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        public static DescribeMetaSearchPageListResponseBodyItemsResponse build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaSearchPageListResponseBodyItemsResponse self = new DescribeMetaSearchPageListResponseBodyItemsResponse();
            return TeaModel.build(map, self);
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponse setData(DescribeMetaSearchPageListResponseBodyItemsResponseData data) {
            this.data = data;
            return this;
        }
        public DescribeMetaSearchPageListResponseBodyItemsResponseData getData() {
            return this.data;
        }

        public DescribeMetaSearchPageListResponseBodyItemsResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeMetaSearchPageListResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ID_CARD_2_META</p>
         */
        @NameInMap("Api")
        public String api;

        @NameInMap("ApiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>6214837145546986</p>
         */
        @NameInMap("BankCard")
        public String bankCard;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>2025-10-17 10:00:11</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>4****************X</p>
         */
        @NameInMap("IdentifyNum")
        public String identifyNum;

        /**
         * <strong>example:</strong>
         * <p>CUCC</p>
         */
        @NameInMap("IspName")
        public String ispName;

        /**
         * <strong>example:</strong>
         * <p>1500000xxxx</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Request")
        public DescribeMetaSearchPageListResponseBodyItemsRequest request;

        /**
         * <strong>example:</strong>
         * <p>B0102BEF-4411-57C3-860D-CFE7DE0A64C0</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("RequestJson")
        public String requestJson;

        @NameInMap("Response")
        public DescribeMetaSearchPageListResponseBodyItemsResponse response;

        @NameInMap("ResponseJson")
        public String responseJson;

        /**
         * <strong>example:</strong>
         * <p>207</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("VehicleNum")
        public String vehicleNum;

        public static DescribeMetaSearchPageListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaSearchPageListResponseBodyItems self = new DescribeMetaSearchPageListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeMetaSearchPageListResponseBodyItems setApi(String api) {
            this.api = api;
            return this;
        }
        public String getApi() {
            return this.api;
        }

        public DescribeMetaSearchPageListResponseBodyItems setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeMetaSearchPageListResponseBodyItems setBankCard(String bankCard) {
            this.bankCard = bankCard;
            return this;
        }
        public String getBankCard() {
            return this.bankCard;
        }

        public DescribeMetaSearchPageListResponseBodyItems setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public DescribeMetaSearchPageListResponseBodyItems setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeMetaSearchPageListResponseBodyItems setIdentifyNum(String identifyNum) {
            this.identifyNum = identifyNum;
            return this;
        }
        public String getIdentifyNum() {
            return this.identifyNum;
        }

        public DescribeMetaSearchPageListResponseBodyItems setIspName(String ispName) {
            this.ispName = ispName;
            return this;
        }
        public String getIspName() {
            return this.ispName;
        }

        public DescribeMetaSearchPageListResponseBodyItems setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public DescribeMetaSearchPageListResponseBodyItems setRequest(DescribeMetaSearchPageListResponseBodyItemsRequest request) {
            this.request = request;
            return this;
        }
        public DescribeMetaSearchPageListResponseBodyItemsRequest getRequest() {
            return this.request;
        }

        public DescribeMetaSearchPageListResponseBodyItems setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeMetaSearchPageListResponseBodyItems setRequestJson(String requestJson) {
            this.requestJson = requestJson;
            return this;
        }
        public String getRequestJson() {
            return this.requestJson;
        }

        public DescribeMetaSearchPageListResponseBodyItems setResponse(DescribeMetaSearchPageListResponseBodyItemsResponse response) {
            this.response = response;
            return this;
        }
        public DescribeMetaSearchPageListResponseBodyItemsResponse getResponse() {
            return this.response;
        }

        public DescribeMetaSearchPageListResponseBodyItems setResponseJson(String responseJson) {
            this.responseJson = responseJson;
            return this;
        }
        public String getResponseJson() {
            return this.responseJson;
        }

        public DescribeMetaSearchPageListResponseBodyItems setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public DescribeMetaSearchPageListResponseBodyItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeMetaSearchPageListResponseBodyItems setVehicleNum(String vehicleNum) {
            this.vehicleNum = vehicleNum;
            return this;
        }
        public String getVehicleNum() {
            return this.vehicleNum;
        }

    }

}
