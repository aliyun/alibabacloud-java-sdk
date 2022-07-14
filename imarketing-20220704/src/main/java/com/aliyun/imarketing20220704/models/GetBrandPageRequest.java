// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetBrandPageRequest extends TeaModel {
    @NameInMap("AccountNo")
    public String accountNo;

    @NameInMap("MainId")
    public Long mainId;

    @NameInMap("MainName")
    public String mainName;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetBrandPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBrandPageRequest self = new GetBrandPageRequest();
        return TeaModel.build(map, self);
    }

    public GetBrandPageRequest setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public GetBrandPageRequest setMainId(Long mainId) {
        this.mainId = mainId;
        return this;
    }
    public Long getMainId() {
        return this.mainId;
    }

    public GetBrandPageRequest setMainName(String mainName) {
        this.mainName = mainName;
        return this;
    }
    public String getMainName() {
        return this.mainName;
    }

    public GetBrandPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetBrandPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
