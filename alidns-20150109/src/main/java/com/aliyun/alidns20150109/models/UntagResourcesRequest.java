// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceType")
    @Validation(required = true)
    public String resourceType;

    @NameInMap("All")
    public Boolean all;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public java.util.List<String> resourceId;

    @NameInMap("TagKey")
    public java.util.List<String> tagKey;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

}
