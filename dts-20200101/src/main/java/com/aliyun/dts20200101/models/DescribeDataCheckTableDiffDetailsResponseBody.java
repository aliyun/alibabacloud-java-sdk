// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDiffDetailsResponseBody extends TeaModel {
    /**
     * <p>The name of the source database to which the table that contains inconsistent data belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>db_dtstest</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The number of data rows that contain inconsistent data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DiffCount")
    public Long diffCount;

    /**
     * <p>The information about the inconsistent data.</p>
     */
    @NameInMap("DiffDetails")
    public java.util.List<DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails> diffDetails;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \<em>\</em>%s\<em>\</em> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p>For example, if the value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the value of the <strong>DynamicMessage</strong> parameter is <strong>Type</strong>, the specified <strong>Type</strong> parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Type</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The value of the parameter tbName is invalid.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dtsog8q1z3tc9t****&quot;</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>621BB4F8-3016-4FAA-8D5A-5D3163CC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The name of the table that contains inconsistent data in the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>test_person</p>
     */
    @NameInMap("TbName")
    public String tbName;

    public static DescribeDataCheckTableDiffDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckTableDiffDetailsResponseBody self = new DescribeDataCheckTableDiffDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setDiffCount(Long diffCount) {
        this.diffCount = diffCount;
        return this;
    }
    public Long getDiffCount() {
        return this.diffCount;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setDiffDetails(java.util.List<DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails> diffDetails) {
        this.diffDetails = diffDetails;
        return this;
    }
    public java.util.List<DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails> getDiffDetails() {
        return this.diffDetails;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDataCheckTableDiffDetailsResponseBody setTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }
    public String getTbName() {
        return this.tbName;
    }

    public static class DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails extends TeaModel {
        /**
         * <p>The details of the inconsistent data, whose value is a JSON string. The JSON string contains the following parameters:</p>
         * <ul>
         * <li>column: the name of the field.</li>
         * <li>source: the value of the field in the source database.</li>
         * <li>dest: the value of the field in the destination database.</li>
         * <li>isPrimary: indicates whether the field is a primary key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[     {         &quot;column&quot;: &quot;id&quot;,         &quot;source&quot;: &quot;9511&quot;,         &quot;dest&quot;: &quot;9511&quot;,         &quot;isPrimary&quot;: true     },     {         &quot;column&quot;: &quot;state&quot;,         &quot;source&quot;: &quot;3&quot;,         &quot;dest&quot;: &quot;2&quot;,         &quot;isPrimary&quot;: false     },     {         &quot;column&quot;: &quot;create_time&quot;,         &quot;source&quot;: &quot;2023-04-11 14:07:17.0&quot;,         &quot;dest&quot;: &quot;NULL&quot;,         &quot;isPrimary&quot;: false     },     {         &quot;column&quot;: &quot;update_time&quot;,         &quot;source&quot;: &quot;2023-04-11 06:07:17.0&quot;,         &quot;dest&quot;: &quot;2023-04-11 06:02:29.0&quot;,         &quot;isPrimary&quot;: false     } ]</p>
         */
        @NameInMap("Diff")
        public String diff;

        /**
         * <p>The time when the data verification was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-23T10:36:05.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The auto-increment primary key that is used to identify the data in a verification result.</p>
         * 
         * <strong>example:</strong>
         * <p>13058****</p>
         */
        @NameInMap("Id")
        public Long id;

        public static DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails self = new DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
