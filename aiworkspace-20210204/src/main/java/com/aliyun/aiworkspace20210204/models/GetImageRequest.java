// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetImageRequest extends TeaModel {
    /**
     * <p>Specifies whether to display optional information. Optional information currently includes Labels.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>false (default): Optional information is not displayed.</li>
     * <li>true: Optional information is displayed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageRequest self = new GetImageRequest();
        return TeaModel.build(map, self);
    }

    public GetImageRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
