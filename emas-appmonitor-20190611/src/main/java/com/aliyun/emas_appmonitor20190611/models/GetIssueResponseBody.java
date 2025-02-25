// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetIssueResponseBody extends TeaModel {
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
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetIssueResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>A8313212-EB4E-4E15-A7F9-D9C8F3FE8E94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetIssueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIssueResponseBody self = new GetIssueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIssueResponseBody setArgs(java.util.Map<String, ?> args) {
        this.args = args;
        return this;
    }
    public java.util.Map<String, ?> getArgs() {
        return this.args;
    }

    public GetIssueResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetIssueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetIssueResponseBody setModel(GetIssueResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetIssueResponseBodyModel getModel() {
        return this.model;
    }

    public GetIssueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIssueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetIssueResponseBodyModel extends TeaModel {
        @NameInMap("AffectedVersions")
        public java.util.List<String> affectedVersions;

        /**
         * <strong>example:</strong>
         * <p>java.lang.NullPointerException: Attempt to invoke virtual method \&quot;java.lang.Object java.lang.ref.WeakReference.get()\&quot; on a null object reference
         *     at e.l.a.a.d.h(BasePresenter.java:1)
         *     at e.l.a.g.c.e.g.s1(GoodsPigLoadPresenter.java:1)
         *     at e.l.a.h.d.a$a.a(AliOssManager.java:2)</p>
         */
        @NameInMap("CruxStack")
        public String cruxStack;

        /**
         * <strong>example:</strong>
         * <p>-6428474329608402395</p>
         */
        @NameInMap("DigestHash")
        public String digestHash;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>0.2</p>
         */
        @NameInMap("ErrorCountGrowthRate")
        public Double errorCountGrowthRate;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ErrorDeviceCount")
        public Integer errorDeviceCount;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("ErrorDeviceCountGrowthRate")
        public Double errorDeviceCountGrowthRate;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("ErrorDeviceRate")
        public Double errorDeviceRate;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("ErrorDeviceRateGrowthRate")
        public Double errorDeviceRateGrowthRate;

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
        public String errorLine;

        /**
         * <strong>example:</strong>
         * <p>Error</p>
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
         * <p>0.2</p>
         */
        @NameInMap("ErrorRateGrowthRate")
        public Double errorRateGrowthRate;

        /**
         * <strong>example:</strong>
         * <p>ErrorType</p>
         */
        @NameInMap("ErrorType")
        public String errorType;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("FirstVersion")
        public String firstVersion;

        /**
         * <strong>example:</strong>
         * <p>1673423227000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1740489688615</p>
         */
        @NameInMap("GmtLatest")
        public Long gmtLatest;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeyLine")
        public Integer keyLine;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>java.lang.NullPointerException</p>
         */
        @NameInMap("Stack")
        public String stack;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>trustee instance</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SymbolicStatus")
        public Boolean symbolicStatus;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static GetIssueResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetIssueResponseBodyModel self = new GetIssueResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetIssueResponseBodyModel setAffectedVersions(java.util.List<String> affectedVersions) {
            this.affectedVersions = affectedVersions;
            return this;
        }
        public java.util.List<String> getAffectedVersions() {
            return this.affectedVersions;
        }

        public GetIssueResponseBodyModel setCruxStack(String cruxStack) {
            this.cruxStack = cruxStack;
            return this;
        }
        public String getCruxStack() {
            return this.cruxStack;
        }

        public GetIssueResponseBodyModel setDigestHash(String digestHash) {
            this.digestHash = digestHash;
            return this;
        }
        public String getDigestHash() {
            return this.digestHash;
        }

        public GetIssueResponseBodyModel setErrorColumn(Integer errorColumn) {
            this.errorColumn = errorColumn;
            return this;
        }
        public Integer getErrorColumn() {
            return this.errorColumn;
        }

        public GetIssueResponseBodyModel setErrorCount(Integer errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Integer getErrorCount() {
            return this.errorCount;
        }

        public GetIssueResponseBodyModel setErrorCountGrowthRate(Double errorCountGrowthRate) {
            this.errorCountGrowthRate = errorCountGrowthRate;
            return this;
        }
        public Double getErrorCountGrowthRate() {
            return this.errorCountGrowthRate;
        }

        public GetIssueResponseBodyModel setErrorDeviceCount(Integer errorDeviceCount) {
            this.errorDeviceCount = errorDeviceCount;
            return this;
        }
        public Integer getErrorDeviceCount() {
            return this.errorDeviceCount;
        }

        public GetIssueResponseBodyModel setErrorDeviceCountGrowthRate(Double errorDeviceCountGrowthRate) {
            this.errorDeviceCountGrowthRate = errorDeviceCountGrowthRate;
            return this;
        }
        public Double getErrorDeviceCountGrowthRate() {
            return this.errorDeviceCountGrowthRate;
        }

        public GetIssueResponseBodyModel setErrorDeviceRate(Double errorDeviceRate) {
            this.errorDeviceRate = errorDeviceRate;
            return this;
        }
        public Double getErrorDeviceRate() {
            return this.errorDeviceRate;
        }

        public GetIssueResponseBodyModel setErrorDeviceRateGrowthRate(Double errorDeviceRateGrowthRate) {
            this.errorDeviceRateGrowthRate = errorDeviceRateGrowthRate;
            return this;
        }
        public Double getErrorDeviceRateGrowthRate() {
            return this.errorDeviceRateGrowthRate;
        }

        public GetIssueResponseBodyModel setErrorFileName(String errorFileName) {
            this.errorFileName = errorFileName;
            return this;
        }
        public String getErrorFileName() {
            return this.errorFileName;
        }

        public GetIssueResponseBodyModel setErrorLine(String errorLine) {
            this.errorLine = errorLine;
            return this;
        }
        public String getErrorLine() {
            return this.errorLine;
        }

        public GetIssueResponseBodyModel setErrorName(String errorName) {
            this.errorName = errorName;
            return this;
        }
        public String getErrorName() {
            return this.errorName;
        }

        public GetIssueResponseBodyModel setErrorRate(Double errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public Double getErrorRate() {
            return this.errorRate;
        }

        public GetIssueResponseBodyModel setErrorRateGrowthRate(Double errorRateGrowthRate) {
            this.errorRateGrowthRate = errorRateGrowthRate;
            return this;
        }
        public Double getErrorRateGrowthRate() {
            return this.errorRateGrowthRate;
        }

        public GetIssueResponseBodyModel setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public GetIssueResponseBodyModel setFirstVersion(String firstVersion) {
            this.firstVersion = firstVersion;
            return this;
        }
        public String getFirstVersion() {
            return this.firstVersion;
        }

        public GetIssueResponseBodyModel setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetIssueResponseBodyModel setGmtLatest(Long gmtLatest) {
            this.gmtLatest = gmtLatest;
            return this;
        }
        public Long getGmtLatest() {
            return this.gmtLatest;
        }

        public GetIssueResponseBodyModel setKeyLine(Integer keyLine) {
            this.keyLine = keyLine;
            return this;
        }
        public Integer getKeyLine() {
            return this.keyLine;
        }

        public GetIssueResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetIssueResponseBodyModel setStack(String stack) {
            this.stack = stack;
            return this;
        }
        public String getStack() {
            return this.stack;
        }

        public GetIssueResponseBodyModel setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetIssueResponseBodyModel setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetIssueResponseBodyModel setSymbolicStatus(Boolean symbolicStatus) {
            this.symbolicStatus = symbolicStatus;
            return this;
        }
        public Boolean getSymbolicStatus() {
            return this.symbolicStatus;
        }

        public GetIssueResponseBodyModel setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

}
