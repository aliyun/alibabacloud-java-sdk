// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetCronExecTimeRequest extends TeaModel {
    /**
     * <p>The Cron expression. Replace spaces with plus signs <code>+</code> when passing the expression as a query parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0+0+0+<em>+</em>+?</p>
     */
    @NameInMap("cronRule")
    public String cronRule;

    public static GetCronExecTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCronExecTimeRequest self = new GetCronExecTimeRequest();
        return TeaModel.build(map, self);
    }

    public GetCronExecTimeRequest setCronRule(String cronRule) {
        this.cronRule = cronRule;
        return this;
    }
    public String getCronRule() {
        return this.cronRule;
    }

}
