// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeSmsTemplateStatusRequest extends TeaModel {
    @NameInMap("TemplateCodes")
    public String templateCodes;

    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeSmsTemplateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsTemplateStatusRequest self = new DescribeSmsTemplateStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmsTemplateStatusRequest setTemplateCodes(String templateCodes) {
        this.templateCodes = templateCodes;
        return this;
    }
    public String getTemplateCodes() {
        return this.templateCodes;
    }

    public DescribeSmsTemplateStatusRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
