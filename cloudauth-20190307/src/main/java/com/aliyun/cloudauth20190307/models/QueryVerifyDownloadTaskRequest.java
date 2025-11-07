// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyDownloadTaskRequest extends TeaModel {
    /**
     * <p>Download task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>202411194002618</p>
     */
    @NameInMap("DownloadTaskId")
    public String downloadTaskId;

    public static QueryVerifyDownloadTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVerifyDownloadTaskRequest self = new QueryVerifyDownloadTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryVerifyDownloadTaskRequest setDownloadTaskId(String downloadTaskId) {
        this.downloadTaskId = downloadTaskId;
        return this;
    }
    public String getDownloadTaskId() {
        return this.downloadTaskId;
    }

}
