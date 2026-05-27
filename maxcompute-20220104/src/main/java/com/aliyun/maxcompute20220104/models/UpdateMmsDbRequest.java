// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsDbRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("dstName")
    public String dstName;

    /**
     * <strong>example:</strong>
     * <p>dst_project_name</p>
     */
    @NameInMap("dstProjectName")
    public String dstProjectName;

    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateMmsDbRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsDbRequest self = new UpdateMmsDbRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmsDbRequest setDstName(String dstName) {
        this.dstName = dstName;
        return this;
    }
    public String getDstName() {
        return this.dstName;
    }

    public UpdateMmsDbRequest setDstProjectName(String dstProjectName) {
        this.dstProjectName = dstProjectName;
        return this;
    }
    public String getDstProjectName() {
        return this.dstProjectName;
    }

    public UpdateMmsDbRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
