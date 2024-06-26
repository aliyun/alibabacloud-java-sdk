// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult result;

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody setResult(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultAuthorizedUserList extends TeaModel {
        @NameInMap("GmtAuthorized")
        public String gmtAuthorized;

        @NameInMap("Phone")
        public String phone;

        public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultAuthorizedUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultAuthorizedUserList self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultAuthorizedUserList();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultAuthorizedUserList setGmtAuthorized(String gmtAuthorized) {
            this.gmtAuthorized = gmtAuthorized;
            return this;
        }
        public String getGmtAuthorized() {
            return this.gmtAuthorized;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultAuthorizedUserList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("AuthorizationType")
        public String authorizationType;

        @NameInMap("AuthorizedUserList")
        public java.util.List<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultAuthorizedUserList> authorizedUserList;

        @NameInMap("Pagination")
        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination pagination;

        @NameInMap("QRCodeType")
        public String QRCodeType;

        public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult setAuthorizedUserList(java.util.List<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultAuthorizedUserList> authorizedUserList) {
            this.authorizedUserList = authorizedUserList;
            return this;
        }
        public java.util.List<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultAuthorizedUserList> getAuthorizedUserList() {
            return this.authorizedUserList;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult setPagination(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBodyResult setQRCodeType(String QRCodeType) {
            this.QRCodeType = QRCodeType;
            return this;
        }
        public String getQRCodeType() {
            return this.QRCodeType;
        }

    }

}
