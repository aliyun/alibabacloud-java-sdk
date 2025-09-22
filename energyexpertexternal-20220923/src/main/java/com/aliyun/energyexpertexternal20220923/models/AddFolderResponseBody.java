// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AddFolderResponseBody extends TeaModel {
    @NameInMap("data")
    public FolderItem data;

    /**
     * <strong>example:</strong>
     * <p>E38E561C-B996-0E19-8DBC-A218AAE17FBA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AddFolderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFolderResponseBody self = new AddFolderResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFolderResponseBody setData(FolderItem data) {
        this.data = data;
        return this;
    }
    public FolderItem getData() {
        return this.data;
    }

    public AddFolderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
