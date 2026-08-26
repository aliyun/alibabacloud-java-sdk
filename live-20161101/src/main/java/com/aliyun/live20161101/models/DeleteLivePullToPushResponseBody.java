// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLivePullToPushResponseBody extends TeaModel {
    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return code.</p>
     * <blockquote>
     * <ul>
     * <li>&quot;0&quot; is returned in normal cases.</li>
     * <li>For exceptions, refer to the error codes listed below.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    public static DeleteLivePullToPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePullToPushResponseBody self = new DeleteLivePullToPushResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLivePullToPushResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeleteLivePullToPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLivePullToPushResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

}
