// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchMode")
    public String searchMode;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Starmark")
    public Boolean starmark;

    public static DescribeDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsRequest self = new DescribeDomainsRequest();
        return TeaModel.build(map, self);
    }

}
