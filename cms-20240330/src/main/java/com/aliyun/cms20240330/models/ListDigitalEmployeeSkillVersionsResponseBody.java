// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeeSkillVersionsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListDigitalEmployeeSkillVersionsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListDigitalEmployeeSkillVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeeSkillVersionsResponseBody self = new ListDigitalEmployeeSkillVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeeSkillVersionsResponseBody setData(java.util.List<ListDigitalEmployeeSkillVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDigitalEmployeeSkillVersionsResponseBodyData> getData() {
        return this.data;
    }

    public ListDigitalEmployeeSkillVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDigitalEmployeeSkillVersionsResponseBodyData extends TeaModel {
        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T14:09:11Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>remark</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("skillName")
        public String skillName;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T14:09:11Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1770386951147366810</p>
         */
        @NameInMap("version")
        public String version;

        public static ListDigitalEmployeeSkillVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDigitalEmployeeSkillVersionsResponseBodyData self = new ListDigitalEmployeeSkillVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDigitalEmployeeSkillVersionsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDigitalEmployeeSkillVersionsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDigitalEmployeeSkillVersionsResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListDigitalEmployeeSkillVersionsResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListDigitalEmployeeSkillVersionsResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListDigitalEmployeeSkillVersionsResponseBodyData setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public ListDigitalEmployeeSkillVersionsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListDigitalEmployeeSkillVersionsResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
