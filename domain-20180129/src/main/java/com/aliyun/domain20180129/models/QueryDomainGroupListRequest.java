// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainGroupListRequest extends TeaModel {
    /**
     * <p>The user-defined domain group name.</p>
     * 
     * <strong>example:</strong>
     * <p>默认分组</p>
     */
    @NameInMap("DomainGroupName")
    public String domainGroupName;

    /**
     * <p>The language of error messages in the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * <p>The default value is <strong>en</strong>.</p>
     * 
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
     * <p>Specifies whether to show domain groups that are being deleted. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong></p>
     * </li>
     * <li><p><strong>true</strong></p>
     * </li>
     * </ul>
     * <p>The default value is <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowDeletingGroup")
    public Boolean showDeletingGroup;

    /**
     * <p>The client IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
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
