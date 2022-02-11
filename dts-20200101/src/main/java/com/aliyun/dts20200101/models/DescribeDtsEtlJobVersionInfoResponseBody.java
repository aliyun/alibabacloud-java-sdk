// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsEtlJobVersionInfoResponseBody extends TeaModel {
    @NameInMap("DtsEtlJobVersionInfos")
    public java.util.List<DescribeDtsEtlJobVersionInfoResponseBodyDtsEtlJobVersionInfos> dtsEtlJobVersionInfos;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("DtsInstanceId")
        public String dtsInstanceId;

        @NameInMap("DtsJobId")
        public String dtsJobId;

        @NameInMap("DtsJobName")
        public String dtsJobName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("SafeCheckpoint")
        public String safeCheckpoint;

        @NameInMap("Status")
        public String status;

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
