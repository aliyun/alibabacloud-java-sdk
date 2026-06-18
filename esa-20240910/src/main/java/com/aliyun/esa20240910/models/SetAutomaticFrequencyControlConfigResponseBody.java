// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetAutomaticFrequencyControlConfigResponseBody extends TeaModel {
    /**
     * <p>The action taken on requests that trigger the control. Valid values:</p>
     * <ul>
     * <li><p><strong>observe</strong>: Requests are monitored.</p>
     * </li>
     * <li><p><strong>deny</strong>: Requests are blocked.</p>
     * </li>
     * <li><p><strong>js</strong>: JS challenges are issued.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>js</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>Indicates whether automatic frequency control is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>on</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>off</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The protection level. Valid values:</p>
     * <ul>
     * <li><p><strong>loose</strong>: Loose protection.</p>
     * </li>
     * <li><p><strong>normal</strong>: Normal protection.</p>
     * </li>
     * <li><p><strong>strict</strong>: Strict protection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The request ID.</p>
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
