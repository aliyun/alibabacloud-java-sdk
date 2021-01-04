// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeBackSourceCidrRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Line")
    public String line;

    @NameInMap("Region")
    public String region;

    public static DescribeBackSourceCidrRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackSourceCidrRequest self = new DescribeBackSourceCidrRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackSourceCidrRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeBackSourceCidrRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeBackSourceCidrRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public DescribeBackSourceCidrRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
