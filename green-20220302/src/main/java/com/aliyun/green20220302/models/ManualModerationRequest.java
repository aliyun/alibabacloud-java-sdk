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
     * <p>Parameter set required for the review service, in JSON string format.</p>
     * <ul>
     * <li>url: The URL of the object to be checked. Please ensure that this URL is publicly accessible.</li>
     * <li>dataId: Optional, the data ID corresponding to the object being checked.</li>
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
