// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DescribePcaAndExternalCACertificateListRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The certificate identifiers. Separate multiple identifiers with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>aaa,bbb</p>
     */
    @NameInMap("Identifiers")
    public String identifiers;

    /**
     * <p>The search keyword. Fuzzy search by name, domain name, or SANs is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The number of records to display per page. Default value: 50.</p>
     * 
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

    public DescribePcaAndExternalCACertificateListRequest setIdentifiers(String identifiers) {
        this.identifiers = identifiers;
        return this;
    }
    public String getIdentifiers() {
        return this.identifiers;
    }

    public DescribePcaAndExternalCACertificateListRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public DescribePcaAndExternalCACertificateListRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
