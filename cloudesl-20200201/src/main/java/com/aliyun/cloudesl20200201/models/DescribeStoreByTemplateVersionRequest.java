// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoreByTemplateVersionRequest extends TeaModel {
    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static DescribeStoreByTemplateVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoreByTemplateVersionRequest self = new DescribeStoreByTemplateVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStoreByTemplateVersionRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
