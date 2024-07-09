// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateBundleResponseBody extends TeaModel {
    /**
     * <p>The ID of the cloud computer template.</p>
     * 
     * <strong>example:</strong>
     * <p>b-cezrnfgecbich****</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBundleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBundleResponseBody self = new CreateBundleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBundleResponseBody setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateBundleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
