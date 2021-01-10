// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteSmsTemplateRequest extends TeaModel {
    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DeleteSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsTemplateRequest self = new DeleteSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmsTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public DeleteSmsTemplateRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
