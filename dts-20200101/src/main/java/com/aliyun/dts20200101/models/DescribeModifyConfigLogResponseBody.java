// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeModifyConfigLogResponseBody extends TeaModel {
    @NameInMap("ModifyConfigLogs")
    public java.util.List<DescribeModifyConfigLogResponseBodyModifyConfigLogs> modifyConfigLogs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeModifyConfigLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyConfigLogResponseBody self = new DescribeModifyConfigLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModifyConfigLogResponseBody setModifyConfigLogs(java.util.List<DescribeModifyConfigLogResponseBodyModifyConfigLogs> modifyConfigLogs) {
        this.modifyConfigLogs = modifyConfigLogs;
        return this;
    }
    public java.util.List<DescribeModifyConfigLogResponseBodyModifyConfigLogs> getModifyConfigLogs() {
        return this.modifyConfigLogs;
    }

    public DescribeModifyConfigLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeModifyConfigLogResponseBodyModifyConfigLogs extends TeaModel {
        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Module")
        public String module;

        @NameInMap("NewParameterValue")
        public String newParameterValue;

        @NameInMap("OldParameterValue")
        public String oldParameterValue;

        @NameInMap("ParameterName")
        public String parameterName;

        public static DescribeModifyConfigLogResponseBodyModifyConfigLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyConfigLogResponseBodyModifyConfigLogs self = new DescribeModifyConfigLogResponseBodyModifyConfigLogs();
            return TeaModel.build(map, self);
        }

        public DescribeModifyConfigLogResponseBodyModifyConfigLogs setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public DescribeModifyConfigLogResponseBodyModifyConfigLogs setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public DescribeModifyConfigLogResponseBodyModifyConfigLogs setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
            return this;
        }
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        public DescribeModifyConfigLogResponseBodyModifyConfigLogs setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public DescribeModifyConfigLogResponseBodyModifyConfigLogs setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

}
