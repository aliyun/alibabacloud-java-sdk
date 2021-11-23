// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModifyParameterLogResponseBody extends TeaModel {
    @NameInMap("Changelogs")
    public java.util.List<DescribeModifyParameterLogResponseBodyChangelogs> changelogs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeModifyParameterLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyParameterLogResponseBody self = new DescribeModifyParameterLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModifyParameterLogResponseBody setChangelogs(java.util.List<DescribeModifyParameterLogResponseBodyChangelogs> changelogs) {
        this.changelogs = changelogs;
        return this;
    }
    public java.util.List<DescribeModifyParameterLogResponseBodyChangelogs> getChangelogs() {
        return this.changelogs;
    }

    public DescribeModifyParameterLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeModifyParameterLogResponseBodyChangelogs extends TeaModel {
        @NameInMap("EffectTime")
        public String effectTime;

        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("ParameterValid")
        public String parameterValid;

        @NameInMap("ParameterValueAfter")
        public String parameterValueAfter;

        @NameInMap("ParameterValueBefore")
        public String parameterValueBefore;

        public static DescribeModifyParameterLogResponseBodyChangelogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyParameterLogResponseBodyChangelogs self = new DescribeModifyParameterLogResponseBodyChangelogs();
            return TeaModel.build(map, self);
        }

        public DescribeModifyParameterLogResponseBodyChangelogs setEffectTime(String effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public String getEffectTime() {
            return this.effectTime;
        }

        public DescribeModifyParameterLogResponseBodyChangelogs setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeModifyParameterLogResponseBodyChangelogs setParameterValid(String parameterValid) {
            this.parameterValid = parameterValid;
            return this;
        }
        public String getParameterValid() {
            return this.parameterValid;
        }

        public DescribeModifyParameterLogResponseBodyChangelogs setParameterValueAfter(String parameterValueAfter) {
            this.parameterValueAfter = parameterValueAfter;
            return this;
        }
        public String getParameterValueAfter() {
            return this.parameterValueAfter;
        }

        public DescribeModifyParameterLogResponseBodyChangelogs setParameterValueBefore(String parameterValueBefore) {
            this.parameterValueBefore = parameterValueBefore;
            return this;
        }
        public String getParameterValueBefore() {
            return this.parameterValueBefore;
        }

    }

}
