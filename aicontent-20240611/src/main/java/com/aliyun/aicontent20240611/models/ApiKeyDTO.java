// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ApiKeyDTO extends TeaModel {
    @NameInMap("client")
    public ClientDTO client;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deleteTag")
    public Integer deleteTag;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>sk-xxx****xxx</p>
     */
    @NameInMap("keyPreview")
    public String keyPreview;

    /**
     * <strong>example:</strong>
     * <p>MyApiKey</p>
     */
    @NameInMap("name")
    public String name;

    public static ApiKeyDTO build(java.util.Map<String, ?> map) throws Exception {
        ApiKeyDTO self = new ApiKeyDTO();
        return TeaModel.build(map, self);
    }

    public ApiKeyDTO setClient(ClientDTO client) {
        this.client = client;
        return this;
    }
    public ClientDTO getClient() {
        return this.client;
    }

    public ApiKeyDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ApiKeyDTO setDeleteTag(Integer deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    public ApiKeyDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ApiKeyDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ApiKeyDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ApiKeyDTO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ApiKeyDTO setKeyPreview(String keyPreview) {
        this.keyPreview = keyPreview;
        return this;
    }
    public String getKeyPreview() {
        return this.keyPreview;
    }

    public ApiKeyDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
