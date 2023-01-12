// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestSampleByInstanceIdRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Role")
    public String role;

    /**
     * <p>SQL ID。</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    @NameInMap("Start")
    public Long start;

    @NameInMap("UserId")
    public String userId;

    public static GetFullRequestSampleByInstanceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFullRequestSampleByInstanceIdRequest self = new GetFullRequestSampleByInstanceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetFullRequestSampleByInstanceIdRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetFullRequestSampleByInstanceIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetFullRequestSampleByInstanceIdRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public GetFullRequestSampleByInstanceIdRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetFullRequestSampleByInstanceIdRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public GetFullRequestSampleByInstanceIdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
