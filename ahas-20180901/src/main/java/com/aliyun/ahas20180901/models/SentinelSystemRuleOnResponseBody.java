// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleOnResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelSystemRuleOnResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelSystemRuleOnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleOnResponseBody self = new SentinelSystemRuleOnResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleOnResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelSystemRuleOnResponseBody setData(SentinelSystemRuleOnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelSystemRuleOnResponseBodyData getData() {
        return this.data;
    }

    public SentinelSystemRuleOnResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelSystemRuleOnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelSystemRuleOnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelSystemRuleOnResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Float count;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        public static SentinelSystemRuleOnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelSystemRuleOnResponseBodyData self = new SentinelSystemRuleOnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelSystemRuleOnResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelSystemRuleOnResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelSystemRuleOnResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelSystemRuleOnResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
