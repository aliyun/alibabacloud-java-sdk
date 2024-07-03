// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetFullRequestSampleByInstanceIdRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time. The interval between the start time and the end time must be equal to or greater than 1 hour.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1660104621000</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The role of the PolarDB-X 2.0 node. Valid values:</p>
     * <ul>
     * <li><strong>polarx_cn</strong>: compute node.</li>
     * <li><strong>polarx_en</strong>: data node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx_cn</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The SQL statement ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>651b56fe9418d48edb8fdf0980ec****</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The start time must be within the storage duration of the SQL Explorer feature of the database instance, and can be up to 90 days earlier than the current time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1660097421000</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
     * <blockquote>
     * <p> This parameter is optional. The system can automatically obtain the account ID based on the value of InstanceId when you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>196278346919****</p>
     */
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
