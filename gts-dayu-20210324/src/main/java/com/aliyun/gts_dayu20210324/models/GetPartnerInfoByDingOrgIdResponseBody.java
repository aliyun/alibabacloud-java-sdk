// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20210324.models;

import com.aliyun.tea.*;

public class GetPartnerInfoByDingOrgIdResponseBody extends TeaModel {
    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // data
    @NameInMap("Data")
    public GetPartnerInfoByDingOrgIdResponseBodyData data;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // success
    @NameInMap("Success")
    public Boolean success;

    // exception
    @NameInMap("Exception")
    public java.util.Map<String, ?> exception;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPartnerInfoByDingOrgIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPartnerInfoByDingOrgIdResponseBody self = new GetPartnerInfoByDingOrgIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPartnerInfoByDingOrgIdResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetPartnerInfoByDingOrgIdResponseBody setData(GetPartnerInfoByDingOrgIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPartnerInfoByDingOrgIdResponseBodyData getData() {
        return this.data;
    }

    public GetPartnerInfoByDingOrgIdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPartnerInfoByDingOrgIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPartnerInfoByDingOrgIdResponseBody setException(java.util.Map<String, ?> exception) {
        this.exception = exception;
        return this;
    }
    public java.util.Map<String, ?> getException() {
        return this.exception;
    }

    public GetPartnerInfoByDingOrgIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPartnerInfoByDingOrgIdResponseBodyData extends TeaModel {
        // id
        @NameInMap("Id")
        public String id;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("CompanyName")
        public String companyName;

        public static GetPartnerInfoByDingOrgIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPartnerInfoByDingOrgIdResponseBodyData self = new GetPartnerInfoByDingOrgIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPartnerInfoByDingOrgIdResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPartnerInfoByDingOrgIdResponseBodyData setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public GetPartnerInfoByDingOrgIdResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

    }

}
