// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataSourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>102E8E24-0387-531D-8A75-1C0AE7DD03E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the data source was updated. Valid values:</p>
     * <ul>
     * <li>true: yes.</li>
     * <li>false: no.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDataSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceResponseBody self = new UpdateDataSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
