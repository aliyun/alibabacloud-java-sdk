// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainGroupListRequest extends TeaModel {
    @NameInMap("DomainGroupName")
    public String domainGroupName;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("OrderByType")
    public String orderByType;

    @NameInMap("OrderKeyType")
    public String orderKeyType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowDeletingGroup")
    public Boolean showDeletingGroup;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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

    public QueryDomainGroupListRequest setOrderByType(String orderByType) {
        this.orderByType = orderByType;
        return this;
    }
    public String getOrderByType() {
        return this.orderByType;
    }

    public QueryDomainGroupListRequest setOrderKeyType(String orderKeyType) {
        this.orderKeyType = orderKeyType;
        return this;
    }
    public String getOrderKeyType() {
        return this.orderKeyType;
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
