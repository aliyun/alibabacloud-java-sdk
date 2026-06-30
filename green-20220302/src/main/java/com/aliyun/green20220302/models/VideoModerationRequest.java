// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationRequest extends TeaModel {
    /**
     * <p>The service code for video moderation.</p>
     * 
     * <strong>example:</strong>
     * <p>videoDetection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameters that are required for the moderation service. The value must be a JSON string.</p>
     * <ul>
     * <li>url: Required. The URL of the object to be moderated. Make sure that the URL can be accessed over the Internet.</li>
     * <li>dataId: Optional. The data ID of the object to be moderated.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2505810.html">ServiceParameter</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;url&quot;: &quot;<a href="https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4">https://talesofai.oss-cn-shanghai.aliyuncs.com/xxx.mp4</a>&quot;, &quot;dataId&quot;: &quot;data1234&quot;}</p>
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
