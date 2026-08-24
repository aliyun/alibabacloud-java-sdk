// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class AddDataAgentMemoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Diamond pricing analysis requires examining the skewness and outliers of the distribution of each feature.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <strong>example:</strong>
     * <p>2037**********23</p>
     */
    @NameInMap("FromId")
    public String fromId;

    /**
     * <strong>example:</strong>
     * <p>fact_specifications</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("MemFrom")
    public String memFrom;

    /**
     * <strong>example:</strong>
     * <p>fc5ice**********ac6e</p>
     */
    @NameInMap("SessionUuid")
    public String sessionUuid;

    public static AddDataAgentMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataAgentMemoryRequest self = new AddDataAgentMemoryRequest();
        return TeaModel.build(map, self);
    }

    public AddDataAgentMemoryRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AddDataAgentMemoryRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public AddDataAgentMemoryRequest setFromId(String fromId) {
        this.fromId = fromId;
        return this;
    }
    public String getFromId() {
        return this.fromId;
    }

    public AddDataAgentMemoryRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public AddDataAgentMemoryRequest setMemFrom(String memFrom) {
        this.memFrom = memFrom;
        return this;
    }
    public String getMemFrom() {
        return this.memFrom;
    }

    public AddDataAgentMemoryRequest setSessionUuid(String sessionUuid) {
        this.sessionUuid = sessionUuid;
        return this;
    }
    public String getSessionUuid() {
        return this.sessionUuid;
    }

}
