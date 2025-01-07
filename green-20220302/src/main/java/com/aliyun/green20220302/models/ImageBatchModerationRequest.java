// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageBatchModerationRequest extends TeaModel {
    /**
     * <p>The types of detection supported by the enhanced image review, separated by English commas. Values:</p>
     * <ul>
     * <li>baselineCheck：General Baseline Detection</li>
     * <li>baselineCheck_pro：General Baseline Detection_Pro Edition</li>
     * <li>tonalityImprove：Content governance monitoring</li>
     * <li>aigcCheck：AIGC image detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck,tonalityImprove</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The set of relevant parameters for content detection objects.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;imageUrl&quot;: &quot;<a href="https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png">https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png</a>&quot;,
     *         &quot;dataId&quot;: &quot;img123****&quot;
     *     }</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ImageBatchModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageBatchModerationRequest self = new ImageBatchModerationRequest();
        return TeaModel.build(map, self);
    }

    public ImageBatchModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ImageBatchModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
