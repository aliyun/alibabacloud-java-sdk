// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CopyGtmConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceId")
    @Validation(required = true)
    public String sourceId;

    @NameInMap("TargetId")
    @Validation(required = true)
    public String targetId;

    @NameInMap("CopyType")
    @Validation(required = true)
    public String copyType;

    public static CopyGtmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyGtmConfigRequest self = new CopyGtmConfigRequest();
        return TeaModel.build(map, self);
    }

}
