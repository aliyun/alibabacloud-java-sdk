// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectorySAMLServiceProviderInfoRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetDirectorySAMLServiceProviderInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDirectorySAMLServiceProviderInfoRequest self = new GetDirectorySAMLServiceProviderInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDirectorySAMLServiceProviderInfoRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
