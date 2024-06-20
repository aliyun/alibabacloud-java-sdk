// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListModelVersionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC***3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Versions")
    public java.util.List<ModelVersion> versions;

    public static ListModelVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelVersionsResponseBody self = new ListModelVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelVersionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListModelVersionsResponseBody setVersions(java.util.List<ModelVersion> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ModelVersion> getVersions() {
        return this.versions;
    }

}
