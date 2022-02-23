// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListVpcsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListVpcsResponseBodyData> data;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcsResponseBody self = new ListVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcsResponseBody setData(java.util.List<ListVpcsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListVpcsResponseBodyData> getData() {
        return this.data;
    }

    public ListVpcsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListVpcsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListVpcsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListVpcsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListVpcsResponseBodyData extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static ListVpcsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVpcsResponseBodyData self = new ListVpcsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVpcsResponseBodyData setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public ListVpcsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVpcsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpcsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVpcsResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVpcsResponseBodyData setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
