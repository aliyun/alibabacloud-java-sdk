// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribePcaAndExternalCACertificateListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    public static DescribePcaAndExternalCACertificateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePcaAndExternalCACertificateListRequest self = new DescribePcaAndExternalCACertificateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePcaAndExternalCACertificateListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePcaAndExternalCACertificateListRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
