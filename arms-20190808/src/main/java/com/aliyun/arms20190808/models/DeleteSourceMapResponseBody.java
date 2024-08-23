// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSourceMapResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the SourceMap files are deleted. Valid values:</p>
     * <ul>
     * <li>success: The SourceMap files are deleted.</li>
     * <li>false: The SourceMap files fail to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSourceMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceMapResponseBody self = new DeleteSourceMapResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSourceMapResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteSourceMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
