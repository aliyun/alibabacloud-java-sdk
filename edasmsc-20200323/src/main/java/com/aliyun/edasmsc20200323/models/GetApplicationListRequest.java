// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetApplicationListRequest extends TeaModel {
    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Source")
    public String source;

    @NameInMap("Language")
    public String language;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static GetApplicationListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationListRequest self = new GetApplicationListRequest();
        return TeaModel.build(map, self);
    }

}
