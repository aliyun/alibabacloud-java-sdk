// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerGroupPasswordResponseBody extends TeaModel {
    /**
     * <p>The current password of the consumer group.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The username of the consumer group. You can call the <a href="https://help.aliyun.com/document_detail/122886.html">DescribeConsumerGroup</a> operation to query the username.</p>
     * 
     * <strong>example:</strong>
     * <p>A06B5CFF-9576-4BC1-BE62-A3D43E1F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The new password of the consumer group.</p>
     * <ul>
     * <li>A password must contain two or more of the following characters: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>A password must be 8 to 32 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifyConsumerGroupPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerGroupPasswordResponseBody self = new ModifyConsumerGroupPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerGroupPasswordResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModifyConsumerGroupPasswordResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModifyConsumerGroupPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyConsumerGroupPasswordResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
