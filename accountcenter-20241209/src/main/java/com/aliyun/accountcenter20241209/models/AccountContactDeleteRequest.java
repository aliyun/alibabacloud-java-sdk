// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class AccountContactDeleteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

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

    public static AccountContactDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        AccountContactDeleteRequest self = new AccountContactDeleteRequest();
        return TeaModel.build(map, self);
    }

    public AccountContactDeleteRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AccountContactDeleteRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public AccountContactDeleteRequest setOrientedEcId(String orientedEcId) {
        this.orientedEcId = orientedEcId;
        return this;
    }
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    public AccountContactDeleteRequest setOrientedLeId(String orientedLeId) {
        this.orientedLeId = orientedLeId;
        return this;
    }
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    public AccountContactDeleteRequest setOrientedNbId(String orientedNbId) {
        this.orientedNbId = orientedNbId;
        return this;
    }
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

}
