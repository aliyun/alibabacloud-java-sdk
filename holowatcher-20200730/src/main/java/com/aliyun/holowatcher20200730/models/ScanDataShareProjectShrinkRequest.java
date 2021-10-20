// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataShareProjectShrinkRequest extends TeaModel {
    // shareUserDataRequest
    @NameInMap("ShareUserDataRequest")
    public String shareUserDataRequestShrink;

    // 权限角色名，目前只支持项目管理员（PROJECT_MANAGER）
    @NameInMap("RoleName")
    public String roleName;

    // 对应数据源，目前仅支持广州三维家，需要新增源需要和接口负责人沟通并添加
    @NameInMap("Source")
    public String source;

    // 需要分享的项目ID
    @NameInMap("ProjectId")
    public Long projectId;

    // 业务幂等ID，用于防止重复请求，写操作必传
    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    public static ScanDataShareProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanDataShareProjectShrinkRequest self = new ScanDataShareProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ScanDataShareProjectShrinkRequest setShareUserDataRequestShrink(String shareUserDataRequestShrink) {
        this.shareUserDataRequestShrink = shareUserDataRequestShrink;
        return this;
    }
    public String getShareUserDataRequestShrink() {
        return this.shareUserDataRequestShrink;
    }

    public ScanDataShareProjectShrinkRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ScanDataShareProjectShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ScanDataShareProjectShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ScanDataShareProjectShrinkRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

}
