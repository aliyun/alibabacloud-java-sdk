// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListCodeSourcesResponseBody extends TeaModel {
    /**
     * <p>The code sources.</p>
     */
    @NameInMap("CodeSources")
    public java.util.List<CodeSourceItem> codeSources;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of code sources that meet the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCodeSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCodeSourcesResponseBody self = new ListCodeSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCodeSourcesResponseBody setCodeSources(java.util.List<CodeSourceItem> codeSources) {
        this.codeSources = codeSources;
        return this;
    }
    public java.util.List<CodeSourceItem> getCodeSources() {
        return this.codeSources;
    }

    public ListCodeSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCodeSourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
