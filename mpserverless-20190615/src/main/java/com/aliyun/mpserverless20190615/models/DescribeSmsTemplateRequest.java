// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsTemplateRequest extends TeaModel {
    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsTemplateRequest self = new DescribeSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmsTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public DescribeSmsTemplateRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
