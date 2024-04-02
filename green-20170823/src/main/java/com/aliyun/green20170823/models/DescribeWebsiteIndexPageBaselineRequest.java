// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteIndexPageBaselineRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeWebsiteIndexPageBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteIndexPageBaselineRequest self = new DescribeWebsiteIndexPageBaselineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteIndexPageBaselineRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeWebsiteIndexPageBaselineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWebsiteIndexPageBaselineRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
