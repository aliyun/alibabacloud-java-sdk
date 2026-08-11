// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseContactQueryPageListRequest extends TeaModel {
    /**
     * <p>The client application name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The entity ID of the cross-enterprise management object.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedEcId")
    public String orientedEcId;

    /**
     * <p>The currently switched enterprise.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedLeId")
    public String orientedLeId;

    /**
     * <p>The marketplace ID of the cross-enterprise management object.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("OrientedNbId")
    public String orientedNbId;

    /**
     * <p>Page number, default 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>Page size, default 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The flag for querying private contacts. The default value of this parameter is set to false for this API.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrivateContact")
    public Boolean privateContact;

    /**
     * <p>Name, email, or mobile number.</p>
     * 
     * <strong>example:</strong>
     * <p>1xxxxxxxxxx</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Whether it is a shared contact. The default value of this parameter is set to true for this API.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SharedContact")
    public Boolean sharedContact;

    /**
     * <p>Whether to display complete information.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowCompleteInfo")
    public Boolean showCompleteInfo;

    public static EnterpriseContactQueryPageListRequest build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseContactQueryPageListRequest self = new EnterpriseContactQueryPageListRequest();
        return TeaModel.build(map, self);
    }

    public EnterpriseContactQueryPageListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnterpriseContactQueryPageListRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public EnterpriseContactQueryPageListRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public EnterpriseContactQueryPageListRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    public EnterpriseContactQueryPageListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public EnterpriseContactQueryPageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public EnterpriseContactQueryPageListRequest setPrivateContact(Boolean privateContact) {
        this.privateContact = privateContact;
        return this;
    }
    public Boolean getPrivateContact() {
        return this.privateContact;
    }

    public EnterpriseContactQueryPageListRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public EnterpriseContactQueryPageListRequest setSharedContact(Boolean sharedContact) {
        this.sharedContact = sharedContact;
        return this;
    }
    public Boolean getSharedContact() {
        return this.sharedContact;
    }

    public EnterpriseContactQueryPageListRequest setShowCompleteInfo(Boolean showCompleteInfo) {
        this.showCompleteInfo = showCompleteInfo;
        return this;
    }
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

}
