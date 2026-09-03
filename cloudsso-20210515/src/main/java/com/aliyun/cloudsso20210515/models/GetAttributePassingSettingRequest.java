// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetAttributePassingSettingRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-003qew84****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetAttributePassingSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttributePassingSettingRequest self = new GetAttributePassingSettingRequest();
        return TeaModel.build(map, self);
    }

    public GetAttributePassingSettingRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
