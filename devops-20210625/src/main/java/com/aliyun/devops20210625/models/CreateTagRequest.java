// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateTagRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("message")
    public String message;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ref")
    public String ref;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("tagName")
    public String tagName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static CreateTagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTagRequest self = new CreateTagRequest();
        return TeaModel.build(map, self);
    }

    public CreateTagRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateTagRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTagRequest setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public CreateTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public CreateTagRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
