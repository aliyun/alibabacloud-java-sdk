// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateBlackIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateBlackIpsResponseBodyResult result;

    public static UpdateBlackIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlackIpsResponseBody self = new UpdateBlackIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBlackIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBlackIpsResponseBody setResult(UpdateBlackIpsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateBlackIpsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateBlackIpsResponseBodyResult extends TeaModel {
        @NameInMap("esIPBlacklist")
        public java.util.List<String> esIPBlacklist;

        public static UpdateBlackIpsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateBlackIpsResponseBodyResult self = new UpdateBlackIpsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateBlackIpsResponseBodyResult setEsIPBlacklist(java.util.List<String> esIPBlacklist) {
            this.esIPBlacklist = esIPBlacklist;
            return this;
        }
        public java.util.List<String> getEsIPBlacklist() {
            return this.esIPBlacklist;
        }

    }

}
