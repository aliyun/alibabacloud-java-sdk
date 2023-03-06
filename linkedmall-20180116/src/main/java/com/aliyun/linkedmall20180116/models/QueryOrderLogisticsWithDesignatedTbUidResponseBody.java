// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsWithDesignatedTbUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>pageSize</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryOrderLogisticsWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsWithDesignatedTbUidResponseBody self = new QueryOrderLogisticsWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setModel(java.util.List<QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOrderLogisticsWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ZipCode")
        public String zipCode;

        public static QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher self = new QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public String getZipCode() {
            return this.zipCode;
        }

    }

    public static class QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList extends TeaModel {
        @NameInMap("OcurrTimeStr")
        public String ocurrTimeStr;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("StanderdDesc")
        public String standerdDesc;

        @NameInMap("StatusIcon")
        public String statusIcon;

        public static QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList self = new QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList setOcurrTimeStr(String ocurrTimeStr) {
            this.ocurrTimeStr = ocurrTimeStr;
            return this;
        }
        public String getOcurrTimeStr() {
            return this.ocurrTimeStr;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList setStanderdDesc(String standerdDesc) {
            this.standerdDesc = standerdDesc;
            return this;
        }
        public String getStanderdDesc() {
            return this.standerdDesc;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList setStatusIcon(String statusIcon) {
            this.statusIcon = statusIcon;
            return this;
        }
        public String getStatusIcon() {
            return this.statusIcon;
        }

    }

    public static class QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Quantity")
        public Integer quantity;

        public static QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems self = new QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

    public static class QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Name")
        public String name;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ZipCode")
        public String zipCode;

        public static QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver self = new QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public String getZipCode() {
            return this.zipCode;
        }

    }

    public static class QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("DataProvider")
        public String dataProvider;

        @NameInMap("DataProviderTitle")
        public String dataProviderTitle;

        @NameInMap("Fetcher")
        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher fetcher;

        @NameInMap("LogisticsCompanyCode")
        public String logisticsCompanyCode;

        @NameInMap("LogisticsCompanyName")
        public String logisticsCompanyName;

        @NameInMap("LogisticsDetailList")
        public java.util.List<QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList> logisticsDetailList;

        @NameInMap("MailNo")
        public String mailNo;

        @NameInMap("PackageGoodItems")
        public java.util.List<QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems> packageGoodItems;

        @NameInMap("Receiver")
        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver receiver;

        @NameInMap("RequestId")
        public String requestId;

        public static QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel self = new QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setDataProvider(String dataProvider) {
            this.dataProvider = dataProvider;
            return this;
        }
        public String getDataProvider() {
            return this.dataProvider;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setDataProviderTitle(String dataProviderTitle) {
            this.dataProviderTitle = dataProviderTitle;
            return this;
        }
        public String getDataProviderTitle() {
            return this.dataProviderTitle;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setFetcher(QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher fetcher) {
            this.fetcher = fetcher;
            return this;
        }
        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelFetcher getFetcher() {
            return this.fetcher;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setLogisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setLogisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setLogisticsDetailList(java.util.List<QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList> logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public java.util.List<QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelLogisticsDetailList> getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setMailNo(String mailNo) {
            this.mailNo = mailNo;
            return this;
        }
        public String getMailNo() {
            return this.mailNo;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setPackageGoodItems(java.util.List<QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems> packageGoodItems) {
            this.packageGoodItems = packageGoodItems;
            return this;
        }
        public java.util.List<QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelPackageGoodItems> getPackageGoodItems() {
            return this.packageGoodItems;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setReceiver(QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver receiver) {
            this.receiver = receiver;
            return this;
        }
        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModelReceiver getReceiver() {
            return this.receiver;
        }

        public QueryOrderLogisticsWithDesignatedTbUidResponseBodyModel setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
