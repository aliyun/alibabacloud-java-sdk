// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CheckVersionTransferResponseBody extends TeaModel {
    @NameInMap("CheckAccess")
    public CheckVersionTransferResponseBodyCheckAccess checkAccess;

    @NameInMap("CheckCategory")
    public Boolean checkCategory;

    @NameInMap("CheckCode")
    public CheckVersionTransferResponseBodyCheckCode checkCode;

    @NameInMap("CheckConnection")
    public Boolean checkConnection;

    @NameInMap("CheckStatus")
    public CheckVersionTransferResponseBodyCheckStatus checkStatus;

    @NameInMap("CheckStorage")
    public Boolean checkStorage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeDuration")
    public String timeDuration;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static CheckVersionTransferResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckVersionTransferResponseBody self = new CheckVersionTransferResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckVersionTransferResponseBody setCheckAccess(CheckVersionTransferResponseBodyCheckAccess checkAccess) {
        this.checkAccess = checkAccess;
        return this;
    }
    public CheckVersionTransferResponseBodyCheckAccess getCheckAccess() {
        return this.checkAccess;
    }

    public CheckVersionTransferResponseBody setCheckCategory(Boolean checkCategory) {
        this.checkCategory = checkCategory;
        return this;
    }
    public Boolean getCheckCategory() {
        return this.checkCategory;
    }

    public CheckVersionTransferResponseBody setCheckCode(CheckVersionTransferResponseBodyCheckCode checkCode) {
        this.checkCode = checkCode;
        return this;
    }
    public CheckVersionTransferResponseBodyCheckCode getCheckCode() {
        return this.checkCode;
    }

    public CheckVersionTransferResponseBody setCheckConnection(Boolean checkConnection) {
        this.checkConnection = checkConnection;
        return this;
    }
    public Boolean getCheckConnection() {
        return this.checkConnection;
    }

    public CheckVersionTransferResponseBody setCheckStatus(CheckVersionTransferResponseBodyCheckStatus checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }
    public CheckVersionTransferResponseBodyCheckStatus getCheckStatus() {
        return this.checkStatus;
    }

    public CheckVersionTransferResponseBody setCheckStorage(Boolean checkStorage) {
        this.checkStorage = checkStorage;
        return this;
    }
    public Boolean getCheckStorage() {
        return this.checkStorage;
    }

    public CheckVersionTransferResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckVersionTransferResponseBody setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
        return this;
    }
    public String getTimeDuration() {
        return this.timeDuration;
    }

    public CheckVersionTransferResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class CheckVersionTransferResponseBodyCheckAccess extends TeaModel {
        @NameInMap("ErrCode")
        public Long errCode;

        @NameInMap("ErrMessage")
        public String errMessage;

        public static CheckVersionTransferResponseBodyCheckAccess build(java.util.Map<String, ?> map) throws Exception {
            CheckVersionTransferResponseBodyCheckAccess self = new CheckVersionTransferResponseBodyCheckAccess();
            return TeaModel.build(map, self);
        }

        public CheckVersionTransferResponseBodyCheckAccess setErrCode(Long errCode) {
            this.errCode = errCode;
            return this;
        }
        public Long getErrCode() {
            return this.errCode;
        }

        public CheckVersionTransferResponseBodyCheckAccess setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

    }

    public static class CheckVersionTransferResponseBodyCheckCode extends TeaModel {
        @NameInMap("ErrCode")
        public Long errCode;

        @NameInMap("ErrMessage")
        public String errMessage;

        public static CheckVersionTransferResponseBodyCheckCode build(java.util.Map<String, ?> map) throws Exception {
            CheckVersionTransferResponseBodyCheckCode self = new CheckVersionTransferResponseBodyCheckCode();
            return TeaModel.build(map, self);
        }

        public CheckVersionTransferResponseBodyCheckCode setErrCode(Long errCode) {
            this.errCode = errCode;
            return this;
        }
        public Long getErrCode() {
            return this.errCode;
        }

        public CheckVersionTransferResponseBodyCheckCode setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

    }

    public static class CheckVersionTransferResponseBodyCheckStatus extends TeaModel {
        @NameInMap("ErrCode")
        public Long errCode;

        @NameInMap("ErrMessage")
        public String errMessage;

        public static CheckVersionTransferResponseBodyCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            CheckVersionTransferResponseBodyCheckStatus self = new CheckVersionTransferResponseBodyCheckStatus();
            return TeaModel.build(map, self);
        }

        public CheckVersionTransferResponseBodyCheckStatus setErrCode(Long errCode) {
            this.errCode = errCode;
            return this;
        }
        public Long getErrCode() {
            return this.errCode;
        }

        public CheckVersionTransferResponseBodyCheckStatus setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

    }

}
