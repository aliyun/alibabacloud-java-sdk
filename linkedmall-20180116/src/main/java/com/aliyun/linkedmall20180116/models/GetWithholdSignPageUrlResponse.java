// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class GetWithholdSignPageUrlResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("WithholdSignResponse")
    @Validation(required = true)
    public GetWithholdSignPageUrlResponseWithholdSignResponse withholdSignResponse;

    public static GetWithholdSignPageUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWithholdSignPageUrlResponse self = new GetWithholdSignPageUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetWithholdSignPageUrlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWithholdSignPageUrlResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWithholdSignPageUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWithholdSignPageUrlResponse setWithholdSignResponse(GetWithholdSignPageUrlResponseWithholdSignResponse withholdSignResponse) {
        this.withholdSignResponse = withholdSignResponse;
        return this;
    }
    public GetWithholdSignPageUrlResponseWithholdSignResponse getWithholdSignResponse() {
        return this.withholdSignResponse;
    }

    public static class GetWithholdSignPageUrlResponseWithholdSignResponse extends TeaModel {
        @NameInMap("OutRequestNo")
        @Validation(required = true)
        public String outRequestNo;

        @NameInMap("PageUrl")
        @Validation(required = true)
        public String pageUrl;

        public static GetWithholdSignPageUrlResponseWithholdSignResponse build(java.util.Map<String, ?> map) throws Exception {
            GetWithholdSignPageUrlResponseWithholdSignResponse self = new GetWithholdSignPageUrlResponseWithholdSignResponse();
            return TeaModel.build(map, self);
        }

        public GetWithholdSignPageUrlResponseWithholdSignResponse setOutRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }
        public String getOutRequestNo() {
            return this.outRequestNo;
        }

        public GetWithholdSignPageUrlResponseWithholdSignResponse setPageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
            return this;
        }
        public String getPageUrl() {
            return this.pageUrl;
        }

    }

}
