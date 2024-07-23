// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAccessPageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a-075nu7bcqim2wvxli</p>
     */
    @NameInMap("AccessPageId")
    public String accessPageId;

    public static DeleteAccessPageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessPageRequest self = new DeleteAccessPageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessPageRequest setAccessPageId(String accessPageId) {
        this.accessPageId = accessPageId;
        return this;
    }
    public String getAccessPageId() {
        return this.accessPageId;
    }

}
