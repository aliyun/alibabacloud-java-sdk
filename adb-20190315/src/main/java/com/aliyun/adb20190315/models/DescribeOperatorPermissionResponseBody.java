// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeOperatorPermissionResponseBody extends TeaModel {
    /**
     * <p>The time when the authorization takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-20T05:41:19Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The time when the authorization expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-20T07:41:19Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The type of authorization. Valid values: Control | Data.</p>
     * 
     * <strong>example:</strong>
     * <p>Control,Data</p>
     */
    @NameInMap("Privileges")
    public String privileges;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOperatorPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorPermissionResponseBody self = new DescribeOperatorPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorPermissionResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeOperatorPermissionResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeOperatorPermissionResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeOperatorPermissionResponseBody setPrivileges(String privileges) {
        this.privileges = privileges;
        return this;
    }
    public String getPrivileges() {
        return this.privileges;
    }

    public DescribeOperatorPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
