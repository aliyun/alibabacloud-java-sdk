// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class GetManagerInfoByAuthCodeResponseBody extends TeaModel {
    /**
     * <p>The organization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678901234****</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>The mobile number.</p>
     * 
     * <strong>example:</strong>
     * <p>1301234****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The team name.</p>
     * 
     * <strong>example:</strong>
     * <p>devteam</p>
     */
    @NameInMap("TeamName")
    public String teamName;

    /**
     * <p>The tenant name.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The ID of the Elastic Desktop Service account.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678901234****</p>
     */
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
