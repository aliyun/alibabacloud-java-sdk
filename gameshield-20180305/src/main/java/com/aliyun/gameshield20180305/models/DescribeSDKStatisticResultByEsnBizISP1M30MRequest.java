// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizISP1M30MRequest extends TeaModel {
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

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Type")
    public String type;

    public static DescribeSDKStatisticResultByEsnBizISP1M30MRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizISP1M30MRequest self = new DescribeSDKStatisticResultByEsnBizISP1M30MRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MRequest setEsnApp(String esnApp) {
        this.esnApp = esnApp;
        return this;
    }
    public String getEsnApp() {
        return this.esnApp;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MRequest setEsnBiz(String esnBiz) {
        this.esnBiz = esnBiz;
        return this;
    }
    public String getEsnBiz() {
        return this.esnBiz;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
