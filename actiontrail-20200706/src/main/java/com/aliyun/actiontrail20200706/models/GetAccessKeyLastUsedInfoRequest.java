// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedInfoRequest extends TeaModel {
    /**
     * <p>The AccessKey secret.</p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    public static GetAccessKeyLastUsedInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedInfoRequest self = new GetAccessKeyLastUsedInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedInfoRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

}
