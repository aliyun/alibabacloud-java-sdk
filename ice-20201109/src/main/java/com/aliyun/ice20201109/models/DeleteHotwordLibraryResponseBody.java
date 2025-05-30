// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteHotwordLibraryResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>83B7-7F87-4792-BFE9-63CD2137</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteHotwordLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotwordLibraryResponseBody self = new DeleteHotwordLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHotwordLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteHotwordLibraryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
