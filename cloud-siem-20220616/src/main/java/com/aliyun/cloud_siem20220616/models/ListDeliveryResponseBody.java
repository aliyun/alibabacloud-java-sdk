// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDeliveryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListDeliveryResponseBodyData data;

    @NameInMap("DyCode")
    public String dyCode;

    @NameInMap("DyMessage")
    public String dyMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryResponseBody self = new ListDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeliveryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeliveryResponseBody setData(ListDeliveryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeliveryResponseBodyData getData() {
        return this.data;
    }

    public ListDeliveryResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public ListDeliveryResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public ListDeliveryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListDeliveryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeliveryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDeliveryResponseBodyDataProductListLogListExtraParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListDeliveryResponseBodyDataProductListLogListExtraParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryResponseBodyDataProductListLogListExtraParameters self = new ListDeliveryResponseBodyDataProductListLogListExtraParameters();
            return TeaModel.build(map, self);
        }

        public ListDeliveryResponseBodyDataProductListLogListExtraParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDeliveryResponseBodyDataProductListLogListExtraParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDeliveryResponseBodyDataProductListLogList extends TeaModel {
        @NameInMap("CanOperateOrNot")
        public Boolean canOperateOrNot;

        @NameInMap("ExtraParameters")
        public java.util.List<ListDeliveryResponseBodyDataProductListLogListExtraParameters> extraParameters;

        @NameInMap("LogCode")
        public String logCode;

        @NameInMap("LogName")
        public String logName;

        @NameInMap("LogNameEn")
        public String logNameEn;

        @NameInMap("LogNameKey")
        public String logNameKey;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Topic")
        public String topic;

        public static ListDeliveryResponseBodyDataProductListLogList build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryResponseBodyDataProductListLogList self = new ListDeliveryResponseBodyDataProductListLogList();
            return TeaModel.build(map, self);
        }

        public ListDeliveryResponseBodyDataProductListLogList setCanOperateOrNot(Boolean canOperateOrNot) {
            this.canOperateOrNot = canOperateOrNot;
            return this;
        }
        public Boolean getCanOperateOrNot() {
            return this.canOperateOrNot;
        }

        public ListDeliveryResponseBodyDataProductListLogList setExtraParameters(java.util.List<ListDeliveryResponseBodyDataProductListLogListExtraParameters> extraParameters) {
            this.extraParameters = extraParameters;
            return this;
        }
        public java.util.List<ListDeliveryResponseBodyDataProductListLogListExtraParameters> getExtraParameters() {
            return this.extraParameters;
        }

        public ListDeliveryResponseBodyDataProductListLogList setLogCode(String logCode) {
            this.logCode = logCode;
            return this;
        }
        public String getLogCode() {
            return this.logCode;
        }

        public ListDeliveryResponseBodyDataProductListLogList setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public ListDeliveryResponseBodyDataProductListLogList setLogNameEn(String logNameEn) {
            this.logNameEn = logNameEn;
            return this;
        }
        public String getLogNameEn() {
            return this.logNameEn;
        }

        public ListDeliveryResponseBodyDataProductListLogList setLogNameKey(String logNameKey) {
            this.logNameKey = logNameKey;
            return this;
        }
        public String getLogNameKey() {
            return this.logNameKey;
        }

        public ListDeliveryResponseBodyDataProductListLogList setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ListDeliveryResponseBodyDataProductListLogList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class ListDeliveryResponseBodyDataProductList extends TeaModel {
        @NameInMap("LogList")
        public java.util.List<ListDeliveryResponseBodyDataProductListLogList> logList;

        @NameInMap("LogMap")
        public java.util.Map<String, java.util.List<DataProductListLogMapValue>> logMap;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        public static ListDeliveryResponseBodyDataProductList build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryResponseBodyDataProductList self = new ListDeliveryResponseBodyDataProductList();
            return TeaModel.build(map, self);
        }

        public ListDeliveryResponseBodyDataProductList setLogList(java.util.List<ListDeliveryResponseBodyDataProductListLogList> logList) {
            this.logList = logList;
            return this;
        }
        public java.util.List<ListDeliveryResponseBodyDataProductListLogList> getLogList() {
            return this.logList;
        }

        public ListDeliveryResponseBodyDataProductList setLogMap(java.util.Map<String, java.util.List<DataProductListLogMapValue>> logMap) {
            this.logMap = logMap;
            return this;
        }
        public java.util.Map<String, java.util.List<DataProductListLogMapValue>> getLogMap() {
            return this.logMap;
        }

        public ListDeliveryResponseBodyDataProductList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListDeliveryResponseBodyDataProductList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class ListDeliveryResponseBodyData extends TeaModel {
        @NameInMap("DashboardUrl")
        public String dashboardUrl;

        @NameInMap("DisplaySwitchOrNot")
        public Boolean displaySwitchOrNot;

        @NameInMap("LogStoreName")
        public String logStoreName;

        @NameInMap("ProductList")
        public java.util.List<ListDeliveryResponseBodyDataProductList> productList;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("SearchUrl")
        public String searchUrl;

        public static ListDeliveryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryResponseBodyData self = new ListDeliveryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeliveryResponseBodyData setDashboardUrl(String dashboardUrl) {
            this.dashboardUrl = dashboardUrl;
            return this;
        }
        public String getDashboardUrl() {
            return this.dashboardUrl;
        }

        public ListDeliveryResponseBodyData setDisplaySwitchOrNot(Boolean displaySwitchOrNot) {
            this.displaySwitchOrNot = displaySwitchOrNot;
            return this;
        }
        public Boolean getDisplaySwitchOrNot() {
            return this.displaySwitchOrNot;
        }

        public ListDeliveryResponseBodyData setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public ListDeliveryResponseBodyData setProductList(java.util.List<ListDeliveryResponseBodyDataProductList> productList) {
            this.productList = productList;
            return this;
        }
        public java.util.List<ListDeliveryResponseBodyDataProductList> getProductList() {
            return this.productList;
        }

        public ListDeliveryResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDeliveryResponseBodyData setSearchUrl(String searchUrl) {
            this.searchUrl = searchUrl;
            return this;
        }
        public String getSearchUrl() {
            return this.searchUrl;
        }

    }

}
