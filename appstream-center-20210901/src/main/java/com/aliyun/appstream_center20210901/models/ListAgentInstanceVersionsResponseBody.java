// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAgentInstanceVersionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <strong>example:</strong>
     * <p>4C5A2E8F-9B3D-4E7A-A1C6-2F8D0E5B7A91</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAgentInstanceVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentInstanceVersionsResponseBody self = new ListAgentInstanceVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentInstanceVersionsResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public ListAgentInstanceVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentInstanceVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
