// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ApplyTagPoliciesResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public java.util.List<ApplyTagPoliciesResponseBodyData> data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful.
    @NameInMap("Success")
    public Boolean success;

    public static ApplyTagPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyTagPoliciesResponseBody self = new ApplyTagPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyTagPoliciesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ApplyTagPoliciesResponseBody setData(java.util.List<ApplyTagPoliciesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ApplyTagPoliciesResponseBodyData> getData() {
        return this.data;
    }

    public ApplyTagPoliciesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ApplyTagPoliciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyTagPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyTagPoliciesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ApplyTagPoliciesResponseBodyData extends TeaModel {
        // Indicates whether pass-through is enabled.
        @NameInMap("CarryData")
        public Boolean carryData;

        // Indicates whether the routing rule is enabled. 
        // 
        // - `true`: enabled 
        // - `false`: disabled
        @NameInMap("Enable")
        public Boolean enable;

        // The ID of the primary key.
        @NameInMap("Id")
        public Long id;

        // The number of instances.
        @NameInMap("InstanceNum")
        public Integer instanceNum;

        // The name of the routing rule.
        @NameInMap("Name")
        public String name;

        // The rate.
        @NameInMap("Rate")
        public Integer rate;

        // Indicates whether the routing rule is deleted.
        @NameInMap("Remove")
        public Boolean remove;

        // The details of the routing rule.
        @NameInMap("Rules")
        public String rules;

        // The status of the routing rule.
        @NameInMap("Status")
        public Integer status;

        // The tag.
        @NameInMap("Tag")
        public String tag;

        public static ApplyTagPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyTagPoliciesResponseBodyData self = new ApplyTagPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyTagPoliciesResponseBodyData setCarryData(Boolean carryData) {
            this.carryData = carryData;
            return this;
        }
        public Boolean getCarryData() {
            return this.carryData;
        }

        public ApplyTagPoliciesResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ApplyTagPoliciesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ApplyTagPoliciesResponseBodyData setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public ApplyTagPoliciesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ApplyTagPoliciesResponseBodyData setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public ApplyTagPoliciesResponseBodyData setRemove(Boolean remove) {
            this.remove = remove;
            return this;
        }
        public Boolean getRemove() {
            return this.remove;
        }

        public ApplyTagPoliciesResponseBodyData setRules(String rules) {
            this.rules = rules;
            return this;
        }
        public String getRules() {
            return this.rules;
        }

        public ApplyTagPoliciesResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ApplyTagPoliciesResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
