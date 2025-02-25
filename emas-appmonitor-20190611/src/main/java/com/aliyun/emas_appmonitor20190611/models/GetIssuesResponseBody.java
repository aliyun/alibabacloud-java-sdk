// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetIssuesResponseBody extends TeaModel {
    /**
     * <p>Args</p>
     */
    @NameInMap("Args")
    public java.util.Map<String, ?> args;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetIssuesResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>22111548-55D2-4258-9B18-273E4C134444</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetIssuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIssuesResponseBody self = new GetIssuesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIssuesResponseBody setArgs(java.util.Map<String, ?> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    public GetIssuesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetIssuesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIssuesResponseBody setModel(GetIssuesResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetIssuesResponseBodyModel getModel() {
        return this.model;
    }

    public GetIssuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIssuesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIssuesResponseBodyModelItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AffectedUserCount")
        public Integer affectedUserCount;

        /**
         * <strong>example:</strong>
         * <p>-3481243636390427020</p>
         */
        @NameInMap("DigestHash")
        public String digestHash;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DomScore")
        public String domScore;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorColumn")
        public Integer errorColumn;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ErrorCount")
        public Integer errorCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorDeviceCount")
        public Integer errorDeviceCount;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ErrorDeviceRate")
        public Double errorDeviceRate;

        /**
         * <strong>example:</strong>
         * <p>test.js</p>
         */
        @NameInMap("ErrorFileName")
        public String errorFileName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorLine")
        public Integer errorLine;

        /**
         * <strong>example:</strong>
         * <p>ErrorName</p>
         */
        @NameInMap("ErrorName")
        public String errorName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorRate")
        public Double errorRate;

        /**
         * <strong>example:</strong>
         * <p>Error</p>
         */
        @NameInMap("ErrorType")
        public String errorType;

        /**
         * <strong>example:</strong>
         * <p>1691745496851</p>
         */
        @NameInMap("EventTime")
        public String eventTime;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("FirstVersion")
        public String firstVersion;

        /**
         * <strong>example:</strong>
         * <p>ServiceType</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>java.lang.NullPointerException: Attempt to invoke virtual method \&quot;java.lang.Object java.lang.ref.WeakReference.get()\&quot; on a null object reference
         *     at e.l.a.a.d.h(BasePresenter.java:1)
         *     at e.l.a.g.c.e.g.s1(GoodsPigLoadPresenter.java:1)
         *     at e.l.a.h.d.a$a.a(AliOssManager.java:2)</p>
         */
        @NameInMap("Stack")
        public String stack;

        /**
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetIssuesResponseBodyModelItems build(java.util.Map<String, ?> map) throws Exception {
            GetIssuesResponseBodyModelItems self = new GetIssuesResponseBodyModelItems();
            return TeaModel.build(map, self);
        }

        public GetIssuesResponseBodyModelItems setAffectedUserCount(Integer affectedUserCount) {
            this.affectedUserCount = affectedUserCount;
            return this;
        }
        public Integer getAffectedUserCount() {
            return this.affectedUserCount;
        }

        public GetIssuesResponseBodyModelItems setDigestHash(String digestHash) {
            this.digestHash = digestHash;
            return this;
        }
        public String getDigestHash() {
            return this.digestHash;
        }

        public GetIssuesResponseBodyModelItems setDomScore(String domScore) {
            this.domScore = domScore;
            return this;
        }
        public String getDomScore() {
            return this.domScore;
        }

        public GetIssuesResponseBodyModelItems setErrorColumn(Integer errorColumn) {
            this.errorColumn = errorColumn;
            return this;
        }
        public Integer getErrorColumn() {
            return this.errorColumn;
        }

        public GetIssuesResponseBodyModelItems setErrorCount(Integer errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Integer getErrorCount() {
            return this.errorCount;
        }

        public GetIssuesResponseBodyModelItems setErrorDeviceCount(Integer errorDeviceCount) {
            this.errorDeviceCount = errorDeviceCount;
            return this;
        }
        public Integer getErrorDeviceCount() {
            return this.errorDeviceCount;
        }

        public GetIssuesResponseBodyModelItems setErrorDeviceRate(Double errorDeviceRate) {
            this.errorDeviceRate = errorDeviceRate;
            return this;
        }
        public Double getErrorDeviceRate() {
            return this.errorDeviceRate;
        }

        public GetIssuesResponseBodyModelItems setErrorFileName(String errorFileName) {
            this.errorFileName = errorFileName;
            return this;
        }
        public String getErrorFileName() {
            return this.errorFileName;
        }

        public GetIssuesResponseBodyModelItems setErrorLine(Integer errorLine) {
            this.errorLine = errorLine;
            return this;
        }
        public Integer getErrorLine() {
            return this.errorLine;
        }

        public GetIssuesResponseBodyModelItems setErrorName(String errorName) {
            this.errorName = errorName;
            return this;
        }
        public String getErrorName() {
            return this.errorName;
        }

        public GetIssuesResponseBodyModelItems setErrorRate(Double errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public Double getErrorRate() {
            return this.errorRate;
        }

        public GetIssuesResponseBodyModelItems setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public GetIssuesResponseBodyModelItems setEventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public String getEventTime() {
            return this.eventTime;
        }

        public GetIssuesResponseBodyModelItems setFirstVersion(String firstVersion) {
            this.firstVersion = firstVersion;
            return this;
        }
        public String getFirstVersion() {
            return this.firstVersion;
        }

        public GetIssuesResponseBodyModelItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIssuesResponseBodyModelItems setStack(String stack) {
            this.stack = stack;
            return this;
        }
        public String getStack() {
            return this.stack;
        }

        public GetIssuesResponseBodyModelItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetIssuesResponseBodyModel extends TeaModel {
        @NameInMap("Items")
        public java.util.List<GetIssuesResponseBodyModelItems> items;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Pages")
        public Integer pages;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetIssuesResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetIssuesResponseBodyModel self = new GetIssuesResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetIssuesResponseBodyModel setItems(java.util.List<GetIssuesResponseBodyModelItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetIssuesResponseBodyModelItems> getItems() {
            return this.items;
        }

        public GetIssuesResponseBodyModel setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetIssuesResponseBodyModel setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetIssuesResponseBodyModel setPages(Integer pages) {
            this.pages = pages;
            return this;
        }
        public Integer getPages() {
            return this.pages;
        }

        public GetIssuesResponseBodyModel setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
