// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RepayWithDesignatedTbUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RepayWithDesignatedTbUidResponseBodyModel model;

    @NameInMap("PageNumber")
    public Long pageNumber;

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

    public static RepayWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RepayWithDesignatedTbUidResponseBody self = new RepayWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public RepayWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RepayWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RepayWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RepayWithDesignatedTbUidResponseBody setModel(RepayWithDesignatedTbUidResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RepayWithDesignatedTbUidResponseBodyModel getModel() {
        return this.model;
    }

    public RepayWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public RepayWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public RepayWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RepayWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RepayWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RepayWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RepayWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class RepayWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("FrontUrl")
        public String frontUrl;

        @NameInMap("IsOnlyPaidPoint")
        public Boolean isOnlyPaidPoint;

        public static RepayWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RepayWithDesignatedTbUidResponseBodyModel self = new RepayWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RepayWithDesignatedTbUidResponseBodyModel setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public RepayWithDesignatedTbUidResponseBodyModel setFrontUrl(String frontUrl) {
            this.frontUrl = frontUrl;
            return this;
        }
        public String getFrontUrl() {
            return this.frontUrl;
        }

        public RepayWithDesignatedTbUidResponseBodyModel setIsOnlyPaidPoint(Boolean isOnlyPaidPoint) {
            this.isOnlyPaidPoint = isOnlyPaidPoint;
            return this;
        }
        public Boolean getIsOnlyPaidPoint() {
            return this.isOnlyPaidPoint;
        }

    }

}
