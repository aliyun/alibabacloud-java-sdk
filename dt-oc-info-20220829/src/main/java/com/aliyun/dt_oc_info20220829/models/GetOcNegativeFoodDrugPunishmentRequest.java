// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcNegativeFoodDrugPunishmentRequest extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    public static GetOcNegativeFoodDrugPunishmentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOcNegativeFoodDrugPunishmentRequest self = new GetOcNegativeFoodDrugPunishmentRequest();
        return TeaModel.build(map, self);
    }

    public GetOcNegativeFoodDrugPunishmentRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetOcNegativeFoodDrugPunishmentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOcNegativeFoodDrugPunishmentRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
