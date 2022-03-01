// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody setResult(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultAuthorizedUserList extends TeaModel {
        @NameInMap("GmtAuthorized")
        public String gmtAuthorized;

        @NameInMap("Phone")
        public String phone;

        public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultAuthorizedUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultAuthorizedUserList self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultAuthorizedUserList();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultAuthorizedUserList setGmtAuthorized(String gmtAuthorized) {
            this.gmtAuthorized = gmtAuthorized;
            return this;
        }
        public String getGmtAuthorized() {
            return this.gmtAuthorized;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultAuthorizedUserList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("AuthorizationType")
        public String authorizationType;

        @NameInMap("AuthorizedUserList")
        public java.util.List<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultAuthorizedUserList> authorizedUserList;

        @NameInMap("Pagination")
        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination pagination;

        @NameInMap("QRCodeType")
        public String QRCodeType;

        public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult setAuthorizedUserList(java.util.List<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultAuthorizedUserList> authorizedUserList) {
            this.authorizedUserList = authorizedUserList;
            return this;
        }
        public java.util.List<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultAuthorizedUserList> getAuthorizedUserList() {
            return this.authorizedUserList;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult setPagination(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBodyResult setQRCodeType(String QRCodeType) {
            this.QRCodeType = QRCodeType;
            return this;
        }
        public String getQRCodeType() {
            return this.QRCodeType;
        }

    }

}
