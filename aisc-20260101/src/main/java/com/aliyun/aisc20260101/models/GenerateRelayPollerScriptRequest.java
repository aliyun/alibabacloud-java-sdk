// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GenerateRelayPollerScriptRequest extends TeaModel {
    /**
     * <p>The target platform in the &quot;operating system-architecture&quot; format. Only linux-amd64 and linux-arm64 are supported. Compatible architecture values include amd64, x86_64, x86, arm64, and aarch64. If only the architecture is specified, the operating system defaults to linux. Other operating systems such as macOS and Windows return HTTP status code 400. If this parameter is not specified, the default value is linux-amd64.</p>
     * 
     * <strong>example:</strong>
     * <p>linux-amd64</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The unique identifier of the scan target. The target must use the enterprise_relay connection method (see CreateAttackTarget). Otherwise, HTTP status code 400 is returned. If the target does not exist or belongs to another tenant, HTTP status code 400 is returned without exposing whether the resource exists. This parameter is registered as optional but is required in practice.</p>
     * 
     * <strong>example:</strong>
     * <p>target-abc123def4567</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    public static GenerateRelayPollerScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateRelayPollerScriptRequest self = new GenerateRelayPollerScriptRequest();
        return TeaModel.build(map, self);
    }

    public GenerateRelayPollerScriptRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GenerateRelayPollerScriptRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
