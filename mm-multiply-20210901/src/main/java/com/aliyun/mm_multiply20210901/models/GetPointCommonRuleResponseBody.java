// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetPointCommonRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PointCommonRuleDTO")
    public GetPointCommonRuleResponseBodyPointCommonRuleDTO pointCommonRuleDTO;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPointCommonRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPointCommonRuleResponseBody self = new GetPointCommonRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPointCommonRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPointCommonRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPointCommonRuleResponseBody setPointCommonRuleDTO(GetPointCommonRuleResponseBodyPointCommonRuleDTO pointCommonRuleDTO) {
        this.pointCommonRuleDTO = pointCommonRuleDTO;
        return this;
    }
    public GetPointCommonRuleResponseBodyPointCommonRuleDTO getPointCommonRuleDTO() {
        return this.pointCommonRuleDTO;
    }

    public GetPointCommonRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPointCommonRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPointCommonRuleResponseBodyPointCommonRuleDTO extends TeaModel {
        @NameInMap("EffectiveInterval")
        public Integer effectiveInterval;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("EffectiveTimeUnit")
        public String effectiveTimeUnit;

        @NameInMap("EffectiveType")
        public Integer effectiveType;

        @NameInMap("LimitInterval")
        public Long limitInterval;

        @NameInMap("LimitStatus")
        public Integer limitStatus;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetPointCommonRuleResponseBodyPointCommonRuleDTO build(java.util.Map<String, ?> map) throws Exception {
            GetPointCommonRuleResponseBodyPointCommonRuleDTO self = new GetPointCommonRuleResponseBodyPointCommonRuleDTO();
            return TeaModel.build(map, self);
        }

        public GetPointCommonRuleResponseBodyPointCommonRuleDTO setEffectiveInterval(Integer effectiveInterval) {
            this.effectiveInterval = effectiveInterval;
            return this;
        }
        public Integer getEffectiveInterval() {
            return this.effectiveInterval;
        }

        public GetPointCommonRuleResponseBodyPointCommonRuleDTO setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public GetPointCommonRuleResponseBodyPointCommonRuleDTO setEffectiveTimeUnit(String effectiveTimeUnit) {
            this.effectiveTimeUnit = effectiveTimeUnit;
            return this;
        }
        public String getEffectiveTimeUnit() {
            return this.effectiveTimeUnit;
        }

        public GetPointCommonRuleResponseBodyPointCommonRuleDTO setEffectiveType(Integer effectiveType) {
            this.effectiveType = effectiveType;
            return this;
        }
        public Integer getEffectiveType() {
            return this.effectiveType;
        }

        public GetPointCommonRuleResponseBodyPointCommonRuleDTO setLimitInterval(Long limitInterval) {
            this.limitInterval = limitInterval;
            return this;
        }
        public Long getLimitInterval() {
            return this.limitInterval;
        }

        public GetPointCommonRuleResponseBodyPointCommonRuleDTO setLimitStatus(Integer limitStatus) {
            this.limitStatus = limitStatus;
            return this;
        }
        public Integer getLimitStatus() {
            return this.limitStatus;
        }

        public GetPointCommonRuleResponseBodyPointCommonRuleDTO setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
