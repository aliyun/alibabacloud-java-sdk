// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDisposeStrategyPlaybookResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeDisposeStrategyPlaybookResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDisposeStrategyPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisposeStrategyPlaybookResponseBody self = new DescribeDisposeStrategyPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisposeStrategyPlaybookResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeDisposeStrategyPlaybookResponseBody setData(java.util.List<DescribeDisposeStrategyPlaybookResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDisposeStrategyPlaybookResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDisposeStrategyPlaybookResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDisposeStrategyPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisposeStrategyPlaybookResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDisposeStrategyPlaybookResponseBodyData extends TeaModel {
        @NameInMap("PlaybookName")
        public String playbookName;

        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        public static DescribeDisposeStrategyPlaybookResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisposeStrategyPlaybookResponseBodyData self = new DescribeDisposeStrategyPlaybookResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDisposeStrategyPlaybookResponseBodyData setPlaybookName(String playbookName) {
            this.playbookName = playbookName;
            return this;
        }
        public String getPlaybookName() {
            return this.playbookName;
        }

        public DescribeDisposeStrategyPlaybookResponseBodyData setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

    }

}
