// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SetStorageResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the settings were saved. Valid values:</p>
     * <ul>
     * <li><p>true: The settings were saved.</p>
     * </li>
     * <li><p>false: The settings failed to be saved.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-58D4-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetStorageResponseBody self = new SetStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public SetStorageResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
