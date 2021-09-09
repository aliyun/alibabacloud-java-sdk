// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateWhiteIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateWhiteIpsResponseBodyResult result;

    public static UpdateWhiteIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteIpsResponseBody self = new UpdateWhiteIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWhiteIpsResponseBody setResult(UpdateWhiteIpsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateWhiteIpsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateWhiteIpsResponseBodyResult extends TeaModel {
        @NameInMap("esIPWhitelist")
        public java.util.List<String> esIPWhitelist;

        public static UpdateWhiteIpsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateWhiteIpsResponseBodyResult self = new UpdateWhiteIpsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateWhiteIpsResponseBodyResult setEsIPWhitelist(java.util.List<String> esIPWhitelist) {
            this.esIPWhitelist = esIPWhitelist;
            return this;
        }
        public java.util.List<String> getEsIPWhitelist() {
            return this.esIPWhitelist;
        }

    }

}
