// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeStatDeviceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeStatDeviceInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeStatDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatDeviceInfoResponseBody self = new DescribeStatDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStatDeviceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeStatDeviceInfoResponseBody setData(DescribeStatDeviceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeStatDeviceInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeStatDeviceInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeStatDeviceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeStatDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStatDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeStatDeviceInfoResponseBodyDataBizChainList extends TeaModel {
        @NameInMap("AuthorizedCount")
        public Integer authorizedCount;

        @NameInMap("BizChainName")
        public String bizChainName;

        public static DescribeStatDeviceInfoResponseBodyDataBizChainList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStatDeviceInfoResponseBodyDataBizChainList self = new DescribeStatDeviceInfoResponseBodyDataBizChainList();
            return TeaModel.build(map, self);
        }

        public DescribeStatDeviceInfoResponseBodyDataBizChainList setAuthorizedCount(Integer authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Integer getAuthorizedCount() {
            return this.authorizedCount;
        }

        public DescribeStatDeviceInfoResponseBodyDataBizChainList setBizChainName(String bizChainName) {
            this.bizChainName = bizChainName;
            return this;
        }
        public String getBizChainName() {
            return this.bizChainName;
        }

    }

    public static class DescribeStatDeviceInfoResponseBodyData extends TeaModel {
        @NameInMap("BizChainList")
        public java.util.List<DescribeStatDeviceInfoResponseBodyDataBizChainList> bizChainList;

        @NameInMap("DistributableCount")
        public Integer distributableCount;

        @NameInMap("TotalAuthorizedCount")
        public Integer totalAuthorizedCount;

        public static DescribeStatDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeStatDeviceInfoResponseBodyData self = new DescribeStatDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeStatDeviceInfoResponseBodyData setBizChainList(java.util.List<DescribeStatDeviceInfoResponseBodyDataBizChainList> bizChainList) {
            this.bizChainList = bizChainList;
            return this;
        }
        public java.util.List<DescribeStatDeviceInfoResponseBodyDataBizChainList> getBizChainList() {
            return this.bizChainList;
        }

        public DescribeStatDeviceInfoResponseBodyData setDistributableCount(Integer distributableCount) {
            this.distributableCount = distributableCount;
            return this;
        }
        public Integer getDistributableCount() {
            return this.distributableCount;
        }

        public DescribeStatDeviceInfoResponseBodyData setTotalAuthorizedCount(Integer totalAuthorizedCount) {
            this.totalAuthorizedCount = totalAuthorizedCount;
            return this;
        }
        public Integer getTotalAuthorizedCount() {
            return this.totalAuthorizedCount;
        }

    }

}
