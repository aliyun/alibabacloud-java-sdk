// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccessKeyLastUsed")
    @Validation(required = true)
    public GetAccessKeyLastUsedResponseAccessKeyLastUsed accessKeyLastUsed;

    public static GetAccessKeyLastUsedResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedResponse self = new GetAccessKeyLastUsedResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccessKeyLastUsedResponse setAccessKeyLastUsed(GetAccessKeyLastUsedResponseAccessKeyLastUsed accessKeyLastUsed) {
        this.accessKeyLastUsed = accessKeyLastUsed;
        return this;
    }
    public GetAccessKeyLastUsedResponseAccessKeyLastUsed getAccessKeyLastUsed() {
        return this.accessKeyLastUsed;
    }

    public static class GetAccessKeyLastUsedResponseAccessKeyLastUsed extends TeaModel {
        @NameInMap("LastUsedDate")
        @Validation(required = true)
        public String lastUsedDate;

        public static GetAccessKeyLastUsedResponseAccessKeyLastUsed build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyLastUsedResponseAccessKeyLastUsed self = new GetAccessKeyLastUsedResponseAccessKeyLastUsed();
            return TeaModel.build(map, self);
        }

        public GetAccessKeyLastUsedResponseAccessKeyLastUsed setLastUsedDate(String lastUsedDate) {
            this.lastUsedDate = lastUsedDate;
            return this;
        }
        public String getLastUsedDate() {
            return this.lastUsedDate;
        }

    }

}
