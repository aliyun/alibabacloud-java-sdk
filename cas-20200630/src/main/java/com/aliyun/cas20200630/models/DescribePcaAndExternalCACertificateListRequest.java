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
     * <p>One or more certificate identifiers, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>aaa,bbb</p>
     */
    @NameInMap("Identifiers")
    public String identifiers;

    /**
     * <p>The keyword for a fuzzy search on the name, domain name, and SAN fields.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The number of entries to return per page. The default value is 50.</p>
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
