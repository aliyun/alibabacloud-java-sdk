// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteRtcAsrTaskResponseBody extends TeaModel {
    /**
     * <p>The description of the result. If the value is \<code>success\\</code>, the operation is successful. Otherwise, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>85F94125-B695-1FB8-A7E7-3BE7CE******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code. A value of \<code>2000\\</code> indicates that the operation is successful. Other values indicate that an error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("RetCode")
    public Long retCode;

    public static DeleteRtcAsrTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRtcAsrTaskResponseBody self = new DeleteRtcAsrTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRtcAsrTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeleteRtcAsrTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRtcAsrTaskResponseBody setRetCode(Long retCode) {
        this.retCode = retCode;
        return this;
    }
    public Long getRetCode() {
        return this.retCode;
    }

}
