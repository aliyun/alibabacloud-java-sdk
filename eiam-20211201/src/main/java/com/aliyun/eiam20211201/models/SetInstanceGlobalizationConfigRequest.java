// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetInstanceGlobalizationConfigRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-Hans-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The time zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    public static SetInstanceGlobalizationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceGlobalizationConfigRequest self = new SetInstanceGlobalizationConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetInstanceGlobalizationConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetInstanceGlobalizationConfigRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SetInstanceGlobalizationConfigRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
