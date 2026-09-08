// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSkillsRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of rows per page in a paged query. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The skill channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BUSINESS</p>
     */
    @NameInMap("SkillChannel")
    public String skillChannel;

    /**
     * <p>The list of skill IDs.</p>
     */
    @NameInMap("SkillIds")
    public java.util.List<String> skillIds;

    /**
     * <p>The supply type.</p>
     * 
     * <strong>example:</strong>
     * <p>WUYING</p>
     */
    @NameInMap("SupplierType")
    public String supplierType;

    /**
     * <p>TagCodes</p>
     */
    @NameInMap("TagCodes")
    public java.util.List<String> tagCodes;

    public static ListSkillsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsRequest self = new ListSkillsRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSkillsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillsRequest setSkillChannel(String skillChannel) {
        this.skillChannel = skillChannel;
        return this;
    }
    public String getSkillChannel() {
        return this.skillChannel;
    }

    public ListSkillsRequest setSkillIds(java.util.List<String> skillIds) {
        this.skillIds = skillIds;
        return this;
    }
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    public ListSkillsRequest setSupplierType(String supplierType) {
        this.supplierType = supplierType;
        return this;
    }
    public String getSupplierType() {
        return this.supplierType;
    }

    public ListSkillsRequest setTagCodes(java.util.List<String> tagCodes) {
        this.tagCodes = tagCodes;
        return this;
    }
    public java.util.List<String> getTagCodes() {
        return this.tagCodes;
    }

}
