// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductCertInfoResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingProductKey</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>ProductKey is mandatory for this action.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The returned certificate information that includes the value of the <strong>IssueModel</strong> parameter.</p>
     */
    @NameInMap("ProductCertInfo")
    public QueryProductCertInfoResponseBodyProductCertInfo productCertInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>57b144cf-09fc-4916-a272-a62902d5b207</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryProductCertInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductCertInfoResponseBody self = new QueryProductCertInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductCertInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductCertInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProductCertInfoResponseBody setProductCertInfo(QueryProductCertInfoResponseBodyProductCertInfo productCertInfo) {
        this.productCertInfo = productCertInfo;
        return this;
    }
    public QueryProductCertInfoResponseBodyProductCertInfo getProductCertInfo() {
        return this.productCertInfo;
    }

    public QueryProductCertInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductCertInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryProductCertInfoResponseBodyProductCertInfo extends TeaModel {
        /**
         * <p>The source from which the X.509 certificate is issued.</p>
         * <ul>
         * <li><strong>1</strong>: The X.509 certificate is issued by IoT Platform.</li>
         * <li><strong>3</strong>: The X.509 certificate is issued by a third-party platform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IssueModel")
        public Integer issueModel;

        public static QueryProductCertInfoResponseBodyProductCertInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductCertInfoResponseBodyProductCertInfo self = new QueryProductCertInfoResponseBodyProductCertInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductCertInfoResponseBodyProductCertInfo setIssueModel(Integer issueModel) {
            this.issueModel = issueModel;
            return this;
        }
        public Integer getIssueModel() {
            return this.issueModel;
        }

    }

}
