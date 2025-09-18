// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CloseStreamToSearchLibRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p>name-1</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>Stream_xxx</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static CloseStreamToSearchLibRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseStreamToSearchLibRequest self = new CloseStreamToSearchLibRequest();
        return TeaModel.build(map, self);
    }

    public CloseStreamToSearchLibRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public CloseStreamToSearchLibRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CloseStreamToSearchLibRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
