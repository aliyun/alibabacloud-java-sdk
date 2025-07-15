// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLivePullToPushResponseBody extends TeaModel {
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
     * <p>The code that is returned for the request.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>0 is returned if the request is normal.</p>
     * </li>
     * <li><p>For information about codes that are returned when exceptions occur, see the following Error codes table.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RetCode")
    public Integer retCode;

    public static UpdateLivePullToPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePullToPushResponseBody self = new UpdateLivePullToPushResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLivePullToPushResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLivePullToPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLivePullToPushResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

}
