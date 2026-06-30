// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ManualModerationRequest extends TeaModel {
    /**
     * <p>Service.</p>
     * 
     * <strong>example:</strong>
     * <p>imageManualCheck</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>Parameters required by the moderation service, in JSON string format.</p>
     * <ul>
     * <li>url: The URL of the object to be inspected. Make sure the URL is accessible through the public network.</li>
     * <li>dataId: Optional. The data ID corresponding to the object being inspected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;url&quot;: &quot;<a href="https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4">https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4</a>&quot;, &quot;dataId&quot;: &quot;data1234&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ManualModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        ManualModerationRequest self = new ManualModerationRequest();
        return TeaModel.build(map, self);
    }

    public ManualModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ManualModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
