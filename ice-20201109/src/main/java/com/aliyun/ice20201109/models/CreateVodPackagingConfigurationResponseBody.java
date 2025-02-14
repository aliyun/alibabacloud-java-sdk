// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingConfigurationResponseBody extends TeaModel {
    @NameInMap("PackagingConfiguration")
    public VodPackagingConfiguration packagingConfiguration;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVodPackagingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingConfigurationResponseBody self = new CreateVodPackagingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingConfigurationResponseBody setPackagingConfiguration(VodPackagingConfiguration packagingConfiguration) {
        this.packagingConfiguration = packagingConfiguration;
        return this;
    }
    public VodPackagingConfiguration getPackagingConfiguration() {
        return this.packagingConfiguration;
    }

    public CreateVodPackagingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
