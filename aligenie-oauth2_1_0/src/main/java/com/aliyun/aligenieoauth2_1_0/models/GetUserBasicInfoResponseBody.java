// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class GetUserBasicInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxxxx">https://xxxxxx</a></p>
     */
    @NameInMap("AvatarUrl")
    public String avatarUrl;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("Nickname")
    public String nickname;

    /**
     * <strong>example:</strong>
     * <p>3hPPBd9YuhfJQCzZ/07AAWdoO3K8zCb/KAqW96zPHXPiFkzjB/JfcWuuFHQQDaGZ4wVbNMV6wYuj075p/rhVLg==</p>
     */
    @NameInMap("OpenId")
    public String openId;

    /**
     * <strong>example:</strong>
     * <p>4070039E-5822-1F32-9295-1D2883E48BA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserBasicInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserBasicInfoResponseBody self = new GetUserBasicInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserBasicInfoResponseBody setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public GetUserBasicInfoResponseBody setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public GetUserBasicInfoResponseBody setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public GetUserBasicInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
