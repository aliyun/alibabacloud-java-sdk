// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class RequestUploadTokenRequest extends TeaModel {
    /**
     * <p>appKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24780725</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("Os")
    public String os;

    public static RequestUploadTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestUploadTokenRequest self = new RequestUploadTokenRequest();
        return TeaModel.build(map, self);
    }

    public RequestUploadTokenRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public RequestUploadTokenRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

}
