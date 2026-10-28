// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AccessTokenModel extends TeaModel {
    /**
     * <p>The access token.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The comment for the access token.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time of the access token.</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>The expiration time of the access token.</p>
     */
    @NameInMap("ExpiredAt")
    public String expiredAt;

    /**
     * <p>The status of the access token.</p>
     */
    @NameInMap("Status")
    public String status;

    public static AccessTokenModel build(java.util.Map<String, ?> map) throws Exception {
        AccessTokenModel self = new AccessTokenModel();
        return TeaModel.build(map, self);
    }

    public AccessTokenModel setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public AccessTokenModel setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AccessTokenModel setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AccessTokenModel setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }
    public String getExpiredAt() {
        return this.expiredAt;
    }

    public AccessTokenModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
