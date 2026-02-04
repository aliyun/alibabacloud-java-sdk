// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderStatusCheckJobResponseBody extends TeaModel {
    @NameInMap("IdentityProviderStatusCheckJob")
    public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob identityProviderStatusCheckJob;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIdentityProviderStatusCheckJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderStatusCheckJobResponseBody self = new GetIdentityProviderStatusCheckJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderStatusCheckJobResponseBody setIdentityProviderStatusCheckJob(GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob identityProviderStatusCheckJob) {
        this.identityProviderStatusCheckJob = identityProviderStatusCheckJob;
        return this;
    }
    public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob getIdentityProviderStatusCheckJob() {
        return this.identityProviderStatusCheckJob;
    }

    public GetIdentityProviderStatusCheckJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason extends TeaModel {
        /**
         * <p>错误码</p>
         * 
         * <strong>example:</strong>
         * <p>NetworkAccessPointWarning.SingleNetworkAccessPath</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>错误级别</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("ErrorLevel")
        public String errorLevel;

        /**
         * <p>错误信息</p>
         * 
         * <strong>example:</strong>
         * <p>There is only one path in the current network access endpoint.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason self = new GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason setErrorLevel(String errorLevel) {
            this.errorLevel = errorLevel;
            return this;
        }
        public String getErrorLevel() {
            return this.errorLevel;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems extends TeaModel {
        /**
         * <p>错误原因</p>
         */
        @NameInMap("ErrorReason")
        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason errorReason;

        /**
         * <p>主要检查项</p>
         * 
         * <strong>example:</strong>
         * <p>network_check</p>
         */
        @NameInMap("MajorCheckItem")
        public String majorCheckItem;

        /**
         * <p>次要检查项</p>
         * 
         * <strong>example:</strong>
         * <p>network_access_status</p>
         */
        @NameInMap("MinorCheckItem")
        public String minorCheckItem;

        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        public static GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems self = new GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems setErrorReason(GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason errorReason) {
            this.errorReason = errorReason;
            return this;
        }
        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItemsErrorReason getErrorReason() {
            return this.errorReason;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems setMajorCheckItem(String majorCheckItem) {
            this.majorCheckItem = majorCheckItem;
            return this;
        }
        public String getMajorCheckItem() {
            return this.majorCheckItem;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems setMinorCheckItem(String minorCheckItem) {
            this.minorCheckItem = minorCheckItem;
            return this;
        }
        public String getMinorCheckItem() {
            return this.minorCheckItem;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob extends TeaModel {
        /**
         * <p>任务检查结果</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("CheckResult")
        public String checkResult;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1763776265757</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>IdP身份提供方</p>
         * 
         * <strong>example:</strong>
         * <p>idp_ncehkms65fiefobrvwy2blrxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>IdP状态检查任务Id</p>
         * 
         * <strong>example:</strong>
         * <p>async_000036tfu8cgngmakngrr2rk75qgf87pf3rxxx</p>
         */
        @NameInMap("IdentityProviderStatusCheckJobId")
        public String identityProviderStatusCheckJobId;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ki6hd7ihir4ybawogqk6kqsfxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>状态检查子项任务结果信息</p>
         */
        @NameInMap("JobCheckItems")
        public java.util.List<GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems> jobCheckItems;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1763776265757</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>任务检查状态</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob self = new GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob setIdentityProviderStatusCheckJobId(String identityProviderStatusCheckJobId) {
            this.identityProviderStatusCheckJobId = identityProviderStatusCheckJobId;
            return this;
        }
        public String getIdentityProviderStatusCheckJobId() {
            return this.identityProviderStatusCheckJobId;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob setJobCheckItems(java.util.List<GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems> jobCheckItems) {
            this.jobCheckItems = jobCheckItems;
            return this;
        }
        public java.util.List<GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJobJobCheckItems> getJobCheckItems() {
            return this.jobCheckItems;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetIdentityProviderStatusCheckJobResponseBodyIdentityProviderStatusCheckJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
