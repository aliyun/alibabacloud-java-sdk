// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QRCodeType")
    public String QRCodeType;

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest setQRCodeType(String QRCodeType) {
        this.QRCodeType = QRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.QRCodeType;
    }

}
