// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetDomainOwnerVerifyContentResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public GetDomainOwnerVerifyContentResponseBodyResult result;

    public static GetDomainOwnerVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainOwnerVerifyContentResponseBody self = new GetDomainOwnerVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainOwnerVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDomainOwnerVerifyContentResponseBody setResult(GetDomainOwnerVerifyContentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDomainOwnerVerifyContentResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetDomainOwnerVerifyContentResponseBodyResult extends TeaModel {
        // 域名归属校验内容
        @NameInMap("Content")
        public String content;

        public static GetDomainOwnerVerifyContentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDomainOwnerVerifyContentResponseBodyResult self = new GetDomainOwnerVerifyContentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDomainOwnerVerifyContentResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
