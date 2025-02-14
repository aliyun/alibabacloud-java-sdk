// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingConfigurationResponseBody extends TeaModel {
    @NameInMap("PackagingConfiguration")
    public VodPackagingConfiguration packagingConfiguration;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVodPackagingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVodPackagingConfigurationResponseBody self = new GetVodPackagingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVodPackagingConfigurationResponseBody setPackagingConfiguration(VodPackagingConfiguration packagingConfiguration) {
        this.packagingConfiguration = packagingConfiguration;
        return this;
    }
    public VodPackagingConfiguration getPackagingConfiguration() {
        return this.packagingConfiguration;
    }

    public GetVodPackagingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
