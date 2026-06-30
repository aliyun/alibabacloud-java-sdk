// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageBatchModerationRequest extends TeaModel {
    /**
     * <p>The detection services supported by Image Moderation Pro. Separate multiple services with commas. Valid values:</p>
     * <ul>
     * <li><p>baselineCheck: General baseline check</p>
     * </li>
     * <li><p>baselineCheck_pro: General baseline check (Professional Edition)</p>
     * </li>
     * <li><p>tonalityImprove: Content administration check</p>
     * </li>
     * <li><p>aigcCheck: AIGC image check</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck,tonalityImprove</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameters for the content to moderate.</p>
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
