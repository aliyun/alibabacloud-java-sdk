// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("active")
    public Boolean active;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("admin")
    public Boolean admin;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("avatar")
    public String avatar;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("boss")
    public Boolean boss;

    /**
     * <strong>example:</strong>
     * <p>[2,3,4]</p>
     */
    @NameInMap("deptIdList")
    public java.util.List<Long> deptIdList;

    @NameInMap("deptOrderList")
    public java.util.List<GetUserResponseBodyDeptOrderList> deptOrderList;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@xxx.com">test@xxx.com</a></p>
     */
    @NameInMap("email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("exclusiveAccount")
    public Boolean exclusiveAccount;

    /**
     * <strong>example:</strong>
     * <p>dingxxx</p>
     */
    @NameInMap("exclusiveAccountCorpId")
    public String exclusiveAccountCorpId;

    /**
     * <strong>example:</strong>
     * <p>组织名称</p>
     */
    @NameInMap("exclusiveAccountCorpName")
    public String exclusiveAccountCorpName;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("exclusiveAccountType")
    public String exclusiveAccountType;

    /**
     * <strong>example:</strong>
     * <p>{&quot;爱好&quot;:&quot;旅游&quot;,&quot;年龄&quot;:&quot;24&quot;}</p>
     */
    @NameInMap("extension")
    public String extension;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("hideMobile")
    public Boolean hideMobile;

    /**
     * <strong>example:</strong>
     * <p>1597573616828</p>
     */
    @NameInMap("hiredDate")
    public Long hiredDate;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("jobNumber")
    public String jobNumber;

    @NameInMap("leaderInDept")
    public java.util.List<GetUserResponseBodyLeaderInDept> leaderInDept;

    /**
     * <strong>example:</strong>
     * <p>login_id3</p>
     */
    @NameInMap("loginId")
    public String loginId;

    /**
     * <strong>example:</strong>
     * <p>manager240</p>
     */
    @NameInMap("managerUserid")
    public String managerUserid;

    /**
     * <strong>example:</strong>
     * <p>18513027676</p>
     */
    @NameInMap("mobile")
    public String mobile;

    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>昵称</p>
     */
    @NameInMap("nickname")
    public String nickname;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@xxx.com">test@xxx.com</a></p>
     */
    @NameInMap("orgEmail")
    public String orgEmail;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("realAuthed")
    public Boolean realAuthed;

    /**
     * <strong>example:</strong>
     * <p>备注备注</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("roleList")
    public java.util.List<GetUserResponseBodyRoleList> roleList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("senior")
    public Boolean senior;

    /**
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("stateCode")
    public String stateCode;

    /**
     * <strong>example:</strong>
     * <p>010-86123456-2345</p>
     */
    @NameInMap("telephone")
    public String telephone;

    /**
     * <strong>example:</strong>
     * <p>技术总监</p>
     */
    @NameInMap("title")
    public String title;

    @NameInMap("unionEmpExt")
    public GetUserResponseBodyUnionEmpExt unionEmpExt;

    /**
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("userid")
    public String userid;

    /**
     * <strong>example:</strong>
     * <p>未来park</p>
     */
    @NameInMap("workPlace")
    public String workPlace;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public GetUserResponseBody setAdmin(Boolean admin) {
        this.admin = admin;
        return this;
    }
    public Boolean getAdmin() {
        return this.admin;
    }

    public GetUserResponseBody setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public GetUserResponseBody setBoss(Boolean boss) {
        this.boss = boss;
        return this;
    }
    public Boolean getBoss() {
        return this.boss;
    }

    public GetUserResponseBody setDeptIdList(java.util.List<Long> deptIdList) {
        this.deptIdList = deptIdList;
        return this;
    }
    public java.util.List<Long> getDeptIdList() {
        return this.deptIdList;
    }

    public GetUserResponseBody setDeptOrderList(java.util.List<GetUserResponseBodyDeptOrderList> deptOrderList) {
        this.deptOrderList = deptOrderList;
        return this;
    }
    public java.util.List<GetUserResponseBodyDeptOrderList> getDeptOrderList() {
        return this.deptOrderList;
    }

    public GetUserResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetUserResponseBody setExclusiveAccount(Boolean exclusiveAccount) {
        this.exclusiveAccount = exclusiveAccount;
        return this;
    }
    public Boolean getExclusiveAccount() {
        return this.exclusiveAccount;
    }

    public GetUserResponseBody setExclusiveAccountCorpId(String exclusiveAccountCorpId) {
        this.exclusiveAccountCorpId = exclusiveAccountCorpId;
        return this;
    }
    public String getExclusiveAccountCorpId() {
        return this.exclusiveAccountCorpId;
    }

    public GetUserResponseBody setExclusiveAccountCorpName(String exclusiveAccountCorpName) {
        this.exclusiveAccountCorpName = exclusiveAccountCorpName;
        return this;
    }
    public String getExclusiveAccountCorpName() {
        return this.exclusiveAccountCorpName;
    }

    public GetUserResponseBody setExclusiveAccountType(String exclusiveAccountType) {
        this.exclusiveAccountType = exclusiveAccountType;
        return this;
    }
    public String getExclusiveAccountType() {
        return this.exclusiveAccountType;
    }

    public GetUserResponseBody setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public GetUserResponseBody setHideMobile(Boolean hideMobile) {
        this.hideMobile = hideMobile;
        return this;
    }
    public Boolean getHideMobile() {
        return this.hideMobile;
    }

    public GetUserResponseBody setHiredDate(Long hiredDate) {
        this.hiredDate = hiredDate;
        return this;
    }
    public Long getHiredDate() {
        return this.hiredDate;
    }

    public GetUserResponseBody setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
        return this;
    }
    public String getJobNumber() {
        return this.jobNumber;
    }

    public GetUserResponseBody setLeaderInDept(java.util.List<GetUserResponseBodyLeaderInDept> leaderInDept) {
        this.leaderInDept = leaderInDept;
        return this;
    }
    public java.util.List<GetUserResponseBodyLeaderInDept> getLeaderInDept() {
        return this.leaderInDept;
    }

    public GetUserResponseBody setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public GetUserResponseBody setManagerUserid(String managerUserid) {
        this.managerUserid = managerUserid;
        return this;
    }
    public String getManagerUserid() {
        return this.managerUserid;
    }

    public GetUserResponseBody setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public GetUserResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetUserResponseBody setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public GetUserResponseBody setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
        return this;
    }
    public String getOrgEmail() {
        return this.orgEmail;
    }

    public GetUserResponseBody setRealAuthed(Boolean realAuthed) {
        this.realAuthed = realAuthed;
        return this;
    }
    public Boolean getRealAuthed() {
        return this.realAuthed;
    }

    public GetUserResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setRoleList(java.util.List<GetUserResponseBodyRoleList> roleList) {
        this.roleList = roleList;
        return this;
    }
    public java.util.List<GetUserResponseBodyRoleList> getRoleList() {
        return this.roleList;
    }

    public GetUserResponseBody setSenior(Boolean senior) {
        this.senior = senior;
        return this;
    }
    public Boolean getSenior() {
        return this.senior;
    }

    public GetUserResponseBody setStateCode(String stateCode) {
        this.stateCode = stateCode;
        return this;
    }
    public String getStateCode() {
        return this.stateCode;
    }

    public GetUserResponseBody setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public GetUserResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetUserResponseBody setUnionEmpExt(GetUserResponseBodyUnionEmpExt unionEmpExt) {
        this.unionEmpExt = unionEmpExt;
        return this;
    }
    public GetUserResponseBodyUnionEmpExt getUnionEmpExt() {
        return this.unionEmpExt;
    }

    public GetUserResponseBody setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

    public GetUserResponseBody setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
        return this;
    }
    public String getWorkPlace() {
        return this.workPlace;
    }

    public static class GetUserResponseBodyDeptOrderList extends TeaModel {
        @NameInMap("deptId")
        public Long deptId;

        @NameInMap("order")
        public Long order;

        public static GetUserResponseBodyDeptOrderList build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyDeptOrderList self = new GetUserResponseBodyDeptOrderList();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyDeptOrderList setDeptId(Long deptId) {
            this.deptId = deptId;
            return this;
        }
        public Long getDeptId() {
            return this.deptId;
        }

        public GetUserResponseBodyDeptOrderList setOrder(Long order) {
            this.order = order;
            return this;
        }
        public Long getOrder() {
            return this.order;
        }

    }

    public static class GetUserResponseBodyLeaderInDept extends TeaModel {
        @NameInMap("deptId")
        public Long deptId;

        @NameInMap("leader")
        public Boolean leader;

        public static GetUserResponseBodyLeaderInDept build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyLeaderInDept self = new GetUserResponseBodyLeaderInDept();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyLeaderInDept setDeptId(Long deptId) {
            this.deptId = deptId;
            return this;
        }
        public Long getDeptId() {
            return this.deptId;
        }

        public GetUserResponseBodyLeaderInDept setLeader(Boolean leader) {
            this.leader = leader;
            return this;
        }
        public Boolean getLeader() {
            return this.leader;
        }

    }

    public static class GetUserResponseBodyRoleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>职务</p>
         */
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("name")
        public String name;

        public static GetUserResponseBodyRoleList build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyRoleList self = new GetUserResponseBodyRoleList();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyRoleList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetUserResponseBodyRoleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserResponseBodyRoleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetUserResponseBodyUnionEmpExtUnionEmpMapList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dingxxx</p>
         */
        @NameInMap("cropId")
        public String cropId;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("userid")
        public String userid;

        public static GetUserResponseBodyUnionEmpExtUnionEmpMapList build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUnionEmpExtUnionEmpMapList self = new GetUserResponseBodyUnionEmpExtUnionEmpMapList();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUnionEmpExtUnionEmpMapList setCropId(String cropId) {
            this.cropId = cropId;
            return this;
        }
        public String getCropId() {
            return this.cropId;
        }

        public GetUserResponseBodyUnionEmpExtUnionEmpMapList setUserid(String userid) {
            this.userid = userid;
            return this;
        }
        public String getUserid() {
            return this.userid;
        }

    }

    public static class GetUserResponseBodyUnionEmpExt extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dingxxx</p>
         */
        @NameInMap("corpId")
        public String corpId;

        @NameInMap("unionEmpMapList")
        public java.util.List<GetUserResponseBodyUnionEmpExtUnionEmpMapList> unionEmpMapList;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("userid")
        public String userid;

        public static GetUserResponseBodyUnionEmpExt build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUnionEmpExt self = new GetUserResponseBodyUnionEmpExt();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUnionEmpExt setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public GetUserResponseBodyUnionEmpExt setUnionEmpMapList(java.util.List<GetUserResponseBodyUnionEmpExtUnionEmpMapList> unionEmpMapList) {
            this.unionEmpMapList = unionEmpMapList;
            return this;
        }
        public java.util.List<GetUserResponseBodyUnionEmpExtUnionEmpMapList> getUnionEmpMapList() {
            return this.unionEmpMapList;
        }

        public GetUserResponseBodyUnionEmpExt setUserid(String userid) {
            this.userid = userid;
            return this;
        }
        public String getUserid() {
            return this.userid;
        }

    }

}
