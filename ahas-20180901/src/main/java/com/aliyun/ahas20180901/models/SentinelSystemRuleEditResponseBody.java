// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleEditResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelSystemRuleEditResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelSystemRuleEditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleEditResponseBody self = new SentinelSystemRuleEditResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleEditResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelSystemRuleEditResponseBody setData(SentinelSystemRuleEditResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelSystemRuleEditResponseBodyData getData() {
        return this.data;
    }

    public SentinelSystemRuleEditResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelSystemRuleEditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelSystemRuleEditResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelSystemRuleEditResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Float count;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        public static SentinelSystemRuleEditResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelSystemRuleEditResponseBodyData self = new SentinelSystemRuleEditResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelSystemRuleEditResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelSystemRuleEditResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelSystemRuleEditResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelSystemRuleEditResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
