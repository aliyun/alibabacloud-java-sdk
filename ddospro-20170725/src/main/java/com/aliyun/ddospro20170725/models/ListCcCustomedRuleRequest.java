// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ListCcCustomedRuleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    public static ListCcCustomedRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCcCustomedRuleRequest self = new ListCcCustomedRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListCcCustomedRuleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ListCcCustomedRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCcCustomedRuleRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListCcCustomedRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCcCustomedRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
