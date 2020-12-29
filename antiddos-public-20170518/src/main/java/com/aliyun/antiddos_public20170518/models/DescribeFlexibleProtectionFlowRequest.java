// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeFlexibleProtectionFlowRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Days")
    public Integer days;

    public static DescribeFlexibleProtectionFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexibleProtectionFlowRequest self = new DescribeFlexibleProtectionFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlexibleProtectionFlowRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeFlexibleProtectionFlowRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFlexibleProtectionFlowRequest setDays(Integer days) {
        this.days = days;
        return this;
    }
    public Integer getDays() {
        return this.days;
    }

}
