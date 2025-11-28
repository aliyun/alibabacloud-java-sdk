// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeAdminInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeAdminInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAdminInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdminInfoResponseBody self = new DescribeAdminInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdminInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAdminInfoResponseBody setData(DescribeAdminInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAdminInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeAdminInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAdminInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdminInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdminInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAdminInfoResponseBodyData extends TeaModel {
        @NameInMap("AccessDate")
        public Long accessDate;

        @NameInMap("AccessStatus")
        public String accessStatus;

        @NameInMap("AuthorizedCount")
        public Long authorizedCount;

        @NameInMap("AuthorizedDeviceCount")
        public Long authorizedDeviceCount;

        @NameInMap("Contactor")
        public String contactor;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        @NameInMap("Telephony")
        public String telephony;

        @NameInMap("Uid")
        public String uid;

        public static DescribeAdminInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdminInfoResponseBodyData self = new DescribeAdminInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAdminInfoResponseBodyData setAccessDate(Long accessDate) {
            this.accessDate = accessDate;
            return this;
        }
        public Long getAccessDate() {
            return this.accessDate;
        }

        public DescribeAdminInfoResponseBodyData setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public DescribeAdminInfoResponseBodyData setAuthorizedCount(Long authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        public DescribeAdminInfoResponseBodyData setAuthorizedDeviceCount(Long authorizedDeviceCount) {
            this.authorizedDeviceCount = authorizedDeviceCount;
            return this;
        }
        public Long getAuthorizedDeviceCount() {
            return this.authorizedDeviceCount;
        }

        public DescribeAdminInfoResponseBodyData setContactor(String contactor) {
            this.contactor = contactor;
            return this;
        }
        public String getContactor() {
            return this.contactor;
        }

        public DescribeAdminInfoResponseBodyData setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DescribeAdminInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAdminInfoResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeAdminInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAdminInfoResponseBodyData setTelephony(String telephony) {
            this.telephony = telephony;
            return this;
        }
        public String getTelephony() {
            return this.telephony;
        }

        public DescribeAdminInfoResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
