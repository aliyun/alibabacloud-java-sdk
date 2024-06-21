// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListSecurityGroupResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSecurityGroupResponseBodyData> data;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupResponseBody self = new ListSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSecurityGroupResponseBody setData(java.util.List<ListSecurityGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSecurityGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListSecurityGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSecurityGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSecurityGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSecurityGroupResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-8vb8gsmrqyc35k645rk6</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The name of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg2</p>
         */
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        /**
         * <p>The type of the security group. Valid values:</p>
         * <ul>
         * <li>normal: basic security group</li>
         * <li>enterprise: advanced security group For more information, see <a href="https://help.aliyun.com/document_detail/120621.html">Advanced security groups</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("SecurityGroupType")
        public String securityGroupType;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1b</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListSecurityGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityGroupResponseBodyData self = new ListSecurityGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSecurityGroupResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListSecurityGroupResponseBodyData setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public ListSecurityGroupResponseBodyData setSecurityGroupType(String securityGroupType) {
            this.securityGroupType = securityGroupType;
            return this;
        }
        public String getSecurityGroupType() {
            return this.securityGroupType;
        }

        public ListSecurityGroupResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
