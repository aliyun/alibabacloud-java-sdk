// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetCustomerListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCustomerListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public GetCustomerListResponseBodyPageInfo pageInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerListResponseBody self = new GetCustomerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomerListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCustomerListResponseBody setData(GetCustomerListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomerListResponseBodyData getData() {
        return this.data;
    }

    public GetCustomerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCustomerListResponseBody setPageInfo(GetCustomerListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetCustomerListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetCustomerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomerListResponseBodyDataListFxCustomerReportDTOCustomerUids extends TeaModel {
        @NameInMap("CustomerUid")
        public java.util.List<String> customerUid;

        public static GetCustomerListResponseBodyDataListFxCustomerReportDTOCustomerUids build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerListResponseBodyDataListFxCustomerReportDTOCustomerUids self = new GetCustomerListResponseBodyDataListFxCustomerReportDTOCustomerUids();
            return TeaModel.build(map, self);
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTOCustomerUids setCustomerUid(java.util.List<String> customerUid) {
            this.customerUid = customerUid;
            return this;
        }
        public java.util.List<String> getCustomerUid() {
            return this.customerUid;
        }

    }

    public static class GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo extends TeaModel {
        @NameInMap("OneMonthAmount")
        public String oneMonthAmount;

        @NameInMap("ShowOne")
        public Boolean showOne;

        @NameInMap("ShowSix")
        public Boolean showSix;

        @NameInMap("ShowThree")
        public Boolean showThree;

        @NameInMap("SixMonthAmount")
        public String sixMonthAmount;

        @NameInMap("ThreeMonthAmount")
        public String threeMonthAmount;

        @NameInMap("TwelveMonthAmount")
        public String twelveMonthAmount;

        public static GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo self = new GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo();
            return TeaModel.build(map, self);
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo setOneMonthAmount(String oneMonthAmount) {
            this.oneMonthAmount = oneMonthAmount;
            return this;
        }
        public String getOneMonthAmount() {
            return this.oneMonthAmount;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo setShowOne(Boolean showOne) {
            this.showOne = showOne;
            return this;
        }
        public Boolean getShowOne() {
            return this.showOne;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo setShowSix(Boolean showSix) {
            this.showSix = showSix;
            return this;
        }
        public Boolean getShowSix() {
            return this.showSix;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo setShowThree(Boolean showThree) {
            this.showThree = showThree;
            return this;
        }
        public Boolean getShowThree() {
            return this.showThree;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo setSixMonthAmount(String sixMonthAmount) {
            this.sixMonthAmount = sixMonthAmount;
            return this;
        }
        public String getSixMonthAmount() {
            return this.sixMonthAmount;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo setThreeMonthAmount(String threeMonthAmount) {
            this.threeMonthAmount = threeMonthAmount;
            return this;
        }
        public String getThreeMonthAmount() {
            return this.threeMonthAmount;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo setTwelveMonthAmount(String twelveMonthAmount) {
            this.twelveMonthAmount = twelveMonthAmount;
            return this;
        }
        public String getTwelveMonthAmount() {
            return this.twelveMonthAmount;
        }

    }

    public static class GetCustomerListResponseBodyDataListFxCustomerReportDTO extends TeaModel {
        @NameInMap("Cid")
        public Long cid;

        @NameInMap("CustomerGcLevel")
        public String customerGcLevel;

        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("CustomerStatus")
        public Integer customerStatus;

        @NameInMap("CustomerType")
        public Integer customerType;

        @NameInMap("CustomerUids")
        public GetCustomerListResponseBodyDataListFxCustomerReportDTOCustomerUids customerUids;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("GcLevelAmountInfo")
        public GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo gcLevelAmountInfo;

        @NameInMap("HasAccount")
        public Integer hasAccount;

        @NameInMap("ReportedTime")
        public String reportedTime;

        public static GetCustomerListResponseBodyDataListFxCustomerReportDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerListResponseBodyDataListFxCustomerReportDTO self = new GetCustomerListResponseBodyDataListFxCustomerReportDTO();
            return TeaModel.build(map, self);
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setCustomerGcLevel(String customerGcLevel) {
            this.customerGcLevel = customerGcLevel;
            return this;
        }
        public String getCustomerGcLevel() {
            return this.customerGcLevel;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setCustomerStatus(Integer customerStatus) {
            this.customerStatus = customerStatus;
            return this;
        }
        public Integer getCustomerStatus() {
            return this.customerStatus;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setCustomerType(Integer customerType) {
            this.customerType = customerType;
            return this;
        }
        public Integer getCustomerType() {
            return this.customerType;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setCustomerUids(GetCustomerListResponseBodyDataListFxCustomerReportDTOCustomerUids customerUids) {
            this.customerUids = customerUids;
            return this;
        }
        public GetCustomerListResponseBodyDataListFxCustomerReportDTOCustomerUids getCustomerUids() {
            return this.customerUids;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setGcLevelAmountInfo(GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo gcLevelAmountInfo) {
            this.gcLevelAmountInfo = gcLevelAmountInfo;
            return this;
        }
        public GetCustomerListResponseBodyDataListFxCustomerReportDTOGcLevelAmountInfo getGcLevelAmountInfo() {
            return this.gcLevelAmountInfo;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setHasAccount(Integer hasAccount) {
            this.hasAccount = hasAccount;
            return this;
        }
        public Integer getHasAccount() {
            return this.hasAccount;
        }

        public GetCustomerListResponseBodyDataListFxCustomerReportDTO setReportedTime(String reportedTime) {
            this.reportedTime = reportedTime;
            return this;
        }
        public String getReportedTime() {
            return this.reportedTime;
        }

    }

    public static class GetCustomerListResponseBodyDataList extends TeaModel {
        @NameInMap("FxCustomerReportDTO")
        public java.util.List<GetCustomerListResponseBodyDataListFxCustomerReportDTO> fxCustomerReportDTO;

        public static GetCustomerListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerListResponseBodyDataList self = new GetCustomerListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetCustomerListResponseBodyDataList setFxCustomerReportDTO(java.util.List<GetCustomerListResponseBodyDataListFxCustomerReportDTO> fxCustomerReportDTO) {
            this.fxCustomerReportDTO = fxCustomerReportDTO;
            return this;
        }
        public java.util.List<GetCustomerListResponseBodyDataListFxCustomerReportDTO> getFxCustomerReportDTO() {
            return this.fxCustomerReportDTO;
        }

    }

    public static class GetCustomerListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public GetCustomerListResponseBodyDataList list;

        public static GetCustomerListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerListResponseBodyData self = new GetCustomerListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomerListResponseBodyData setList(GetCustomerListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public GetCustomerListResponseBodyDataList getList() {
            return this.list;
        }

    }

    public static class GetCustomerListResponseBodyPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static GetCustomerListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerListResponseBodyPageInfo self = new GetCustomerListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetCustomerListResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetCustomerListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetCustomerListResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
