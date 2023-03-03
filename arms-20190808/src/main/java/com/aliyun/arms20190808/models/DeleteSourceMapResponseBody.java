// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSourceMapResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the SourceMap files are deleted. Valid values:</p>
     * <br>
     * <p>*   success: The SourceMap files are deleted.</p>
     * <p>*   false: The SourceMap files fail to be deleted.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
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
