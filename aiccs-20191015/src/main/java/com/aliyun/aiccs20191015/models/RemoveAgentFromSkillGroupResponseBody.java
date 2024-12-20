// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RemoveAgentFromSkillGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RemoveAgentFromSkillGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RemoveAgentFromSkillGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAgentFromSkillGroupResponseBody self = new RemoveAgentFromSkillGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAgentFromSkillGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveAgentFromSkillGroupResponseBody setData(RemoveAgentFromSkillGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveAgentFromSkillGroupResponseBodyData getData() {
        return this.data;
    }

    public RemoveAgentFromSkillGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveAgentFromSkillGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveAgentFromSkillGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RemoveAgentFromSkillGroupResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        public static RemoveAgentFromSkillGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveAgentFromSkillGroupResponseBodyData self = new RemoveAgentFromSkillGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveAgentFromSkillGroupResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
