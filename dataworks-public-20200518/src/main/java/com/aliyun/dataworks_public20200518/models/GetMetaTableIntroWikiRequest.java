// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableIntroWikiRequest extends TeaModel {
    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("WikiVersion")
    public Long wikiVersion;

    public static GetMetaTableIntroWikiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableIntroWikiRequest self = new GetMetaTableIntroWikiRequest();
        return TeaModel.build(map, self);
    }

}
