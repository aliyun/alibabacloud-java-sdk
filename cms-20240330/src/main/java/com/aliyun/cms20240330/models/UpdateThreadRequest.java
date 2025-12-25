// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateThreadRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>MY ANTOM Tech Team Annual Dinner Performance Lucky Draw</p>
     */
    @NameInMap("title")
    public String title;

    public static UpdateThreadRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateThreadRequest self = new UpdateThreadRequest();
        return TeaModel.build(map, self);
    }

    public UpdateThreadRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateThreadRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
