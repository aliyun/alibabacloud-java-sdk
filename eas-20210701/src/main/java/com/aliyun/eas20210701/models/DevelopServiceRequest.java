// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DevelopServiceRequest extends TeaModel {
    /**
     * <p>Specifies whether to exit development mode. Valid values:</p>
     * <ul>
     * <li>true: exits development mode.</li>
     * <li>false (default): enters development mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Exit")
    public String exit;

    public static DevelopServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DevelopServiceRequest self = new DevelopServiceRequest();
        return TeaModel.build(map, self);
    }

    public DevelopServiceRequest setExit(String exit) {
        this.exit = exit;
        return this;
    }
    public String getExit() {
        return this.exit;
    }

}
