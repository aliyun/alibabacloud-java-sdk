// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryMediaIndexJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("SearchLibName")
    public String searchLibName;

    public static QueryMediaIndexJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaIndexJobRequest self = new QueryMediaIndexJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaIndexJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public QueryMediaIndexJobRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
