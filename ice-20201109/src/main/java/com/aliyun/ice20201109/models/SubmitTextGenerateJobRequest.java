// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTextGenerateJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GenerateConfig")
    public String generateConfig;

    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>MarketingCopy</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("UserData")
    public String userData;

    public static SubmitTextGenerateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextGenerateJobRequest self = new SubmitTextGenerateJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTextGenerateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitTextGenerateJobRequest setGenerateConfig(String generateConfig) {
        this.generateConfig = generateConfig;
        return this;
    }
    public String getGenerateConfig() {
        return this.generateConfig;
    }

    public SubmitTextGenerateJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitTextGenerateJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SubmitTextGenerateJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
