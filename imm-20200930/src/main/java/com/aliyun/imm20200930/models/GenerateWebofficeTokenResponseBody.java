// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateWebofficeTokenResponseBody extends TeaModel {
    /**
     * <p>The Weboffice access credential.</p>
     * 
     * <strong>example:</strong>
     * <p>2d73dd5d87524c5e8a194c3eb5********</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The expiration time of the access credential. The credential expires in 30 minutes. Format: YYYY-MM-DDTHH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-30T13:13:11.347146982Z</p>
     */
    @NameInMap("AccessTokenExpiredTime")
    public String accessTokenExpiredTime;

    /**
     * <p>The Weboffice refresh credential.</p>
     * 
     * <strong>example:</strong>
     * <p>e374995ec532432bb678074d36********</p>
     */
    @NameInMap("RefreshToken")
    public String refreshToken;

    /**
     * <p>The expiration time of the refresh credential. The credential expires in 1 day. Format: YYYY-MM-DDTHH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-31T12:43:11.347146982Z</p>
     */
    @NameInMap("RefreshTokenExpiredTime")
    public String refreshTokenExpiredTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1759315A-CB33-0A75-A72B-62D7********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Weboffice entry URL for previewing or editing documents online.</p>
     * <blockquote>
     * <p>This URL cannot be opened directly in a browser. You must use it together with the Weboffice JS-SDK and the access credential (AccessToken) to preview or edit documents. For more information, see <a href="https://help.aliyun.com/document_detail/468066.html">Getting Started</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://office-cn-shanghai.imm.aliyuncs.com/office/s/dd221b2cdb44fb66e9070d1d70a8b9bbb6d6fff7?_w_tokentype=1">https://office-cn-shanghai.imm.aliyuncs.com/office/s/dd221b2cdb44fb66e9070d1d70a8b9bbb6d6fff7?_w_tokentype=1</a></p>
     */
    @NameInMap("WebofficeURL")
    public String webofficeURL;

    public static GenerateWebofficeTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateWebofficeTokenResponseBody self = new GenerateWebofficeTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateWebofficeTokenResponseBody setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GenerateWebofficeTokenResponseBody setAccessTokenExpiredTime(String accessTokenExpiredTime) {
        this.accessTokenExpiredTime = accessTokenExpiredTime;
        return this;
    }
    public String getAccessTokenExpiredTime() {
        return this.accessTokenExpiredTime;
    }

    public GenerateWebofficeTokenResponseBody setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

    public GenerateWebofficeTokenResponseBody setRefreshTokenExpiredTime(String refreshTokenExpiredTime) {
        this.refreshTokenExpiredTime = refreshTokenExpiredTime;
        return this;
    }
    public String getRefreshTokenExpiredTime() {
        return this.refreshTokenExpiredTime;
    }

    public GenerateWebofficeTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateWebofficeTokenResponseBody setWebofficeURL(String webofficeURL) {
        this.webofficeURL = webofficeURL;
        return this;
    }
    public String getWebofficeURL() {
        return this.webofficeURL;
    }

}
