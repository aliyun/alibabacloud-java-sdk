// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DescribeRecordDataResponseBody extends TeaModel {
    @NameInMap("Acid")
    public String acid;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("OssLink")
    public String ossLink;

    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("Code")
    public String code;

    public static DescribeRecordDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordDataResponseBody self = new DescribeRecordDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecordDataResponseBody setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public DescribeRecordDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecordDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRecordDataResponseBody setOssLink(String ossLink) {
        this.ossLink = ossLink;
        return this;
    }
    public String getOssLink() {
        return this.ossLink;
    }

    public DescribeRecordDataResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DescribeRecordDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
