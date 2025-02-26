// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class AuthorizeAndroidInstanceRequest extends TeaModel {
    /**
     * <p>List of instance IDs.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>User ID to be assigned.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AuthorizeUserId")
    public String authorizeUserId;

    /**
     * <p>User ID to be unassigned.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UnAuthorizeUserId")
    public String unAuthorizeUserId;

    public static AuthorizeAndroidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAndroidInstanceRequest self = new AuthorizeAndroidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeAndroidInstanceRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public AuthorizeAndroidInstanceRequest setAuthorizeUserId(String authorizeUserId) {
        this.authorizeUserId = authorizeUserId;
        return this;
    }
    public String getAuthorizeUserId() {
        return this.authorizeUserId;
    }

    public AuthorizeAndroidInstanceRequest setUnAuthorizeUserId(String unAuthorizeUserId) {
        this.unAuthorizeUserId = unAuthorizeUserId;
        return this;
    }
    public String getUnAuthorizeUserId() {
        return this.unAuthorizeUserId;
    }

}
