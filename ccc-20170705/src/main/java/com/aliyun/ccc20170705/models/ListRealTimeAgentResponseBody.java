// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRealTimeAgentResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ListRealTimeAgentResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListRealTimeAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRealTimeAgentResponseBody self = new ListRealTimeAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRealTimeAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRealTimeAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRealTimeAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRealTimeAgentResponseBody setData(ListRealTimeAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRealTimeAgentResponseBodyData getData() {
        return this.data;
    }

    public ListRealTimeAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRealTimeAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill extends TeaModel {
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SkillGroupDescription")
        public String skillGroupDescription;

        public static ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill build(java.util.Map<String, ?> map) throws Exception {
            ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill self = new ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill();
            return TeaModel.build(map, self);
        }

        public ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill setSkillGroupDescription(String skillGroupDescription) {
            this.skillGroupDescription = skillGroupDescription;
            return this;
        }
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

    }

    public static class ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel extends TeaModel {
        @NameInMap("Skill")
        public ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill skill;

        @NameInMap("SkillLevelId")
        public String skillLevelId;

        @NameInMap("Level")
        public Integer level;

        public static ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel build(java.util.Map<String, ?> map) throws Exception {
            ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel self = new ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel();
            return TeaModel.build(map, self);
        }

        public ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel setSkill(ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill skill) {
            this.skill = skill;
            return this;
        }
        public ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevelSkill getSkill() {
            return this.skill;
        }

        public ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel setSkillLevelId(String skillLevelId) {
            this.skillLevelId = skillLevelId;
            return this;
        }
        public String getSkillLevelId() {
            return this.skillLevelId;
        }

        public ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

    }

    public static class ListRealTimeAgentResponseBodyDataUserSkillLevels extends TeaModel {
        @NameInMap("SkillLevel")
        public java.util.List<ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel> skillLevel;

        public static ListRealTimeAgentResponseBodyDataUserSkillLevels build(java.util.Map<String, ?> map) throws Exception {
            ListRealTimeAgentResponseBodyDataUserSkillLevels self = new ListRealTimeAgentResponseBodyDataUserSkillLevels();
            return TeaModel.build(map, self);
        }

        public ListRealTimeAgentResponseBodyDataUserSkillLevels setSkillLevel(java.util.List<ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel> skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public java.util.List<ListRealTimeAgentResponseBodyDataUserSkillLevelsSkillLevel> getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class ListRealTimeAgentResponseBodyDataUser extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("StateDesc")
        public String stateDesc;

        @NameInMap("SkillLevels")
        public ListRealTimeAgentResponseBodyDataUserSkillLevels skillLevels;

        @NameInMap("Dn")
        public String dn;

        @NameInMap("State")
        public String state;

        @NameInMap("RamId")
        public String ramId;

        @NameInMap("Phone")
        public String phone;

        public static ListRealTimeAgentResponseBodyDataUser build(java.util.Map<String, ?> map) throws Exception {
            ListRealTimeAgentResponseBodyDataUser self = new ListRealTimeAgentResponseBodyDataUser();
            return TeaModel.build(map, self);
        }

        public ListRealTimeAgentResponseBodyDataUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListRealTimeAgentResponseBodyDataUser setStateDesc(String stateDesc) {
            this.stateDesc = stateDesc;
            return this;
        }
        public String getStateDesc() {
            return this.stateDesc;
        }

        public ListRealTimeAgentResponseBodyDataUser setSkillLevels(ListRealTimeAgentResponseBodyDataUserSkillLevels skillLevels) {
            this.skillLevels = skillLevels;
            return this;
        }
        public ListRealTimeAgentResponseBodyDataUserSkillLevels getSkillLevels() {
            return this.skillLevels;
        }

        public ListRealTimeAgentResponseBodyDataUser setDn(String dn) {
            this.dn = dn;
            return this;
        }
        public String getDn() {
            return this.dn;
        }

        public ListRealTimeAgentResponseBodyDataUser setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRealTimeAgentResponseBodyDataUser setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public ListRealTimeAgentResponseBodyDataUser setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class ListRealTimeAgentResponseBodyData extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListRealTimeAgentResponseBodyDataUser> user;

        public static ListRealTimeAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRealTimeAgentResponseBodyData self = new ListRealTimeAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRealTimeAgentResponseBodyData setUser(java.util.List<ListRealTimeAgentResponseBodyDataUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListRealTimeAgentResponseBodyDataUser> getUser() {
            return this.user;
        }

    }

}
