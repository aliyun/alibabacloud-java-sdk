// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainStatisticsSummaryRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartDate")
    @Validation(required = true)
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("SearchMode")
    public String searchMode;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Threshold")
    public Long threshold;

    public static DescribeDomainStatisticsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainStatisticsSummaryRequest self = new DescribeDomainStatisticsSummaryRequest();
        return TeaModel.build(map, self);
    }

}
