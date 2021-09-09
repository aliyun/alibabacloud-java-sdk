// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaWhiteIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateKibanaWhiteIpsResponseBodyResult result;

    public static UpdateKibanaWhiteIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaWhiteIpsResponseBody self = new UpdateKibanaWhiteIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaWhiteIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKibanaWhiteIpsResponseBody setResult(UpdateKibanaWhiteIpsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateKibanaWhiteIpsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateKibanaWhiteIpsResponseBodyResult extends TeaModel {
        @NameInMap("kibanaPrivateIPWhitelist")
        public java.util.List<String> kibanaPrivateIPWhitelist;

        @NameInMap("kibanaIPWhitelist")
        public java.util.List<String> kibanaIPWhitelist;

        public static UpdateKibanaWhiteIpsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateKibanaWhiteIpsResponseBodyResult self = new UpdateKibanaWhiteIpsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateKibanaWhiteIpsResponseBodyResult setKibanaPrivateIPWhitelist(java.util.List<String> kibanaPrivateIPWhitelist) {
            this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaPrivateIPWhitelist() {
            return this.kibanaPrivateIPWhitelist;
        }

        public UpdateKibanaWhiteIpsResponseBodyResult setKibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
            this.kibanaIPWhitelist = kibanaIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaIPWhitelist() {
            return this.kibanaIPWhitelist;
        }

    }

}
