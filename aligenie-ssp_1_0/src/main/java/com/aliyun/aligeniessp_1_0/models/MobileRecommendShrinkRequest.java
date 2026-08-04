// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class MobileRecommendShrinkRequest extends TeaModel {
    /**
     * <p>Bot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BotId")
    public String botId;

    /**
     * <p>Quantity of recommended Result</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>Device identification information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public String deviceInfoShrink;

    /**
     * <p>Required when the request type is STYLE.</p>
     * 
     * <strong>example:</strong>
     * <p>轻音乐</p>
     */
    @NameInMap("Style")
    public String style;

    /**
     * <p>Request Type: Obtain daily recommendations, hot songs, or genre-based playlists.</p>
     * 
     * <strong>example:</strong>
     * <p>DAILY_REC</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>User information – userId</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static MobileRecommendShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MobileRecommendShrinkRequest self = new MobileRecommendShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MobileRecommendShrinkRequest setBotId(String botId) {
        this.botId = botId;
        return this;
    }
    public String getBotId() {
        return this.botId;
    }

    public MobileRecommendShrinkRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public MobileRecommendShrinkRequest setDeviceInfoShrink(String deviceInfoShrink) {
        this.deviceInfoShrink = deviceInfoShrink;
        return this;
    }
    public String getDeviceInfoShrink() {
        return this.deviceInfoShrink;
    }

    public MobileRecommendShrinkRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public MobileRecommendShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MobileRecommendShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
