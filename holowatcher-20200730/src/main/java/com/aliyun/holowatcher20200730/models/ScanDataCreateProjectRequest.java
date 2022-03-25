// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataCreateProjectRequest extends TeaModel {
    // 业务幂等编号
    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    // createScanUserDataRequest
    @NameInMap("CreateScanUserDataRequest")
    public ScanDataCreateProjectRequestCreateScanUserDataRequest createScanUserDataRequest;

    // 项目描述
    @NameInMap("ProjectDesc")
    public String projectDesc;

    // 单个人下不允许出现相同项目名
    @NameInMap("ProjectName")
    public String projectName;

    // 目前只支持3VJIA
    @NameInMap("Source")
    public String source;

    public static ScanDataCreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanDataCreateProjectRequest self = new ScanDataCreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public ScanDataCreateProjectRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ScanDataCreateProjectRequest setCreateScanUserDataRequest(ScanDataCreateProjectRequestCreateScanUserDataRequest createScanUserDataRequest) {
        this.createScanUserDataRequest = createScanUserDataRequest;
        return this;
    }
    public ScanDataCreateProjectRequestCreateScanUserDataRequest getCreateScanUserDataRequest() {
        return this.createScanUserDataRequest;
    }

    public ScanDataCreateProjectRequest setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
        return this;
    }
    public String getProjectDesc() {
        return this.projectDesc;
    }

    public ScanDataCreateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ScanDataCreateProjectRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public static class ScanDataCreateProjectRequestCreateScanUserDataRequest extends TeaModel {
        // 会员类型对应的手机号码
        @NameInMap("UserMobNum")
        public String userMobNum;

        // 会员类型对应的昵称
        @NameInMap("UserNick")
        public String userNick;

        // 目前只支持TB一种类型
        @NameInMap("UserType")
        public String userType;

        public static ScanDataCreateProjectRequestCreateScanUserDataRequest build(java.util.Map<String, ?> map) throws Exception {
            ScanDataCreateProjectRequestCreateScanUserDataRequest self = new ScanDataCreateProjectRequestCreateScanUserDataRequest();
            return TeaModel.build(map, self);
        }

        public ScanDataCreateProjectRequestCreateScanUserDataRequest setUserMobNum(String userMobNum) {
            this.userMobNum = userMobNum;
            return this;
        }
        public String getUserMobNum() {
            return this.userMobNum;
        }

        public ScanDataCreateProjectRequestCreateScanUserDataRequest setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

        public ScanDataCreateProjectRequestCreateScanUserDataRequest setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
