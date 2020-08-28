// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchRetcodeAppByPageRequest extends TeaModel {
    @NameInMap("RetcodeAppName")
    public String retcodeAppName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static SearchRetcodeAppByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchRetcodeAppByPageRequest self = new SearchRetcodeAppByPageRequest();
        return TeaModel.build(map, self);
    }

}
