// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizProvince30MRequest extends TeaModel {
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

    public static DescribeSDKStatisticResultByEsnBizProvince30MRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizProvince30MRequest self = new DescribeSDKStatisticResultByEsnBizProvince30MRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MRequest setEsnApp(String esnApp) {
        this.esnApp = esnApp;
        return this;
    }
    public String getEsnApp() {
        return this.esnApp;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MRequest setEsnBiz(String esnBiz) {
        this.esnBiz = esnBiz;
        return this;
    }
    public String getEsnBiz() {
        return this.esnBiz;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MRequest setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
