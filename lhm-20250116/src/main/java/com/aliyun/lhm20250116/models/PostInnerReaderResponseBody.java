// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class PostInnerReaderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static PostInnerReaderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PostInnerReaderResponseBody self = new PostInnerReaderResponseBody();
        return TeaModel.build(map, self);
    }

    public PostInnerReaderResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PostInnerReaderResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public PostInnerReaderResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public PostInnerReaderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PostInnerReaderResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
