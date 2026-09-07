// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class GetUsersCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GroupCount")
    public Integer groupCount;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("MaxUserNumber")
    public Integer maxUserNumber;

    /**
     * <strong>example:</strong>
     * <p>278</p>
     */
    @NameInMap("OrgCount")
    public Integer orgCount;

    /**
     * <strong>example:</strong>
     * <p>9677D40F-0040-5956-A0EB-11B8B88****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("UserCount")
    public Integer userCount;

    public static GetUsersCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUsersCountResponseBody self = new GetUsersCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUsersCountResponseBody setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }
    public Integer getGroupCount() {
        return this.groupCount;
    }

    public GetUsersCountResponseBody setMaxUserNumber(Integer maxUserNumber) {
        this.maxUserNumber = maxUserNumber;
        return this;
    }
    public Integer getMaxUserNumber() {
        return this.maxUserNumber;
    }

    public GetUsersCountResponseBody setOrgCount(Integer orgCount) {
        this.orgCount = orgCount;
        return this;
    }
    public Integer getOrgCount() {
        return this.orgCount;
    }

    public GetUsersCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUsersCountResponseBody setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

}
