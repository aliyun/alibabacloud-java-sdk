// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductCertInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("ProductCertInfo")
    @Validation(required = true)
    public QueryProductCertInfoResponseProductCertInfo productCertInfo;

    public static QueryProductCertInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductCertInfoResponse self = new QueryProductCertInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductCertInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductCertInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProductCertInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductCertInfoResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryProductCertInfoResponse setProductCertInfo(QueryProductCertInfoResponseProductCertInfo productCertInfo) {
        this.productCertInfo = productCertInfo;
        return this;
    }
    public QueryProductCertInfoResponseProductCertInfo getProductCertInfo() {
        return this.productCertInfo;
    }

    public static class QueryProductCertInfoResponseProductCertInfo extends TeaModel {
        @NameInMap("IssueModel")
        @Validation(required = true)
        public Integer issueModel;

        public static QueryProductCertInfoResponseProductCertInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductCertInfoResponseProductCertInfo self = new QueryProductCertInfoResponseProductCertInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductCertInfoResponseProductCertInfo setIssueModel(Integer issueModel) {
            this.issueModel = issueModel;
            return this;
        }
        public Integer getIssueModel() {
            return this.issueModel;
        }

    }

}
