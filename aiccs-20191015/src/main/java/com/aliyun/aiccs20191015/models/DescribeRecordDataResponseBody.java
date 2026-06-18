// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DescribeRecordDataResponseBody extends TeaModel {
    /**
     * <p>Session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1004849****</p>
     */
    @NameInMap("Acid")
    public String acid;

    /**
     * <p>Agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1212****</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Recording file link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://****</p>
     */
    @NameInMap("OssLink")
    public String ossLink;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public DescribeRecordDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
