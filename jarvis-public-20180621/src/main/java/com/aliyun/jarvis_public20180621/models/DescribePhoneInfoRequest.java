// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribePhoneInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("phoneNum")
    public String phoneNum;

    @NameInMap("sourceCode")
    public String sourceCode;

    public static DescribePhoneInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneInfoRequest self = new DescribePhoneInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePhoneInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribePhoneInfoRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public DescribePhoneInfoRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

}
