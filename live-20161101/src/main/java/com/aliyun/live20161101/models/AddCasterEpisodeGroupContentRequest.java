// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupContentRequest extends TeaModel {
    @NameInMap("ClientToken")
    @Validation(required = true)
    public String clientToken;

    @NameInMap("Content")
    @Validation(required = true)
    public String content;

    public static AddCasterEpisodeGroupContentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupContentRequest self = new AddCasterEpisodeGroupContentRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupContentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddCasterEpisodeGroupContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
