// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainGroupListRequest extends TeaModel {
    @NameInMap("DomainGroupName")
    public String domainGroupName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ShowDeletingGroup")
    public Boolean showDeletingGroup;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryDomainGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainGroupListRequest self = new QueryDomainGroupListRequest();
        return TeaModel.build(map, self);
    }

    public QueryDomainGroupListRequest setDomainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
        return this;
    }
    public String getDomainGroupName() {
        return this.domainGroupName;
    }

    public QueryDomainGroupListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryDomainGroupListRequest setShowDeletingGroup(Boolean showDeletingGroup) {
        this.showDeletingGroup = showDeletingGroup;
        return this;
    }
    public Boolean getShowDeletingGroup() {
        return this.showDeletingGroup;
    }

    public QueryDomainGroupListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
