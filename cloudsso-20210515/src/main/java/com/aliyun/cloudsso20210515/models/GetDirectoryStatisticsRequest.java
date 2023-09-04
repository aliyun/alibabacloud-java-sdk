// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectoryStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetDirectoryStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryStatisticsRequest self = new GetDirectoryStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetDirectoryStatisticsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
