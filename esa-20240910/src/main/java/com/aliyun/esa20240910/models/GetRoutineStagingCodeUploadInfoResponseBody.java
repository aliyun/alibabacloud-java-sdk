// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineStagingCodeUploadInfoResponseBody extends TeaModel {
    /**
     * <p>The code version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1710120201067203242</p>
     */
    @NameInMap("CodeVersion")
    public String codeVersion;

    /**
     * <p>The configuration information for uploading a JavaScript file to OSS. When uploading to OSS, you must include the OSSAccessKeyId and x-oss-security-token parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;OssPostConfig&quot;: {
     *             &quot;Url&quot;: &quot;<a href="http://oss_fake_bucket_url">http://oss_fake_bucket_url</a>&quot;,
     *             &quot;OSSAccessKeyId&quot;: &quot;xxx&quot;,
     *             &quot;XOssSecurityToken&quot;: &quot;&quot;,
     *             &quot;key&quot;: &quot;sp_esa_rwa/xxx/hello/unstable/routine/index.js&quot;,
     *             &quot;callback&quot;: &quot;xxx=&quot;,
     *             &quot;x:codeDescription&quot;: &quot;xxx=&quot;,
     *             &quot;policy&quot;: &quot;xxx=&quot;,
     *             &quot;Signature&quot;: &quot;xxx=&quot;
     *         }</p>
     */
    @NameInMap("OssPostConfig")
    public java.util.Map<String, ?> ossPostConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
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
