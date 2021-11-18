// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListTrunksOfSkillGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TrunkConfigs")
    public java.util.List<ListTrunksOfSkillGroupResponseBodyTrunkConfigs> trunkConfigs;

    public static ListTrunksOfSkillGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrunksOfSkillGroupResponseBody self = new ListTrunksOfSkillGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrunksOfSkillGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTrunksOfSkillGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTrunksOfSkillGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTrunksOfSkillGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrunksOfSkillGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTrunksOfSkillGroupResponseBody setTrunkConfigs(java.util.List<ListTrunksOfSkillGroupResponseBodyTrunkConfigs> trunkConfigs) {
        this.trunkConfigs = trunkConfigs;
        return this;
    }
    public java.util.List<ListTrunksOfSkillGroupResponseBodyTrunkConfigs> getTrunkConfigs() {
        return this.trunkConfigs;
    }

    public static class ListTrunksOfSkillGroupResponseBodyTrunkConfigs extends TeaModel {
        @NameInMap("Primary")
        public Boolean primary;

        @NameInMap("ProviderName")
        public String providerName;

        public static ListTrunksOfSkillGroupResponseBodyTrunkConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListTrunksOfSkillGroupResponseBodyTrunkConfigs self = new ListTrunksOfSkillGroupResponseBodyTrunkConfigs();
            return TeaModel.build(map, self);
        }

        public ListTrunksOfSkillGroupResponseBodyTrunkConfigs setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public ListTrunksOfSkillGroupResponseBodyTrunkConfigs setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

    }

}
