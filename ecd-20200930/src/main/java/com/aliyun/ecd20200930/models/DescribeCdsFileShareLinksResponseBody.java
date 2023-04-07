// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCdsFileShareLinksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<CdsFileShareLinkModel> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCdsFileShareLinksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdsFileShareLinksResponseBody self = new DescribeCdsFileShareLinksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdsFileShareLinksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCdsFileShareLinksResponseBody setData(java.util.List<CdsFileShareLinkModel> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CdsFileShareLinkModel> getData() {
        return this.data;
    }

    public DescribeCdsFileShareLinksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCdsFileShareLinksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCdsFileShareLinksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdsFileShareLinksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
