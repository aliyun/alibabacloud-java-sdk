// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineStagingCodeUploadInfoRequest extends TeaModel {
    /**
     * <p>The code description.</p>
     * 
     * <strong>example:</strong>
     * <p>the description of code</p>
     */
    @NameInMap("CodeDescription")
    public String codeDescription;

    /**
     * <p>The routine name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GetRoutineStagingCodeUploadInfo</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetRoutineStagingCodeUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineStagingCodeUploadInfoRequest self = new GetRoutineStagingCodeUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetRoutineStagingCodeUploadInfoRequest setCodeDescription(String codeDescription) {
        this.codeDescription = codeDescription;
        return this;
    }
    public String getCodeDescription() {
        return this.codeDescription;
    }

    public GetRoutineStagingCodeUploadInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
