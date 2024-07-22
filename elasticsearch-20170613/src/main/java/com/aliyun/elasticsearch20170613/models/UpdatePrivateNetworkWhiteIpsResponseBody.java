// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePrivateNetworkWhiteIpsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6DEBE5EE-0368-4757-8F82-EF9C3972****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdatePrivateNetworkWhiteIpsResponseBodyResult result;

    public static UpdatePrivateNetworkWhiteIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateNetworkWhiteIpsResponseBody self = new UpdatePrivateNetworkWhiteIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateNetworkWhiteIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePrivateNetworkWhiteIpsResponseBody setResult(UpdatePrivateNetworkWhiteIpsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdatePrivateNetworkWhiteIpsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdatePrivateNetworkWhiteIpsResponseBodyResult extends TeaModel {
        @NameInMap("privateNetworkIpWhiteList")
        public java.util.List<String> privateNetworkIpWhiteList;

        public static UpdatePrivateNetworkWhiteIpsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateNetworkWhiteIpsResponseBodyResult self = new UpdatePrivateNetworkWhiteIpsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateNetworkWhiteIpsResponseBodyResult setPrivateNetworkIpWhiteList(java.util.List<String> privateNetworkIpWhiteList) {
            this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
            return this;
        }
        public java.util.List<String> getPrivateNetworkIpWhiteList() {
            return this.privateNetworkIpWhiteList;
        }

    }

}
