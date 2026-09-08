// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetSkillGroupResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public GetSkillGroupResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF1C21B9-2D49-4B54-880F-FBE248C16903</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSkillGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupResponseBody self = new GetSkillGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupResponseBody setData(GetSkillGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSkillGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSkillGroupResponseBodyData extends TeaModel {
        /**
         * <p>Description of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>云联络中心的测试技能组。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Display name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>测试技能组</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Media type. The default value is AUDIO. Other valid values include CHAT and VIDEO.</p>
         * 
         * <strong>example:</strong>
         * <p>VIDEO</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>Name of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Skill group ID, in the format: skill group name\@instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        public static GetSkillGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupResponseBodyData self = new GetSkillGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSkillGroupResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetSkillGroupResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSkillGroupResponseBodyData setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public GetSkillGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSkillGroupResponseBodyData setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

    }

}
