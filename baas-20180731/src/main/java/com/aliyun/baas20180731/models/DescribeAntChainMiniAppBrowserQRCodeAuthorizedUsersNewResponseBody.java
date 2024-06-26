// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody setResult(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList extends TeaModel {
        @NameInMap("GmtAuthorized")
        public String gmtAuthorized;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("UserId")
        public Long userId;

        public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList setGmtAuthorized(String gmtAuthorized) {
            this.gmtAuthorized = gmtAuthorized;
            return this;
        }
        public String getGmtAuthorized() {
            return this.gmtAuthorized;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("AuthorizationType")
        public String authorizationType;

        @NameInMap("AuthorizedUserList")
        public java.util.List<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList> authorizedUserList;

        @NameInMap("Pagination")
        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination pagination;

        @NameInMap("QRCodeType")
        public String QRCodeType;

        public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult self = new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult setAuthorizedUserList(java.util.List<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList> authorizedUserList) {
            this.authorizedUserList = authorizedUserList;
            return this;
        }
        public java.util.List<DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultAuthorizedUserList> getAuthorizedUserList() {
            return this.authorizedUserList;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult setPagination(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponseBodyResult setQRCodeType(String QRCodeType) {
            this.QRCodeType = QRCodeType;
            return this;
        }
        public String getQRCodeType() {
            return this.QRCodeType;
        }

    }

}
