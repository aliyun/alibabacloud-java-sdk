// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateVendorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>vd-qlsw5eocx94w9。</p>
     */
    @NameInMap("VendorId")
    public String vendorId;

    public static CreateVendorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVendorResponseBody self = new CreateVendorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVendorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVendorResponseBody setVendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }
    public String getVendorId() {
        return this.vendorId;
    }

}
