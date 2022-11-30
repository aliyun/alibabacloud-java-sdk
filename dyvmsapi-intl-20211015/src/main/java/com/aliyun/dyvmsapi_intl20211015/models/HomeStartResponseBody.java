// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class HomeStartResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public HomeStartResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    public static HomeStartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HomeStartResponseBody self = new HomeStartResponseBody();
        return TeaModel.build(map, self);
    }

    public HomeStartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HomeStartResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public HomeStartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HomeStartResponseBody setModel(HomeStartResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public HomeStartResponseBodyModel getModel() {
        return this.model;
    }

    public HomeStartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class HomeStartResponseBodyModelList extends TeaModel {
        @NameInMap("CallFailed")
        public Long callFailed;

        @NameInMap("CallSuccess")
        public Long callSuccess;

        @NameInMap("CallTotal")
        public Long callTotal;

        @NameInMap("Date")
        public String date;

        @NameInMap("SuccessRate")
        public Long successRate;

        public static HomeStartResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            HomeStartResponseBodyModelList self = new HomeStartResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public HomeStartResponseBodyModelList setCallFailed(Long callFailed) {
            this.callFailed = callFailed;
            return this;
        }
        public Long getCallFailed() {
            return this.callFailed;
        }

        public HomeStartResponseBodyModelList setCallSuccess(Long callSuccess) {
            this.callSuccess = callSuccess;
            return this;
        }
        public Long getCallSuccess() {
            return this.callSuccess;
        }

        public HomeStartResponseBodyModelList setCallTotal(Long callTotal) {
            this.callTotal = callTotal;
            return this;
        }
        public Long getCallTotal() {
            return this.callTotal;
        }

        public HomeStartResponseBodyModelList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public HomeStartResponseBodyModelList setSuccessRate(Long successRate) {
            this.successRate = successRate;
            return this;
        }
        public Long getSuccessRate() {
            return this.successRate;
        }

    }

    public static class HomeStartResponseBodyModel extends TeaModel {
        @NameInMap("CdrDrUrl")
        public String cdrDrUrl;

        @NameInMap("List")
        public java.util.List<HomeStartResponseBodyModelList> list;

        public static HomeStartResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            HomeStartResponseBodyModel self = new HomeStartResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public HomeStartResponseBodyModel setCdrDrUrl(String cdrDrUrl) {
            this.cdrDrUrl = cdrDrUrl;
            return this;
        }
        public String getCdrDrUrl() {
            return this.cdrDrUrl;
        }

        public HomeStartResponseBodyModel setList(java.util.List<HomeStartResponseBodyModelList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<HomeStartResponseBodyModelList> getList() {
            return this.list;
        }

    }

}
