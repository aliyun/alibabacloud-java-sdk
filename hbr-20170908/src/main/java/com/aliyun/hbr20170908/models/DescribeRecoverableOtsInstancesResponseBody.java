// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeRecoverableOtsInstancesResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of Tablestore instances that can be restored and the tables in the instances.</p>
     */
    @NameInMap("OtsInstances")
    public java.util.List<DescribeRecoverableOtsInstancesResponseBodyOtsInstances> otsInstances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14DC089E-5DD3-5028-AEDB-93D78E11DB2A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRecoverableOtsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoverableOtsInstancesResponseBody self = new DescribeRecoverableOtsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecoverableOtsInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRecoverableOtsInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRecoverableOtsInstancesResponseBody setOtsInstances(java.util.List<DescribeRecoverableOtsInstancesResponseBodyOtsInstances> otsInstances) {
        this.otsInstances = otsInstances;
        return this;
    }
    public java.util.List<DescribeRecoverableOtsInstancesResponseBodyOtsInstances> getOtsInstances() {
        return this.otsInstances;
    }

    public DescribeRecoverableOtsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecoverableOtsInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRecoverableOtsInstancesResponseBodyOtsInstances extends TeaModel {
        /**
         * <p>The name of the Tablestore instance that can be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>instancename</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The names of the tables in the Tablestore instance.</p>
         */
        @NameInMap("TableNames")
        public java.util.List<String> tableNames;

        public static DescribeRecoverableOtsInstancesResponseBodyOtsInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecoverableOtsInstancesResponseBodyOtsInstances self = new DescribeRecoverableOtsInstancesResponseBodyOtsInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRecoverableOtsInstancesResponseBodyOtsInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRecoverableOtsInstancesResponseBodyOtsInstances setTableNames(java.util.List<String> tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public java.util.List<String> getTableNames() {
            return this.tableNames;
        }

    }

}
