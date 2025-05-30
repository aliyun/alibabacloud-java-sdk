// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetHotwordLibraryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("HotwordLibraryId")
    public String hotwordLibraryId;

    public static GetHotwordLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotwordLibraryRequest self = new GetHotwordLibraryRequest();
        return TeaModel.build(map, self);
    }

    public GetHotwordLibraryRequest setHotwordLibraryId(String hotwordLibraryId) {
        this.hotwordLibraryId = hotwordLibraryId;
        return this;
    }
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

}
