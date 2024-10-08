// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeyVersionsRequest extends TeaModel {
    /**
     * <p>The globally unique ID of the CMK. You can also set this parameter to an alias that is bound to the CMK. For more information, see <a href="https://help.aliyun.com/document_detail/68522.html">Use aliases</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0b30658a-ed1a-4922-b8f7-a673ca9c****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The number of the page to return.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 0 to 101.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListKeyVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKeyVersionsRequest self = new ListKeyVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListKeyVersionsRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public ListKeyVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKeyVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
