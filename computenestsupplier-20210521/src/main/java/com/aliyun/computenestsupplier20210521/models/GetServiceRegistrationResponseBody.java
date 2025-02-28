// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceRegistrationResponseBody extends TeaModel {
    /**
     * <p>Comment from reviewer.</p>
     * 
     * <strong>example:</strong>
     * <p>comment message</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The details of service audit.</p>
     */
    @NameInMap("Detail")
    public GetServiceRegistrationResponseBodyDetail detail;

    /**
     * <p>Finish time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-07T11:05:50Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>Service registration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sr-1b4aabc1c9eb4109****</p>
     */
    @NameInMap("RegistrationId")
    public String registrationId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A361BA9E-xxxx-xxxx-xxxx-C26E5180456E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>service-c2d118c9193e49xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The service details.</p>
     */
    @NameInMap("ServiceInfo")
    public GetServiceRegistrationResponseBodyServiceInfo serviceInfo;

    /**
     * <p>The service version.</p>
     * 
     * <strong>example:</strong>
     * <p>beta</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    /**
     * <p>The status of service registration. Valid values:</p>
     * <ul>
     * <li>Submitted</li>
     * <li>Approved</li>
     * <li>Rejected</li>
     * <li>Canceled</li>
     * <li>Executed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Submitted</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Submit time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-07T11:05:50Z</p>
     */
    @NameInMap("SubmitTime")
    public String submitTime;

    public static GetServiceRegistrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRegistrationResponseBody self = new GetServiceRegistrationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceRegistrationResponseBody setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public GetServiceRegistrationResponseBody setDetail(GetServiceRegistrationResponseBodyDetail detail) {
        this.detail = detail;
        return this;
    }
    public GetServiceRegistrationResponseBodyDetail getDetail() {
        return this.detail;
    }

    public GetServiceRegistrationResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetServiceRegistrationResponseBody setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

    public GetServiceRegistrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceRegistrationResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceRegistrationResponseBody setServiceInfo(GetServiceRegistrationResponseBodyServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }
    public GetServiceRegistrationResponseBodyServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    public GetServiceRegistrationResponseBody setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public GetServiceRegistrationResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetServiceRegistrationResponseBody setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public static class GetServiceRegistrationResponseBodyDetail extends TeaModel {
        /**
         * <p>Whether risk exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AtRisk")
        public Boolean atRisk;

        /**
         * <p>Whether service is associated with artifact.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasRelatedArtifact")
        public Boolean hasRelatedArtifact;

        /**
         * <p>The reports.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;template1&quot;:&quot;<a href="https://compute-nest-security-audit-bucket.oss-cn-hangzhou.aliyuncs.com/report">https://compute-nest-security-audit-bucket.oss-cn-hangzhou.aliyuncs.com/report</a>&quot; }</p>
         */
        @NameInMap("Reports")
        public String reports;

        /**
         * <p>The url of template diff file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://compute-nest-template-diff-bucket.oss-cn-hangzhou.aliyuncs.com/service-abc/diff">https://compute-nest-template-diff-bucket.oss-cn-hangzhou.aliyuncs.com/service-abc/diff</a></p>
         */
        @NameInMap("TemplateDiffUrl")
        public String templateDiffUrl;

        public static GetServiceRegistrationResponseBodyDetail build(java.util.Map<String, ?> map) throws Exception {
            GetServiceRegistrationResponseBodyDetail self = new GetServiceRegistrationResponseBodyDetail();
            return TeaModel.build(map, self);
        }

        public GetServiceRegistrationResponseBodyDetail setAtRisk(Boolean atRisk) {
            this.atRisk = atRisk;
            return this;
        }
        public Boolean getAtRisk() {
            return this.atRisk;
        }

        public GetServiceRegistrationResponseBodyDetail setHasRelatedArtifact(Boolean hasRelatedArtifact) {
            this.hasRelatedArtifact = hasRelatedArtifact;
            return this;
        }
        public Boolean getHasRelatedArtifact() {
            return this.hasRelatedArtifact;
        }

        public GetServiceRegistrationResponseBodyDetail setReports(String reports) {
            this.reports = reports;
            return this;
        }
        public String getReports() {
            return this.reports;
        }

        public GetServiceRegistrationResponseBodyDetail setTemplateDiffUrl(String templateDiffUrl) {
            this.templateDiffUrl = templateDiffUrl;
            return this;
        }
        public String getTemplateDiffUrl() {
            return this.templateDiffUrl;
        }

    }

    public static class GetServiceRegistrationResponseBodyServiceInfo extends TeaModel {
        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li>private: The service is a private service and is deployed within the account of a customer.</li>
         * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
         * <li>operation: The service is a hosted O\&amp;M service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The trial policy. Valid values:</p>
         * <ul>
         * <li>Trial: Trials are supported.</li>
         * <li>NotTrial: Trials are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Trial</p>
         */
        @NameInMap("TrialType")
        public String trialType;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>v1.0</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static GetServiceRegistrationResponseBodyServiceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetServiceRegistrationResponseBodyServiceInfo self = new GetServiceRegistrationResponseBodyServiceInfo();
            return TeaModel.build(map, self);
        }

        public GetServiceRegistrationResponseBodyServiceInfo setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetServiceRegistrationResponseBodyServiceInfo setTrialType(String trialType) {
            this.trialType = trialType;
            return this;
        }
        public String getTrialType() {
            return this.trialType;
        }

        public GetServiceRegistrationResponseBodyServiceInfo setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

}
