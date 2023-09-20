// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class GetManagerInfoByAuthCodeResponseBody extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TeamName")
    public String teamName;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("WaId")
    public Long waId;

    public static GetManagerInfoByAuthCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManagerInfoByAuthCodeResponseBody self = new GetManagerInfoByAuthCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManagerInfoByAuthCodeResponseBody setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetManagerInfoByAuthCodeResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetManagerInfoByAuthCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetManagerInfoByAuthCodeResponseBody setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public GetManagerInfoByAuthCodeResponseBody setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public GetManagerInfoByAuthCodeResponseBody setWaId(Long waId) {
        this.waId = waId;
        return this;
    }
    public Long getWaId() {
        return this.waId;
    }

}
