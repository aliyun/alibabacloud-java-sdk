// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListPromptsResponseBody extends TeaModel {
    /**
     * <p>The list of prompts.</p>
     */
    @NameInMap("Prompts")
    public java.util.List<Prompt> prompts;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D5BFFEE3-6025-443F-8A03-02D619B5C4B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned under the current request conditions. This parameter is optional and may not be returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPromptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPromptsResponseBody self = new ListPromptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPromptsResponseBody setPrompts(java.util.List<Prompt> prompts) {
        this.prompts = prompts;
        return this;
    }
    public java.util.List<Prompt> getPrompts() {
        return this.prompts;
    }

    public ListPromptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPromptsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
