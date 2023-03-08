// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetUnionIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetUnionIdResponseBodyResult> result;

    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetUnionIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUnionIdResponseBody self = new GetUnionIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUnionIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUnionIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUnionIdResponseBody setResult(java.util.List<GetUnionIdResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetUnionIdResponseBodyResult> getResult() {
        return this.result;
    }

    public GetUnionIdResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetUnionIdResponseBodyResult extends TeaModel {
        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("UnionId")
        public String unionId;

        public static GetUnionIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetUnionIdResponseBodyResult self = new GetUnionIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetUnionIdResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public GetUnionIdResponseBodyResult setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

    }

}
