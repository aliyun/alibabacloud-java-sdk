// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentMemoryRequest extends TeaModel {
    /**
     * <p>The memory content.</p>
     * 
     * <strong>example:</strong>
     * <p>Diamond pricing analysis requires examining the skewness and outliers of the distribution of each feature.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li>If MemFrom is set to session, FromId indicates the session ID.</li>
     * <li>If MemFrom is set to user, FromId indicates the RAM user ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8zm3**********g3yxa1</p>
     */
    @NameInMap("FromId")
    public String fromId;

    /**
     * <p>The memory source. Valid values:</p>
     * <ul>
     * <li>session: generated from a session.</li>
     * <li>user: edited by a user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("MemFrom")
    public String memFrom;

    /**
     * <p>The memory UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>ed3f67***********ed</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static UpdateDataAgentMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentMemoryRequest self = new UpdateDataAgentMemoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentMemoryRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDataAgentMemoryRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public UpdateDataAgentMemoryRequest setFromId(String fromId) {
        this.fromId = fromId;
        return this;
    }
    public String getFromId() {
        return this.fromId;
    }

    public UpdateDataAgentMemoryRequest setMemFrom(String memFrom) {
        this.memFrom = memFrom;
        return this;
    }
    public String getMemFrom() {
        return this.memFrom;
    }

    public UpdateDataAgentMemoryRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
