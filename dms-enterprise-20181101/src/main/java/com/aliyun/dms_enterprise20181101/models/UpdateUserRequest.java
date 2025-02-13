// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The maximum number of queries that can be performed each day.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxExecuteCount")
    public Long maxExecuteCount;

    /**
     * <p>The maximum number of rows that can be queried each day.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxResultCount")
    public Long maxResultCount;

    /**
     * <p>The DingTalk ID or mobile number of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>188xxxxxxxx</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The roles that the user assumes. For more information about the valid values, see the Request parameters section in the <a href="https://help.aliyun.com/document_detail/465812.html">UpdateUser</a> topic.</p>
     * 
     * <strong>example:</strong>
     * <p>ADMIN,DBA</p>
     */
    @NameInMap("RoleNames")
    public String roleNames;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The Alibaba Cloud unique ID (UID) of the user to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("Uid")
    public Long uid;

    @NameInMap("UidString")
    public String uidString;

    /**
     * <p>The nickname of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UserNick")
    public String userNick;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setMaxExecuteCount(Long maxExecuteCount) {
        this.maxExecuteCount = maxExecuteCount;
        return this;
    }
    public Long getMaxExecuteCount() {
        return this.maxExecuteCount;
    }

    public UpdateUserRequest setMaxResultCount(Long maxResultCount) {
        this.maxResultCount = maxResultCount;
        return this;
    }
    public Long getMaxResultCount() {
        return this.maxResultCount;
    }

    public UpdateUserRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UpdateUserRequest setRoleNames(String roleNames) {
        this.roleNames = roleNames;
        return this;
    }
    public String getRoleNames() {
        return this.roleNames;
    }

    public UpdateUserRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateUserRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public UpdateUserRequest setUidString(String uidString) {
        this.uidString = uidString;
        return this;
    }
    public String getUidString() {
        return this.uidString;
    }

    public UpdateUserRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

}
