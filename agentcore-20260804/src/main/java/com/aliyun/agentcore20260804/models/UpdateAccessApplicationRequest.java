// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateAccessApplicationRequest extends TeaModel {
    /**
     * <p>The request body for updating the access application.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateAccessApplicationRequestBody body;

    public static UpdateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessApplicationRequest self = new UpdateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccessApplicationRequest setBody(UpdateAccessApplicationRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccessApplicationRequestBody getBody() {
        return this.body;
    }

    public static class UpdateAccessApplicationRequestBody extends TeaModel {
        /**
         * <p>The name of the access application.</p>
         * 
         * <strong>example:</strong>
         * <p>my-access-application</p>
         */
        @NameInMap("applicationName")
        public String applicationName;

        /**
         * <p>The list of redirect URIs.</p>
         */
        @NameInMap("redirectUris")
        public java.util.List<String> redirectUris;

        public static UpdateAccessApplicationRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateAccessApplicationRequestBody self = new UpdateAccessApplicationRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateAccessApplicationRequestBody setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public UpdateAccessApplicationRequestBody setRedirectUris(java.util.List<String> redirectUris) {
            this.redirectUris = redirectUris;
            return this;
        }
        public java.util.List<String> getRedirectUris() {
            return this.redirectUris;
        }

    }

}
