// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListOsVersionsResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 数组，返回示例目录。
    @NameInMap("OsVersion")
    public java.util.List<ListOsVersionsResponseBodyOsVersion> osVersion;

    public static ListOsVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOsVersionsResponseBody self = new ListOsVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOsVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOsVersionsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListOsVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class ListOsVersionsResponseBodyOsVersion extends TeaModel {
        // 系统版本
        @NameInMap("OsVersion")
        public String osVersion;

        // 文件名
        @NameInMap("FileName")
        public String fileName;

        // 状态
        @NameInMap("Status")
        public String status;

        // 文件路径
        @NameInMap("FilePath")
        public String filePath;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 型号
        @NameInMap("Model")
        public String model;

        // 资源uuid
        @NameInMap("OsVersionId")
        public String osVersionId;

        // 修改时间
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListOsVersionsResponseBodyOsVersion build(java.util.Map<String, ?> map) throws Exception {
            ListOsVersionsResponseBodyOsVersion self = new ListOsVersionsResponseBodyOsVersion();
            return TeaModel.build(map, self);
        }

        public ListOsVersionsResponseBodyOsVersion setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public ListOsVersionsResponseBodyOsVersion setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListOsVersionsResponseBodyOsVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOsVersionsResponseBodyOsVersion setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListOsVersionsResponseBodyOsVersion setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOsVersionsResponseBodyOsVersion setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListOsVersionsResponseBodyOsVersion setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListOsVersionsResponseBodyOsVersion setOsVersionId(String osVersionId) {
            this.osVersionId = osVersionId;
            return this;
        }
        public String getOsVersionId() {
            return this.osVersionId;
        }

        public ListOsVersionsResponseBodyOsVersion setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
