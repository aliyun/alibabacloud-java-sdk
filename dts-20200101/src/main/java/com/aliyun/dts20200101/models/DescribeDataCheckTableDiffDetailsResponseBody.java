// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDiffDetailsResponseBody extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DiffCount")
    public Long diffCount;

    @NameInMap("DiffDetails")
    public java.util.List<DescribeDataCheckTableDiffDetailsResponseBodyDiffDetails> diffDetails;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Diff")
        public String diff;

        @NameInMap("GmtCreated")
        public String gmtCreated;

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
