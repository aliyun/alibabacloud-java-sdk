// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupContentRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Content")
    public String content;

    public static AddCasterEpisodeGroupContentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupContentRequest self = new AddCasterEpisodeGroupContentRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupContentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
