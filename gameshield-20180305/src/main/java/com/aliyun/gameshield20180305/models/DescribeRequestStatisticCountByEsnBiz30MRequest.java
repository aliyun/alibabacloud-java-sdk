// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeRequestStatisticCountByEsnBiz30MRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EsnApp")
    public String esnApp;

    @NameInMap("EsnBiz")
    public String esnBiz;

    @NameInMap("Time")
    public Long time;

    public static DescribeRequestStatisticCountByEsnBiz30MRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestStatisticCountByEsnBiz30MRequest self = new DescribeRequestStatisticCountByEsnBiz30MRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRequestStatisticCountByEsnBiz30MRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeRequestStatisticCountByEsnBiz30MRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRequestStatisticCountByEsnBiz30MRequest setEsnApp(String esnApp) {
        this.esnApp = esnApp;
        return this;
    }
    public String getEsnApp() {
        return this.esnApp;
    }

    public DescribeRequestStatisticCountByEsnBiz30MRequest setEsnBiz(String esnBiz) {
        this.esnBiz = esnBiz;
        return this;
    }
    public String getEsnBiz() {
        return this.esnBiz;
    }

    public DescribeRequestStatisticCountByEsnBiz30MRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}
