// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSupportLinesRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("DomainName")
    public String domainName;

    public static DescribeSupportLinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportLinesRequest self = new DescribeSupportLinesRequest();
        return TeaModel.build(map, self);
    }

}
