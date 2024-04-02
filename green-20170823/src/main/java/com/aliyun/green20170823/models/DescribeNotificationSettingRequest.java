// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeNotificationSettingRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeNotificationSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotificationSettingRequest self = new DescribeNotificationSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNotificationSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNotificationSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
