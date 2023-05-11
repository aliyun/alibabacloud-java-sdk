// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorSLSGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ModifyHybridMonitorSLSGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridMonitorSLSGroupResponseBody self = new ModifyHybridMonitorSLSGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHybridMonitorSLSGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyHybridMonitorSLSGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyHybridMonitorSLSGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyHybridMonitorSLSGroupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
