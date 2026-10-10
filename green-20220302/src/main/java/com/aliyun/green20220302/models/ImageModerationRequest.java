// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageModerationRequest extends TeaModel {
    /**
     * <p>The detection types supported by Image Moderation Enhanced Edition. Valid values:</p>
     * <ul>
     * <li>baselineCheck: general baseline check</li>
     * <li>baselineCheck_pro: general baseline check (Professional Edition)</li>
     * <li>baselineCheck_cb: general baseline check (Overseas Edition)</li>
     * <li>tonalityImprove: content governance detection</li>
     * <li>aigcCheck: AIGC image detection</li>
     * <li>aigcViolationDetection: AIGC image infringement detection</li>
     * <li>aigcDetector: AIGC image generation determination</li>
     * <li>profilePhotoCheck: profile picture detection</li>
     * <li>postImageCheck: post and comment image detection</li>
     * <li>advertisingCheck: marketing material detection</li>
     * <li>liveStreamCheck: video or live stream screenshot detection</li>
     * <li>generalOcr: general image and text OCR</li>
     * <li>generalRecognition: universal image recognition</li>
     * <li>postImageCheckByVL: image moderation service with large and small model fusion</li>
     * <li>postImageCheckByVL_cb: image moderation service with large and small model fusion (Overseas Edition)</li>
     * <li>baselineCheckByVL: general image moderation large model service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameter set for the content moderation object. The value is a JSON string.</p>
     * <ul>
     * <li>imageUrl: the URL of the object to be moderated. Required.</li>
     * <li>dataId: the data ID corresponding to the moderation object. Optional.</li>
     * <li>referer: the Referer request header, used for scenarios such as hotlink protection. Optional.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;imageUrl&quot;:&quot;<a href="https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png%22,%22dataId%22:%22img1234567%22%7D">https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png&quot;,&quot;dataId&quot;:&quot;img1234567&quot;}</a></p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ImageModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageModerationRequest self = new ImageModerationRequest();
        return TeaModel.build(map, self);
    }

    public ImageModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ImageModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
