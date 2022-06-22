// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelSystemRuleNewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelSystemRuleNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleNewResponseBody self = new SentinelSystemRuleNewResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelSystemRuleNewResponseBody setData(SentinelSystemRuleNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelSystemRuleNewResponseBodyData getData() {
        return this.data;
    }

    public SentinelSystemRuleNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelSystemRuleNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelSystemRuleNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelSystemRuleNewResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Float count;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        public static SentinelSystemRuleNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelSystemRuleNewResponseBodyData self = new SentinelSystemRuleNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelSystemRuleNewResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelSystemRuleNewResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelSystemRuleNewResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelSystemRuleNewResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
