// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardAsyncRequest extends TeaModel {
    /**
     * <p>The moderation service type. Valid values: <code>audio_security_check</code> and <code>video_security_check</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>audio_security_check</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameter set required for the moderation service.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;url&quot;: &quot;<a href="https://testxxx.oss-cn-shanghai.aliyuncs.com/xxx.mp4">https://testxxx.oss-cn-shanghai.aliyuncs.com/xxx.mp4</a>&quot;, &quot;dataId&quot;: &quot;data1234&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static MultiModalGuardAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardAsyncRequest self = new MultiModalGuardAsyncRequest();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardAsyncRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public MultiModalGuardAsyncRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
