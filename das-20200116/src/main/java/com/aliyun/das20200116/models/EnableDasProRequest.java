// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class EnableDasProRequest extends TeaModel {
    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The storage duration of SQL Explorer data. Unit: day. Default value: <strong>30</strong>. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>180</strong></li>
     * <li><strong>365</strong></li>
     * <li><strong>1095</strong></li>
     * <li><strong>1825</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("SqlRetention")
    public Integer sqlRetention;

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

    public static EnableDasProRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDasProRequest self = new EnableDasProRequest();
        return TeaModel.build(map, self);
    }

    public EnableDasProRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableDasProRequest setSqlRetention(Integer sqlRetention) {
        this.sqlRetention = sqlRetention;
        return this;
    }
    public Integer getSqlRetention() {
        return this.sqlRetention;
    }

    public EnableDasProRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
