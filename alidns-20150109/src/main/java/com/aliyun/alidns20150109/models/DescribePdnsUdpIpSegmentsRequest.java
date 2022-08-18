// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsUdpIpSegmentsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribePdnsUdpIpSegmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsUdpIpSegmentsRequest self = new DescribePdnsUdpIpSegmentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePdnsUdpIpSegmentsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePdnsUdpIpSegmentsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePdnsUdpIpSegmentsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
