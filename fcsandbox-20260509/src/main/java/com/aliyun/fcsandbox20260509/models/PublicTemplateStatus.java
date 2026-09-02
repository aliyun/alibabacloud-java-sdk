// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class PublicTemplateStatus extends TeaModel {
    /**
     * <p>The time when the build is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-28T12:00:00.000Z</p>
     */
    @NameInMap("finishedAt")
    public String finishedAt;

    /**
     * <p>The reason for the build failure.</p>
     */
    @NameInMap("reason")
    public PublicTemplateStatusReason reason;

    /**
     * <p>The build status.</p>
     * 
     * <strong>example:</strong>
     * <p>ready</p>
     */
    @NameInMap("state")
    public String state;

    public static PublicTemplateStatus build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateStatus self = new PublicTemplateStatus();
        return TeaModel.build(map, self);
    }

    public PublicTemplateStatus setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public PublicTemplateStatus setReason(PublicTemplateStatusReason reason) {
        this.reason = reason;
        return this;
    }
    public PublicTemplateStatusReason getReason() {
        return this.reason;
    }

    public PublicTemplateStatus setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
