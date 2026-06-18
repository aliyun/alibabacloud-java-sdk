// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateApiKeyRequest extends TeaModel {
    /**
     * <p>The API key permission settings.</p>
     */
    @NameInMap("auth")
    public UpdateApiKeyRequestAuth auth;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>update description.</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyRequest self = new UpdateApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyRequest setAuth(UpdateApiKeyRequestAuth auth) {
        this.auth = auth;
        return this;
    }
    public UpdateApiKeyRequestAuth getAuth() {
        return this.auth;
    }

    public UpdateApiKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public static class UpdateApiKeyRequestAuth extends TeaModel {
        /**
         * <p>The IP access whitelist.</p>
         * <blockquote>
         * <ul>
         * <li>When you set custom permissions and do not specify the IP access whitelist, the server sets the whitelist to IPv4 (0.0.0.0/0) and IPv6 (::/0) by default, which allows all traffic.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("accessIps")
        public java.util.List<String> accessIps;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>All: all permissions.</li>
         * <li>Custom: custom permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateApiKeyRequestAuth build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiKeyRequestAuth self = new UpdateApiKeyRequestAuth();
            return TeaModel.build(map, self);
        }

        public UpdateApiKeyRequestAuth setAccessIps(java.util.List<String> accessIps) {
            this.accessIps = accessIps;
            return this;
        }
        public java.util.List<String> getAccessIps() {
            return this.accessIps;
        }

        public UpdateApiKeyRequestAuth setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
