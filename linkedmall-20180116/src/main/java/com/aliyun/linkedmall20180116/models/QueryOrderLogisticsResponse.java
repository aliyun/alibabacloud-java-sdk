// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("OrderLogistics")
    @Validation(required = true)
    public QueryOrderLogisticsResponseOrderLogistics orderLogistics;

    public static QueryOrderLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsResponse self = new QueryOrderLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderLogisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderLogisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderLogisticsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderLogisticsResponse setOrderLogistics(QueryOrderLogisticsResponseOrderLogistics orderLogistics) {
        this.orderLogistics = orderLogistics;
        return this;
    }
    public QueryOrderLogisticsResponseOrderLogistics getOrderLogistics() {
        return this.orderLogistics;
    }

    public static class QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList extends TeaModel {
        @NameInMap("OcurrTimeStr")
        @Validation(required = true)
        public String ocurrTimeStr;

        @NameInMap("StanderdDesc")
        @Validation(required = true)
        public String standerdDesc;

        @NameInMap("StatusIcon")
        @Validation(required = true)
        public String statusIcon;

        public static QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList self = new QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList setOcurrTimeStr(String ocurrTimeStr) {
            this.ocurrTimeStr = ocurrTimeStr;
            return this;
        }
        public String getOcurrTimeStr() {
            return this.ocurrTimeStr;
        }

        public QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList setStanderdDesc(String standerdDesc) {
            this.standerdDesc = standerdDesc;
            return this;
        }
        public String getStanderdDesc() {
            return this.standerdDesc;
        }

        public QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList setStatusIcon(String statusIcon) {
            this.statusIcon = statusIcon;
            return this;
        }
        public String getStatusIcon() {
            return this.statusIcon;
        }

    }

    public static class QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailList extends TeaModel {
        @NameInMap("LogisticsDetailList")
        @Validation(required = true)
        public java.util.List<QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList> logisticsDetailList;

        public static QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailList self = new QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailList setLogisticsDetailList(java.util.List<QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList> logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public java.util.List<QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailListLogisticsDetailList> getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

    }

    public static class QueryOrderLogisticsResponseOrderLogisticsReceiver extends TeaModel {
        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("PhoneNumber")
        @Validation(required = true)
        public String phoneNumber;

        @NameInMap("ZipCode")
        @Validation(required = true)
        public String zipCode;

        public static QueryOrderLogisticsResponseOrderLogisticsReceiver build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseOrderLogisticsReceiver self = new QueryOrderLogisticsResponseOrderLogisticsReceiver();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseOrderLogisticsReceiver setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryOrderLogisticsResponseOrderLogisticsReceiver setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOrderLogisticsResponseOrderLogisticsReceiver setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryOrderLogisticsResponseOrderLogisticsReceiver setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public String getZipCode() {
            return this.zipCode;
        }

    }

    public static class QueryOrderLogisticsResponseOrderLogisticsFetcher extends TeaModel {
        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("PhoneNumber")
        @Validation(required = true)
        public String phoneNumber;

        @NameInMap("ZipCode")
        @Validation(required = true)
        public String zipCode;

        public static QueryOrderLogisticsResponseOrderLogisticsFetcher build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseOrderLogisticsFetcher self = new QueryOrderLogisticsResponseOrderLogisticsFetcher();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseOrderLogisticsFetcher setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryOrderLogisticsResponseOrderLogisticsFetcher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOrderLogisticsResponseOrderLogisticsFetcher setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryOrderLogisticsResponseOrderLogisticsFetcher setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public String getZipCode() {
            return this.zipCode;
        }

    }

    public static class QueryOrderLogisticsResponseOrderLogistics extends TeaModel {
        @NameInMap("DataProvider")
        @Validation(required = true)
        public String dataProvider;

        @NameInMap("DataProviderTitle")
        @Validation(required = true)
        public String dataProviderTitle;

        @NameInMap("LogisticsCompanyCode")
        @Validation(required = true)
        public String logisticsCompanyCode;

        @NameInMap("LogisticsCompanyName")
        @Validation(required = true)
        public String logisticsCompanyName;

        @NameInMap("LogisticsDetailList")
        @Validation(required = true)
        public QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailList logisticsDetailList;

        @NameInMap("Receiver")
        @Validation(required = true)
        public QueryOrderLogisticsResponseOrderLogisticsReceiver receiver;

        @NameInMap("Fetcher")
        @Validation(required = true)
        public QueryOrderLogisticsResponseOrderLogisticsFetcher fetcher;

        public static QueryOrderLogisticsResponseOrderLogistics build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseOrderLogistics self = new QueryOrderLogisticsResponseOrderLogistics();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseOrderLogistics setDataProvider(String dataProvider) {
            this.dataProvider = dataProvider;
            return this;
        }
        public String getDataProvider() {
            return this.dataProvider;
        }

        public QueryOrderLogisticsResponseOrderLogistics setDataProviderTitle(String dataProviderTitle) {
            this.dataProviderTitle = dataProviderTitle;
            return this;
        }
        public String getDataProviderTitle() {
            return this.dataProviderTitle;
        }

        public QueryOrderLogisticsResponseOrderLogistics setLogisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

        public QueryOrderLogisticsResponseOrderLogistics setLogisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

        public QueryOrderLogisticsResponseOrderLogistics setLogisticsDetailList(QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailList logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public QueryOrderLogisticsResponseOrderLogisticsLogisticsDetailList getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        public QueryOrderLogisticsResponseOrderLogistics setReceiver(QueryOrderLogisticsResponseOrderLogisticsReceiver receiver) {
            this.receiver = receiver;
            return this;
        }
        public QueryOrderLogisticsResponseOrderLogisticsReceiver getReceiver() {
            return this.receiver;
        }

        public QueryOrderLogisticsResponseOrderLogistics setFetcher(QueryOrderLogisticsResponseOrderLogisticsFetcher fetcher) {
            this.fetcher = fetcher;
            return this;
        }
        public QueryOrderLogisticsResponseOrderLogisticsFetcher getFetcher() {
            return this.fetcher;
        }

    }

}
