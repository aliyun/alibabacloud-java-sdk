// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataUpdateProjectRequest extends TeaModel {
    // 业务幂等ID，用于防止重复请求，写操作必传
    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    // 更新的项目描述信息
    @NameInMap("ProjectDesc")
    public String projectDesc;

    // 项目ID
    @NameInMap("ProjectId")
    public Long projectId;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 对应数据源，目前仅支持广州三维家，需要新增源需要和接口负责人沟通并添加
    @NameInMap("Source")
    public String source;

    // 用户手机号码
    @NameInMap("UserMobNum")
    public String userMobNum;

    // 用户昵称
    @NameInMap("UserNick")
    public String userNick;

    // 用户会员类型，目前只支持TB淘宝
    @NameInMap("UserType")
    public String userType;

    public static ScanDataUpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanDataUpdateProjectRequest self = new ScanDataUpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public ScanDataUpdateProjectRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ScanDataUpdateProjectRequest setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
        return this;
    }
    public String getProjectDesc() {
        return this.projectDesc;
    }

    public ScanDataUpdateProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ScanDataUpdateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ScanDataUpdateProjectRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ScanDataUpdateProjectRequest setUserMobNum(String userMobNum) {
        this.userMobNum = userMobNum;
        return this;
    }
    public String getUserMobNum() {
        return this.userMobNum;
    }

    public ScanDataUpdateProjectRequest setUserNick(String userNick) {
        this.userNick = userNick;
        return this;
    }
    public String getUserNick() {
        return this.userNick;
    }

    public ScanDataUpdateProjectRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
