// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180813.models;

import com.aliyun.tea.*;

public class ListPCAInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <strong>example:</strong>
     * <p>iTrusChina</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListPCAInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPCAInstanceRequest self = new ListPCAInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListPCAInstanceRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListPCAInstanceRequest setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListPCAInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
