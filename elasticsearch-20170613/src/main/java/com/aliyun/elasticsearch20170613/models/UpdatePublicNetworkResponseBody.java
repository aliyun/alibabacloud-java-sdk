// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePublicNetworkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
    @NameInMap("Result")
    public UpdatePublicNetworkResponseBodyResult result;

    public static UpdatePublicNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicNetworkResponseBody self = new UpdatePublicNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePublicNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePublicNetworkResponseBody setResult(UpdatePublicNetworkResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdatePublicNetworkResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdatePublicNetworkResponseBodyResult extends TeaModel {
        /**
         * <p>The status of the public network access switch.</p>
         */
        @NameInMap("enablePublic")
        public Boolean enablePublic;

        public static UpdatePublicNetworkResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdatePublicNetworkResponseBodyResult self = new UpdatePublicNetworkResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdatePublicNetworkResponseBodyResult setEnablePublic(Boolean enablePublic) {
            this.enablePublic = enablePublic;
            return this;
        }
        public Boolean getEnablePublic() {
            return this.enablePublic;
        }

    }

}
