// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByUserExternalIdRequest extends TeaModel {
    /**
     * <p>The external ID of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx001</p>
     */
    @NameInMap("userExternalId")
    public String userExternalId;

    /**
     * <p>The source ID of the account. If the account was created in IDaaS, its source ID is the ID of the IDaaS instance. If the account was imported, its source ID is the enterprise ID in the source. For example, if the account was imported from DingTalk, its source ID is the corpId value of the enterprise in DingTalk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("userSourceId")
    public String userSourceId;

    /**
     * <p>The source type of the account. Valid values:</p>
     * <ul>
     * <li>build_in: The account was created in Identity as a Service (IDaaS).</li>
     * <li>ding_talk: The account was imported from DingTalk.</li>
     * <li>ad: The account was imported from Microsoft Active Directory (AD).</li>
     * <li>ldap: The account was imported from a Lightweight Directory Access Protocol (LDAP) service.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>build_in</p>
     */
    @NameInMap("userSourceType")
    public String userSourceType;

    public static GetUserIdByUserExternalIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByUserExternalIdRequest self = new GetUserIdByUserExternalIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByUserExternalIdRequest setUserExternalId(String userExternalId) {
        this.userExternalId = userExternalId;
        return this;
    }
    public String getUserExternalId() {
        return this.userExternalId;
    }

    public GetUserIdByUserExternalIdRequest setUserSourceId(String userSourceId) {
        this.userSourceId = userSourceId;
        return this;
    }
    public String getUserSourceId() {
        return this.userSourceId;
    }

    public GetUserIdByUserExternalIdRequest setUserSourceType(String userSourceType) {
        this.userSourceType = userSourceType;
        return this;
    }
    public String getUserSourceType() {
        return this.userSourceType;
    }

}
