// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSecretValueRequest extends TeaModel {
    /**
     * <p>The comment.</p>
     * 
     * <strong>example:</strong>
     * <p>My secret</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The content of the ciphertext.</p>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The name of the ciphertext.</p>
     * 
     * <strong>example:</strong>
     * <p>mysecret</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateSecretValueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretValueRequest self = new CreateSecretValueRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretValueRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateSecretValueRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateSecretValueRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
