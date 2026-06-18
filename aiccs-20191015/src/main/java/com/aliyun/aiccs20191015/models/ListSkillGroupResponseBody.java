// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListSkillGroupResponseBody extends TeaModel {
    /**
     * <p>Status code. A value of &quot;Success&quot; indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Skill group information.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSkillGroupResponseBodyData> data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSkillGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupResponseBody self = new ListSkillGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupResponseBody setData(java.util.List<ListSkillGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSkillGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListSkillGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupResponseBodyData extends TeaModel {
        /**
         * <p>Channel type of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChannelType")
        public Integer channelType;

        /**
         * <p>Skill group description.</p>
         * 
         * <strong>example:</strong>
         * <p>自动化技能组</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Display name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>自动化技能组</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>自动化技能组</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("SkillGroupId")
        public Long skillGroupId;

        public static ListSkillGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupResponseBodyData self = new ListSkillGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupResponseBodyData setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public ListSkillGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSkillGroupResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListSkillGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillGroupResponseBodyData setSkillGroupId(Long skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public Long getSkillGroupId() {
            return this.skillGroupId;
        }

    }

}
