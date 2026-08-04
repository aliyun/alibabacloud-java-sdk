// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class PAL7ConfigRewriteOp extends TeaModel {
    /**
     * <p>HTTP header or query parameter name. Required.</p>
     * 
     * <strong>example:</strong>
     * <p>X-Test-Param</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>Value to find and replace. Used only for the replace operation.</p>
     * 
     * <strong>example:</strong>
     * <p>old_value</p>
     */
    @NameInMap("OldValue")
    public String oldValue;

    /**
     * <p>Operation type. Required.</p>
     * <ul>
     * <li><p><strong>add</strong>: Add an item.</p>
     * </li>
     * <li><p><strong>set</strong>: Set a value.</p>
     * </li>
     * <li><p><strong>delete</strong>: Delete an item.</p>
     * </li>
     * <li><p><strong>replace</strong>: Replace a value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("Op")
    public String op;

    /**
     * <p>Target value as a string.</p>
     * 
     * <strong>example:</strong>
     * <p>new_value</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>Target value as a string. Valid values:</p>
     * <ul>
     * <li><p><strong>sase_app_name</strong>: Application name.</p>
     * </li>
     * <li><p><strong>sase_app_id</strong>: Application ID.</p>
     * </li>
     * <li><p><strong>sase_policy_name</strong>: Zero Trust policy name.</p>
     * </li>
     * <li><p><strong>sase_user_username</strong>: Username.</p>
     * </li>
     * <li><p><strong>sase_user_department</strong>: User department.</p>
     * </li>
     * <li><p><strong>sase_user_group_infos</strong>: User organizational structure information.</p>
     * </li>
     * <li><p><strong>sase_user_matched_user_groups</strong>: User group information.</p>
     * </li>
     * <li><p><strong>sase_client_addr</strong>: Client address.</p>
     * </li>
     * <li><p><strong>sase_client_ip</strong>: Client IP address.</p>
     * </li>
     * <li><p><strong>sase_client_port</strong>: Client port.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sase_app_name</p>
     */
    @NameInMap("ValueVariable")
    public String valueVariable;

    public static PAL7ConfigRewriteOp build(java.util.Map<String, ?> map) throws Exception {
        PAL7ConfigRewriteOp self = new PAL7ConfigRewriteOp();
        return TeaModel.build(map, self);
    }

    public PAL7ConfigRewriteOp setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PAL7ConfigRewriteOp setOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }
    public String getOldValue() {
        return this.oldValue;
    }

    public PAL7ConfigRewriteOp setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public PAL7ConfigRewriteOp setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public PAL7ConfigRewriteOp setValueVariable(String valueVariable) {
        this.valueVariable = valueVariable;
        return this;
    }
    public String getValueVariable() {
        return this.valueVariable;
    }

}
