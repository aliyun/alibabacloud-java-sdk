// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulItemPageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>RHSA-2018:3665-Important: NetworkManager security update</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <strong>example:</strong>
     * <p>later</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <strong>example:</strong>
     * <p>oval:com.redhat.rhsa:def:20183665</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    public static GetVulItemPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVulItemPageRequest self = new GetVulItemPageRequest();
        return TeaModel.build(map, self);
    }

    public GetVulItemPageRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public GetVulItemPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetVulItemPageRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public GetVulItemPageRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetVulItemPageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetVulItemPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetVulItemPageRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

}
