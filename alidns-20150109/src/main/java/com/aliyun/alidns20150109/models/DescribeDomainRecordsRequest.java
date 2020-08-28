// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("RRKeyWord")
    public String RRKeyWord;

    @NameInMap("TypeKeyWord")
    public String typeKeyWord;

    @NameInMap("ValueKeyWord")
    public String valueKeyWord;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("SearchMode")
    public String searchMode;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Line")
    public String line;

    @NameInMap("Status")
    public String status;

    public static DescribeDomainRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordsRequest self = new DescribeDomainRecordsRequest();
        return TeaModel.build(map, self);
    }

}
