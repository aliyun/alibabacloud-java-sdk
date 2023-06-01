// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatAttributeRequest extends TeaModel {
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    public static DescribeSnatAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatAttributeRequest self = new DescribeSnatAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnatAttributeRequest setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

}
