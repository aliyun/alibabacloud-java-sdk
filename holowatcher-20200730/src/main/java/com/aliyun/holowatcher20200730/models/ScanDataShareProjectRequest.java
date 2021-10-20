// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataShareProjectRequest extends TeaModel {
    // shareUserDataRequest
    @NameInMap("ShareUserDataRequest")
    public ScanDataShareProjectRequestShareUserDataRequest shareUserDataRequest;

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

    public static ScanDataShareProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanDataShareProjectRequest self = new ScanDataShareProjectRequest();
        return TeaModel.build(map, self);
    }

    public ScanDataShareProjectRequest setShareUserDataRequest(ScanDataShareProjectRequestShareUserDataRequest shareUserDataRequest) {
        this.shareUserDataRequest = shareUserDataRequest;
        return this;
    }
    public ScanDataShareProjectRequestShareUserDataRequest getShareUserDataRequest() {
        return this.shareUserDataRequest;
    }

    public ScanDataShareProjectRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ScanDataShareProjectRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ScanDataShareProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ScanDataShareProjectRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public static class ScanDataShareProjectRequestShareUserDataRequest extends TeaModel {
        // 分享用户的昵称
        @NameInMap("UserNick")
        public String userNick;

        // 分享用户的会员类型，目前只支持淘宝TB
        @NameInMap("UserType")
        public String userType;

        // 分享用户的手机号码
        @NameInMap("UserMobNum")
        public String userMobNum;

        public static ScanDataShareProjectRequestShareUserDataRequest build(java.util.Map<String, ?> map) throws Exception {
            ScanDataShareProjectRequestShareUserDataRequest self = new ScanDataShareProjectRequestShareUserDataRequest();
            return TeaModel.build(map, self);
        }

        public ScanDataShareProjectRequestShareUserDataRequest setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public ScanDataShareProjectRequestShareUserDataRequest setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public ScanDataShareProjectRequestShareUserDataRequest setUserMobNum(String userMobNum) {
            this.userMobNum = userMobNum;
            return this;
        }
        public String getUserMobNum() {
            return this.userMobNum;
        }

    }

}
