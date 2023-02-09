// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListBatchTasksRequest extends TeaModel {
    /**
     * <p>oss bucket</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Id")
    public Long id;

    /**
     * <p>oss path</p>
     */
    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListBatchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTasksRequest self = new ListBatchTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListBatchTasksRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListBatchTasksRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListBatchTasksRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public ListBatchTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBatchTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
