// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserBatchRequest extends TeaModel {
    /**
     * <p>The business isolation ID, which is used to isolate data between different business applications under the same Alibaba Cloud account. Keep this value consistent with the <strong>IsolationId</strong> set when calling the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add users.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The list of user IDs. Pass the user IDs that were obtained and saved locally after calling the <a href="https://help.aliyun.com/document_detail/288338.html">AddFaceUser</a> operation to add users.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;xqymlby<strong><strong>4whye&quot;,&quot;6qyyb69zqara</strong></strong>&quot;,&quot;64nbfx8****hzmy4&quot;]</p>
     */
    @NameInMap("UserIdList")
    public java.util.List<String> userIdList;

    public static QueryFaceUserBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserBatchRequest self = new QueryFaceUserBatchRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserBatchRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public QueryFaceUserBatchRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

}
