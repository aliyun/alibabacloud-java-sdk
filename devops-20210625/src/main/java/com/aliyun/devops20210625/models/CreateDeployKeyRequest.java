// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateDeployKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60de7a6852743a5162b5f957</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static CreateDeployKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployKeyRequest self = new CreateDeployKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeployKeyRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateDeployKeyRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateDeployKeyRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateDeployKeyRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
