// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchIntrudeDomainsResponseBody extends TeaModel {
    @NameInMap("Data")
    public BatchIntrudeDomainsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static BatchIntrudeDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchIntrudeDomainsResponseBody self = new BatchIntrudeDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchIntrudeDomainsResponseBody setData(BatchIntrudeDomainsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchIntrudeDomainsResponseBodyData getData() {
        return this.data;
    }

    public BatchIntrudeDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchIntrudeDomainsResponseBodyDataFailureList extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Success")
        public Boolean success;

        public static BatchIntrudeDomainsResponseBodyDataFailureList build(java.util.Map<String, ?> map) throws Exception {
            BatchIntrudeDomainsResponseBodyDataFailureList self = new BatchIntrudeDomainsResponseBodyDataFailureList();
            return TeaModel.build(map, self);
        }

        public BatchIntrudeDomainsResponseBodyDataFailureList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public BatchIntrudeDomainsResponseBodyDataFailureList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchIntrudeDomainsResponseBodyDataFailureList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchIntrudeDomainsResponseBodyDataFailureList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class BatchIntrudeDomainsResponseBodyDataSuccessList extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Success")
        public Boolean success;

        public static BatchIntrudeDomainsResponseBodyDataSuccessList build(java.util.Map<String, ?> map) throws Exception {
            BatchIntrudeDomainsResponseBodyDataSuccessList self = new BatchIntrudeDomainsResponseBodyDataSuccessList();
            return TeaModel.build(map, self);
        }

        public BatchIntrudeDomainsResponseBodyDataSuccessList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public BatchIntrudeDomainsResponseBodyDataSuccessList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public BatchIntrudeDomainsResponseBodyDataSuccessList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchIntrudeDomainsResponseBodyDataSuccessList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class BatchIntrudeDomainsResponseBodyData extends TeaModel {
        @NameInMap("FailureCount")
        public Integer failureCount;

        @NameInMap("FailureList")
        public java.util.List<BatchIntrudeDomainsResponseBodyDataFailureList> failureList;

        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("SuccessList")
        public java.util.List<BatchIntrudeDomainsResponseBodyDataSuccessList> successList;

        public static BatchIntrudeDomainsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchIntrudeDomainsResponseBodyData self = new BatchIntrudeDomainsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchIntrudeDomainsResponseBodyData setFailureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Integer getFailureCount() {
            return this.failureCount;
        }

        public BatchIntrudeDomainsResponseBodyData setFailureList(java.util.List<BatchIntrudeDomainsResponseBodyDataFailureList> failureList) {
            this.failureList = failureList;
            return this;
        }
        public java.util.List<BatchIntrudeDomainsResponseBodyDataFailureList> getFailureList() {
            return this.failureList;
        }

        public BatchIntrudeDomainsResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public BatchIntrudeDomainsResponseBodyData setSuccessList(java.util.List<BatchIntrudeDomainsResponseBodyDataSuccessList> successList) {
            this.successList = successList;
            return this;
        }
        public java.util.List<BatchIntrudeDomainsResponseBodyDataSuccessList> getSuccessList() {
            return this.successList;
        }

    }

}
