// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("QRCodeType")
    public String QRCodeType;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest setQRCodeType(String QRCodeType) {
        this.QRCodeType = QRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.QRCodeType;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
