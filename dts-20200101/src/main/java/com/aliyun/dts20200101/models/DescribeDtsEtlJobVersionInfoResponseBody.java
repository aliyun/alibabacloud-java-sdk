// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsEtlJobVersionInfoResponseBody extends TeaModel {
    /**
     * <p>The details of ETL tasks.</p>
     */
    @NameInMap("DtsEtlJobVersionInfos")
    public java.util.List<DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos> dtsEtlJobVersionInfos;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message.</p>
     * 
     * <strong>example:</strong>
     * <p>present environment is not support,so skip</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code. This example indicates that the specified ETL task ID is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidJobId</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message. This example indicates that the specified ETL task ID does not exist. In this case, the ETL task may have been deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified dts job id %s is not exists.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The page number of the returned page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>224DB9F7-3100-4899-AB9C-C938BCCB43E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. If the call failed, false is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDtsEtlJobVersionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsEtlJobVersionInfoResponseBody self = new DescribeDtsEtlJobVersionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setDtsEtlJobVersionInfos(java.util.List<DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos> dtsEtlJobVersionInfos) {
        this.dtsEtlJobVersionInfos = dtsEtlJobVersionInfos;
        return this;
    }
    public java.util.List<DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos> getDtsEtlJobVersionInfos() {
        return this.dtsEtlJobVersionInfos;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDtsEtlJobVersionInfoResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos extends TeaModel {
        /**
         * <p>The time when the ETL task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1637229315000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>10000000</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The username of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>@</strong></em>*.com</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The ID of the DTS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsg******gd</p>
         */
        @NameInMap("DtsInstanceId")
        public String dtsInstanceId;

        /**
         * <p>The ID of the ETL task.</p>
         * 
         * <strong>example:</strong>
         * <p>l5512es7w15****</p>
         */
        @NameInMap("DtsJobId")
        public String dtsJobId;

        /**
         * <p>The name of the ETL task.</p>
         * 
         * <strong>example:</strong>
         * <p>test_sql</p>
         */
        @NameInMap("DtsJobName")
        public String dtsJobName;

        /**
         * <p>The time when the ETL task was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1637230117000</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The safe checkpoint of the ETL task.</p>
         * 
         * <strong>example:</strong>
         * <p>1637230117000</p>
         */
        @NameInMap("SafeCheckpoint")
        public String safeCheckpoint;

        /**
         * <p>The log level. Valid values: ERROR, WARN, INFO, and DEBUG.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version number of the ETL task.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos self = new DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setDtsInstanceId(String dtsInstanceId) {
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }
        public String getDtsInstanceId() {
            return this.dtsInstanceId;
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setDtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }
        public String getDtsJobId() {
            return this.dtsJobId;
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setDtsJobName(String dtsJobName) {
            this.dtsJobName = dtsJobName;
            return this;
        }
        public String getDtsJobName() {
            return this.dtsJobName;
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setSafeCheckpoint(String safeCheckpoint) {
            this.safeCheckpoint = safeCheckpoint;
            return this;
        }
        public String getSafeCheckpoint() {
            return this.safeCheckpoint;
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
