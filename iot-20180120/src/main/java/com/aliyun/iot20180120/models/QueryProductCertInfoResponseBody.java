// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductCertInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProductCertInfo")
    public QueryProductCertInfoResponseBodyProductCertInfo productCertInfo;

    public static QueryProductCertInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductCertInfoResponseBody self = new QueryProductCertInfoResponseBody();
        return TeaModel.build(map, self);
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

    public static class QueryProductCertInfoResponseBodyProductCertInfo extends TeaModel {
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
