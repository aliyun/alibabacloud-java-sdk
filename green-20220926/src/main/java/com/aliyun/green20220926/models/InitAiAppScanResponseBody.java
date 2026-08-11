// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class InitAiAppScanResponseBody extends TeaModel {
    /**
     * <p>The access entry information.</p>
     */
    @NameInMap("AuthInfo")
    public InitAiAppScanResponseBodyAuthInfo authInfo;

    /**
     * <p>The access information.</p>
     */
    @NameInMap("AuthInfoConfig")
    public java.util.Map<String, AuthInfoConfigValue> authInfoConfig;

    /**
     * <p>The authorization status.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("AuthStatus")
    public String authStatus;

    /**
     * <p>The service activation status.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("OpenStatus")
    public String openStatus;

    /**
     * <p>The ready status.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ReadyStatus")
    public String readyStatus;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. Used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitAiAppScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitAiAppScanResponseBody self = new InitAiAppScanResponseBody();
        return TeaModel.build(map, self);
    }

    public InitAiAppScanResponseBody setAuthInfo(InitAiAppScanResponseBodyAuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public InitAiAppScanResponseBodyAuthInfo getAuthInfo() {
        return this.authInfo;
    }

    public InitAiAppScanResponseBody setAuthInfoConfig(java.util.Map<String, AuthInfoConfigValue> authInfoConfig) {
        this.authInfoConfig = authInfoConfig;
        return this;
    }
    public java.util.Map<String, AuthInfoConfigValue> getAuthInfoConfig() {
        return this.authInfoConfig;
    }

    public InitAiAppScanResponseBody setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public String getAuthStatus() {
        return this.authStatus;
    }

    public InitAiAppScanResponseBody setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public String getOpenStatus() {
        return this.openStatus;
    }

    public InitAiAppScanResponseBody setReadyStatus(String readyStatus) {
        this.readyStatus = readyStatus;
        return this;
    }
    public String getReadyStatus() {
        return this.readyStatus;
    }

    public InitAiAppScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InitAiAppScanResponseBodyAuthInfo extends TeaModel {
        /**
         * <p>The credential.</p>
         * 
         * <strong>example:</strong>
         * <p>token-xxx</p>
         */
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>The private domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
        @NameInMap("PrivateDomain")
        public String privateDomain;

        /**
         * <p>The project space.</p>
         * 
         * <strong>example:</strong>
         * <p>proj-xxx</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The public domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
        @NameInMap("PublicDomain")
        public String publicDomain;

        public static InitAiAppScanResponseBodyAuthInfo build(java.util.Map<String, ?> map) throws Exception {
            InitAiAppScanResponseBodyAuthInfo self = new InitAiAppScanResponseBodyAuthInfo();
            return TeaModel.build(map, self);
        }

        public InitAiAppScanResponseBodyAuthInfo setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public InitAiAppScanResponseBodyAuthInfo setPrivateDomain(String privateDomain) {
            this.privateDomain = privateDomain;
            return this;
        }
        public String getPrivateDomain() {
            return this.privateDomain;
        }

        public InitAiAppScanResponseBodyAuthInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public InitAiAppScanResponseBodyAuthInfo setPublicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }
        public String getPublicDomain() {
            return this.publicDomain;
        }

    }

}
