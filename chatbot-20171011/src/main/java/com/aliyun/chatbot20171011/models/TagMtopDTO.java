// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class TagMtopDTO extends TeaModel {
    @NameInMap("UserSayId")
    public String userSayId;

    @NameInMap("Value")
    public String value;

    public static TagMtopDTO build(java.util.Map<String, ?> map) throws Exception {
        TagMtopDTO self = new TagMtopDTO();
        return TeaModel.build(map, self);
    }

    public TagMtopDTO setUserSayId(String userSayId) {
        this.userSayId = userSayId;
        return this;
    }
    public String getUserSayId() {
        return this.userSayId;
    }

    public TagMtopDTO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
