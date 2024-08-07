// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableServiceForCloudSiemResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the threat analysis feature is authorized to access the resource directory. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableServiceForCloudSiemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceForCloudSiemResponseBody self = new EnableServiceForCloudSiemResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableServiceForCloudSiemResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public EnableServiceForCloudSiemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
