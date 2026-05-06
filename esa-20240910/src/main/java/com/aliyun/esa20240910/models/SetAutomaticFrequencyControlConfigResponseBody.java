// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetAutomaticFrequencyControlConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>js</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F32C57AA-7BF8-49AE-A2CC-9F42390F5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetAutomaticFrequencyControlConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAutomaticFrequencyControlConfigResponseBody self = new SetAutomaticFrequencyControlConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAutomaticFrequencyControlConfigResponseBody setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public SetAutomaticFrequencyControlConfigResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public SetAutomaticFrequencyControlConfigResponseBody setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public SetAutomaticFrequencyControlConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
