// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteHotwordLibraryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("HotwordLibraryId")
    public String hotwordLibraryId;

    public static DeleteHotwordLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotwordLibraryRequest self = new DeleteHotwordLibraryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHotwordLibraryRequest setHotwordLibraryId(String hotwordLibraryId) {
        this.hotwordLibraryId = hotwordLibraryId;
        return this;
    }
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

}
