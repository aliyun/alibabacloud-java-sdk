// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListImageAssociatedProjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<Long> data;

    /**
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListImageAssociatedProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageAssociatedProjectsResponseBody self = new ListImageAssociatedProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageAssociatedProjectsResponseBody setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public ListImageAssociatedProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageAssociatedProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
