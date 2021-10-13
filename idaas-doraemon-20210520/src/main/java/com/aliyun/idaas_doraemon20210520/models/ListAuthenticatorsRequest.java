// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListAuthenticatorsRequest extends TeaModel {
    // 应用外部Id
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    // 认证器类型
    @NameInMap("AuthenticatorType")
    public String authenticatorType;

    // 当前开始读取的位置，不设置时默认为1
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 本次读取的最大数据记录数量，不指定时使用默认值
    @NameInMap("PageSize")
    public Long pageSize;

    // 用户id
    @NameInMap("UserId")
    public String userId;

    public static ListAuthenticatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticatorsRequest self = new ListAuthenticatorsRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthenticatorsRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public ListAuthenticatorsRequest setAuthenticatorType(String authenticatorType) {
        this.authenticatorType = authenticatorType;
        return this;
    }
    public String getAuthenticatorType() {
        return this.authenticatorType;
    }

    public ListAuthenticatorsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthenticatorsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAuthenticatorsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
