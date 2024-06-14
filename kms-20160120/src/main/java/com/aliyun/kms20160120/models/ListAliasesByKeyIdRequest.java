// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListAliasesByKeyIdRequest extends TeaModel {
    /**
     * <p>The globally unique ID of the CMK.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Valid values: an integer that is greater than 0.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 0 to 101.</p>
     * <br>
     * <p>Default value: 10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAliasesByKeyIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesByKeyIdRequest self = new ListAliasesByKeyIdRequest();
        return TeaModel.build(map, self);
    }

    public ListAliasesByKeyIdRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public ListAliasesByKeyIdRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAliasesByKeyIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
