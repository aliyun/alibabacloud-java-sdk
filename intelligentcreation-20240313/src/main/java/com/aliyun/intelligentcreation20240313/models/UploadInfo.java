// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class UploadInfo extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accessId")
    public String accessId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("host")
    public String host;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("policy")
    public String policy;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("policySignature")
    public String policySignature;

    @NameInMap("url")
    public String url;

    public static UploadInfo build(java.util.Map<String, ?> map) throws Exception {
        UploadInfo self = new UploadInfo();
        return TeaModel.build(map, self);
    }

    public UploadInfo setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public UploadInfo setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UploadInfo setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UploadInfo setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public UploadInfo setPolicySignature(String policySignature) {
        this.policySignature = policySignature;
        return this;
    }
    public String getPolicySignature() {
        return this.policySignature;
    }

    public UploadInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
