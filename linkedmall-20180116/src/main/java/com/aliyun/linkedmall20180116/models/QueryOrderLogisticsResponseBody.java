// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderLogisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("OrderLogistics")
    public QueryOrderLogisticsResponseBodyOrderLogistics orderLogistics;

    /**
     * <strong>example:</strong>
     * <p>1718921E-C8D4-55E1-B8D4-114AE537****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryOrderLogisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderLogisticsResponseBody self = new QueryOrderLogisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderLogisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderLogisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderLogisticsResponseBody setOrderLogistics(QueryOrderLogisticsResponseBodyOrderLogistics orderLogistics) {
        this.orderLogistics = orderLogistics;
        return this;
    }
    public QueryOrderLogisticsResponseBodyOrderLogistics getOrderLogistics() {
        return this.orderLogistics;
    }

    public QueryOrderLogisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryOrderLogisticsResponseBodyOrderLogisticsFetcher extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>185****4801</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>457001</p>
         */
        @NameInMap("ZipCode")
        public String zipCode;

        public static QueryOrderLogisticsResponseBodyOrderLogisticsFetcher build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseBodyOrderLogisticsFetcher self = new QueryOrderLogisticsResponseBodyOrderLogisticsFetcher();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsFetcher setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsFetcher setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsFetcher setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsFetcher setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public String getZipCode() {
            return this.zipCode;
        }

    }

    public static class QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-04-01 16:33:23</p>
         */
        @NameInMap("OcurrTimeStr")
        public String ocurrTimeStr;

        @NameInMap("StanderdDesc")
        public String standerdDesc;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("StatusIcon")
        public String statusIcon;

        public static QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList self = new QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList setOcurrTimeStr(String ocurrTimeStr) {
            this.ocurrTimeStr = ocurrTimeStr;
            return this;
        }
        public String getOcurrTimeStr() {
            return this.ocurrTimeStr;
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList setStanderdDesc(String standerdDesc) {
            this.standerdDesc = standerdDesc;
            return this;
        }
        public String getStanderdDesc() {
            return this.standerdDesc;
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList setStatusIcon(String statusIcon) {
            this.statusIcon = statusIcon;
            return this;
        }
        public String getStatusIcon() {
            return this.statusIcon;
        }

    }

    public static class QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailList extends TeaModel {
        @NameInMap("LogisticsDetailList")
        public java.util.List<QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList> logisticsDetailList;

        public static QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailList self = new QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailList();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailList setLogisticsDetailList(java.util.List<QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList> logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public java.util.List<QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailListLogisticsDetailList> getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

    }

    public static class QueryOrderLogisticsResponseBodyOrderLogisticsReceiver extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>185****4801</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>457001</p>
         */
        @NameInMap("ZipCode")
        public String zipCode;

        public static QueryOrderLogisticsResponseBodyOrderLogisticsReceiver build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseBodyOrderLogisticsReceiver self = new QueryOrderLogisticsResponseBodyOrderLogisticsReceiver();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsReceiver setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsReceiver setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsReceiver setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public QueryOrderLogisticsResponseBodyOrderLogisticsReceiver setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public String getZipCode() {
            return this.zipCode;
        }

    }

    public static class QueryOrderLogisticsResponseBodyOrderLogistics extends TeaModel {
        @NameInMap("DataProvider")
        public String dataProvider;

        @NameInMap("DataProviderTitle")
        public String dataProviderTitle;

        @NameInMap("Fetcher")
        public QueryOrderLogisticsResponseBodyOrderLogisticsFetcher fetcher;

        /**
         * <strong>example:</strong>
         * <p>ZTO</p>
         */
        @NameInMap("LogisticsCompanyCode")
        public String logisticsCompanyCode;

        @NameInMap("LogisticsCompanyName")
        public String logisticsCompanyName;

        @NameInMap("LogisticsDetailList")
        public QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailList logisticsDetailList;

        @NameInMap("Receiver")
        public QueryOrderLogisticsResponseBodyOrderLogisticsReceiver receiver;

        public static QueryOrderLogisticsResponseBodyOrderLogistics build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderLogisticsResponseBodyOrderLogistics self = new QueryOrderLogisticsResponseBodyOrderLogistics();
            return TeaModel.build(map, self);
        }

        public QueryOrderLogisticsResponseBodyOrderLogistics setDataProvider(String dataProvider) {
            this.dataProvider = dataProvider;
            return this;
        }
        public String getDataProvider() {
            return this.dataProvider;
        }

        public QueryOrderLogisticsResponseBodyOrderLogistics setDataProviderTitle(String dataProviderTitle) {
            this.dataProviderTitle = dataProviderTitle;
            return this;
        }
        public String getDataProviderTitle() {
            return this.dataProviderTitle;
        }

        public QueryOrderLogisticsResponseBodyOrderLogistics setFetcher(QueryOrderLogisticsResponseBodyOrderLogisticsFetcher fetcher) {
            this.fetcher = fetcher;
            return this;
        }
        public QueryOrderLogisticsResponseBodyOrderLogisticsFetcher getFetcher() {
            return this.fetcher;
        }

        public QueryOrderLogisticsResponseBodyOrderLogistics setLogisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

        public QueryOrderLogisticsResponseBodyOrderLogistics setLogisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

        public QueryOrderLogisticsResponseBodyOrderLogistics setLogisticsDetailList(QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailList logisticsDetailList) {
            this.logisticsDetailList = logisticsDetailList;
            return this;
        }
        public QueryOrderLogisticsResponseBodyOrderLogisticsLogisticsDetailList getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        public QueryOrderLogisticsResponseBodyOrderLogistics setReceiver(QueryOrderLogisticsResponseBodyOrderLogisticsReceiver receiver) {
            this.receiver = receiver;
            return this;
        }
        public QueryOrderLogisticsResponseBodyOrderLogisticsReceiver getReceiver() {
            return this.receiver;
        }

    }

}
