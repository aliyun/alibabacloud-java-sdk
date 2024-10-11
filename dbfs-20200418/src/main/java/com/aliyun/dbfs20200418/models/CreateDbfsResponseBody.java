// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateDbfsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dbfs-GOrr********Yd0VLOyBpg</p>
     */
    @NameInMap("FsId")
    public String fsId;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDbfsResponseBody self = new CreateDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDbfsResponseBody setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public CreateDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
