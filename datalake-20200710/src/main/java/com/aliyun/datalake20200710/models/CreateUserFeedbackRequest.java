// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateUserFeedbackRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Score")
    public String score;

    @NameInMap("Tags")
    public String tags;

    public static CreateUserFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserFeedbackRequest self = new CreateUserFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserFeedbackRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserFeedbackRequest setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public CreateUserFeedbackRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
