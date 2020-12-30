// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeBindUserIdListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<DescribeBindUserIdListResponseBodyData> data;

    public static DescribeBindUserIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBindUserIdListResponseBody self = new DescribeBindUserIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBindUserIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBindUserIdListResponseBody setData(java.util.List<DescribeBindUserIdListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBindUserIdListResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeBindUserIdListResponseBodyData extends TeaModel {
        @NameInMap("CertificateType")
        public String certificateType;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("CertificateNo")
        public String certificateNo;

        @NameInMap("Id")
        public Long id;

        public static DescribeBindUserIdListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBindUserIdListResponseBodyData self = new DescribeBindUserIdListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBindUserIdListResponseBodyData setCertificateType(String certificateType) {
            this.certificateType = certificateType;
            return this;
        }
        public String getCertificateType() {
            return this.certificateType;
        }

        public DescribeBindUserIdListResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeBindUserIdListResponseBodyData setCertificateNo(String certificateNo) {
            this.certificateNo = certificateNo;
            return this;
        }
        public String getCertificateNo() {
            return this.certificateNo;
        }

        public DescribeBindUserIdListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
