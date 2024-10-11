// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ModifyOfflineStoragesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7F176EE8-51DA-4B4D-8FFE-04448CD7A171</p>
     */
    @NameInMap("requestId")
    public byte[] requestId;

    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static ModifyOfflineStoragesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfflineStoragesResponseBody self = new ModifyOfflineStoragesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOfflineStoragesResponseBody setRequestId(byte[] requestId) {
        this.requestId = requestId;
        return this;
    }
    public byte[] getRequestId() {
        return this.requestId;
    }

    public ModifyOfflineStoragesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
