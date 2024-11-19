// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryCertUrlByApplyIdResponseBody extends TeaModel {
    /**
     * <p>The URL from which you can download the X.509 certificates of created devices.</p>
     * 
     * <strong>example:</strong>
     * <p>https://****</p>
     */
    @NameInMap("CertUrl")
    public String certUrl;

    /**
     * <p>The error code returned if the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>A system exception occurred.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCertUrlByApplyIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCertUrlByApplyIdResponseBody self = new QueryCertUrlByApplyIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCertUrlByApplyIdResponseBody setCertUrl(String certUrl) {
        this.certUrl = certUrl;
        return this;
    }
    public String getCertUrl() {
        return this.certUrl;
    }

    public QueryCertUrlByApplyIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCertUrlByApplyIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryCertUrlByApplyIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCertUrlByApplyIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
