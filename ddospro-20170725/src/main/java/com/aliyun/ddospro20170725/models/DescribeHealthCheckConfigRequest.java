// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckConfigRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Ip")
    public String ip;

    public static DescribeHealthCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckConfigRequest self = new DescribeHealthCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeHealthCheckConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeHealthCheckConfigRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
