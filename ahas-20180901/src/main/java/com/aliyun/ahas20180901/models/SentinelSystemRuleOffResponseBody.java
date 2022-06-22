// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleOffResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelSystemRuleOffResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelSystemRuleOffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleOffResponseBody self = new SentinelSystemRuleOffResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleOffResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelSystemRuleOffResponseBody setData(SentinelSystemRuleOffResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelSystemRuleOffResponseBodyData getData() {
        return this.data;
    }

    public SentinelSystemRuleOffResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelSystemRuleOffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelSystemRuleOffResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelSystemRuleOffResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Float count;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        public static SentinelSystemRuleOffResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelSystemRuleOffResponseBodyData self = new SentinelSystemRuleOffResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelSystemRuleOffResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelSystemRuleOffResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelSystemRuleOffResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelSystemRuleOffResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
