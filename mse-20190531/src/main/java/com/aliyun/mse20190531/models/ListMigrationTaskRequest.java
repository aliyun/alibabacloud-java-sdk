// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListMigrationTaskRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("OriginInstanceName")
    public String originInstanceName;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestPars")
    public String requestPars;

    public static ListMigrationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationTaskRequest self = new ListMigrationTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListMigrationTaskRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListMigrationTaskRequest setOriginInstanceName(String originInstanceName) {
        this.originInstanceName = originInstanceName;
        return this;
    }
    public String getOriginInstanceName() {
        return this.originInstanceName;
    }

    public ListMigrationTaskRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListMigrationTaskRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMigrationTaskRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
