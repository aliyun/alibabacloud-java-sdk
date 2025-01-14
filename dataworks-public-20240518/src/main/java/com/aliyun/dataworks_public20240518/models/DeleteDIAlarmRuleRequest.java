// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteDIAlarmRuleRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated. Use the Id parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DIAlarmRuleId")
    @Deprecated
    public Long DIAlarmRuleId;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteDIAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIAlarmRuleRequest self = new DeleteDIAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public DeleteDIAlarmRuleRequest setDIAlarmRuleId(Long DIAlarmRuleId) {
        this.DIAlarmRuleId = DIAlarmRuleId;
        return this;
    }
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    public DeleteDIAlarmRuleRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public DeleteDIAlarmRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
