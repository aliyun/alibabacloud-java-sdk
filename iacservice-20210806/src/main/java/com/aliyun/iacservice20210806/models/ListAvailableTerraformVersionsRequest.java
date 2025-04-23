// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListAvailableTerraformVersionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1.35</p>
     */
    @NameInMap("keyWord")
    public String keyWord;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListAvailableTerraformVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableTerraformVersionsRequest self = new ListAvailableTerraformVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableTerraformVersionsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListAvailableTerraformVersionsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAvailableTerraformVersionsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
