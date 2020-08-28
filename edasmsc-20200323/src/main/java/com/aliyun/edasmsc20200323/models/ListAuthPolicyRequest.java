// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class ListAuthPolicyRequest extends TeaModel {
    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public String pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Name")
    public String name;

    @NameInMap("AppId")
    public String appId;

    public static ListAuthPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthPolicyRequest self = new ListAuthPolicyRequest();
        return TeaModel.build(map, self);
    }

}
