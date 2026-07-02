// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetSkillResponseBody extends TeaModel {
    /**
     * <p>The time when the Skill was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Locales")
    public java.util.List<GetSkillResponseBodyLocales> locales;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Skill description.</p>
     * 
     * <strong>example:</strong>
     * <p>11111111</p>
     */
    @NameInMap("SkillDescription")
    public String skillDescription;

    @NameInMap("SkillDisplayName")
    public String skillDisplayName;

    /**
     * <p>Skill ID</p>
     * 
     * <strong>example:</strong>
     * <p>s-04zzrgosj6xd11yah</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The Skill labels.</p>
     */
    @NameInMap("SkillLabels")
    public java.util.List<String> skillLabels;

    /**
     * <p>The Skill name.</p>
     * 
     * <strong>example:</strong>
     * <p>skill-hello</p>
     */
    @NameInMap("SkillName")
    public String skillName;

    /**
     * <p>The ID of the SkillSpace to which the Skill belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-111111111</p>
     */
    @NameInMap("SkillSpaceId")
    public String skillSpaceId;

    /**
     * <p>The time when the Skill was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillResponseBody self = new GetSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetSkillResponseBody setLocales(java.util.List<GetSkillResponseBodyLocales> locales) {
        this.locales = locales;
        return this;
    }
    public java.util.List<GetSkillResponseBodyLocales> getLocales() {
        return this.locales;
    }

    public GetSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillResponseBody setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
        return this;
    }
    public String getSkillDescription() {
        return this.skillDescription;
    }

    public GetSkillResponseBody setSkillDisplayName(String skillDisplayName) {
        this.skillDisplayName = skillDisplayName;
        return this;
    }
    public String getSkillDisplayName() {
        return this.skillDisplayName;
    }

    public GetSkillResponseBody setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public GetSkillResponseBody setSkillLabels(java.util.List<String> skillLabels) {
        this.skillLabels = skillLabels;
        return this;
    }
    public java.util.List<String> getSkillLabels() {
        return this.skillLabels;
    }

    public GetSkillResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public GetSkillResponseBody setSkillSpaceId(String skillSpaceId) {
        this.skillSpaceId = skillSpaceId;
        return this;
    }
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

    public GetSkillResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetSkillResponseBodyLocales extends TeaModel {
        @NameInMap("EnValue")
        public String enValue;

        @NameInMap("OriginalValue")
        public String originalValue;

        @NameInMap("ZhValue")
        public String zhValue;

        public static GetSkillResponseBodyLocales build(java.util.Map<String, ?> map) throws Exception {
            GetSkillResponseBodyLocales self = new GetSkillResponseBodyLocales();
            return TeaModel.build(map, self);
        }

        public GetSkillResponseBodyLocales setEnValue(String enValue) {
            this.enValue = enValue;
            return this;
        }
        public String getEnValue() {
            return this.enValue;
        }

        public GetSkillResponseBodyLocales setOriginalValue(String originalValue) {
            this.originalValue = originalValue;
            return this;
        }
        public String getOriginalValue() {
            return this.originalValue;
        }

        public GetSkillResponseBodyLocales setZhValue(String zhValue) {
            this.zhValue = zhValue;
            return this;
        }
        public String getZhValue() {
            return this.zhValue;
        }

    }

}
