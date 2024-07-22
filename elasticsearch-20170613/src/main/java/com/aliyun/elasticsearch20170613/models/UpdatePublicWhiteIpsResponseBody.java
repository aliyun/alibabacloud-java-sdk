// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePublicWhiteIpsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C82758DD-282F-4D48-934F-92170A33****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdatePublicWhiteIpsResponseBodyResult result;

    public static UpdatePublicWhiteIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicWhiteIpsResponseBody self = new UpdatePublicWhiteIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePublicWhiteIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePublicWhiteIpsResponseBody setResult(UpdatePublicWhiteIpsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdatePublicWhiteIpsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdatePublicWhiteIpsResponseBodyResult extends TeaModel {
        @NameInMap("publicIpWhitelist")
        public java.util.List<String> publicIpWhitelist;

        public static UpdatePublicWhiteIpsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdatePublicWhiteIpsResponseBodyResult self = new UpdatePublicWhiteIpsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdatePublicWhiteIpsResponseBodyResult setPublicIpWhitelist(java.util.List<String> publicIpWhitelist) {
            this.publicIpWhitelist = publicIpWhitelist;
            return this;
        }
        public java.util.List<String> getPublicIpWhitelist() {
            return this.publicIpWhitelist;
        }

    }

}
