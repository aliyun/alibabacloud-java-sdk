// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateParameterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Version")
    public Integer version;

    public static UpdateParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterResponseBody self = new UpdateParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateParameterResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
