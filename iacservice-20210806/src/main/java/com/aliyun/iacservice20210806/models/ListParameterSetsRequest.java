// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListParameterSetsRequest extends TeaModel {
    /**
     * <p>The keyword for exact match search. The search is case-insensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>The key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21a90f5d-a469-4ac4-a8ea-f6e1e7470e6f</p>
     */
    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results returned per page. Default value: 20. Minimum value: 1. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListParameterSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListParameterSetsRequest self = new ListParameterSetsRequest();
        return TeaModel.build(map, self);
    }

    public ListParameterSetsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListParameterSetsRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public ListParameterSetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListParameterSetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
