// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageModerationRequest extends TeaModel {
    /**
     * <p>The moderation services supported by Image Moderation 2.0. Valid values:</p>
     * <ul>
     * <li>baselineCheck: common baseline moderation</li>
     * <li>baselineCheck_pro: common baseline moderation_Professional</li>
     * <li>baselineCheck_cb: common baseline moderation_For regions outside the Chinese mainland</li>
     * <li>tonalityImprove: content governance moderation</li>
     * <li>aigcCheck: AI-generated image identification</li>
     * <li>profilePhotoCheck: avatar image moderation</li>
     * <li>advertisingCheck: marketing material identification</li>
     * <li>liveStreamCheck: moderation of screenshots of videos and live streams</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>liveStreamCheck: moderation of screenshots of videos and live streams</li>
     * <li>baselineCheck: common baseline moderation</li>
     * <li>aigcCheck: AI-generated image identification</li>
     * <li>baselineCheck_pro: common baseline moderation_Professional</li>
     * <li>advertisingCheck: marketing material identification</li>
     * <li>baselineCheck_cb: common baseline moderation_For regions outside the Chinese mainland</li>
     * <li>tonalityImprove: content governance moderation</li>
     * <li>profilePhotoCheck: avatar image moderation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameters required by the moderation service. The value is a JSON string.</p>
     * <ul>
     * <li>imageUrl: the URL of the object that you want to moderate. This parameter is required.</li>
     * <li>dataId: the ID of the object that you want to moderate. This parameter is optional.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;imageUrl&quot;:&quot;<a href="https://www.aliyun.com/test.jpg%22,%22dataId%22:%22img1234567%22%7D">https://www.aliyun.com/test.jpg&quot;,&quot;dataId&quot;:&quot;img1234567&quot;}</a></p>
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
