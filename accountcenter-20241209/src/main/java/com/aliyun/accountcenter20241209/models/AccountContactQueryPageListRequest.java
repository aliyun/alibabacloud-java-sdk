// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactQueryPageListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedEcId")
    public String orientedEcId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedLeId")
    public String orientedLeId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedNbId")
    public String orientedNbId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PrivateContact")
    public Boolean privateContact;

    /**
     * <strong>example:</strong>
     * <p>keyword</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SharedContact")
    public Boolean sharedContact;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowCompleteInfo")
    public Boolean showCompleteInfo;

    public static AccountContactQueryPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        AccountContactQueryPageListRequest self = new AccountContactQueryPageListRequest();
        return TeaModel.build(map, self);
    }

    public AccountContactQueryPageListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AccountContactQueryPageListRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public AccountContactQueryPageListRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public AccountContactQueryPageListRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public AccountContactQueryPageListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public AccountContactQueryPageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public AccountContactQueryPageListRequest setPrivateContact(Boolean privateContact) {
        this.privateContact = privateContact;
        return this;
    }
    public Boolean getPrivateContact() {
        return this.privateContact;
    }

    public AccountContactQueryPageListRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public AccountContactQueryPageListRequest setSharedContact(Boolean sharedContact) {
        this.sharedContact = sharedContact;
        return this;
    }
    public Boolean getSharedContact() {
        return this.sharedContact;
    }

    public AccountContactQueryPageListRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

}
