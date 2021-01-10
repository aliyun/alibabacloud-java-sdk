// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeAssistReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AssistResult")
    public String assistResult;

    @NameInMap("AssistReason")
    public String assistReason;

    @NameInMap("AssistId")
    public String assistId;

    @NameInMap("AssistDescription")
    public String assistDescription;

    @NameInMap("AssistTag")
    public String assistTag;

    public static DescribeAssistReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssistReportResponseBody self = new DescribeAssistReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssistReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssistReportResponseBody setAssistResult(String assistResult) {
        this.assistResult = assistResult;
        return this;
    }
    public String getAssistResult() {
        return this.assistResult;
    }

    public DescribeAssistReportResponseBody setAssistReason(String assistReason) {
        this.assistReason = assistReason;
        return this;
    }
    public String getAssistReason() {
        return this.assistReason;
    }

    public DescribeAssistReportResponseBody setAssistId(String assistId) {
        this.assistId = assistId;
        return this;
    }
    public String getAssistId() {
        return this.assistId;
    }

    public DescribeAssistReportResponseBody setAssistDescription(String assistDescription) {
        this.assistDescription = assistDescription;
        return this;
    }
    public String getAssistDescription() {
        return this.assistDescription;
    }

    public DescribeAssistReportResponseBody setAssistTag(String assistTag) {
        this.assistTag = assistTag;
        return this;
    }
    public String getAssistTag() {
        return this.assistTag;
    }

}
