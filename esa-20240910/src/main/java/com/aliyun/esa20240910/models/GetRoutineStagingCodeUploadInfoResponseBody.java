// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineStagingCodeUploadInfoResponseBody extends TeaModel {
    @NameInMap("CodeVersion")
    public String codeVersion;

    @NameInMap("OssPostConfig")
    public java.util.Map<String, ?> ossPostConfig;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRoutineStagingCodeUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineStagingCodeUploadInfoResponseBody self = new GetRoutineStagingCodeUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineStagingCodeUploadInfoResponseBody setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
        return this;
    }
    public String getCodeVersion() {
        return this.codeVersion;
    }

    public GetRoutineStagingCodeUploadInfoResponseBody setOssPostConfig(java.util.Map<String, ?> ossPostConfig) {
        this.ossPostConfig = ossPostConfig;
        return this;
    }
    public java.util.Map<String, ?> getOssPostConfig() {
        return this.ossPostConfig;
    }

    public GetRoutineStagingCodeUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
