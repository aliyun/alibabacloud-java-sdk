// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResponseBody extends TeaModel {
    @NameInMap("AccessKeyLastUsed")
    public GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed accessKeyLastUsed;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessKeyLastUsedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedResponseBody self = new GetAccessKeyLastUsedResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedResponseBody setAccessKeyLastUsed(GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed accessKeyLastUsed) {
        this.accessKeyLastUsed = accessKeyLastUsed;
        return this;
    }
    public GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed getAccessKeyLastUsed() {
        return this.accessKeyLastUsed;
    }

    public GetAccessKeyLastUsedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed extends TeaModel {
        @NameInMap("LastUsedDate")
        public String lastUsedDate;

        public static GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed self = new GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed();
            return TeaModel.build(map, self);
        }

        public GetAccessKeyLastUsedResponseBodyAccessKeyLastUsed setLastUsedDate(String lastUsedDate) {
            this.lastUsedDate = lastUsedDate;
            return this;
        }
        public String getLastUsedDate() {
            return this.lastUsedDate;
        }

    }

}
