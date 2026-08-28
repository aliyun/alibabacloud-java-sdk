// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifyForwardSqlLogConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>ForwardSqlLogResult</p>
     */
    @NameInMap("Data")
    public ModifyForwardSqlLogConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifyForwardSqlLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardSqlLogConfigResponseBody self = new ModifyForwardSqlLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyForwardSqlLogConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyForwardSqlLogConfigResponseBody setData(ModifyForwardSqlLogConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyForwardSqlLogConfigResponseBodyData getData() {
        return this.data;
    }

    public ModifyForwardSqlLogConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyForwardSqlLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyForwardSqlLogConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ModifyForwardSqlLogConfigResponseBodyData extends TeaModel {
        /**
         * <p>The LogStore name for real-time delivery to Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>cdn222</p>
         */
        @NameInMap("Logstore")
        public String logstore;

        /**
         * <p>The project.</p>
         * 
         * <strong>example:</strong>
         * <p>facedetect7</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The VPC endpoint of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-intranet.log.aliyuncs.com</p>
         */
        @NameInMap("VpcEndpoint")
        public String vpcEndpoint;

        public static ModifyForwardSqlLogConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyForwardSqlLogConfigResponseBodyData self = new ModifyForwardSqlLogConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyForwardSqlLogConfigResponseBodyData setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ModifyForwardSqlLogConfigResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ModifyForwardSqlLogConfigResponseBodyData setVpcEndpoint(String vpcEndpoint) {
            this.vpcEndpoint = vpcEndpoint;
            return this;
        }
        public String getVpcEndpoint() {
            return this.vpcEndpoint;
        }

    }

}
