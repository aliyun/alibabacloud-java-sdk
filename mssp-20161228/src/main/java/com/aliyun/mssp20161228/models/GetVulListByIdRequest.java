// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulListByIdRequest extends TeaModel {
    /**
     * <p>Current page</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Whether it has been processed; y: processed; n: not processed</p>
     * 
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>Primary key ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4209205</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Risk level</p>
     * 
     * <strong>example:</strong>
     * <p>asap,later,nntf</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Asset information of the vulnerability to be queried, which can be set as asset name, public IP, or private IP.</p>
     * 
     * <strong>example:</strong>
     * <p>production_nat_cn-hangzhou_zone_105</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>UUID of the server with the vulnerability to be queried. Multiple UUIDs should be separated by a comma (,).</p>
     * 
     * <strong>example:</strong>
     * <p>3615b908-995a-4edb-bc85-1981b4e94ba0,9c52cf9a-d8ba-4e31-ae06-500b879ee4e6,4b7de3cf-c4ac-42fc-8804-35070493dc29,f3c01525-0777-4c97-88d9-bec11afd4a6a,a80bd516-c4f3-4c27-a169-c8abfaf9e89e</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static GetVulListByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVulListByIdRequest self = new GetVulListByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetVulListByIdRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetVulListByIdRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public GetVulListByIdRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetVulListByIdRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public GetVulListByIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetVulListByIdRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public GetVulListByIdRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
