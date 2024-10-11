// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RunSampleFormatConfigRequest extends TeaModel {
    /**
     * <p>The mode of the formatting. Default value: Latest. This value indicates that the latest formatting configurations are used.</p>
     * 
     * <strong>example:</strong>
     * <p>latest</p>
     */
    @NameInMap("mode")
    public String mode;

    public static RunSampleFormatConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSampleFormatConfigRequest self = new RunSampleFormatConfigRequest();
        return TeaModel.build(map, self);
    }

    public RunSampleFormatConfigRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
