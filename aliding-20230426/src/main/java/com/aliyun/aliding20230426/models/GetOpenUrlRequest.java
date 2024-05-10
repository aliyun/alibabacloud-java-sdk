// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOpenUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    @NameInMap("Timeout")
    public Long timeout;

    public static GetOpenUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpenUrlRequest self = new GetOpenUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetOpenUrlRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetOpenUrlRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public GetOpenUrlRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetOpenUrlRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public GetOpenUrlRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
