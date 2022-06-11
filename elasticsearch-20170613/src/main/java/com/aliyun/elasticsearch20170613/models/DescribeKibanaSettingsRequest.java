// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeKibanaSettingsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static DescribeKibanaSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKibanaSettingsRequest self = new DescribeKibanaSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKibanaSettingsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
