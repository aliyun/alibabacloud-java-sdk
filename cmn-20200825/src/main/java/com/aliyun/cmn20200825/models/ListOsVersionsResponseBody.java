// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListOsVersionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("OsVersion")
    public java.util.List<ListOsVersionsResponseBodyOsVersion> osVersion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListOsVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOsVersionsResponseBody self = new ListOsVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOsVersionsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListOsVersionsResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListOsVersionsResponseBody setOsVersion(java.util.List<ListOsVersionsResponseBodyOsVersion> osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public java.util.List<ListOsVersionsResponseBodyOsVersion> getOsVersion() {
        return this.osVersion;
    }

    public ListOsVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOsVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOsVersionsResponseBodyOsVersion extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Model")
        public String model;

        @NameInMap("OsVersion")
        public String osVersion;

        @NameInMap("OsVersionId")
        public String osVersionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Vendor")
        public String vendor;

        public static ListOsVersionsResponseBodyOsVersion build(java.util.Map<String, ?> map) throws Exception {
            ListOsVersionsResponseBodyOsVersion self = new ListOsVersionsResponseBodyOsVersion();
            return TeaModel.build(map, self);
        }

        public ListOsVersionsResponseBodyOsVersion setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOsVersionsResponseBodyOsVersion setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListOsVersionsResponseBodyOsVersion setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListOsVersionsResponseBodyOsVersion setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListOsVersionsResponseBodyOsVersion setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public ListOsVersionsResponseBodyOsVersion setOsVersionId(String osVersionId) {
            this.osVersionId = osVersionId;
            return this;
        }
        public String getOsVersionId() {
            return this.osVersionId;
        }

        public ListOsVersionsResponseBodyOsVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOsVersionsResponseBodyOsVersion setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListOsVersionsResponseBodyOsVersion setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
