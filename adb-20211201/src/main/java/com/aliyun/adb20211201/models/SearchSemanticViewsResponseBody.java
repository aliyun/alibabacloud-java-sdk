// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SearchSemanticViewsResponseBody extends TeaModel {
    /**
     * <p>A list of semantic view objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<SemanticViewModel> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SearchSemanticViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchSemanticViewsResponseBody self = new SearchSemanticViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchSemanticViewsResponseBody setData(java.util.List<SemanticViewModel> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SemanticViewModel> getData() {
        return this.data;
    }

    public SearchSemanticViewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
