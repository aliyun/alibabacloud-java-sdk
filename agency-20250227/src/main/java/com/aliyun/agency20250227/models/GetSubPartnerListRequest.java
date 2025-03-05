// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetSubPartnerListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SubPartnerCompanyName")
    public String subPartnerCompanyName;

    /**
     * <strong>example:</strong>
     * <p>2323431211</p>
     */
    @NameInMap("SubPartnerPid")
    public String subPartnerPid;

    public static GetSubPartnerListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubPartnerListRequest self = new GetSubPartnerListRequest();
        return TeaModel.build(map, self);
    }

    public GetSubPartnerListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetSubPartnerListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSubPartnerListRequest setSubPartnerCompanyName(String subPartnerCompanyName) {
        this.subPartnerCompanyName = subPartnerCompanyName;
        return this;
    }
    public String getSubPartnerCompanyName() {
        return this.subPartnerCompanyName;
    }

    public GetSubPartnerListRequest setSubPartnerPid(String subPartnerPid) {
        this.subPartnerPid = subPartnerPid;
        return this;
    }
    public String getSubPartnerPid() {
        return this.subPartnerPid;
    }

}
