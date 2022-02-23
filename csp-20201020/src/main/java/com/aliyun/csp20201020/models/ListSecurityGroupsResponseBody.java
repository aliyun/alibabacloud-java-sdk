// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListSecurityGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListSecurityGroupsResponseBodyData> data;

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

    public static ListSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupsResponseBody self = new ListSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupsResponseBody setData(java.util.List<ListSecurityGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSecurityGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListSecurityGroupsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListSecurityGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSecurityGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSecurityGroupsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListSecurityGroupsResponseBodyData extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListSecurityGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityGroupsResponseBodyData self = new ListSecurityGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSecurityGroupsResponseBodyData setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListSecurityGroupsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSecurityGroupsResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListSecurityGroupsResponseBodyData setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public ListSecurityGroupsResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
