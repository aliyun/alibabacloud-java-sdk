// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateBlackIpsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The updated access blacklist information.</p>
     */
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
        /**
         * <p>The list of IP addresses in the access blacklist of the Elasticsearch instance.</p>
         */
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
