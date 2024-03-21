// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainsBySourceRequest extends TeaModel {
    /**
     * <p>The list of origin servers. Separate origin servers with commas (,). You can specify a maximum of 20 origin servers. Fuzzy match is not supported.</p>
     */
    @NameInMap("Sources")
    public String sources;

    public static DescribeDcdnDomainsBySourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainsBySourceRequest self = new DescribeDcdnDomainsBySourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainsBySourceRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

}
