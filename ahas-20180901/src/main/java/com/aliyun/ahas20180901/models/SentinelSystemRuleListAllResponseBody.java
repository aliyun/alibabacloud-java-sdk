// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSystemRuleListAllResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelSystemRuleListAllResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelSystemRuleListAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelSystemRuleListAllResponseBody self = new SentinelSystemRuleListAllResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelSystemRuleListAllResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelSystemRuleListAllResponseBody setData(java.util.List<SentinelSystemRuleListAllResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelSystemRuleListAllResponseBodyData> getData() {
        return this.data;
    }

    public SentinelSystemRuleListAllResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelSystemRuleListAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelSystemRuleListAllResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelSystemRuleListAllResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Float count;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("fallbackObject")
        public String fallbackObject;

        @NameInMap("grade")
        public Integer grade;

        @NameInMap("id")
        public Long id;

        public static SentinelSystemRuleListAllResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelSystemRuleListAllResponseBodyData self = new SentinelSystemRuleListAllResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelSystemRuleListAllResponseBodyData setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

        public SentinelSystemRuleListAllResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelSystemRuleListAllResponseBodyData setFallbackObject(String fallbackObject) {
            this.fallbackObject = fallbackObject;
            return this;
        }
        public String getFallbackObject() {
            return this.fallbackObject;
        }

        public SentinelSystemRuleListAllResponseBodyData setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public SentinelSystemRuleListAllResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
