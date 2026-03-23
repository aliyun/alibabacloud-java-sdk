// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTagMetaAssetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("MetaParentId")
    public String metaParentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>META_DATABASE</p>
     */
    @NameInMap("MetaType")
    public String metaType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sys::DMS-DA::cn-hangzhou::space:abcde</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListTagMetaAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagMetaAssetRequest self = new ListTagMetaAssetRequest();
        return TeaModel.build(map, self);
    }

    public ListTagMetaAssetRequest setMetaParentId(String metaParentId) {
        this.metaParentId = metaParentId;
        return this;
    }
    public String getMetaParentId() {
        return this.metaParentId;
    }

    public ListTagMetaAssetRequest setMetaType(String metaType) {
        this.metaType = metaType;
        return this;
    }
    public String getMetaType() {
        return this.metaType;
    }

    public ListTagMetaAssetRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTagMetaAssetRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagMetaAssetRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListTagMetaAssetRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public ListTagMetaAssetRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
