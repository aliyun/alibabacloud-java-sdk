// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class RenewServiceInstanceResourcesResponseBody extends TeaModel {
    /**
     * <p>Details of failed renewals.</p>
     */
    @NameInMap("FailureDetails")
    public java.util.List<RenewServiceInstanceResourcesResponseBodyFailureDetails> failureDetails;

    /**
     * <p>Renewal result.</p>
     */
    @NameInMap("RenewalResult")
    public RenewServiceInstanceResourcesResponseBodyRenewalResult renewalResult;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewServiceInstanceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewServiceInstanceResourcesResponseBody self = new RenewServiceInstanceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewServiceInstanceResourcesResponseBody setFailureDetails(java.util.List<RenewServiceInstanceResourcesResponseBodyFailureDetails> failureDetails) {
        this.failureDetails = failureDetails;
        return this;
    }
    public java.util.List<RenewServiceInstanceResourcesResponseBodyFailureDetails> getFailureDetails() {
        return this.failureDetails;
    }

    public RenewServiceInstanceResourcesResponseBody setRenewalResult(RenewServiceInstanceResourcesResponseBodyRenewalResult renewalResult) {
        this.renewalResult = renewalResult;
        return this;
    }
    public RenewServiceInstanceResourcesResponseBodyRenewalResult getRenewalResult() {
        return this.renewalResult;
    }

    public RenewServiceInstanceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RenewServiceInstanceResourcesResponseBodyFailureDetails extends TeaModel {
        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidPeriod</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Error message</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Resource ARN (Aliyun Resource Name).</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:cn-hongkong:1488317743351199:instance/i-j6c6f3lbky38o8rpeqw2</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        public static RenewServiceInstanceResourcesResponseBodyFailureDetails build(java.util.Map<String, ?> map) throws Exception {
            RenewServiceInstanceResourcesResponseBodyFailureDetails self = new RenewServiceInstanceResourcesResponseBodyFailureDetails();
            return TeaModel.build(map, self);
        }

        public RenewServiceInstanceResourcesResponseBodyFailureDetails setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public RenewServiceInstanceResourcesResponseBodyFailureDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public RenewServiceInstanceResourcesResponseBodyFailureDetails setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

    }

    public static class RenewServiceInstanceResourcesResponseBodyRenewalResult extends TeaModel {
        /**
         * <p>Number of failed renewals.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Integer failed;

        /**
         * <p>Number of successfully renewed resources.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Succeeded")
        public Integer succeeded;

        /**
         * <p>Number of renewed resources.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static RenewServiceInstanceResourcesResponseBodyRenewalResult build(java.util.Map<String, ?> map) throws Exception {
            RenewServiceInstanceResourcesResponseBodyRenewalResult self = new RenewServiceInstanceResourcesResponseBodyRenewalResult();
            return TeaModel.build(map, self);
        }

        public RenewServiceInstanceResourcesResponseBodyRenewalResult setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public RenewServiceInstanceResourcesResponseBodyRenewalResult setSucceeded(Integer succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Integer getSucceeded() {
            return this.succeeded;
        }

        public RenewServiceInstanceResourcesResponseBodyRenewalResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
