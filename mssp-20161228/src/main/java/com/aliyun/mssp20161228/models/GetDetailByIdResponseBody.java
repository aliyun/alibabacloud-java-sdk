// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDetailByIdResponseBody extends TeaModel {
    /**
     * <p>Interface return code.</p>
     * 
     * <strong>example:</strong>
     * <p>404</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data query result.</p>
     */
    @NameInMap("Data")
    public GetDetailByIdResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAB46EC5-3746-59C4-B6D2-469F442EC73F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Values: - <strong>true</strong>: indicates a successful call. - <strong>false</strong>: indicates a failed call.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDetailByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetailByIdResponseBody self = new GetDetailByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetailByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDetailByIdResponseBody setData(GetDetailByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDetailByIdResponseBodyData getData() {
        return this.data;
    }

    public GetDetailByIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDetailByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDetailByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDetailByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDetailByIdResponseBodyDataVulDetails extends TeaModel {
        /**
         * <p>CVE ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2022-21291</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The CVSS score of the vulnerability in the Alibaba Cloud vulnerability database.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("CvssScore")
        public String cvssScore;

        /**
         * <p>Fix suggestion.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://avd.aliyun.com/detail/CVE-2022-21291">https://avd.aliyun.com/detail/CVE-2022-21291</a></p>
         */
        @NameInMap("FixSuggestion")
        public String fixSuggestion;

        /**
         * <p>Title of the vulnerability announcement.</p>
         * 
         * <strong>example:</strong>
         * <p>Chanjet T-Plus SetupAccount/Upload. Aspx file upload vulnerability(CNVD-2022-60632)</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetDetailByIdResponseBodyDataVulDetails build(java.util.Map<String, ?> map) throws Exception {
            GetDetailByIdResponseBodyDataVulDetails self = new GetDetailByIdResponseBodyDataVulDetails();
            return TeaModel.build(map, self);
        }

        public GetDetailByIdResponseBodyDataVulDetails setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public GetDetailByIdResponseBodyDataVulDetails setCvssScore(String cvssScore) {
            this.cvssScore = cvssScore;
            return this;
        }
        public String getCvssScore() {
            return this.cvssScore;
        }

        public GetDetailByIdResponseBodyDataVulDetails setFixSuggestion(String fixSuggestion) {
            this.fixSuggestion = fixSuggestion;
            return this;
        }
        public String getFixSuggestion() {
            return this.fixSuggestion;
        }

        public GetDetailByIdResponseBodyDataVulDetails setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetDetailByIdResponseBodyData extends TeaModel {
        /**
         * <p>Vulnerability details.</p>
         */
        @NameInMap("VulDetails")
        public java.util.List<GetDetailByIdResponseBodyDataVulDetails> vulDetails;

        public static GetDetailByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDetailByIdResponseBodyData self = new GetDetailByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDetailByIdResponseBodyData setVulDetails(java.util.List<GetDetailByIdResponseBodyDataVulDetails> vulDetails) {
            this.vulDetails = vulDetails;
            return this;
        }
        public java.util.List<GetDetailByIdResponseBodyDataVulDetails> getVulDetails() {
            return this.vulDetails;
        }

    }

}
