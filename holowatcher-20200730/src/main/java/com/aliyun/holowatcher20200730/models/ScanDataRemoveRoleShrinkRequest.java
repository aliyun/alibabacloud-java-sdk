// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataRemoveRoleShrinkRequest extends TeaModel {
    // removeUserDataRequest
    @NameInMap("RemoveUserDataRequest")
    public String removeUserDataRequestShrink;

    // 移除角色名称，本次只支持PROJECT_MANAGER
    @NameInMap("RoleName")
    public String roleName;

    // 数据请求来源，目前只支持广州三维家3VJIA
    @NameInMap("Source")
    public String source;

    // 移除角色的项目ID，必须是开放平台图对应source创建的项目
    @NameInMap("ProjectId")
    public Long projectId;

    // 业务幂等编号，用于幂等处理
    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    public static ScanDataRemoveRoleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanDataRemoveRoleShrinkRequest self = new ScanDataRemoveRoleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScanDataRemoveRoleShrinkRequest setRemoveUserDataRequestShrink(String removeUserDataRequestShrink) {
        this.removeUserDataRequestShrink = removeUserDataRequestShrink;
        return this;
    }
    public String getRemoveUserDataRequestShrink() {
        return this.removeUserDataRequestShrink;
    }

    public ScanDataRemoveRoleShrinkRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ScanDataRemoveRoleShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ScanDataRemoveRoleShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ScanDataRemoveRoleShrinkRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

}
