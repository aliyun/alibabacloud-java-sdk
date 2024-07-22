// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class AddTextFeedbackRequest extends TeaModel {
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quality")
    public Integer quality;

    /**
     * <strong>example:</strong>
     * <p>8478</p>
     */
    @NameInMap("textId")
    public Long textId;

    public static AddTextFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTextFeedbackRequest self = new AddTextFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public AddTextFeedbackRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AddTextFeedbackRequest setQuality(Integer quality) {
        this.quality = quality;
        return this;
    }
    public Integer getQuality() {
        return this.quality;
    }

    public AddTextFeedbackRequest setTextId(Long textId) {
        this.textId = textId;
        return this;
    }
    public Long getTextId() {
        return this.textId;
    }

}
