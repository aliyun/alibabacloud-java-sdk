// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetAccessChannelOfStagingRequest extends TeaModel {
    @NameInMap("SearchPattern")
    public String searchPattern;

    public static GetAccessChannelOfStagingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessChannelOfStagingRequest self = new GetAccessChannelOfStagingRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessChannelOfStagingRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

}
