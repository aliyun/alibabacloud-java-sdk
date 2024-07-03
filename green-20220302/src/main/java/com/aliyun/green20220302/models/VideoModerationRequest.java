// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>videoDetection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;url\&quot;: \&quot;<a href="https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4%5C%5C">https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4\\</a>&quot;, \&quot;dataId\&quot;: \&quot;94db0b88-f521-11ed-806e-fae21c1f239c\&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static VideoModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        VideoModerationRequest self = new VideoModerationRequest();
        return TeaModel.build(map, self);
    }

    public VideoModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public VideoModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
