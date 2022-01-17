// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class CreateCommodityRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Content")
    public String content;

    public static CreateCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommodityRequest self = new CreateCommodityRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommodityRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateCommodityRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
