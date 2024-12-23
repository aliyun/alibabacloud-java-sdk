// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRolePolicyResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Statement&quot;: [
     *             {
     *                   &quot;Action&quot;: [
     *                         &quot;odps:<em>&quot;
     *                   ],
     *                   &quot;Effect&quot;: &quot;Allow&quot;,
     *                   &quot;Resource&quot;: [
     *                         &quot;acs:odps:</em>:projects/{projectname}/authorization/packages&quot;
     *                   ]
     *             }
     *       ],
     *       &quot;Version&quot;: &quot;1&quot;
     * }</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1eeed16675342848904412e08dd</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRolePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRolePolicyResponseBody self = new GetRolePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRolePolicyResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetRolePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
