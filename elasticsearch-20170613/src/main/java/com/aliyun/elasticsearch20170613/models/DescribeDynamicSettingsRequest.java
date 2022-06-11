// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDynamicSettingsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeDynamicSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicSettingsRequest self = new DescribeDynamicSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicSettingsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
